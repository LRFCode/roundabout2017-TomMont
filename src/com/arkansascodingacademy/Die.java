package com.arkansascodingacademy;

import java.util.Random;

public class Die
{
    private int rolledNumber;

    public Die()
    {
        roll();
    }

    public int getValue()
    {
        return rolledNumber;
    }

    public void roll()
    {
        Random random = new Random();
        rolledNumber = random.nextInt(6) + 1;
    }
}
