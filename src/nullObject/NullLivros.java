package nullObject;

//utilizado caso o livro n�o esteja disponivel
public class NullLivros extends AbstractLivros{

	@Override
	public String getTitulo() {
		return "Livro nao encontrado!";
	}

	@Override
	public int getPaginas() {
		return 0;
	}

}
