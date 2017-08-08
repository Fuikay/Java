package Atividade02_UNIT;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.dataDeEntrada = new Data();
		
		f1.salario = 200.0;
		f1.nome = "Fernando";
		f1.departamento = "Programador";
		f1.rg = "000000";
		f1.dataDeEntrada.calendario(10,10,2010);
		
		f1.RecebeAumento(200.0);
		
		Funcionario f2 = new Funcionario();
		f2.dataDeEntrada = new Data();
		
		f2.salario = 300.0;
		f2.nome = "Gustavo";
		f2.departamento = "Desenvolvedor";
		f2.rg = "151215";
		f2.dataDeEntrada.calendario(12,12,2012);
		
		f2.RecebeAumento(500.0);
		
		f1.mostra();
		f2.mostra();
		
		if(f1 == f2) {
			
			System.out.println("Os usu�rios s�o iguais");
			
		} else {
			
			System.out.println("Os usu�rios s�o diferentes");
			
			/* Mesmo que fossem exatamente iguais os espa�os alocados seriam diferentes
			   dessa forma geralndo um false */
			
		}
		
	}

}
