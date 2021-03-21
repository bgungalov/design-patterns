package observer;

public class TopicSubscriber implements Observer {

	private String name;
	private Observable topic;
	
	public TopicSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(this.topic == null) {
			System.out.println(this.getName() + " has no topic set");
			return;
		}
		String updatedTopic = this.topic.getUpdate();
		System.out.println(this.getName() + " received an update from topic: " + updatedTopic);
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
