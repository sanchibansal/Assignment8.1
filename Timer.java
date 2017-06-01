public class Timer {

	public static void main(String[] args) {
		int i=1;
		//Run the delay method for 50 iterations
		while(i<=50){
			delay(); // Calls the delay method
			System.out.println("Timer :"+i);// Prints timer
			i++;
		}
	}
	
	// This method will cause the delay of 1 second
	static void delay() {
		try {
			Thread.sleep(1000);	// can be changed to 2000 for 2 seconds and so on
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}