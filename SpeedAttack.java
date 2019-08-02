// extends attack as type defense
public class SpeedAttack extends Attack{

	public SpeedAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	
	public SpeedAttack(String name, int value) {
		super(name, value);
	}
	
	public String toString() {
		return super.toString().replaceAll("value", "speed");
	}
	
	public void attack(Pokemon attacker, Pokemon attackee) {
		
		// modifies speed by half of attack if attackee is resistant to attacker
		if(attacker.isResistant(attackee)) {
			if(attackee.getSpeed() + super.getValue()/2 < 0) {
				attackee.setSpeed(0);
			} else {
				attackee.setSpeed(attackee.getSpeed() + super.getValue()/2);
			}			
		}
		
		// modifies speed by double of attack if attackee is weak to attacker
		else if(attacker.isWeak(attackee)) {
			if(attackee.getSpeed() + super.getValue()*2 < 0) {
				attackee.setSpeed(0);
			} else {
				attackee.setSpeed(attackee.getSpeed() + super.getValue()*2);
			}
		}
		
		// modifies speed by attack in all other cases
		else {
			if(attackee.getSpeed() + super.getValue() < 0) {
				attackee.setSpeed(0);
			} else {
				attackee.setSpeed(attackee.getSpeed() + super.getValue());
			}
		}
	}
}
