package ParkingLot;

import java.util.ArrayList;

public class Level {
    private ArrayList<Spot> spotList;
    public ArrayList<Spot> getSpotList() {
        return spotList;
    }
    public int getLevelNumber() {
        return levelNumber;
    }
    private int levelNumber;
    public Level(ArrayList<Spot> spotList, int levelNumber) {
        this.spotList = spotList;
        this.levelNumber = levelNumber;
    }
}
