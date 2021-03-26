package instructorCommand;

public class ExerciseType {

	private Boolean getUpExercise;
	
	public void exerciseGetUp() {
		System.out.println("Exercise: GET UP");
		this.getUpExercise = true;
	}

	public void exerciseLieDown() {
		System.out.println("Exercise: LIE DOWN");
		this.getUpExercise = false;
	}
}
