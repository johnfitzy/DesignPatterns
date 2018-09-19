package memento;

/**
 *
 */
public class Memento<T> {
    private T state;

    public Memento(final T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }

    public void setState(final T state) {
        this.state = state;
    }
}
