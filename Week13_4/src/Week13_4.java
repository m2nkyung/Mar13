//p596 페이지 참고해서 작성

public class Week13_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();

	}


}

class Counter {
	private int value = 0;
	public void increment() { value++; }
	public void decrement() { value--; }
	public void printCounter() { System.out.println(value); }
}

class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		this.sharedCounter = c;
	}
	
	public void run() {
		int i = 0;
		while(i < 100) {
			sharedCounter.increment();
			sharedCounter.decrement();
			
			if(i % 40 == 0)
				sharedCounter.printCounter();
			
			try {
				sleep((int) (Math.random() * 2));
			} catch (InterruptedException e) { }
			i++;
		}
	}
}