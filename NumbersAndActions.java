package com.company;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class NumbersAndActions
{
    public List<Integer> numbers = new ArrayList<Integer>();
    public List<Integer> goodNumbers = new ArrayList<Integer>();
    public List<Integer> badNumbers = new ArrayList<Integer>();

    private IStrategy strategy;

    public void SetStrategy (IStrategy _strategy)
    {
        strategy = _strategy;
    }

    public void ExecuteStrategy ()
    {
        ArrayList<Integer>[] badNumsAndGood;

        badNumsAndGood = strategy.Algorithm(numbers);

        goodNumbers = badNumsAndGood[1];
        badNumbers = badNumsAndGood[0];
    }
}
