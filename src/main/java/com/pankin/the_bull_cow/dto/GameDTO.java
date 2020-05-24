package com.pankin.the_bull_cow.dto;

import java.util.ArrayList;

public class GameDTO {

    private ArrayList<Integer> numbersGame;

    private boolean isGameOver;

    public GameDTO(ArrayList<Integer> numbersGame, boolean isGameOver) {
        this.numbersGame = numbersGame;
        this.isGameOver = isGameOver;
    }

    public GameDTO() {
    }

    public ArrayList<Integer> getNumbersGame() {
        return numbersGame;
    }

    public void setNumbersGame(ArrayList<Integer> numbersGame) {
        this.numbersGame = numbersGame;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
}
