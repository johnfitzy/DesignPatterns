package memento;

import java.util.ArrayList;
import java.util.List;


public class CareTaker<T> {

    private List<Memento<T>> mementoList = new ArrayList<>();

    public void add(Memento<T> state) {
        mementoList.add(state);
    }

    public List<Memento<T>> getAll() {
        return mementoList;
    }

    public Memento<T> getAll(int index) {
        return mementoList.get(index);
    }

    public Memento<T> getLastSavedState() {
        if (mementoList.isEmpty()) {
            throw new RuntimeException("No previous states saved");
        }
        return mementoList.get(mementoList.size() - 1);
    }
}
