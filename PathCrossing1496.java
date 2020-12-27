/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Vector;
import java.util.Collections;

public class PathCrossing1496 {

    public void PathCrossing1496() {
        String path = "NESWW";
        int iX = 0, iY = 0;
        Vector<Coordinates> vListCoordinates = new Vector();
        vListCoordinates.add(new Coordinates(0, 0));
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                iY++;
                vListCoordinates.add(new Coordinates(iX, iY));
            }
            if (c == 'S') {
                iY--;
                vListCoordinates.add(new Coordinates(iX, iY));
            }
            if (c == 'E') {
                iX--;
                vListCoordinates.add(new Coordinates(iX, iY));
            }
            if (c == 'W') {
                iX++;
                vListCoordinates.add(new Coordinates(iX, iY));
            }
        }
        Collections.sort(vListCoordinates);
        for (int i = 0; i < vListCoordinates.size(); i++) {
            System.out.println(vListCoordinates.get(i).getX() + " " + vListCoordinates.get(i).getY());
            for (int j = 0; j < vListCoordinates.size(); j++) {
                if (i != j && vListCoordinates.get(i).equals(vListCoordinates.get(j))) {
                    System.out.println("true");
                }
            }
        }
        System.out.println("false");
    }

    public class Coordinates implements Comparable<Coordinates> {

        int X, Y;

        public Coordinates(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public int getY() {
            return Y;
        }

        public boolean equals(Coordinates first) {
            if (this.X == first.X && this.Y == first.Y) {
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Coordinates t) {
            if (X < t.X) {
                return 1;
            }
            if (X > t.X) {
                return -1;
            }
            if (Y < t.Y) {
                return 1;
            }
            if (Y > t.Y) {
                return -1;
            }
            return 0;
        }
    }
}
