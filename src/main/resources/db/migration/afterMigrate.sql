INSERT INTO USERS
    (USERNAME, EMAIL, PASSWORD)
VALUES
    ('user 1', 'hi@gmail.com', 'password'),
    ('user 1', 'hi@gmail.com', 'password');

INSERT INTO TITLES
    (USER_ID, TEXT)
VALUES
    (2, 'TITLE A'),
    (2, 'TITLE B');

INSERT INTO HEADERS
    (TITLE_ID, TEXT)
VALUES
    (1, 'HEADER A'),
    (2, 'HEADER B');