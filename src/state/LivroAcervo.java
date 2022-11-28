package state;

import hookMethod.Livro;

public class LivroAcervo extends Livro {	
    private LivroState state;				 // recebe o estado do livro

    
    public LivroAcervo(String titulo, int paginas, Double preco) {		
        super(titulo,paginas,preco);		                            
        this.state = new Disponivel(this);  		    
    }

    // Get e Set de LivroState e state   
    protected Double calcularPrecoEmprestimo() {
        return this.getPrecoEmprestimo() * 2.0;
    }

    public void emprestado(){
        state.livroEmprestado();   
    }

    public void disponivel(){
        state.livroDisponivel();  
    }

    public void state(){
        state.myState();
    }

    public LivroState getState() {
        return state;
    }

    public void setState(LivroState state) {
        this.state = state;
    }
}
