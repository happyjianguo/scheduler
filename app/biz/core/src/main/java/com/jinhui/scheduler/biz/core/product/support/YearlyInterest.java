package com.jinhui.scheduler.biz.core.product.support;

import java.util.List;

/**
 * Created by Administrator on 2017/12/15 0015.
 */
public abstract class YearlyInterest extends AbstractInterest {


    public YearlyInterest(List dateRule, int term, String startDate, String endDate) {
        super(dateRule, term, startDate, endDate);
    }
}
