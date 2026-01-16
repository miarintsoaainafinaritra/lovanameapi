CREATE TABLE Dish (
    id_Dish SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    dish_type VARCHAR(50),
    selling_price NUMERIC(10, 2)
);

INSERT INTO Dish (id_Dish, name, dish_type, selling_price)
VALUES
(1, 'Salade fraiche', 'START', 3500.00),
(2, 'Poulet grille', 'MAIN', 12000.00),
(3, 'Riz aux legumes', 'MAIN', NULL),
(4, 'Gateau au chocolat', 'DESSERT', 8000.00),
(5, 'Salade de fruits', 'DESSERT', NULL);

SELECT * FROM Dish;

SELECT id_dish, name, selling_price
FROM Dish
WHERE selling_price IS NOT NULL
ORDER BY selling_price DESC;
