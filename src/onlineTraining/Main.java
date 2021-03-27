package onlineTraining;

public class Main {

	public static void main(String[] args) {


		InstructorController instructorController = new InstructorController();
		Trainer trainer = new Trainer();
		Command lieDownCommand = new LieDownCommand(trainer);
		Command getUpCommand = new GetUpCommand(trainer);

		instructorController.setCommand(getUpCommand);
		instructorController.changeExercise();

		instructorController.setCommand(lieDownCommand);
		instructorController.changeExercise();
		
		
	}

}
