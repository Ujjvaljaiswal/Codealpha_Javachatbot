import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("🤖 Hello! I’m CodeAlpha ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("Bot: Hello there! How can I assist you today?");
            } else if (input.contains("your name")) {
                System.out.println("Bot: I’m CodeAlpha Bot, your virtual assistant!");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm doing great, thanks for asking!");
            } else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a great day! 👋");
                break;
            } else if (input.contains("help") || input.contains("support")) {
                System.out.println("Bot: I can help you with internship info, tasks, or Java basics.");
            } else {
                System.out.println("Bot: Sorry, I didn’t understand that. Can you try again?");
            }
        }

        scanner.close();
    }
}
