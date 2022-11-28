package main;

import java.util.ArrayList;
import java.util.List;

import strategy.*;
import nullObject.*;
import hookMethod.*;
import state.*;
import observerPattern.*;

public class Main {

	public static void main(String[] args) {
		
		//Utilizando o padrao Strategy: CustoUtilizacao - Diaria - ResultadoUtil
		System.out.println("------------------- \nPadrao Strategy");
		System.out.println("- Realizando calculo de custo da utilização do kindle");

		// Objeto  do tipo cliente
		Cliente ruan = new Cliente("Ruan", 478850662);
		List<Integer> dias = new ArrayList<Integer>();
		
		dias.add(1); //  dias de utilizacao
	
		//Resultado 
		ResultadoUtilKindle diaria = new ResultadoUtilKindle(ruan, dias, 1, new Diaria());

		System.out.println("Total a ser pago: R$ "+ diaria.calcularPrecoFinal());
		
		//Utilizando o padrao Null Object - Null object - LivrosDao
		System.out.println("-------------------\nPadrao Null Object");
		System.out.println("- Realiza busca de livro ");

		//Buscando e armazenando resultado das livros
		AbstractLivros livro1 = LivrosDAO.getCustomer("O poder do habito");
		AbstractLivros livro2 = LivrosDAO.getCustomer("Poder do habito");

		System.out.println("Titulo: "+livro1.getTitulo());
		System.out.println("Titulo: "+livro2.getTitulo());

		//Utilizando o padrÃ£o Hook Method - Livro - LivroDigital - LivroFisico
		System.out.println("-------------------\nHook Method");
		System.out.println("- Calcula preço de livro digital, fisico com desconto de 10 e 20%");

		//Livro fisico e digital sao do tipo livro 
		Livro Digital = new LivroDigital("Digital",100, 10.0); 
		Livro Fisico = new LivroFisico("Fisico",100, 10.0);

		//Calculo dos resultados
		System.out.println("Preco do livro "+Digital.getTitulo()+" com desconto: R$"+Digital.calcularPrecoExtendido(1));
		System.out.println("Preco do livro "+Fisico.getTitulo()+" com desconto: R$"+Fisico.calcularPrecoExtendido(1));
		
		//Utilizando o padrao State Pattern - 
		System.out.println("-------------------\nPadrao State Pattern");
		System.out.println("- Definindo estado do livro dispinivel ou emprestado");

		//Criando livro com seus atributos 
		LivroAcervo livroAcervo = new LivroAcervo("O poder do habito", 256, 10.0);

		//Definindo o estado do objeto e imprimindo
		livroAcervo.state();				
		livroAcervo.emprestado();           
		livroAcervo.state();
		
		//Utilizando o padrao Observer Pattern
		System.out.println("-------------------\nObserver Pattern");
		System.out.println("- Enviando notificação para dispositivos");

		//Nesse padrao vou usar os Kindle como Observavel e o KindleAdm como o observador
		//Assim o Admin pode mandar mensagem para todos os Kindle ou especificar

		Kindle Kindle1 = new Kindle(1, true);
		Kindle Kindle2 = new Kindle(2, true);

		//Declarado o adminsiatrador
		KindleAdmin KindleAdm = new KindleAdmin("Ruan");

		//Adicionando Observadores
		KindleAdm.addObserver(Kindle1);
		KindleAdm.addObserver(Kindle2);

		//Enviando mensagem para todos e uma exclusiva para a kindle 1
		KindleAdm.notifyAll("A biblioteca esta fechada amanha!");
		KindleAdm.notify(1,"Realize a renovação do seu livro online!");

		System.out.println("-------------------\n");

	}
}
