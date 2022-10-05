package strategy;

import java.util.List;

//Interface para o calculo da utilizacao

//Metodo chamado calcular  recebe uma lista de tempo do tipo int e retorna double
public interface CustoUtilizacao {
	public double calcular(List<Integer> tempo);
}
