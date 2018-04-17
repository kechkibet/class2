package com.company.crpinheritancetest.entity;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Column;

@DiscriminatorValue("S")
@Entity(name = "crpinheritancetest$RevenueStream")
public class RevenueStream extends CountyRevenue {
    private static final long serialVersionUID = -8634699177793629938L;

    @Column(name = "STREAM_CODE")
    protected String streamCode;

    public void setStreamCode(String streamCode) {
        this.streamCode = streamCode;
    }

    public String getStreamCode() {
        return streamCode;
    }


}