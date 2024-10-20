-- we don't know how to generate database DATASTORE (class Database) :(

create table PUBLIC.CATEGORY
(
    CAT_ID          INTEGER auto_increment,
    CAT_NAME        CHARACTER VARYING not null,
    CAT_DESCRIPTION CHARACTER VARYING,
    constraint CATEGORY_PK
        primary key (CAT_ID)
);

create table PUBLIC.PRODUCT
(
    PRD_ID          INTEGER auto_increment,
    PRD_NAME        CHARACTER VARYING not null,
    PRD_DESCRIPTION CHARACTER VARYING,
    PRD_UNITPRICE   DOUBLE PRECISION  not null,
    PRD_CAT_ID      INTEGER           not null,
    PRD_BRAND       CHARACTER VARYING,
    PRD_STOCK       INTEGER,
    constraint PRODUCT_PK
        primary key (PRD_ID),
    constraint PRODUCT_CATEGORY_CAT_ID_FK
        foreign key (PRD_CAT_ID) references PUBLIC.CATEGORY
);

INSERT INTO PUBLIC.CATEGORY (CAT_NAME, CAT_DESCRIPTION) VALUES ('tools', 'electric tools');
INSERT INTO PUBLIC.CATEGORY (CAT_NAME, CAT_DESCRIPTION) VALUES ('garden furniture', null);
INSERT INTO PUBLIC.CATEGORY (CAT_NAME, CAT_DESCRIPTION) VALUES ('sport', 'sport clothes');
INSERT INTO PUBLIC.CATEGORY (CAT_NAME, CAT_DESCRIPTION) VALUES ('sport', 'sport clothes');

commit;

INSERT INTO PUBLIC.PRODUCT (PRD_NAME, PRD_DESCRIPTION, PRD_UNITPRICE, PRD_CAT_ID, PRD_BRAND, PRD_STOCK) VALUES ('UniversalImpact 800W', 'electric drill', 65.9, 1, 'bosh', 5);
INSERT INTO PUBLIC.PRODUCT (PRD_NAME, PRD_DESCRIPTION, PRD_UNITPRICE, PRD_CAT_ID, PRD_BRAND, PRD_STOCK) VALUES ('Garden Table', 'Plastic Garden Table 101 x 68 x 72 cm Green', 43.5, 2, 'vileda', 10);
INSERT INTO PUBLIC.PRODUCT (PRD_NAME, PRD_DESCRIPTION, PRD_UNITPRICE, PRD_CAT_ID, PRD_BRAND, PRD_STOCK) VALUES ('Bosh IXO 7', 'screwdriver', 68, 1, 'Bosh', 3);

commit;