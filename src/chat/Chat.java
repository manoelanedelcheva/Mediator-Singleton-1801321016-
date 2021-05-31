package chat;

import java.util.ArrayList;
import java.util.List;


public class Chat implements MessageMediator {
	
	private List<User> users;
    

	public Chat() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	private boolean addBot = false; 
	@Override
	public void sendMessage(String message, User user) {
		if(message == "addBot") {                               
			addBot = true;
		}
		
		for(User chatUser: this.users) {
			
			if(chatUser!=user) {
				chatUser.receiveMessage(message);
			}
		}
		
		if(addBot == true && message == "cat") { 
			System.out.println("Forbidden word: 'Cat'");
		
			users.remove(user);
		}
		
	}	
	
}
