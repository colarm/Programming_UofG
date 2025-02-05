package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public void run() {
        // 创建主窗口
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(512, 512);

        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10)); // 使用网格布局
        frame.add(panel);

        // 创建标签
        JLabel label = new JLabel("Enter your name:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

        // 创建文本框
        JTextField textField = new JTextField();
        panel.add(textField);

        // 创建按钮
        JButton button = new JButton("Click Me");
        panel.add(button);

        // 创建点击事件监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your name!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Hello, " + input + "!", "Greeting",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // 设置窗口可见
        frame.setVisible(true);
    }
}
