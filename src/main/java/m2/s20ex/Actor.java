package m2.s20ex;

public abstract class Actor {
	private String name;
	private int power;

	private static final int DEFAULT_POWER = 1;

	public Actor(String name) {
		this.name = name;
		this.power = DEFAULT_POWER;
	}
	
	public Actor(String name, int power) {
		this.name = name;
		this.power = power;
	}
	

	public int getPower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}

}
