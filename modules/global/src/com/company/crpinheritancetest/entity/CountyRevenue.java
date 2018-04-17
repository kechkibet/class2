package com.company.crpinheritancetest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("C")
@NamePattern("%s|name")
@Table(name = "CRPINHERITANCETEST_COUNTY_REVENUE")
@Entity(name = "crpinheritancetest$CountyRevenue")
public class CountyRevenue extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 3008427993749423252L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "AMOUNT")
    protected Double amount;


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }


}