package defaultPackage;

public class Main {

	public static void main(String[] args) {
		
		ChatMediator chatRoom = new ChatRoom("First room");
		
		User firstUser = new RoomUser(chatRoom, "Ivan", "Ivanov", 27, "Plovdiv", "programmer", "Vankata");
		User secondUser = new RoomUser(chatRoom, "Nikolina", "Todorova", 30, "Plovdiv", "doctor", "Nikito");
		User thirdUser = new RoomUser(chatRoom, "Dim0", "Petrov", 22, "Plovdiv", "programmer", "Dimo");
		
		firstUser.sendMessage("Hello, everyone!");
		System.out.println();
		secondUser.sendMessage("Hello, dogs!");
		System.out.println();
		thirdUser.sendMessage("I have a pet which is a dog.");
		System.out.println();
		firstUser.sendMessage("Hello, everyone!");

	}

}
