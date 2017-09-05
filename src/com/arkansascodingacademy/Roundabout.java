package com.arkansascodingacademy;

public class Roundabout
{
    private final Player redPlayer = new Player("Blinky");
    private final Player bluePlayer = new Player("Sue");
    private Player currentPlayer = redPlayer;
    private Player otherPlayer = bluePlayer;
    private Dice dice = new Dice();

    public Roundabout()
    {
    }

    public void play()
    {
        final int WINNING_POSITION = 12;

        boolean gameOver = false;

        while (!gameOver)
        {
            playTurn();

            if (currentPlayer.getPosition() == WINNING_POSITION)
            {
                gameOver = true;
            }
            else
            {
                //get ready to run look again since the game is not over
                switchPlayers();
            }
        }

        System.out.println(currentPlayer.getName() + " Wins!");
    }

    private void switchPlayers()
    {
        if (currentPlayer == redPlayer)
        {
            currentPlayer = bluePlayer;
            otherPlayer = redPlayer;
        }
        else
        {
            currentPlayer = redPlayer;
            otherPlayer = bluePlayer;
        }
    }

    private void playTurn()
    {
        dice.roll();

        System.out.println(currentPlayer.getName() + " rolled " + dice.getFirstValue() + " and " + dice.getSecondValue());

        if (playerShouldMove())
        {
            currentPlayer.moveForward();

            System.out.println(currentPlayer.getName() + " moved forward to position " + currentPlayer.getPosition());

            if (currentPlayer.getPosition() == otherPlayer.getPosition())
            {
                otherPlayer.goBackToStart();
                System.out.println(otherPlayer.getName() + " moved back to start!");
            }

        }

    }

    private boolean playerShouldMove()
    {
        final int neededRoll;

        if (currentPlayer.getPosition() == 0)
        {
          neededRoll = 5;
        }
        else
        {
          neededRoll = currentPlayer.getPosition() + 1;
        }

        return dice.getFirstValue() == neededRoll ||
                dice.getSecondValue() == neededRoll ||
                dice.getTotalValue() == neededRoll;
    }

}
