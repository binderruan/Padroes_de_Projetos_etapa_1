package strategy;

import observerPattern.KindleAdmin;
import observerPattern.Observable;
import observerPattern.Observer;

//classe cliente possui os atributos...
public class Kindle implements Observer {
	private int ipdispositivo;
	
	//Metodo constrtuor Kindle  
	public Kindle(int ipdispositivo, boolean disponivel){
		super();
		this.ipdispositivo = ipdispositivo;
	}

	@Override
	// metodo construtor que sera utilizado no padrão  Observer Pattern para mandar a notificação
	public void notify(Observable observable, String message) {
		//Cast para conseguir no nome do Admin
		System.out.println(((KindleAdmin)observable).getNomeAdmin() +" para maquina "+this.ipdispositivo+": "+message);
	}

    // Metodos get e set para telefone
	public int getIpdispositivo() {
		return ipdispositivo;
	}

	public void setIpdispositivo(int ipdispositivo) {
		this.ipdispositivo = ipdispositivo;
	}

}
