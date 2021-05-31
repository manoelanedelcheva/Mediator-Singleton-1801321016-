package chat;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		
	}
	
	public static Singleton getInstance() { 
		
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {
		//System.out.println(message);
		System.out.println("Forbidden word: 'Cat'");
	}

}
