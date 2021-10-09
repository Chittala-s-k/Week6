package state;

public class DoorState {

	public static void main(String[] args) {
		Door door = new Door(true);
		System.out.println(door);
		System.out.println("---------------------------------");
		door.doorClose();
		System.out.println(door);
		System.out.println("---------------------------------");
		door.doorOpen();
		System.out.println(door);
		//lock mode
		System.out.println("----------------------------------");
		door.doorLock();
		System.out.println(door);
		System.out.println("----------------------------------");
		door.doorOpen();
		System.out.println(door);
		System.out.println("------------------------------------");
	
		door.doorUnlock();
		System.out.println(door);
		System.out.println("-------------------------------------");
		
		door.doorClose();
		System.out.println(door);
		System.out.println("-------------------------------------");
	
//		//unlock mode
		door.doorOpen();
		System.out.println(door);
		System.out.println("---------------------------------------");
		door.doorClose();

		door.brokenState();
		door.brokenState();

		
		
		
	}

}