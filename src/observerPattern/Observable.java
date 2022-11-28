package observerPattern;


//interface observavel que pode adicionar,remover e noficar
public interface Observable {       
	
    public void addObserver(Observer observer);	
    public void removeObserver(Observer observer); 
    public void notify(int numeroMaquina, String message);  // recebe como parametro num maquina e mensagem
    public void notifyAll(String message);
}
