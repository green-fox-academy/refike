package FleetOfThings;

public class Thing {
    private String name;
    boolean completed;


    public Thing(String name) {
        this.name = name;
    }

    public void isCompleted () {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[X]" : "[]") + name;
    }
}
