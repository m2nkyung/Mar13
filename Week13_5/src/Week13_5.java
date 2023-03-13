// -와 |를 반복문으로 100개씩 출력하는 스레드 2개
// 첫번째 스레드에 sleep(2000) 작성
// 각 스레드 끝나기 전에 <th1 종료> 출력
public class Week13_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
	}
}

class Thread1 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		System.out.print("th1 종료");
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("|");
		}
		System.out.print("th2 종료");
	}
}