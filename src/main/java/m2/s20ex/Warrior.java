package m2.s20ex;

public class Warrior extends Actor {

	public Warrior(String name) {
		super(name);
	}

	public Warrior(String name, int power) {
		super(name, power);
	}

	public boolean fight(Actor enemy) {
		if (this.getPower() > enemy.getPower()) {
			System.out.println("Warrior " + this.getName() + " wins against " + enemy.getName());
			return true;
		} else {
			System.out.println("Warrior " + this.getName() + " loses against " + enemy.getName());
			return false;

		}
	}
}
