package instructorObserver;

public class ObserverMain {

	public static void main(String[] args) {

		Exercise exercise = new Exercise();
		Observer obs1 = new ExerciseSubscriber("Person 1");
		Observer obs2 = new ExerciseSubscriber("Person 2");
		Observer obs3 = new ExerciseSubscriber("Person 3");
		
		exercise.subscribe(obs1);
		exercise.subscribe(obs2);
		exercise.subscribe(obs3);
		
		exercise.setExercise("Chest exercise");
		exercise.setExercise("Legs exercise");

	}

}
