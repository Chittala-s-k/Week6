package state;
public class ExteriorDoorBuilder extends DoorBuilder{

	public ExteriorDoorBuilder() {
		this.name = "Exterior Door";
	}
	
	
	
	@Override
	public DoorBuilder addWood() {
		this.materials.add("Wood");

		return this;
	}
	@Override
	public DoorBuilder addSteel() {
		this.materials.add("Steel");
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public DoorBuilder addFiberGlass() {
		this.materials.add("FiberGlass");
		// TODO Auto-generated method stub
		return this;
	}



	@Override
	public DoorBuilder addGlass() {
		return this;
	}



	@Override
	public DoorBuilder addAluminium() {
		return this;
	}




}