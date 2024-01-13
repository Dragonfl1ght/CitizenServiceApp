CREATE TABLE citizen_house_relationship (
    id INT PRIMARY KEY,
    citizen_id      INT,
    house_id        INT,
    FOREIGN KEY (citizen_id) REFERENCES citizen (id),
    FOREIGN KEY (house_id) REFERENCES house (id)
);
