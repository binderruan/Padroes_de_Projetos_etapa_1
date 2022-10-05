package strategy;

import java.util.List;

// ⬇ classe  ResultadoUtilKindle tem os atriutos ...
public class ResultadoUtilKindle {
	private Cliente cliente;
	private List<Integer> tempo;
	private int qtdUsos;
	private CustoUtilizacao calculoPrecoFinal;
	
	// classe ResultadoUtilKindle temos um metodo contrutor, metodo calcularPrecoFinal 
	public ResultadoUtilKindle(Cliente cliente, List<Integer> tempo, int qtdUsos, CustoUtilizacao calculoPrecoFinal) {
		super();
		this.cliente = cliente;
		this.tempo = tempo;
		this.qtdUsos = qtdUsos;
		this.calculoPrecoFinal = calculoPrecoFinal;
	}
	
	public double calcularPrecoFinal() {
		return calculoPrecoFinal.calcular(tempo);  //chama o metod calculoPrecoFinal e metod calcular passando o vetor tempo
	}

// ⬇ get e set dos atributos
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getQtdUsos() {
		return qtdUsos;
	}

	public CustoUtilizacao getCalculoPrecoFinal() {
		return calculoPrecoFinal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQtdUsos(int qtdUsos) {
		this.qtdUsos = qtdUsos;
	}

	public void setCalculoPrecoFinal(CustoUtilizacao calculoPrecoFinal) {
		this.calculoPrecoFinal = calculoPrecoFinal;
	}
	
	
}
