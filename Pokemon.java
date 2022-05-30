import java.util.Random;

public class Pokemon extends Thread {

	String name;
	int power;
	int hp;
	int evadeChance;
	double attackSpeed;
	
	Pokemon target;
	Random random = new Random();
	
	public Pokemon(String name, int power, int hp, int evadeChance, double attackSpeed) {
		super();
		this.name = name;
		this.power = power;
		this.hp = hp;
		this.evadeChance = evadeChance;
		this.attackSpeed = attackSpeed;
	}
	
	@Override
	public void run() {
	
		while(hp > 0 && target.hp > 0) {
			
			if(random.nextInt(101) > target.evadeChance) {
				target.hp -= power;
				System.out.println(name + " hit " + target.name + " for " + power +
						" points of damage and left him with " + ((target.hp <= 0) ? 0 + " hp.": target.hp + " hp."));
			}else {
				System.out.println(name + " missed! ");				
			}
			
			
			try {
				
				sleep((long) (1000 / attackSpeed));				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			
		
		}
		
		if(hp > 0) {
			System.out.println("\n" + name + ": HAHAHAHA LOOOOOOSEEEEEEEER!!!\n");
		}else {
			System.out.println("\n" + name + ": CHEATEEEEEEEEEEEEEEEEEEER!!!!!!!!!\n");
		}

		
	}
	
	
	
}