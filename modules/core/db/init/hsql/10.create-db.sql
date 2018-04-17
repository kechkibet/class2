-- begin CRPINHERITANCETEST_INVOICE
create table CRPINHERITANCETEST_INVOICE (
    ID integer not null,
    UUID varchar(36),
    --
    DUE_DATE date not null,
    --
    primary key (ID)
)^
-- end CRPINHERITANCETEST_INVOICE
-- begin CRPINHERITANCETEST_COUNTY_REVENUE
create table CRPINHERITANCETEST_COUNTY_REVENUE (
    ID integer not null,
    UUID varchar(36),
    DTYPE varchar(31),
    --
    REVENUE_TYPE varchar(50),
    NAME varchar(255),
    AMOUNT double precision,
    --
    -- from crpinheritancetest$BusinessPermit
    ACTIVITY_CODE varchar(255),
    END_DATE date,
    --
    -- from crpinheritancetest$RevenueStream
    STREAM_CODE varchar(255),
    --
    primary key (ID)
)^
-- end CRPINHERITANCETEST_COUNTY_REVENUE
-- begin CRPINHERITANCETEST_INVOICELINE
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
)^
-- end CRPINHERITANCETEST_INVOICELINE
