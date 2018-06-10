INSERT INTO USERS
    (ID, EMAIL, PASSWORD)
VALUES
    ('user1', 'hi@gmail.com', 'password'),
    ('user2', 'bye@gmail.com', 'password');

INSERT INTO NOTE
    (ID, USER_ID, TEXT)
VALUES
    ('frontend', 'user1', 'frontend'),
    ('backend', 'user2', 'backend');