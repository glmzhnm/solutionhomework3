package assignment3;
import assignment1.Dungeon;
import assignment1.SimpleDungeonBuilder;
import assignment2.Room;
import assignment2.NPC;
public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room baseRoom = new Room("Base Room", "empty room.");
        Room clonedRoom1 = (Room) baseRoom.cloneEntity();
        Room clonedRoom2 = (Room) baseRoom.cloneEntity();

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Prototype + Builder")
                .addRoom(clonedRoom1)
                .addRoom(clonedRoom2)
                .addNPC(new NPC("Zombie", "strong enemy."))
                .build();

        dungeon.display();
    }
}
