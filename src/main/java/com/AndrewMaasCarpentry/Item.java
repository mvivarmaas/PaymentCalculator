package com.AndrewMaasCarpentry;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private final ItemType aDescription;
    private Double aScheduledValue;
    private Double aWorkCompleted = 0.0;
    private Double percentCompleted = 0.0;
    private Double balanceToFinish;
    private List<subItem> subItems = new ArrayList<>();

    public Item(ItemType pDescription, Double pScheduledValue) {
        aDescription = pDescription;
        aScheduledValue = pScheduledValue;

    }


    private void calculateBalanceToFinish() {
        balanceToFinish = aScheduledValue - aWorkCompleted;
    }

    private void calculatePercentCompleted() {
        percentCompleted = aWorkCompleted / aScheduledValue;
    }

}
