package nullObject;

public class RealLivros extends AbstractLivros{

// metodo contrutor recebe string titulo e int nome e faz a inicializa��o
	public RealLivros(String titulo) {
		super();
		this.titulo = titulo;
	}

// implementa��o do titulo fazer o retorno efetivamente
	@Override
	public String getTitulo() {
		return this.titulo;
	}


}
