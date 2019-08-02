// creates water type pokemon
public class Water extends Pokemon {
	
	public Water(String name, int speed, int defense, int hp, attack[] attack) {
		super(name, speed, defense, hp, attack);
	}
	
	public Water(String name, attack[] attack) {
		super(name, attack);
	}
	
	public boolean isWeak(Pokemon pokemon) {
		if(pokemon instanceof Grass) {
			return true;
		}
		return super.isWeak(pokemon);
	}
	
	public boolean isResistant(Pokemon pokemon) {
		if(pokemon instanceof Fire) {
			return true;
		}
		return super.isResistant(pokemon);
	}
}
