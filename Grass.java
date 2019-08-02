
public class Grass extends Pokemon {
	
	public Grass(String name, int speed, int defense, int hp, Attack[] attack) {
		super(name, speed, defense, hp, attack);
	}
	
	public Grass(String name, Attack[] attack) {
		super(name, attack);
	}
	
	public boolean isWeak(Pokemon pokemon) {
		if(pokemon instanceof Fire) {
			return true;
		}
		return super.isWeak(pokemon);
	}
	
	public boolean isResistant(Pokemon pokemon) {
		if(pokemon instanceof Water) {
			return true;
		}
		return super.isResistant(pokemon);
	}

}
