// You are developing a feature for Zomato that helps users find the nearest restaurants to their current location. It uses GPS to determine the user's location and has access to a database of restaurants, each with its own set of coordinates in a two-dimensional space representing their geographical location on a map. The goal is to identify the "B" closest restaurants to the user, providing a quick and convenient way to choose where to eat.
// Given a list of restaurant locations, denoted by A (each represented by its x and y coordinates on a map), and an integer B representing the number of closest restaurants to the user. The user's current location is assumed to be at the origin (0, 0).
// Here, the distance between two points on a plane is the Euclidean distance.
// You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)
// NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2).

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(closestToOrigin(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1,3)), new ArrayList<>(Arrays.asList(-2, 2)))), 1));
        System.out.println(closestToOrigin(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2,-1)), new ArrayList<>(Arrays.asList(1, -1)))), 1));
    }
    public static ArrayList<ArrayList<Integer>> closestToOrigin(ArrayList<ArrayList<Integer>> A, int B) {
        A.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> A, ArrayList<Integer> B) {
                if(distanceFromOrigin(A)<distanceFromOrigin(B))    return -1;
                if(distanceFromOrigin(A)>distanceFromOrigin(B))    return 1;
                if(A.get(0)<B.get(0))    return -1;
                if(A.get(0)>B.get(0))    return 1;
                if(A.get(1)<B.get(1))    return -1;
                if(A.get(1)>B.get(1))    return 1;
                return 0;
            }
        });
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // double dis = distanceFromOrigin(A.get(0));
        // for(ArrayList<Integer> i : A) {
        //     if(distanceFromOrigin(i) == dis)
        //         ans.add(i);
        // }
        return new ArrayList<>(A.subList(0, B));
    }
    public static double distanceFromOrigin(ArrayList<Integer> A) {
        return Math.sqrt(Math.pow(A.get(0), 2) + Math.pow(A.get(1), 2));
    }
}