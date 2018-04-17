package com.company.crpinheritancetest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CRPINHERITANCETEST_INVOICELINE")
@Entity(name = "crpinheritancetest$Invoiceline")
public class Invoiceline extends StandardEntity {
    private static final long serialVersionUID = -6394155921791766427L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTY_REVENUE_ID")
    protected CountyRevenue countyRevenue;

    @Column(name = "QTY")
    protected Double qty;

    @Column(name = "TOTAL_AMOUNT")
    protected Double totalAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
    protected Invoice invoice;

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }


    public void setCountyRevenue(CountyRevenue countyRevenue) {
        this.countyRevenue = countyRevenue;
    }

    public CountyRevenue getCountyRevenue() {
        return countyRevenue;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQty() {
        return qty;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }


}