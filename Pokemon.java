//Julia Wang
//APCS Period 1


// creates new pokemon with information
public class Pokemon {
	
	private String name;
	private int speed;
	private int defense;
	private int hp;
	private Attack[] attack;
	private int damage;
	private int energy = 0;
	
	// first constructor
	public Pokemon(String name, int speed, int defense, int hp, Attack[] attack) {
		
		if(name.equals("")) {
			throw new IllegalArgumentException("Name needs a value");
		}
		
		if(speed <= 0) {
			throw new IllegalArgumentException("Speed must be greater than zero");
		}
		
		if(defense <= 0) {
			throw new IllegalArgumentException("Defense must be greater than zero");
		}
		
		if(hp <= 0) {
			throw new IllegalArgumentException("HP must be greater than zero");
		}
		
		if(attack.length < 1 || attack.length > 3) {
			throw new IllegalArgumentException("Must have between one and three attack");
		}
		
		if(damage < 0) {
			throw new IllegalArgumentException("Damage must be greater than or equal to zero");
		}
		
		if(energy < 0) {
			throw new IllegalArgumentException("Energy must be greater than or equal to zero");
		}
		
		if(speed + defense + hp > 150) {
			throw new IllegalArgumentException("Sum of speed, defense, and hp must not be greater than 150");
		}
		
		int attackum = 0;
		for(int i = 0; i < attack.length; i++) {
			attackum += Math.abs(attack[i].getValue());
		}
		if(attackum > 150) {
			throw new IllegalArgumentException("Sum of attack values must not be greater than 150");
		}
		
		this.name = name;
		this.speed = speed;
		this.defense = defense;
		this.hp = hp;
		this.attack = attack;
	}
	
	// second constructor
	public Pokemon(String name, Attack[] attack) {
		this(name, 50, 50, 50, attack);
	}
	
	// pokemon accessors
	
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getHp() {
		return hp;
	}
	
	public Attack[] getAttack() {
		return attack;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	/* ------------------- TEST ------------------- 
	public int changeDamage(int damageAmount) {
		return damage += damageAmount;
	}
	
	public int changeEnergy(int energyAmount) {
		if(energyAmount > 1) {
			throw new IllegalArgumentException("energy amount must not be greater than one");
		}
		return energy -= energyAmount;
	}
	*/
	
	//pokemon modifiers
	
	public void setSpeed(int amount) {
		speed = amount;
	}
	
	public void setDefense(int amount) {
		defense = amount;
	}
	
	public void setDamage(int amount) {
		damage = amount;
	}
	
	public void setEnergy(int amount) {
		if(amount > 1) {
			throw new IllegalArgumentException("Energy amount must not be greater than one");
		}
		energy = amount;
	}
	
	public Attack getAttackObject(String name) {
        for (int i = 0; i < this.getAttack().length; i++) {
               if (attack[i].getName().equals(name)) {
                      return attack[i];                      
               }
         }
        return null;
  	}
	
	public String toString() {
		String string = name + ", Speed " + speed + ", Defense " + defense + ", HP " + hp + ", Damage " + damage + ", Energy " + energy;
		for(int i = 0; i < attack.length; i++) {
			string += "\n" + attack[i].toString(); 
		}
		string += "\n";
		return string;
	}
	
	public boolean isWeak(Pokemon pokemon) {
		return false;
	}
	
	public boolean isResistant(Pokemon pokemon) {
		return false;
	}
}
