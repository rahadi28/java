package com.enigmacamp;

public class Sudoku {

	// We define a simple grid to solve. Grid is stored in a 2D Array
	public static int[][] GRID_TO_SOLVE = {
			{ 9, 0, 0, 1, 0, 0, 0, 0, 5 },
			{ 0, 0, 5, 0, 9, 0, 2, 0, 1 },
			{ 8, 0, 0, 0, 4, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 8, 0, 0, 0, 0 },
			{ 0, 0, 0, 7, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 2, 6, 0, 0, 9 },
			{ 2, 0, 0, 3, 0, 0, 0, 0, 6 },
			{ 0, 0, 0, 2, 0, 0, 9, 0, 0 },
			{ 0, 0, 1, 9, 0, 4, 5, 7, 0 }
	};

	private int[][] board;
	public static final int EMPTY = 0; // Empty cell
	public static final int SIZE = 9; // Size of our sudoku grids

	public Sudoku(int[][] board) {
		this.board = new int[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				this.board[i][j] = board[i][j];
			}
		}
	}

	// We check if a possible number is already in a row
	private boolean isInRow(int row, int number) {
		for (int i = 0; i < SIZE; i++)
			if (board[row][i] == number)
				return true;

		return false;
	}

	// We check if a possible number is already in a column
	private boolean isInCol(int col, int number) {
		for (int i = 0; i < SIZE; i++)
			if (board[i][col] == number)
				return true;

		return false;
	}

	// We check if a possible number is in its 3x3 box
	private boolean isInBox(int row, int col, int number) {
		int r = row - row % 3;
		int c = col - col % 3;

		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (board[i][j] == number)
					return true;

		return false;
	}

	// Combined method to check if a number possible to a row, col position is ok
	private boolean isOk(int row, int col, int number) {
		return !isInRow(row, number) && !isInCol(col, number) && !isInBox(row, col, number);
	}

	// Solve method. We will use a recursive BackTracking Algorithm.
	// We will see better approaches in next video :)
	public boolean solve() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				// We search an empty cell
				if (board[row][col] == EMPTY) {
					// We try possible numbers
					for (int number = 1; number <= SIZE; number++) {
						if (isOk(row, col, number)) {
							// Number ok. It respects sudoku constraints
							board[row][col] = number;

							if (solve()) { // We start backtracking recursively
								return true;
							} else { // If not a solution, we empty the cell and we continue
								board[row][col] = EMPTY;
							}
						}
					}

					return false; // We return false
				}
			}
		}

		return true; // Sudoku solved
	}

	public void display() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(" " + board[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku(GRID_TO_SOLVE);
		System.out.println("Sudoku grid to solve");
		sudoku.display();

		// We try resolution
		if (sudoku.solve()) {
			System.out.println("Sudoku Grid solved with simple BT");
			sudoku.display();
		} else {
			System.out.println("Unsolvable");
		}
	}
}