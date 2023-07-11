-- liquibase formatted sql

-- changeset akuznetsov:1

CREATE TABLE frameworks
(
    pk       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(255),
    language VARCHAR(255)
);

INSERT INTO frameworks (pk, name, language)
VALUES (1, 'React', 'Javascript'),
       (2, 'Vue', 'Javascript'),
       (3, 'FastApi', 'Python'),
       (4, 'Laravel', 'PHP'),
       (5, 'Spring', 'Java');