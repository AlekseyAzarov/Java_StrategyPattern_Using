package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputController
{
    Scanner Input = new Scanner(System.in);

    public List<Integer> ScanedNumbers ()
    {
        List<Integer> nums = new ArrayList<>();

        String numsInString = Input.nextLine();
        String[] numsInStringSeparate = numsInString.split(" ");
        for (String s : numsInStringSeparate)
        {
            nums.add(Integer.parseInt(s));
        }

        return nums;
    }

    public IStrategy ScanVaration ()
    {
        int v;
        IStrategy strategy = new StrategyForFirstVariation();

        v = Input.nextInt();
        switch (v) {
            case 1:
                strategy = new StrategyForFirstVariation();
                break;
            case 2:
                strategy = new StrategyForSecondVariation();
                break;
            case 3:
                strategy = new StrategyForThirdVariation();
                break;
            case 4:
                strategy = new StrategyForFourthVariation();
                break;
            case 5:
                strategy = new StrategyForFifthVariation();
                break;
                
                default: System.out.println("Вы ввели не то число. Вариант по-умолчанию - 1");
            }

        return strategy;
    }
}
