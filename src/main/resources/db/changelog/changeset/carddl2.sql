ALTER TABLE car
    ADD COLUMN owner_id INT,
    ADD FOREIGN KEY(owner_id) REFERENCES citizen(id);