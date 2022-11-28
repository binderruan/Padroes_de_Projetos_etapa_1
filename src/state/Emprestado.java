package state;

public class Emprestado extends LivroState{

	// Ao criar este estado chamamos o metodo construtor da classe mae LivroState
    public Emprestado(LivroAcervo livro){
        super(livro);
    }

    // realizamos a atualização do estado e mostamos na tela o estado do livro
    @Override
    public void livroDisponivel() {
        getLivro().setState(new Emprestado(getLivro()));
    }

    @Override
    public void livroEmprestado() {
        System.out.println("Esse livro esta disponivel");
    }

    public void myState(){
        System.out.println("Estado: Emprestado");
    }
}
