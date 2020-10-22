package com.company;

public class Main
{

    public static void main(String[] args)
    {
        NumbersAndActions Nums = new NumbersAndActions();
        InputController Input = new InputController();

        while (Nums.numbers.size() == 0)
        {
            try
            {
                System.out.println("Введите набор целых чисел через пробел:");
                Nums.numbers = Input.ScanedNumbers();
            } catch (NumberFormatException exc) {
                System.out.println("Вы нарушили правило ввода. Введите числа правильно!");
            }
        }

        System.out.println("Выберите вариант:\n1. Q: число является простым.");
        System.out.println("2. Q: число больше нуля.");
        System.out.println("3. Q: число содержит единицу.");
        System.out.println("4. Q: число не содержит ноль.");
        System.out.println("5. Q: число является составным.");

        Nums.SetStrategy(Input.ScanVaration());
        Nums.ExecuteStrategy();

        System.out.println("Последовательность чисел с свойством Q:\n" + Nums.goodNumbers
                + "\nПоследовательнность чисел без свойства Q:\n" + Nums.badNumbers);
    }
}
