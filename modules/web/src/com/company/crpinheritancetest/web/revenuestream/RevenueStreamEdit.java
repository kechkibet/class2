package com.company.crpinheritancetest.web.revenuestream;

import com.company.crpinheritancetest.entity.CountyRevenueTypes;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.crpinheritancetest.entity.RevenueStream;

public class RevenueStreamEdit extends AbstractEditor<RevenueStream> {
    @Override
    protected boolean preCommit() {
        getItem().setRevenueType(CountyRevenueTypes.Revenue_Stream);
        return super.preCommit();
    }
}