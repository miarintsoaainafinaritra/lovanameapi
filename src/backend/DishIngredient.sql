CREATE TABLE DishIngredient (
    id_DishIngredient SERIAL PRIMARY KEY,
    id_dish INT NOT NULL,
    id_ingredient INT NOT NULL,
    quantity_required NUMERIC(10, 2) NOT NULL,
    unit VARCHAR(20),
    FOREIGN KEY (id_dish) REFERENCES Dish(id_Dish) ON DELETE CASCADE,
    FOREIGN KEY (id_ingredient) REFERENCES Ingredient(id_Ingredient) ON DELETE CASCADE,
    UNIQUE (id_dish, id_ingredient)
);

INSERT INTO DishIngredient (id_DishIngredient, id_dish, id_ingredient, quantity_required, unit)
VALUES
(1, 1, 1, 0.20, 'KG'),
(2, 1, 2, 0.15, 'KG'),
(3, 2, 3, 1.00, 'KG'),
(4, 4, 4, 0.30, 'KG'),
(5, 4, 5, 0.20, 'KG');

SELECT * FROM DishIngredient;

SELECT
    di.id_dishingredient,
    d.name AS dish_name,
    i.name AS ingredient_name,
    di.quantity_required,
    di.unit
FROM DishIngredient di
JOIN Dish d ON di.id_dish = d.id_dish
JOIN Ingredient i ON di.id_ingredient = i.id_ingredient
ORDER BY d.name, i.name;
