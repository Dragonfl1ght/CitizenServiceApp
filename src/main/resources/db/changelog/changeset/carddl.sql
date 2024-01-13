ALTER TABLE car
    ADD COLUMN
        model VARCHAR(255),
    ADD COLUMN price INT;
    --ADD COLUMN citizen_id,
    --ADD CONSTRAINT FOREIGN KEY(citizen_id) REFERENCES citizen(id);
    --FOREIGN KEY (citizen_id) REFERENCES citizen(id);

--ALTER TABLE car
--   ADD CONSTRAINT FOREIGN KEY(citizen_id) REFERENCES citizen(id);

-- ALTER TABLE books
--     ADD author NVARCHAR(50) NOT NULL DEFAULT 'Неизвестен';
-- private Long id;
-- private String model;
-- private Integer price;
-- private Citizen owner;
