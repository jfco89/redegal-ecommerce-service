CREATE TABLE PRICES(
    PRICE_ID INTEGER NOT NULL,
    BRAND_ID INTEGER,
    START_DATE TIMESTAMP,
    END_DATE TIMESTAMP,
    PRICE_LIST INTEGER,
    PRODUCT_ID INTEGER,
    PRIORITY INTEGER,
    PRICE DOUBLE,
    CURR VARCHAR(5),
    CONSTRAINT "PRICE_PK" PRIMARY KEY (ID)
);