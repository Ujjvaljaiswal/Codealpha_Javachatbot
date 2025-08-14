import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBotGUI extends JFrame implements ActionListener {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton, themeToggleButton;
    private boolean isDarkMode = false;

    public ChatBotGUI() {
        setTitle("Java ChatBot");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Chat area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setBackground(new Color(220, 220, 255)); // Light blue
        chatArea.setForeground(Color.BLACK);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Input panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Theme button
        themeToggleButton = new JButton("Dark Mode");
        themeToggleButton.addActionListener(e -> toggleTheme());
        inputPanel.add(themeToggleButton, BorderLayout.WEST);

        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void toggleTheme() {
        isDarkMode = !isDarkMode;

        if (isDarkMode) {
            chatArea.setBackground(new Color(30, 30, 30));   // Dark
            chatArea.setForeground(Color.WHITE);
            inputField.setBackground(new Color(50, 50, 50));
            inputField.setForeground(Color.WHITE);
            themeToggleButton.setText("Light Mode");
        } else {
            chatArea.setBackground(new Color(220, 220, 255)); // Light blue
            chatArea.setForeground(Color.BLACK);
            inputField.setBackground(Color.WHITE);
            inputField.setForeground(Color.BLACK);
            themeToggleButton.setText("Dark Mode");
        }
    }

    public void actionPerformed(ActionEvent e) {
        String userText = inputField.getText().trim();
        if (!userText.isEmpty()) {
            chatArea.append("You: " + userText + "\n");
            String botResponse = ChatBotBackend.getResponse(userText);
            chatArea.append("Bot: " + botResponse + "\n");
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        new ChatBotGUI();
    }
}


