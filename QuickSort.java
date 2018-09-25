package algoritmos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] v = { 5, 2, 1, 4, 3 };
		quicksort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));
	}

	private static void quicksort(int[] v, int esq, int dir) {
		if (esq < dir) {
			int pivo = particionar(v, esq, dir);
			quicksort(v, esq, pivo - 1);
			quicksort(v, pivo + 1, dir);
		}

	}

	private static int particionar(int[] v, int esq, int dir) {
		int pivo = [esq];
		int i = esq + 1;
		int j = dir;

		while (i <= j) {
			if (v[i] <= pivo) {
				i++;
			} else if (v[j] > pivo) {
				j--;
			} else if (i <= j) {
				swap(v, i, j);
				i++;
				j--;
			}
		}
		swap(v, esq, j);

		return j;
	}

	private static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
