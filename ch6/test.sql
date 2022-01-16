DROP TABLE author IF EXISTS;
DROP TABLE book IF EXISTS;

CREATE TABLE author(
    name TEXT PRIMARY KEY,
    birth TEXT,
    country TEXT
);

INSERT INTO author(name, birth, country)
VALUES ('Lu Xun', '1881-09-25', 'China');

INSERT INTO author(name, birth, country)
VALUES ('F. Scott Fitzgerald', '1896-09-24', 'America');

INSERT INTO author(name, birth, country)
VALUES ('Ray Huang', '1918-06-25', 'America');

INSERT INTO author(name, birth, country)
VALUES ('Margaret Mitchell', '1900-11-08', 'America');

INSERT INTO author(name, birth, country)
VALUES ('Haruki Murakami', '1949-01-12', 'Japan');

INSERT INTO author(name, birth, country)
VALUES ('Mo Yan', '1955-02-17', 'China');

CREATE TABLE book(
    ISBN TEXT,
    title TEXT NOT NULL,
    author_name TEXT,
    price REAL DEFAULT 9.9,
    PRIMARY KEY(ISBN),
    FOREIGN KEY(author_name) REFERENCES author(name)
);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780446365383', 'Gone with the Wind', 'Margaret Mitchell', 7.99);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780743273565', 'The Great Gatsby', 'F. Scott Fitzgerald', 15.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780300028843', '1587, a Year of No Significance', 'Ray Huang', 27.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9783442715930', 'Hear the Wind Sing', 'Haruki Murakami', 25.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780099448822', 'Norwegian Wood', 'Haruki Murakami', 24.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780699460923', 'Wandering', 'Lu Xun', 8.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9780689460812', 'Old Tales Retold', 'Lu Xun', 10.00);

INSERT INTO book(ISBN, title, author_name, price)
VALUES ('9784489461944', 'Life and Death Are Wearing Me Out', 'Mo Yan', 22.00);