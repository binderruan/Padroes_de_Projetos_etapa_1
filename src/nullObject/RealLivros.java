package nullObject;

public class RealLivros extends AbstractLivros{

// metodo contrutor recebe string titulo e int nome e faz a inicialização
	public RealLivros(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}

// implementação do titulo e da pagina para fazer o retorno efetivamente
	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public int getPaginas() {
		return this.paginas;
	}

}
