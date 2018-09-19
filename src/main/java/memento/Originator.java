package memento;

public class Originator {

    private String name;
    private int age;

    public Originator(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Memento<Originator> saveStateToMemento(){
        return new Memento<>(new Originator(name, age));
    }

    public void resetStateFromMemento(Memento<Originator> memento){
        name = memento.getState().getName();
        age = memento.getState().getAge();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
