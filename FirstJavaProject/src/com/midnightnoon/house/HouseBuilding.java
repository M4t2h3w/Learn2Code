package com.midnightnoon.house;

public class HouseBuilding {

    public static void main(String[] args) {

        char[][] map = new char[5][5];
        map[0] = new char[]{'O', 'X', 'X', 'O', 'O'};
        map[1] = new char[]{'X', 'X', 'X', 'O', 'O'};
        map[2] = new char[]{'O', 'O', 'X', 'X', 'X'};
        map[3] = new char[]{'O', 'O', 'O', 'X', 'X'};
        map[4] = new char[]{'O', 'O', 'O', 'O', 'O'};

        char[][] house = new char[2][2];
        house[0] = new char[]{'H','H'};
        house[1] = new char[]{'H','-'};

        buildHouse(map, house);
    }

    // writes coordinates on the console if possible to build the house on the map
    private static void buildHouse(char[][] map, char[][] house) {
        int housesBuild = 0; // helper var for number of houses already build
        for (int i = 0; i < map.length - (house.length - 1); i++) {
            for (int j = 0; j < map[i].length - (house[0].length - 1); j++) {
                if ((map[i][j] == 'X' && house[0][0] == 'H') ||
                        ((map[i][j] == 'O' || map[i][j] == 'X') && house[0][0] == '-')) {

                    // if there is 'X' on the map and first position of house is 'H'
                    // calls the checkIfSuitable method
                    // if 'O' or 'X' is on the map and first house position is '-'
                    // calls the checkIfSuitable as well
                    if (checkIfSuitable(map, house, i, j)) {
                        housesBuild++;
                        System.out.println("H"+ housesBuild + "{" + i + "," + j + "}");
                    }
                }
            }
        }
        if (housesBuild == 0) {
            System.out.println("Unable to build the house on given map.");
        }
    }

    // checks if the whole house can be build on the given portion of map
    private static boolean checkIfSuitable(char[][] map, char[][] house, int i, int j) {

        for (int k = 0; k < house.length; k++) {
            for (int l = 0; l < house[k].length; l++) {
                if (house[k][l] == 'H' && map[i+k][j+l] == 'X') {
                }
                else if (house[k][l] == '-' && (map[i+k][j+l] == 'O' || map[i+k][j+l] == 'X')) {
                }
                // if the loop gets here it means that there was not a match,
                // therefore it's not possible to build a house, exiting the method with false as return
                else return false;
            }
        }
        // if the method gets here, there is possible to build a house since all position have their
        // matching counterparts (H & X); (- & (O || X))
        return true;
    }
}
