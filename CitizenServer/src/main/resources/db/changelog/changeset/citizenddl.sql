--liquibase formatted sql
--changeset author:Egor-Kuralesov

ALTER TABLE citizen
    ADD COLUMN passport_id INT,
    ADD COLUMN car_id INT,
    ADD FOREIGN KEY(car_id) REFERENCES car(id),
    ADD FOREIGN KEY(passport_id) REFERENCES passport(id),
    --FOREIGN KEY (passport_id) REFERENCES passport(id),
    --FOREIGN KEY (car_id) REFERENCES car(id),
    ADD COLUMN name VARCHAR(255),
    ADD COLUMN surname VARCHAR(255),
    ADD COLUMN age INT;

-- private Long id;
--     private Passport passport;
--     private String name;
--     private String surname;
--     private int age;
--     private List<Car> carList;