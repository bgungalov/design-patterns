package instructorCommand;

public class GetUp implements Command {

	private ExerciseType exercises;
	
	public GetUp(ExerciseType exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		exercises.exerciseGetUp();
	}

}
