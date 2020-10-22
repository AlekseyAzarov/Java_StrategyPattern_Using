package com.company;

import java.util.ArrayList;
import java.util.List;

public class StrategyForFifthVariation implements IStrategy {

    public ArrayList<Integer>[] Algorithm (List<Integer> nums)
    {
        ArrayList<Integer>[] badNumsAndGood = new ArrayList[2];
        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> badNums = new ArrayList<>();

        for (int n : nums)
        {
            if (checkComposite(n)) {
                goodNums.add(n);
            } else {
                badNums.add(n);
            }
        }
        badNumsAndGood[1] = goodNums;
        badNumsAndGood[0] = badNums;

        return badNumsAndGood;
    }

    private boolean checkComposite(int i)
    {
        if (i <= 1)
            return true;
        else if (i <= 3)
            return false;
        else if (i % 2 == 0 || i % 3 == 0)
            return true;
        int n = 5;

        while (n * n <= i){
            if (i % n == 0 || i % (n + 2) == 0)
                return true;
            n = n + 6;
        }

        return false;
    }
}
