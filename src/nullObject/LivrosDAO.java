package nullObject;

// Acesso centralizado aceso aos dados dos livros 
public class LivrosDAO {

//Declaração de atributos do tipo string e int são publico e estatico 
	public static final String[] titulos = {"Feitos de sol"};
	public static final int[] pages = {256};
	
	
// metodo responavel por retornar um titulo e paginas abstratas
	public static AbstractLivros getCustomer(String titulo) {
		for(int i=0; i<titulos.length; i++) {
			if(titulos[i].equalsIgnoreCase(titulo)) {              //verifica se o nome é o mesmo que foi passado e retorna o onjeto real
				return new RealLivros(titulos[i], pages[i]);
			}
		}
		
		return new NullLivros();
	}
}
