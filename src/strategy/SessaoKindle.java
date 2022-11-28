package strategy;

//classe SessaoKindle possui tres atributos privados cliente, kindle e tempoUtil
public class SessaoKindle {
	private Cliente cliente;
	private Kindle kindle;
	private int tempoUtil;
	
	
	// ⬇ metodos construtor  e get e set
	public SessaoKindle(Cliente cliente, Kindle kindle, int tempoUtil) {
		this.cliente = cliente;
		this.kindle = kindle;
		this.tempoUtil = tempoUtil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Kindle getKindle() {
		return kindle;
	}

	public int getTempoUtil() {
		return tempoUtil;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setKindle(Kindle kindle) {
		this.kindle = kindle;
	}

	public void setTempoUtil(int tempoUtil) {
		this.tempoUtil = tempoUtil;
	}
	
}
