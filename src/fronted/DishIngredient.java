package fronted;

public class DishIngredient {
    private int id;
    private int dishId;
    private int ingredientId;
    private String unit;

    public DishIngredient(int id, int dishId, int ingredientId, String unit) {
        this.id = id;
        this.dishId = dishId;
        this.ingredientId = ingredientId;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DishIngredient{");
        sb.append("id=").append(id);
        sb.append(", dishId=").append(dishId);
        sb.append(", ingredientId=").append(ingredientId);
        sb.append(", unit='").append(unit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
