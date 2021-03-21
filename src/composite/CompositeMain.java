package composite;

public class CompositeMain {

	public static void main(String[] args) {


		Developer dev1 = new Developer("Ivan", 2000);
		Developer dev2 = new Developer("Peter", 3000);
		
		Manager manager1 = new Manager("Georgi", 4000);
		manager1.add(dev1);
		manager1.add(dev2);
		
		Developer dev3 = new Developer("Stamat", 5000);
		
		Manager manager2 = new Manager("Vasil", 6000);
		manager2.add(manager1);
		manager2.add(dev3);
		
		manager2.printData();
	}

}
