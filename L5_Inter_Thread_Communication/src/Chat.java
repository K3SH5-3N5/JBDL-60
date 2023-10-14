
public class Chat {
	
	boolean flag = false;
	
	public synchronized void question(String msg) {
		if(flag) {
			
			try {
				
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Question: "+msg);
		flag=true;
		notify();
	}
	
	public synchronized void answer(String msg) {
		if(!flag) {
			
			try {
				
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Answer:"+msg);
		flag = false;
		notify();
	}

}
