package observerPattern;


public interface Observable {        // toda interface que for utilizar necessita implentar
	
	//adc metodo  observador, recebe referncia do tipo observadora
    public void addObserver(Observer observer);	
    public void removeObserver(Observer observer); 
    public void notify(int numeroMaquina, String message);
    // metodo notificacao é uma mensagem que sera passada para todos os observadores
    public void notifyAll(String message);
}
