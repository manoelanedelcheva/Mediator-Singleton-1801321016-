package chat;

public abstract class User {
	
	public MessageMediator messageMediator;
	public String userName;

	public User(MessageMediator messageMediator, String userName) {
		this.messageMediator = messageMediator;
		this.userName = userName;
	}

	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);


}
