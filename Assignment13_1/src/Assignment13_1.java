//은행계좌(account)에서 잔고(balance)를 확인하고, 임의의 금액을 출금(withdraw)하는  예제를 완성하세요.

public class Assignment13_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new RunnableEx();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.run();
		t2.run();
	}
}

class RunnableEx implements Runnable {
	int mon;
	Account a = new Account();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(a.getBalance() > 0) {
			mon = ((int) (Math.random() * 3 + 1) * 100);
			a.withdraw(mon);
			
			System.out.println("출금액 : " + mon + ", 잔액 : " + a.getBalance());
		}
	}
}

class Account {
	int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int mon) {
		if(balance < mon) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			balance -= mon;
		}
	}
}