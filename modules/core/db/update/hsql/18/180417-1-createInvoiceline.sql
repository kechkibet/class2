create table CRPINHERITANCETEST_INVOICELINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTY_REVENUE_ID integer,
    QTY double precision,
    TOTAL_AMOUNT double precision,
    INVOICE_ID integer,
    --
    primary key (ID)
);
