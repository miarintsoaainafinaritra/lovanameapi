package fronted;

import java.math.BigDecimal;
import java.sql.*;

public class DataRetriever {
    private Connection connection;
    public BigDecimal getDishCost(int dishId) throws SQLException {
        String sql = """
            SELECT SUM(i.price * di.quantity_required) AS total_cost
            FROM DishIngredient di
            JOIN Ingredient i ON di.id_ingredient = i.id
            WHERE di.id_dish = ?
            GROUP BY di.id_dish
            """;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, dishId);
            ResultSet rs = stmt.executeQuery();
            return rs.next() ? rs.getBigDecimal("total_cost") : BigDecimal.ZERO;
        }
    }
    public BigDecimal getGrossMargin(int dishId) throws SQLException {
        String sql = "SELECT selling_price FROM Dish WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, dishId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                BigDecimal sellingPrice = rs.getBigDecimal("selling_price");
                if (sellingPrice == null) {
                    throw new IllegalStateException("Prix de vente non défini pour le plat ID: " + dishId);
                }
                BigDecimal cost = getDishCost(dishId);
                return sellingPrice.subtract(cost);
            }
            throw new IllegalArgumentException("Plat non trouvé avec ID: " + dishId);
        }
    }
}