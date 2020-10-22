package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyForSecondVariation implements IStrategy
{
    public ArrayList<Integer>[] Algorithm(List<Integer> nums)
    {
        ArrayList<Integer>[] badNumsAndGood = new ArrayList[2];
        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> badNums = new ArrayList<>();

        for (int n : nums)
        {
            if (n >= 0) {
                goodNums.add(n);
            } else {
                badNums.add(n);
            }
        }
        badNumsAndGood[1] = goodNums;
        badNumsAndGood[0] = badNums;

        return badNumsAndGood;
    }
}

