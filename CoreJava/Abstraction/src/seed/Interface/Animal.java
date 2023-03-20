package seed.Interface;

public class Animal implements MoveEat {

	@Override
	public void eat() {
		System.out.println("Animal is Eating");
	}

	@Override
	public void move() {
		System.out.println("Animal is Moving");
	}

}
