package fronted;

import java.math.BigDecimal;

public class Dish {
    private int id;
    private String name;
    private String dishType;
    private BigDecimal sellingPrice;

    public Dish(int id, String name, String dishType, BigDecimal sellingPrice) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dish{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dishType='").append(dishType).append('\'');
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append('}');
        return sb.toString();
    }
}
