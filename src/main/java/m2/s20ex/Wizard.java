package m2.s20ex;

public class Wizard extends Actor {
	public Wizard (String name) {
	super(name);
	}
	
	public Wizard (String name, int power) {
		super(name, power);
	}
	public boolean spell(Actor target) {
		return false;
	}
}
