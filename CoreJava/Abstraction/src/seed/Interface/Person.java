package seed.Interface;

public class Person implements MoveEat {

	@Override
	public void eat() {
		System.out.println("Person is Eating");	
	}

	@Override
	public void move() {
		System.out.println("Person is Eating");
	}
}
