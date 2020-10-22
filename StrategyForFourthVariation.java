package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyForFourthVariation implements IStrategy
{
    public ArrayList<Integer>[] Algorithm(List<Integer> nums)
    {
        ArrayList<Integer>[] badNumsAndGood = new ArrayList[2];
        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> badNums = new ArrayList<>();

        for (int n : nums)
        {
            if (DontContainsZero(n)) {
                goodNums.add(n);
            } else {
                badNums.add(n);
            }
        }
        badNumsAndGood[1] = goodNums;
        badNumsAndGood[0] = badNums;

        return badNumsAndGood;
    }

    private boolean DontContainsZero(int num)
    {
        if(num == 0)
            return false;

        if(num < 0)
            num = -num;

        while(num > 0) {
            if(num % 10 == 0)
                return false;
            num /= 10;
        }
        return true;
    }
}
