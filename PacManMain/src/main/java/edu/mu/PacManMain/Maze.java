package edu.mu.PacManMain;

public class Maze {
    private int[][] mapGrid;

    public Maze(int[][] mapGrid) {
        this.mapGrid = mapGrid;
    }

    public boolean isValidMove(int x, int y) {
        int cellX = x / 50; // Convert pixel position to grid cell
        int cellY = y / 50;

        // Check if Pacman is within bounds of the maze
        if (cellX >= 0 && cellX < mapGrid[0].length && cellY >= 0 && cellY < mapGrid.length) {
            int cellValue = mapGrid[cellY][cellX];
            return cellValue != 1; // Assuming 1 represents a wall
        }
        return false;
    }

    public int[][] getMapGrid() {
        return mapGrid;
    }
}
