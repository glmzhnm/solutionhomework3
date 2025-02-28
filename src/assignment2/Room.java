package assignment2;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CloneableGameEntity cloneEntity() {
        return new Room(this.name , this.description);
    }
    public String toString() {
        return  name + "," + description;
    }
}