package hookMethod;

//Classe LivroFisico extende para classe Livro
public class LivroFisico extends Livro {

	//metodo construtor
    public LivroFisico(String titulo, int numPags, Double precoEmprestimo) {
        super(titulo, numPags, precoEmprestimo);
    }

    // pegamos metodo PrecoEmprestimo e faazemos menos 20%
    protected  Double calcularPrecoEmprestimo(){
        return this.getPrecoEmprestimo() - 2;
    }
}
