public class TimedTask implements Runnable {
	
	private int duration;

	public TimedTask(int duration) {
		this.duration = duration;
	}
	

	public void run() {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}