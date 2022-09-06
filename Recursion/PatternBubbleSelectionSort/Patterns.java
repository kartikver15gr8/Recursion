package com.Recursion.PatternBubbleSelectionSort;

public class Patterns {
    public static void main(String[] args) {
        pattern(5, 0);
        pattern2(5, 0);
    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*"+" ");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
    }
    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("*"+" ");
        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }
}
