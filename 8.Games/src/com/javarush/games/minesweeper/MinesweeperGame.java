package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private void countMineNeighbors() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                GameObject object = gameField[i][j];
                if (!object.isMine) {
                    List<GameObject> objectsNear = getNeighbors(object);
                    int mineCount = 0;
                    for (GameObject objectNear : objectsNear) {
                        if (objectNear.isMine)
                            mineCount++;
                    }
                    object.countMineNeighbors = mineCount;
                }
            }
        }
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void openTile(int x, int y) {
        GameObject object = gameField[y][x];
        object.isOpen = true;
        if (object.isMine)
            setCellValue(x, y, MINE);
        else if (object.countMineNeighbors == 0) {
                List<GameObject> objectsNear = getNeighbors(object);
                for (GameObject objNear : objectsNear) {
                    if (!objNear.isOpen)
                        openTile(objNear.x, objNear.y);
                }
            setCellValue(x, y, "");
        } else {
            setCellNumber(x, y, object.countMineNeighbors);
        }
        setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        openTile(x, y);
    }
}