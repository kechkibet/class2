package com.company.crpinheritancetest.web.businesspermit;

import com.company.crpinheritancetest.entity.CountyRevenueTypes;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.crpinheritancetest.entity.BusinessPermit;

public class BusinessPermitEdit extends AbstractEditor<BusinessPermit> {
    @Override
    protected boolean preCommit() {
        getItem().setRevenueType(CountyRevenueTypes.Business_Permit);
        return super.preCommit();
    }
}