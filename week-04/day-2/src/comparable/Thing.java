package comparable;

public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing other) {
        int result = Boolean.compare(other.completed, this.completed);
        if (result != 0) {
            return result;
        }
        if (result == 0) {
            result = this.name.compareTo(other.name);
        }
        return result;
    }
}
