package events;

public class LunchEvent {

	private int time;

	public int getTime() {
		return time;
	}

	// @Value("30")
	public void setTime(int time) {
		this.time = time;
	}

	public LunchEvent(int time) {
		super();
		this.time = time;
	}

}
