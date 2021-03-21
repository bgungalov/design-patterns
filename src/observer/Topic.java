package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<Observer> observers;
	private String topic;
	
	public Topic() {
		this.observers = new ArrayList<>();
	}

	public void setTopic(String newTopic) {
		this.topic = newTopic;
		this.notifyObservers();
	}
	
	@Override
	public void subscribe(Observer topicSubscriber) {
		this.observers.add(topicSubscriber);
		topicSubscriber.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer topicSubscriber) {
		this.observers.remove(topicSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// can be something more than just getTopic
		return this.topic;
	}

}
