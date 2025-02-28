package assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Hall", "narrow corridor");
        Room clonedRoom = (Room) prototypeRoom.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room: " + clonedRoom);
    }
}
