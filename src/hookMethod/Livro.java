package hookMethod;

// classe abstrata Livro 
public abstract class Livro {
    private String titulo;
    private Double precoEmprestimo;

    public Livro(String titulo, int numPags, Double precoEmprestimo){
        this.titulo = titulo;
        this.precoEmprestimo = precoEmprestimo;
    }

    // metodo calcularPrecoExtendido x semnas = calcularPrecoEmprestimo
    public Double calcularPrecoExtendido(int semanas){
        return calcularPrecoEmprestimo()*semanas;
    }

    //metodo abstrato 
    protected abstract Double calcularPrecoEmprestimo();

    // ↓ Get e set 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecoEmprestimo() {
        return precoEmprestimo;
    }

    public void setPrecoEmprestimo(Double precoEmprestimo) {
        this.precoEmprestimo = precoEmprestimo;
    }

}
