package assignment1;
import assignment2.Room;
import assignment2.NPC;
public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark, cold entrance."))
                .addRoom(new Room("Main Hall", "A large hall filled with echoes."))
                .addNPC(new NPC("Goblin", "A small but aggressive creature."))
                .build();

        dungeon.display();
    }
}