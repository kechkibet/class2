create table CRPINHERITANCETEST_COUNTY_REVENUE (
    ID integer not null,
    UUID varchar(36),
    DTYPE varchar(31),
    --
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
);
