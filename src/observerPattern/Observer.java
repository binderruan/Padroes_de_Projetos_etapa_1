package observerPattern;

//interface observadora 
public interface Observer {
	// metodo notify recebe  objeto observavel e uma mensagem 
    public void notify(Observable observable, String message); // quem mandou mensagem e quem recebe e mensagem
}
