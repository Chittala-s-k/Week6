package state;

public class BrokenState implements State {
	Door door;
	public BrokenState( Door operator ) {
		this.door = operator;
	}

public void doorOpen() {
		
		if(door.checkCondition()) {
			System.out.println("Door is open");
			door.setState(door.getOpenState());
		}
		else {
			System.out.println("Repair Door as its broken");
			door.setState(door.getOpenState());
		}
	}

	public void doorClose() {
		System.out.println("Door is closed");
//		operator.setState(operator.getCloseState());
	}

	public void doorLock() {
		System.out.println("Door is locked, Kindly Unlock");

	}

	public void doorUnlock() {
		System.out.println("Door is Unlocked, Kindly Lock it");
	}


	public String toString() {
		return " Door is Broken...";
	}

	@Override
	public void doorBroken() {
		// TODO Auto-generated method stub
		System.out.println("Door is Broken");
		
		System.out.println(" Construct a door\n");
			DoorBuilder doorBuilder=new InteriorDoorBuilder();
			Doors doors=doorBuilder.addWood().addFiberGlass().addSteel().addGlass().addAluminium().build();
			doors.materialPreparation();
			doors.painting();
			doors.productInspection();
			doors.pack();
			System.out.println(doors);
			
			doorBuilder=new ExteriorDoorBuilder();
			doors=doorBuilder.addWood().addFiberGlass().addSteel().addGlass().addAluminium().build();
			doors.materialPreparation();
			doors.painting();
			doors.productInspection();
			doors.pack();
//			System.out.println(doors);

			
			
}
}
