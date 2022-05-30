public class Main {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("pikachu1", 100, 1000, 40, 2);
        Pokemon p2 = new Pokemon("pikachu2", 100, 1000, 40, 2);
        Pokemon p3 = new Pokemon("pikachu3", 300, 1000, 40, 2);
        Pokemon p4 = new Pokemon("pikachu4", 300, 2000, 40, 2);

		Boss boss = new Boss("boss", 200, 2000, 0, 2, 5);
	
        boss.AddRival(p1);
        boss.AddRival(p2);
        // boss.AddRival(p3);

        p1.target = boss;
        p2.target = boss;
        // p3.target = boss;
		// p3.target = p4;
        // p4.target = p3;





		
		p1.start();
        p2.start();
        // p3.start();
        // p4.start();
        boss.start();
        

	}

}