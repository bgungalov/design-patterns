package instructorCommand;

public class LieDown implements Command {

	private ExerciseType exercises;
	
	public LieDown(ExerciseType exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		exercises.exerciseLieDown();
	}


}
