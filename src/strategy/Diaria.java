package strategy;

import java.util.List;

//
//classe diaria implementa a interface CustoUtilizacao
public class Diaria implements CustoUtilizacao{

// Metodo calcular recebe uma lista de tempo 
	public double calcular(List<Integer> tempo) {
		Double total = 0.0;		// total recebe inicialmente o valor 0
		
		
		for(Integer dia : tempo) {       
			total = dia*2.0;			 // total = numero de dias x 2
		}
		return total;
	}

}
