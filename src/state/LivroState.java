package state;

//classe abstrata 
public abstract class LivroState {
    private LivroAcervo livro;     

    public LivroState(LivroAcervo livro){	// passamos o estado do livro
        this.livro = livro;
    }

   // tres metodos abtatos que precisam ser implentadas pelas classes livrostate
    
    public abstract void livroDisponivel();

    public abstract void livroEmprestado();

    public abstract void myState();

    public LivroAcervo getLivro() {
        return livro;
    }

    public void setLivro(LivroAcervo livro) {
        this.livro = livro;
    }
}
