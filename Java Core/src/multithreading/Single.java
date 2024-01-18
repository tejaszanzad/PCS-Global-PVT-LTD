package multithreading;

//Single Tasking Using Thread
class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//execute the task one by one by calling methods
		task1();
		task2();
		task3();
		
	}
  void task1() {
  	System.out.println("This is task 1");
  }
  void task2() {
  	System.out.println("This is task 2");
  }
  void task3() {
  	System.out.println("This is task 3");
  }
  
}
  public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an object of MyThread Class
				MyThread obj = new MyThread();
				
				//Create a thread t1 and attach it to that object
				Thread t1 = new Thread(obj);
				
				//execute the thread t1 on the objects run() method
				t1.start();
	}

}
