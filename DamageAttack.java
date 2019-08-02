// extends attack as type damage
public class DamageAttack extends Attack{

	public DamageAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	
	public DamageAttack(String name, int value) {
		super(name, value);
	}
	
	public String toString() {
		return super.toString().replaceAll("value", "damage");
	}
	
	public void attack(Pokemon attacker, Pokemon attackee) {
		
		// modifies damage by half of attack if attackee is resistant to attacker
		if(attacker.isResistant(attackee)) {
			if(attackee.getDamage() + super.getValue()/2 < 0) {
				attackee.setDamage(0);
			} else {
				attackee.setDamage(attackee.getDamage() + super.getValue()/2);
			}			
		}
		
		// modifies damage by double of attack if attackee is weak to attacker
		else if(attacker.isWeak(attackee)) {
			if(attackee.getDamage() + super.getValue()*2 < 0) {
				attackee.setDamage(0);
			} else {
				attackee.setDamage(attackee.getDamage() + super.getValue()*2);
			}
		}
		
		// modifies damage by value of attack in all other cases
		else {
			if(attackee.getDamage() + super.getValue() < 0) {
				attackee.setDamage(0);
			} else {
				attackee.setDamage(attackee.getDamage() + super.getValue());
			}
		}
	}
	
}
