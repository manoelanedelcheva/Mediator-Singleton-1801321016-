package chat;

public class UserChat extends User {

	public UserChat(MessageMediator messageMediator, String userName) {
		super(messageMediator, userName);
		messageMediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("\n");
		System.out.println(this.userName + " sent: " + message);
		this.messageMediator.sendMessage(message, this);
	}
	@Override
	public void receiveMessage(String message) {
		System.out.println(this.userName + " received: " + message);
	}

}
