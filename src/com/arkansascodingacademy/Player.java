package com.arkansascodingacademy;

/**
 * Created by lrflr on 9/5/2017.
 */
public class Player
{
    private int position = 0;
    private final String name;

    public Player(String name)
    {
        this.name = name;
    }

    public int getPosition()
    {
        return position;
    }

    public void moveForward()
    {
        position++;
    }

    public void goBackToStart()
    {
        position = 0;
    }

    public String getName()
    {
        return name;
    }
}
