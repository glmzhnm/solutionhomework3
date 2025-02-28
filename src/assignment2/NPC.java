package assignment2;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CloneableGameEntity cloneEntity() {
        return new NPC(this.name + " (Clone)", this.description);
    }
}