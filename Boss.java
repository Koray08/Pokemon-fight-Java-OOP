import java.util.ArrayList;
import java.util.Random;

public class Boss extends Pokemon{
	int massDamageChance;

    Random random = new Random();

    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public void AddRival(Pokemon x) {
        pokemons.add(x);
    }


    public Boss(String name, int power, int hp, int eva, int attackSpeed, int massDamageChance) {
		super(name, power, hp, eva, attackSpeed);
        this.massDamageChance = massDamageChance;
    };

	public void eliminate(int i) {
		System.out.println("\n" + pokemons.get(i).name + " got defeated.\n");
		pokemons.remove(i);
	}
	
    @Override
	public void run() {

		while(true) {
			if(random.nextInt(101) < massDamageChance) {
				for(int i=0; i<pokemons.size();i++) {
					pokemons.get(i).hp -= power;
					System.out.println("MASS ATTACK: Boss hit with " + power + " damage to " + pokemons.get(i).name + " remaining hp: " + ((pokemons.get(i).hp <= 0) ? 0 + " hp.": pokemons.get(i).hp + " hp."));
					if (pokemons.get(i).hp <= 0) {
						eliminate(i);
						if (pokemons.size() == 0) {
							break;
						}
					}
				}
			}
			else { 
				int index = (pokemons.size() != 1) ? random.nextInt(pokemons.size()) : 0;
				pokemons.get(index).hp -= power;
				System.out.println("Boss hit " + pokemons.get(index).name + " for " + power + " points of damage and left him with " + ((pokemons.get(index).hp <= 0) ? 0 : pokemons.get(index).hp + " hp."));
				if (pokemons.get(index).hp <= 0) {
					eliminate(index);
					if (pokemons.size() == 0) {
						break;
					}
				}
			}
			
			
			
			try {
				sleep((long) (1000 / attackSpeed));				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	

			if (hp <= 0) {
				break;
			}
		}

	try {
		if(hp > 0) {
			Thread.sleep(1,5 * 1000);
			System.out.println("\n" + name + ": HAHAHAHA LOOOOOOSEEEEEEEER!!!\n");
		}else {
			Thread.sleep(1,5 * 1000);
			System.out.println("\n" + name + ": CHEATEEEEEEEEEEEEEEEEEEER!!!!!!!!!\n");
		}
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}


}}
