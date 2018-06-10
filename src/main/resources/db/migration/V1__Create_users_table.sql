create table USERS (
    ID varchar(100) PRIMARY KEY,
    EMAIL varchar(100),
    PASSWORD varchar(100)
);

create table NOTE (
    ID varchar(100) PRIMARY KEY,
    USER_ID varchar(100),
    text varchar(100),
    CONSTRAINT USER_ID FOREIGN KEY(USER_ID)
        REFERENCES USERS (ID)
);
