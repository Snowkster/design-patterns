package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class ChatBotSingleton {
	
	private static ChatBotSingleton chatBot;

	private ChatBotSingleton() {
	}

	public static ChatBotSingleton getInstance() {

		if (chatBot == null) {
			chatBot = new ChatBotSingleton();
		}
		return chatBot;
	}

	public void isBotConnected() {
		System.out.println("The ChatBot is connected successfully.");
	}
	
	public boolean isUserMessageContainsDog(String message) {
		return message.contains("cat");
	}
	
	public List<User> isUserMessageContainsDog(String message, List<User> users, User user) {
		List<User> list = users;
		if(message.contains("dog")) {
			list.remove(user);
			System.out.println("This user is removed: " + user.toString());
		} 
		return list;
	}
	
}
