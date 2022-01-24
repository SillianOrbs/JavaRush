package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
    private void createGame() {
        countMinesOnField = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                boolean isMine = getRandomNumber(10) == 1;
                gameField[i][j] = new GameObject(j, i, isMine);
                setCellColor(j, i, Color.AZURE);
                if (isMine) {
                    countMinesOnField++;
                }
            }
        }
    }
}
