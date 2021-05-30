package defaultPackage;

import java.util.List;
import java.util.ArrayList;

public class ChatRoom implements ChatMediator {

	private List<User> users;
	private ChatBotSingleton chatBot;
	private String roomName;

	public ChatRoom(String roomName) {
		this.users = new ArrayList<>();
		this.roomName = roomName;
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendUserMessage(String message, User user) {

		String recentMessage = chatBot.isUserMessageContainsDog(message)
				? "This message contains 'dog' and it's not valid!"
				: message;

		this.users = chatBot.isUserMessageContainsDog(message, users, user);

		for (User recentUser : this.users) {
			if (recentUser != user) {
				recentUser.receiveMessage(recentMessage);
			}
		}
	}

	@Override
	public void addBot() {
		if (chatBot == null) {
			this.chatBot = ChatBotSingleton.getInstance();
			chatBot.isBotConnected();
		}
	}
}
