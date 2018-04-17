package com.company.crpinheritancetest.entity;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@DiscriminatorValue("P")
@Entity(name = "crpinheritancetest$BusinessPermit")
public class BusinessPermit extends CountyRevenue {
    private static final long serialVersionUID = -5782902917885097052L;

    @Column(name = "ACTIVITY_CODE")
    protected String activityCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "END_DATE")
    protected Date endDate;

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }


}