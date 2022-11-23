package nullObject;

public class RealLivros extends AbstractLivros{

// metodo contrutor recebe string titulo e int nome e faz a inicialização
	public RealLivros(String titulo) {
		super();
		this.titulo = titulo;
	}

// implementação do titulo fazer o retorno efetivamente
	@Override
	public String getTitulo() {
		return this.titulo;
	}


}
