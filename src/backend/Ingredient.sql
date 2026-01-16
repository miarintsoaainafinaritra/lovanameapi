CREATE TABLE Ingredient (
    id_Ingredient SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    category VARCHAR(50)
);

INSERT INTO Ingredient (id_Ingredient, name, price, category)
VALUES
(1, 'Laitue', 800.00, 'VEGETABLE'),
(2, 'Tomate', 600.00, 'VEGETABLE'),
(3, 'Poulet', 8000.00, 'MEAT'),
(4, 'Huile', 1000.00, 'OIL'),
(5, 'chocolat', 5000.00, 'SWEET');

SELECT * FROM Ingredient;

SELECT name, price, category
FROM Ingredient
ORDER BY category, price;