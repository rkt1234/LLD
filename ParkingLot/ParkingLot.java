package ParkingLot;

import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<Level> levelList;

    void parkVehicle(Vehicle vehicle) { // parks the vehicle in an available spot.

        for(int i=0;i<levelList.size();i++) {
            ArrayList<Spot> spot = levelList.get(i).getSpotList();
            for(int k=0;k<spot.size();k++) {
                
            }
        }
    }

    void leaveSpot(Vehicle vehicle) {

    }

    void getAvailableSpots(Level level, Spot spotType) {

    }

    public static void main() {

    }
}
