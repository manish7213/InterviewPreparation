package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointToOrigin_5 {

    private static List<Point> findKClosestPoint(int[][] arr, int k) {
        int[] distance = new int[arr.length];
        List<Point> points = new ArrayList<>();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((o1, o2) -> o2.distance - o1.distance);
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            distance[i] = (x * x) + (y * y); //Avoided square root, because order will be same
            Point point = new Point(x, y);
            Pair pair = new Pair(distance[i], point);

            maxHeap.add(pair);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }

        }
        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();
            points.add(pair.point);
        }

        System.out.println(Arrays.toString(distance));
        return points;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        List<Point> res = findKClosestPoint(arr, k);
        for (Point point : res) {
            System.out.println(point);
        }
    }

    static class Pair {
        int distance;
        Point point;

        public Pair(int distance, Point point) {
            this.distance = distance;
            this.point = point;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "distance=" + distance +
                    ", point=" + point +
                    '}';
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
