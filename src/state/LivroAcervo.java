package state;

import hookMethod.Livro;

public class LivroAcervo extends Livro {	 // extendemos para a classe livro de metodo HookMethod 
    private LivroState state;				//  atributo state

    
    public LivroAcervo(String titulo, int paginas, Double preco) {		// metodo contrutor inicializamos e passamos 
        super(titulo,paginas,preco);		                            // a referencia para disponivel
        this.state = new Disponivel(this);					            // 
    }

    // Get e Set de LivroState e state
    
    protected Double calcularPrecoEmprestimo() {
        return this.getPrecoEmprestimo() * 2.0;
    }

    // chamamos o emprestado e disponivel no objeto LivroAcervo
    
    
    public void emprestado(){
        state.livroEmprestado();   //pega o estado e chama o metodo livroEmprestado
    }

    public void disponivel(){
        state.livroDisponivel();  //pega o estado e chama o metodo livroDisponivel
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
