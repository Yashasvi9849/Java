import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TaskManager extends JFrame {

    private JPanel taskPanel;
    private JButton addButton;
    private JButton clearButton;
    private ArrayList<JCheckBox> taskList;

    public TaskManager() {
        setTitle("SwiftList Task Manager");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskList = new ArrayList<>();

        // Panel to hold tasks
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(taskPanel);

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("➕ Add Task");
        clearButton = new JButton("🧹 Clear All");
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        // Add panels to frame
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add task button action
        addButton.addActionListener(e -> addTask());

        // Clear all button action
        clearButton.addActionListener(e -> clearTasks());
    }

    private void addTask() {
        String taskText = JOptionPane.showInputDialog(this, "Enter a new task:");
        if (taskText != null && !taskText.trim().isEmpty()) {
            JCheckBox task = new JCheckBox(taskText);
            taskList.add(task);
            taskPanel.add(task);
            taskPanel.revalidate();
            taskPanel.repaint();
        }
    }

    private void clearTasks() {
        taskPanel.removeAll();
        taskList.clear();
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TaskManager app = new TaskManager();
            app.setVisible(true);
        });
    }
}
