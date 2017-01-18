package objects;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Characters {
    int id;
    String name;
    boolean alignment;

    public Characters(int id, String name, boolean alignment) {
        this.id = id;
        this.name = name;
        this.alignment = alignment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlignment() {
        return alignment;
    }

    public void setAlignment(boolean alignment) {
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alignment=" + alignment +
                '}';
    }
}
