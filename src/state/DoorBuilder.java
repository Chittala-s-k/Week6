package state;
import java.util.*;
public abstract class DoorBuilder {
	String name;
	List<String> materials = new ArrayList<String>();
	public abstract DoorBuilder addWood();
	public abstract DoorBuilder addSteel();
	public abstract DoorBuilder addFiberGlass();
	public abstract DoorBuilder addGlass();
	public abstract DoorBuilder addAluminium();
	

	public Doors build() {
		Doors doors = new Doors();

		doors.setName(this.name);
		doors.addMaterials(materials);
		return doors;
	}
}