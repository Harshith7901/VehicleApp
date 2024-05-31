package VehicleApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV fortuner = new SUV("Fortuner", true);

		fortuner.move(40, 0);
		fortuner.acceleratre(20);
//		fortuner.acceleratre(-60);
		System.out.println("Current Gear: " + fortuner.getCurrentGear());
		System.out.println("Current Speed: " + fortuner.getCurrentSpeed());

	}

}