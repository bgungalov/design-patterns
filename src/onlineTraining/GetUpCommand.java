package onlineTraining;

public class GetUpCommand implements Command {

	private Trainer trainer;
	
	public GetUpCommand(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		trainer.getUpExercise();
	}


}
