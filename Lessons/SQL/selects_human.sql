SELECT * FROM human WHERE age = 23;
SELECT (name) FROM human WHERE age = 23 OR height < 175;
SELECT DISTINCT (name) FROM human h JOIN auto a
    ON h.id = a.owner_id WHERE a.color = 'Black';