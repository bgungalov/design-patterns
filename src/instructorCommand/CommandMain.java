package instructorCommand;

public class CommandMain {

	public static void main(String[] args) {


		InstructorController instructorController = new InstructorController();
		ExerciseType exerciseType = new ExerciseType();
		Command startTraining = new GetUp(exerciseType);
		Command stopTraining = new LieDown(exerciseType);
		
		
		instructorController.setCommand(startTraining);
		instructorController.changeExercise();
		
		instructorController.setCommand(stopTraining);
		instructorController.changeExercise();
		
		
	}

}
