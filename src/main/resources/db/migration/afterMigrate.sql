INSERT INTO USERS
    (ID, EMAIL, PASSWORD)
VALUES
    ('user1', 'hi@gmail.com', 'password'),
    ('user2', 'bye@gmail.com', 'password');

INSERT INTO TITLES
    (USER_ID, TEXT)
VALUES
    ('user1', 'frontend'),
    ('user2', 'backend');

INSERT INTO HEADERS
    (TITLE_ID, TEXT)
VALUES
    (1, 'html'),
    (1, 'css'),
    (1, 'frameworks'),
    (2, 'databases'),
    (2, 'servers');