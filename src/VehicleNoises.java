import model.Car;	
import model.Jeep;
import model.Moped;
import model.MuscleCar;
import model.Bus;
import model.Train;
import model.Truck;
import model.ElectricCar;
import model.boat;
import model.ElectricTruck;
import model.Motorcycle;
import model.Helicopter;

public class VehicleNoises {
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Jeep jeep = new Jeep();
		System.out.println(jeep.makeNoise());
		
		Bus bus = new Bus();
		System.out.println(bus.makeNoise());
		
		Train train = new Train();
		System.out.println(train.makeNoise());

		Truck truck = new Truck();
		System.out.println(truck.makeNoise());
		
		ElectricCar EC = new ElectricCar();
		System.out.println(EC.makeNoise());

		boat nboat = new boat();
		System.out.println(nboat.makeNoise());
		
		Moped moped = new Moped();
		System.out.println(moped.makeNoise());

		ElectricTruck ET= new ElectricTruck();
		System.out.println(ET.makeNoise());

		Motorcycle motorcycle = new Motorcycle();
		System.out.println(motorcycle.makeNoise());

		MuscleCar MC = new MuscleCar();
		System.out.println(MC.makeNoise());
		
		Helicopter chopper = new Helicopter();
		System.out.println(chopper.makeNoise());

	}

}
