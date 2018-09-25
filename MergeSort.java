package algoritmos;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int []v = {5, 2, 1, 4, 3};
		int []aux = new int[v.length];
		
		mergeSort(v, aux, 0, v.length-1);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int[] aux, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini+fim) / 2;
			mergeSort(v, aux, ini, meio);
			mergeSort(v, aux, meio+1, fim);
			merge(v, aux, ini, meio, fim);
		}
		
	}

	private static void merge(int[] v, int[] aux, int ini, int meio, int fim) {
		for(int i = 0; i < v.length; i++) {
			aux[i] = v[i];
		}
		
		int i = ini;
		int j = meio+1;
		
		for(int k = ini; k <= fim; k++) {
			if(i > meio) { v[k] = aux[j++]; }
			else if(j > fim) {v[k] = aux[i++]; }
			else if(aux[i] < aux[j]) {v[k] = aux[i++]; }
			else {v[k] = aux[j++]; }
		}  
		
	}

}
