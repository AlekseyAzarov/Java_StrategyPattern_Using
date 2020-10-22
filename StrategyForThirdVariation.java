package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyForThirdVariation implements IStrategy
{
    public ArrayList<Integer>[] Algorithm(List<Integer> nums)
    {
        ArrayList<Integer>[] badNumsAndGood = new ArrayList[2];
        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> badNums = new ArrayList<>();

        for (int n : nums)
        {
            if (hasOne(n)) {
                goodNums.add(n);
            } else {
                badNums.add(n);
            }
        }
        badNumsAndGood[1] = goodNums;
        badNumsAndGood[0] = badNums;

        return badNumsAndGood;
    }

    private boolean hasOne(int number)
    {
        while(number > 0)
        {
            if(number % 10 == 1)
                return true;

            number=number/10;
        }
        return false;
    }
}

