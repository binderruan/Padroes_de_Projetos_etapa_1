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
		
		//Utilizando o padrao Strategy:
		System.out.println("------------------- \nPadrao Strategy");
		
		// Objeto  do tipo cliente
		Cliente ruan = new Cliente("Ruan", 1405);
		List<Integer> dias = new ArrayList<Integer>(); //lista de dias
		
		//Apartir da sessao e possivel retirar o tempo de utilizacao e somar aos dias utilizados

		dias.add(1); // adc dias de utilizacao
		
		//Resultado 
		ResultadoUtilKindle diaria = new ResultadoUtilKindle(ruan, dias, 1, new Diaria());
		
		System.out.println("Total a ser pago: R$ "+ diaria.calcularPrecoFinal());
		
		//Utilizando o padrao Null Object
		System.out.println("-------------------\nPadrao Null Object");
		
		//Buscando e armazenando resultado das livros
		AbstractLivros livro1 = LivrosDAO.getCustomer("Feitos de sol");
		
		System.out.println("Livros: ");
		System.out.println("Titulo: "+livro1.getTitulo()+"\nPaginas: "+livro1.getPaginas());

		//Utilizando o padr√£o Hook Method
		System.out.println("-------------------\nHook Method");

		//Livro fisico e digital sao do tipo livro 
		Livro Digital = new LivroDigital("Digital",100, 2.0); 
		Livro Fisico = new LivroFisico("Fisico",100, 2.0);

		//Calculo dos resultados
		System.out.println("Preco do livro "+Digital.getTitulo()+" com desconto: R$"+Digital.calcularPrecoExtendido(2));
		System.out.println("Preco do livro "+Fisico.getTitulo()+" com desconto: R$"+Fisico.calcularPrecoExtendido(2));
		
		//Utilizando o padr√£o State Pattern
		System.out.println("-------------------\nPadrao State Pattern");

		//Criando livro com seus atributos 
		LivroAcervo livroAcervo = new LivroAcervo("Feitos de sol", 256, 1.25);

		//Definindo o estado do objeto e imprimindo
		livroAcervo.emprestado();           //pode alterar entre disponivel, emprestado
		livroAcervo.state();

		//Utilizando o padr√£o Observer Pattern
		System.out.println("-------------------\nObserver Pattern");

		//Nesse padrao vou usar os Kindle Observavel como  e o Kindle do Admin como o observadores
		//Assim o Admin poder√° mandar mensagem para todos os Kindle ou especificar

		//Kindlees como 'Device' que ser√£o os Observadores
		Kindle Kindle1 = new Kindle(1, true);
		Kindle Kindle2 = new Kindle(2, true);

		//Declarado o adminsiatrador
		KindleAdmin KindleAdm = new KindleAdmin("Ruan");

		//Adicionando Observadores
		KindleAdm.addObserver(Kindle1);
		KindleAdm.addObserver(Kindle2);

		//Enviando mensagem para todos e uma exclusiva para a kindle 1
		KindleAdm.notifyAll("A biblioteca esta fechada amanha!");
		KindleAdm.notify(1,"Realize a renovaÁ„o do seu kindle online!");

		//Tirando observador 
		KindleAdm.removeObserver(Kindle1);
		KindleAdm.notify(1,"Essa mensagem ,n„o ira aparecer!");

		System.out.println("-------------------\n");

	}
}
