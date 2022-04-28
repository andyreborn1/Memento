package memento;

public class ConcreteMemento implements Memento{

    private String[][] state;

    public ConcreteMemento(String[][] state) {
        this.state = state;
    }

    @Override
    public String[][] getState() {
        return this.state;
    }
}
