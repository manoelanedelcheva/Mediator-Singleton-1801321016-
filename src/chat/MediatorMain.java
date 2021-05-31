package chat;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator message = new Chat();
		User user1 = new UserChat(message, "user1");
		User user2 = new UserChat(message, "user2");
		User user3 = new UserChat(message, "user3");
		user2.sendMessage("Hi, guys");  //forbidden word
		user3.sendMessage("addBot"); //special word
		user2.sendMessage("cat");   //forbidden word
	}

}
