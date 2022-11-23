package nullObject;

// Acesso centralizado aceso aos dados dos livros 
public class LivrosDAO {

	public static final String[] titulos = {"O poder do habito"};
	
	
// metodo responsavel por retornar um titulo 
	public static AbstractLivros getCustomer(String titulo) {
		for(int i=0; i < titulos.length; i++) 
			if(titulos[i].equalsIgnoreCase(titulo))    //verifica o titulo é = do vetor
				return new RealLivros(titulos[i]);	  
			
		return new NullLivros();
	}
}
