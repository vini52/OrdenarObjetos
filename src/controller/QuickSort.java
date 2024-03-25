package controller;

public class QuickSort{
	public QuickSort(){
		super();
	}
	public void sort(String[] vetor){
		quick(vetor, 0, vetor.length -1);
	}
	private void quick(String[] vetor, int inicio, int fim){
		if(fim > inicio){
			int indexPivo = dividir(vetor, inicio, fim);
			quick(vetor, inicio, indexPivo - 1);
			quick(vetor, indexPivo + 1, fim);
		}
	}
	private int dividir(String[] vetor, int inicio, int fim){
		String pivo = vetor[inicio];
		int pontoDir = fim;
		int pontoEsq = (inicio + 1);
		
		while(pontoEsq <= pontoDir){
			while(pontoEsq <= pontoDir && vetor[pontoEsq].compareTo(pivo) > 0){
				pontoEsq++;
			}
			while(pontoDir >= pontoEsq && vetor[pontoDir].compareTo(pivo) < 0){
				pontoDir--;
			}
			if(pontoEsq < pontoDir)
				trocar(vetor, pontoDir--, pontoEsq++);
		}
		trocar(vetor, inicio, pontoDir);
		return pontoDir;
	}
	private void trocar(String[] vetor, int i, int j){
		String temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}