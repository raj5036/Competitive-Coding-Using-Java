import java.util.*;

public class Main{
	public static final int N = 5;

	public static final int row[] = { 2, 1, -1, -2, -2, -1,  1,  2 , 2 };
	public static final int col[] = { 1, 2,  2,  1, -1, -2, -2, -1, 1 };

	private static boolean isValid(int x, int y)
	{
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;

		return true;
	}

	private static void print(int[][] visited)
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void knightTour(int visited[][], int x, int y, int pos)
	{
		visited[x][y] = pos;

		if (pos >= N*N)
		{
			print(visited);
			visited[x][y] = 0;
			return;
		}

		for (int k = 0; k < 8; k++)
		{
			int newX = x + row[k];
			int newY = y + col[k];

			if (isValid(newX, newY) && visited[newX][newY] == 0)
				knightTour(visited, newX, newY, pos + 1);
		}

		visited[x][y] = 0;
	}

	public static void main(String[] args)
	{
		// visited[][] serves two purpose -
		// 1. It keep track of squares involved the Knight's tour.
		// 2. It stores the order in which the squares are visited
		int visited[][] = new int[N][N];
		int pos = 1;

		// start knight tour from corner square (0, 0)
		knightTour(visited, 0, 0, pos);
	}
}