package chat;

public interface MessageMediator {
	void addUser(User user);
	void sendMessage(String messageMediator, User user);
}
