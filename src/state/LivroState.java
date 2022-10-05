package state;

//classe abstrata 
public abstract class LivroState {
	
    private LivroAcervo livro; //referencia para o livro

    public LivroState(LivroAcervo livro){	// recebemos o livro e setamos no atributo
        this.livro = livro;
    }

   // tres metodos abtatos que precisam ser implentadas pelas 
   // classes que irao extender LivroState
    
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
