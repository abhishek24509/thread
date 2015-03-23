package abhishek.thread;

public class MyRunThread extends Thread  {
	
	String name ;

	@Override
	public void run() {
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
		

	        for (int i = 0;
	             i < importantInfo.length;
	             i++) {
	            //Pause for 4 seconds
	            try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     
	            //Print a message
	            System.out.println(importantInfo[i]+this.name);
	        }
		
	}
	public static void main(String[] args){
		MyRunThread obj = new MyRunThread();
		obj.name = "Abhishek";
		obj.start();
	
		try {
			obj.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyRunThread obj1 = new MyRunThread();
		obj1.name = "Abhishek Saxena";
		obj1.start();
		
	}

}
