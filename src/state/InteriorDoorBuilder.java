package state;
public class InteriorDoorBuilder extends DoorBuilder{

	public InteriorDoorBuilder() {
		this.name = "Exterior Door";
	}
	
	
	
	@Override
	public DoorBuilder addWood() {
		this.materials.add("Wood");

		return this;
	}
	@Override
	public DoorBuilder addSteel() {
		return this;
	}
	@Override
	public DoorBuilder addFiberGlass() {
		return this;
	}
	@Override
	public DoorBuilder addGlass() {
		this.materials.add("Glass");
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public DoorBuilder addAluminium() {
		this.materials.add("Aluminium");
		// TODO Auto-generated method stub
		return this;
	}



}