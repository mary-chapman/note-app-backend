create table USERS (
    id varchar(100) PRIMARY KEY,
    EMAIL varchar(100),
    PASSWORD varchar(100)
);

create table TITLES (
    ID serial PRIMARY KEY,
    USER_ID varchar(100),
    TEXT varchar(100),
    CONSTRAINT USER_ID FOREIGN KEY(USER_ID)
        REFERENCES USERS (id)
);

create table HEADERS (
    ID serial PRIMARY KEY,
    TITLE_ID integer,
    TEXT varchar(100),
    CONSTRAINT TITLE_ID FOREIGN KEY(TITLE_ID)
        REFERENCES TITLES (ID)
);