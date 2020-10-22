package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyForFirstVariation implements IStrategy
{
    public ArrayList<Integer>[] Algorithm (List<Integer> nums)
    {
        ArrayList<Integer>[] badNumsAndGood = new ArrayList[2];
        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> badNums = new ArrayList<>();

        for (int n : nums)
        {
            if (checkSimple(n)) {
                goodNums.add(n);
            } else {
                badNums.add(n);
            }
        }
        badNumsAndGood[1] = goodNums;
        badNumsAndGood[0] = badNums;

        return badNumsAndGood;
    }

    private boolean checkSimple(int i)
    {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;

        while (n * n <= i){
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }

        return true;
    }
}

