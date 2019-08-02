
public class Fire extends Pokemon {

	public Fire(String name, int speed, int defense, int hp, Attack[] attack) {
		super(name, speed, defense, hp, attack);
	}
	
	public Fire(String name, Attack[] attack) {
		super(name, attack);
	}
	
	public boolean isWeak(Pokemon pokemon) {
		if(pokemon instanceof Water) {
			return true;
		}
		return super.isWeak(pokemon);
	}
	
	public boolean isResistant(Pokemon pokemon) {
		if(pokemon instanceof Grass) {
			return true;
		}
		return super.isResistant(pokemon);
	}
	
}
