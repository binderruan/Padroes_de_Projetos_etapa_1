package nullObject;

public class RealLivros extends AbstractLivros{

// metodo contrutor recebe string titulo e int nome e faz a inicializa��o
	public RealLivros(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}

// implementa��o do titulo e da pagina para fazer o retorno efetivamente
	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public int getPaginas() {
		return this.paginas;
	}

}
