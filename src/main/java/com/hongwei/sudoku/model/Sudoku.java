package com.hongwei.sudoku.model;

public class Sudoku {
    private final int[][] puzzle;

    public Sudoku() {
        this.puzzle = new int[9][9];
    }

    public Sudoku(int[][] puzzle) {
        this.puzzle = puzzle;
    }

    public int[][] getPuzzle() { return this.puzzle; }

    public int[] getRow(int index) {
        return this.puzzle[index];
    }
}
