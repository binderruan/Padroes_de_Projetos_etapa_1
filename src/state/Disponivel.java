package state;

public class Disponivel extends LivroState{

	// Cria o estado e chama o metodo  LivroState
    public Disponivel(LivroAcervo livro){
        super(livro);          // 
    }

    // Imprime a mensagem caso o livro esteja disponivel
    public void livroDisponivel() {
        System.out.println("Esse livro esta disponivel");
    }

    // pega o estado do livro e altera para disponivel
    public void livroEmprestado() {
        getLivro().setState(new Emprestado(getLivro()));
    }

    
    public void myState(){
        System.out.println("Estado: Disponivel");
    }

}
