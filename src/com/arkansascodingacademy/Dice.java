package com.arkansascodingacademy;

public class Dice
{
    private Die die1;
    private Die die2;

    public Dice()
    {
        die1 = new Die();
        die2 = new Die();
    }

    public void roll()
    {
        die1.roll();
        die2.roll();
    }

    public int getFirstValue()
    {
        return die1.getValue();
    }

    public int getSecondValue()
    {
        return die2.getValue();
    }

    public int getTotalValue()
    {
        return getFirstValue() + getSecondValue();
    }
}
