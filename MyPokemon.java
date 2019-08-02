// creates personal pokemon
public class MyPokemon extends Water {
	
	public MyPokemon() {
		super("Galax", 10, 25, 50, new Attack[] {
				new SpeedAttack("comet", 1, 10), 
				new DefenseAttack("orbit", 2, 20),
				new DamageAttack("whirlwind", 5, 30)
				});
	}
	
	public void comet (Pokemon pokemon) {
		getAttackObject("comet").attack(this, pokemon);
	}
	
	public void orbit (Pokemon pokemon) {
		getAttackObject("orbit").attack(this, pokemon);
	}
	
	public void whirlwind (Pokemon pokemon) {
		getAttackObject("whirlwind").attack(this, pokemon);
	}

}
