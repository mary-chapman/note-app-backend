create table USERS (
    ID serial PRIMARY KEY,
    USERNAME varchar(100),
    EMAIL varchar(100),
    PASSWORD varchar(100)
);

create table TITLES (
    ID serial PRIMARY KEY,
    USER_ID integer,
    TEXT varchar(100),
    CONSTRAINT USER_ID FOREIGN KEY(USER_ID)
        REFERENCES USERS (ID)
);

