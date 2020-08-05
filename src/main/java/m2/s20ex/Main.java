package m2.s20ex;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Wizard("A"), new Wizard("B", 6), new Warrior("a"), new Warrior("b", 5) };

		for (Actor actor : actors) {
			if (actor instanceof Wizard) {

				System.out.println("Wizard " + actor.getName() + " has power " + actor.getPower());
			} else if (actor instanceof Warrior) {
				System.out.println("Warrior " + actor.getName() + " has power " + actor.getPower());
			}

		}

// for (Actor actor : actors) {
// if (actor instanceof Wizard) {

// for ()
// ((Wizard) actor.spell(enemy);

		for (Actor actor : actors) {
			for (Actor enemy : actors) {
				if ((actor instanceof Warrior) && (actor != enemy)) {
					Warrior fightingActor = (Warrior) actor;

					fightingActor.fight(enemy);
				}
			}
		}
	}
}
// for (Actor enemy : enemies) {
// ((Warrior) actor).fight(enemy);
