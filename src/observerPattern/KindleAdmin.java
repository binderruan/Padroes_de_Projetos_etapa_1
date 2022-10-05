package observerPattern;

import strategy.Kindle;

import java.util.ArrayList;
import java.util.List;

// KindleAdmin implenta interface Observable possui nome e uma lista de observadores
public class KindleAdmin implements Observable{
    private String nomeAdmin;
    private List<Observer> observers = new ArrayList<Observer>();

    // metodo construtor
    public KindleAdmin(String nomeAdmin){
        super();
        this.nomeAdmin=nomeAdmin;
    }

    // Adicionamos o observador que  recebemos como argumento e chama o metodo get
    @Override
    public void addObserver(Observer observer) {
        getObservers().add(observer);
    }

    // Removemos o observador que  recebemos como argumento e chama o metodo get
    @Override
    public void removeObserver(Observer observer) {
        getObservers().remove(observer);
    }

    @Override
    
    // ira percorrer a lista e verificar o numero da maquina 
    public void notify(int numeroMaquina, String message) {
        for(Observer o : observers){
            if(((Kindle)o).getIpdispositivo() == numeroMaquina){
                o.notify(this, message);
            }
        }
    }

    
    // ira enviar a notificacao 
    @Override
    public void notifyAll(String message){
        for (Observer o : observers){
            o.notify(this, message);
        }
    }

    // ↓ get e set
   
    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
