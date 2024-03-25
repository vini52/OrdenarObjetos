package model;

import java.io.*;
import model.Arquivo;

public class Pessoa{
	private String nome;
	private String sobrenome;
	private int idade;
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		if(nome != "" || nome != " ")
			this.nome = nome;
	}
	public String[] getSobrenome(){
		return new String[]{this.sobrenome};
	}
	public void setSobrenome(String sobrenome){
		if(sobrenome != "" || sobrenome != " ")
			this.sobrenome = sobrenome;
	}
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int idade){
		if(idade > 0 && idade < 120)
			this.idade = idade;
	}
	public String toString(){
		return this.nome + " " + this.sobrenome;
	}
	public static Pessoa[] carregar() throws IOException{
		Arquivo arquivo = new Arquivo("data\\pessoas.csv");
		String[] valores;
		String[] linhas = arquivo.linhas();
		Pessoa[] pessoas = new Pessoa[linhas.length];
		
		for(int i = 0; i < linhas.length; i++){
			valores = linhas[i].split(";");
			pessoas[i] = new Pessoa();
			pessoas[i].setNome(valores[0]);
			pessoas[i].setSobrenome(valores[1]);
			pessoas[i].setIdade(Integer.parseInt(valores[2]));
		}
		return pessoas;
	}
}