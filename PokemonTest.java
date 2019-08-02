import java.util.*;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokemon charmander = new Fire("Charmander", 30, 60, 25, new Attack[] {
				new SpeedAttack("charSpeed", 2, 20),
				new DefenseAttack("charDefense", 1, 10),
				new DamageAttack("charDamage", 1, 10)
				});
		Pokemon bulbasaur = new Grass("Bulbasaur", 30, 30, 25, new Attack[] {
				new SpeedAttack("bulbSpeed", 2, 20),
				new DefenseAttack("bulbDefense", 1, 10),
				new DamageAttack("bulbDamage", 1, 10)
				});
		Pokemon squirtle = new Grass("Squirtle", 30, 30, 25, new Attack[] {
				new SpeedAttack("squirtSpeed", 2, 20),
				new DefenseAttack("squirtDefense", 1, 10),
				new DamageAttack("squirtDamage", 1, 10)
				});

		Pokemon galax = new MyPokemon();
		
		Pokemon[] allPokemon = {charmander, bulbasaur, squirtle, galax};
		for(int i = 0; i < allPokemon.length; i++) {
			System.out.println(allPokemon[i]);
		}
		
		System.out.println("Charmander attacks Bulbasaur");
		attack(charmander, bulbasaur);
		System.out.println("Squirtle attacks galax");
		attack(squirtle, galax);
	}
	
	public static void attack(Pokemon attacker, Pokemon attackee) {
		int count = 1;
		Attack[] attackerMoves = attacker.getAttacks();
		Attack[] attackeeMoves = attackee.getAttacks();
		Random rand1 = new Random();
		Random rand2 = new Random();
		
		while(attacker.getHp() > attacker.getDamage() || attackee.getHp() > attackee.getDamage()) {
			if(count % 2 == 1) {
				int r = rand1.nextInt(attackerMoves.length);
				System.out.println(attacker.getName() + " attacks with " + attackerMoves[r]);
				attackerMoves[r].attack(attacker, attackee);
				System.out.println(attackee);
				count++;
			}
			else {
				int r = rand2.nextInt(attackeeMoves.length);
				System.out.println(attackee.getName() + " attacks with " + attackeeMoves[r]);
				attackeeMoves[r].attack(attackee, attacker);
				System.out.println(attacker);
				count++;
			}
		}
		
		if(count % 2 == 1) {
			System.out.println("\n" + attackee.getName() + " WINS!!!");
		}
		else {
			System.out.println("\n" + attacker.getName() + " WINS!!!");
		}
	}

}
