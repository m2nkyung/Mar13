import java.util.Scanner;

public class Week13_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx t = new ThreadEx();
		t.start();
		
		Scanner input = new Scanner(System.in);
		System.out.print("값 입력 : ");
		String s = input.next();
		
		System.out.println("입력하신 값은 " + s + "입니다.");
	}
}


class ThreadEx extends Thread {
	public void run() {
		for(int i = 10; i > 0 ; i--) {
			System.out.println(i);
			
			try {
				sleep(3000);
				interrupt();
			} catch(InterruptedException e) {
				System.out.println("catch line");
			}
		} System.out.println("카운트 종료");
	}
}