import java.util.concurrent.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ExecutorImpl implements Executor {

	private ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(8);

	
	public void execute(Runnable command) {
		
		queue.add(command);

		while (queue.size() > 0) {
			try {
				Thread t = new Thread(queue.take());
				t.start();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}