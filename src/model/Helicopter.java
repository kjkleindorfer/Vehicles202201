/**
 * @author Anthon Torgerson - atorgerson
 * CIS175 - Fall 2021
 * Sept 06, 2021
 */

package model;

public class Helicopter {
	private String make;
	private String model;
	private String sound;
	
	public Helicopter() {
		super();
	}
	
	public Helicopter (String make, String model, String sound) {
		this.make = make;
		this.model = model;
		this.sound = sound;
	}
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "Helicopter [make=" + make + ", model=" + model + ", sound=" + sound + "]";
	}

	public String makeNoise() {
		return ("whirrrrrrrr!!!!");
	}
	
}


