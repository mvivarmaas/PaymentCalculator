package com.AndrewMaasCarpentry;


import java.util.ArrayList;
import java.util.List;

public class Job {
    private List<ContinuationSheet> continuationSheets = new ArrayList<>();
    private List<ChangeOrder> changeOrders = new ArrayList<>();
    private Double aProfitAndOverHead;
    private Double aOriginalScheduledTotal;

    public Job(Double pProfitAndOverHead, Double pOriginalScheduledTotal ) {
        aProfitAndOverHead = pProfitAndOverHead;
        aOriginalScheduledTotal = pOriginalScheduledTotal;
    }



}
