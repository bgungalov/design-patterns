package onlineTraining;

public class Trainer {

	private Boolean exerciseType;

	public void getUpExercise() {
		System.out.println("Get Up exercise");
		this.exerciseType = true;
	}
	
	public void lieDownExercise() {
		System.out.println("Lie Down exercise");
		this.exerciseType = false;
	}
}
