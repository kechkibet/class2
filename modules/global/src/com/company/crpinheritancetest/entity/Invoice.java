package com.company.crpinheritancetest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@Table(name = "CRPINHERITANCETEST_INVOICE")
@Entity(name = "crpinheritancetest$Invoice")
public class Invoice extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -4869507552653723330L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "invoice")
    protected List<Invoiceline> invoiceLines;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DUE_DATE", nullable = false)
    protected Date dueDate;

    public void setInvoiceLines(List<Invoiceline> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public List<Invoiceline> getInvoiceLines() {
        return invoiceLines;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }


}