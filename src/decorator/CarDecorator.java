package decorator;

public abstract class CarDecorator implements Car {

	protected Car decoratedCar;
	
	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public void create() {
		// Place to decorate the object with additional things
		this.decoratedCar.create();
	}

}
