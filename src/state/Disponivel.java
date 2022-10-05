package state;

public class Disponivel extends LivroState{

	// Ao criar este estado chamamos o metodo construtor da classe mae LivroState
    public Disponivel(LivroAcervo livro){
        super(livro);          // 
    }

    // Imprime a mensagem caso o livro esteja disponivel
    @Override
    public void livroDisponivel() {
        System.out.println("Esse livro esta disponivel");
    }

    // recuperamos o livro que esta com esse stado e alteramos para outro estado
    @Override
    public void livroEmprestado() {
        getLivro().setState(new Emprestado(getLivro()));
    }

    
    public void myState(){
        System.out.println("Estado: Disponivel");
    }

}
