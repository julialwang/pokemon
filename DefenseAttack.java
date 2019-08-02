// extends attack as type defense
public class DefenseAttack extends Attack{

	public DefenseAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	
	public DefenseAttack(String name, int value) {
		super(name, value);
	}
	
	public String toString() {
		return super.toString().replaceAll("value", "defense");
	}
	
	public void attack(Pokemon attacker, Pokemon attackee) {
		
		// modifies defense by half of attack if attackee is resistant to attacker
		if(attacker.isResistant(attackee)) {
			if(attackee.getDefense() + super.getValue()/2 < 0) {
				attackee.setDefense(0);
			} else {
				attackee.setDefense(attackee.getDefense() + super.getValue()/2);
			}			
		}
		
		// modifies defense by double of attack if attackee is weak to attacker
		else if(attacker.isWeak(attackee)) {
			if(attackee.getDefense() + super.getValue()*2 < 0) {
				attackee.setDefense(0);
			} else {
				attackee.setDefense(attackee.getDefense() + super.getValue()*2);
			}
		}
		
		// modifies defense by attack in all other cases
		else {
			if(attackee.getDefense() + super.getValue() < 0) {
				attackee.setDefense(0);
			} else {
				attackee.setDefense(attackee.getDefense() + super.getValue());
			}
		}
	}
}
