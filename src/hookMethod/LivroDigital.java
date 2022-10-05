package hookMethod;

//Classe LivroDigital extende para classe Livro
public class LivroDigital extends Livro {
	
	//metodo construtor
    public LivroDigital(String titulo, int numPags, Double precoEmprestimo) {
        super(titulo, numPags, precoEmprestimo);
    }
    
    // pegamos metodo PrecoEmprestimo e faazemos menos 10%
    protected  Double calcularPrecoEmprestimo(){
        return this.getPrecoEmprestimo() - 0.1;
    }
}
