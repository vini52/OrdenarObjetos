package view;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView{
	public static void main(String[] args){
		try{
			PessoaController metodos = new PessoaController();
			Pessoa[] pessoas = metodos.ordenaSobrenome();
			for(int i = 0; i < pessoas.length; i++)
				System.out.println(pessoas[i].toString());
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}