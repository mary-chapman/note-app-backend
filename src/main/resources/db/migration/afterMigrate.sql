INSERT INTO USERS
    (USERNAME, EMAIL, PASSWORD)
VALUES
    ('user 1', 'hi@gmail.com', 'password'),
    ('user 1', 'hi@gmail.com', 'password');

INSERT INTO TITLES
    (USER_ID, TEXT)
VALUES
    (1, 'frontend'),
    (1, 'backend');

INSERT INTO HEADERS
    (TITLE_ID, TEXT)
VALUES
    (1, 'html'),
    (1, 'css'),
    (1, 'frameworks'),
    (2, 'databases'),
    (2, 'servers');