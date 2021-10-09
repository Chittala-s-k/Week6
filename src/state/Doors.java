package state;

import java.util.List;

public class Doors {
	
	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials=materials;
	}
		void materialPreparation() {
			System.out.println("Prepare " + name);
			System.out.println("Importing materials from different work shops according to requiements");
			for(String material: materials) {
				System.out.println("   " + material);
			}
		}
		void doorLeaf() {
			System.out.println("In this Process the door is cold pressed.");
		}
		
		void painting(){
			System.out.println("Door is polished.");
			
		}
		void productInspection() {
			System.out.println("In this step, the size,thickness and customer requirements are verified. ");
		}
		void pack() {
			System.out.println("The final product is ready and sent to warehouse.");
		}
		public void setName(String name) {
			this.name = name;

		}
		public String toString() {
			StringBuffer display = new StringBuffer();
			display.append("-----" + this.name + "-----");
			for(String material : materials) {
				display.append(material + "\n");
			}
			return display.toString();
		}



}

