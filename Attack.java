// creates a new attack
public class Attack {
	
	private String name;
	private int energy = 0;
	private int value;
	
	// first attack constructor
	public Attack(String name, int energy, int value) {
		
		if(name.equals("")) {
			throw new IllegalArgumentException("Name needs a value");
		}
		
		if(energy < 1 || energy > 5) {
			throw new IllegalArgumentException("Energy must be greater than or equal to one and less than or equal to five");
		}
		
		if(Math.abs(value) > 10 * energy || value % 10 != 0) {
			throw new IllegalArgumentException("Value must be less than or equal to 10 times energy value and must be a multiple of 10");
		}
		
		this.name = name;
		this.energy = energy;
		this.value = value;
	}
	
	// second constructor
	public Attack(String name, int value) {
		this(name, 1, value);
	}
	
	// attack accessors 
	
	public String getName() {
		return name;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String statement = ("\t" + name + ": energy " + energy + ", value ");
		
		if(value < 0) {
			statement += ("-" + value);
		}
		
		else {
			statement += ("+" + value);
		}
		
		return statement;
	}
	
	public void attack(Pokemon attacker, Pokemon attackee) {
		
	}
	
}
