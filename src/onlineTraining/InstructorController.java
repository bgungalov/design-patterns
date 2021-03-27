package onlineTraining;

public class InstructorController {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void changeExercise() {
		System.out.println("Changing exercise...");
		this.command.execute();
	}
	
}
