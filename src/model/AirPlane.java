package model;
/**
 * @author Rob Dunavan
 *CIS175 - Fall 2021
 * 9/1/2021
 */
public class AirPlane {
	private String model;
	private int year;
	private int numberOfSeats;
	private int engineSize;
	
	public AirPlane() {
		super();
		
	}
	
	public AirPlane(String model, int year, int numberOfSeats, int engineSize ) {
		super();
		this.model = model;
		this.year = year;
		this. numberOfSeats = numberOfSeats;
		this.engineSize = engineSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int  numberOfSeats) {
		this. numberOfSeats =  numberOfSeats;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Bus [model=" + model + ", year=" + year + ", number of seats=" + numberOfSeats
				+ ", engine size=" +engineSize + "]";
	}
	
	public String makeNoise() {
		return "vvvvvvvvveerrrrmmmmmmm";
	}
}
