//Package Definition
package seed.upcastingdowncasting;
//Driver Code
public class TestAnimal {

	public static void getAllmakeNoise(Animal a){
		a.makeNoise();
		
		if (a instanceof Dog){
			((Dog) a).Noise();
			
			a.makeNoise();
			
			Dog d = (Dog) a;
			d.makeNoise();
			d.Noise();
		}else if (a instanceof Cat){
			((Cat) a).Noise();
			
			a.makeNoise();
			
			Cat c = (Cat) a;
			c.makeNoise();
			c.Noise();	
		}
}
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeNoise();
		
		Dog d1 = new Dog();
		d1.makeNoise();
		d1.Noise();
		
	    System.out.println("----------------------");
		
	    Animal a2 = new Dog();
		a2.makeNoise();
		
		Animal a3 = new Dog();
		Dog d2 = (Dog) a3;
		d2.makeNoise();
		d2.Noise();
		
		System.out.println("----------------------");
		
		TestAnimal.getAllmakeNoise(a1);
		System.out.println("----------------------");
		TestAnimal.getAllmakeNoise(d1);
		System.out.println("----------------------");
		TestAnimal.getAllmakeNoise(a2);
		System.out.println("----------------------");
		TestAnimal.getAllmakeNoise(d2);
	}
}