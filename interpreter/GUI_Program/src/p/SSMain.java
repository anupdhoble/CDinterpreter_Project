package p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

import javax.swing.border.EmptyBorder;

class MyFrame extends JFrame {

    JPanel panel, messagePanel, headerPanel;
    JScrollPane scrollPane;
    JLabel heading, fileName, message, team, collegeName, collegeLogo,teachers;
    JButton fileChoose;

    MyFrame() {
        setTitle("CSE B Compiler Design Project");
        setSize(900, 900);
        init();
        createGUI();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void init() {
        fileChoose = new JButton("Choose File");
        panel = new JPanel();
        messagePanel = new JPanel();
        headerPanel = new JPanel();
        fileName = new JLabel();
        team = new JLabel();
        message = new JLabel();
        heading = new JLabel();
        collegeName = new JLabel("Shri Ramdeobaba College Of Engineering And Management, Nagpur");
        collegeLogo = new JLabel();
        scrollPane = new JScrollPane(messagePanel);

        // Load and set the college logo
        ImageIcon icon = new ImageIcon(getClass().getResource("./rcoem.png")); 
                                                                              
        if (icon != null) {
            Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
                                                                                          
            collegeLogo.setIcon(new ImageIcon(image));
        }
    }

    void createGUI() {
        panel.setBackground(Color.decode("#66ff99"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(30, 30, 60, 30));

        heading.setText("Syntax Analyser for DummyC");
        heading.setFont(new Font("Courier", Font.BOLD, 20));
        heading.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));

 
        collegeLogo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        collegeName.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        collegeName.setFont(new Font("Courier", Font.BOLD, 20));

        headerPanel.setBackground(Color.ORANGE);
        headerPanel.setPreferredSize(new Dimension(700, 150)); 
        headerPanel.add(Box.createVerticalGlue());
        headerPanel.add(collegeLogo);
        headerPanel.add(Box.createVerticalStrut(10));
        headerPanel.add(collegeName); 
        headerPanel.add(Box.createVerticalGlue()); 

        team = new JLabel("Group: B27 Anup Dhoble, B23 Akshat Shah, B40 Dhyanesh Dharmik");
        team.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        team.setFont(new Font("Courier", Font.PLAIN, 14));
        team.setForeground(Color.BLACK);

        fileChoose.setMargin(new Insets(10, 10, 10, 10));
        fileChoose.setBackground(Color.decode("#6eafe8"));
        fileChoose.setForeground(Color.decode("#ffffff"));
        fileChoose.setContentAreaFilled(false);
        fileChoose.setBorderPainted(false);
        fileChoose.setOpaque(true);
        fileChoose.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        fileName.setText(" File chosen : ");
        fileName.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        messagePanel.setLayout(new FlowLayout());
        messagePanel.setBackground(Color.WHITE);
        messagePanel.add(message);

        teachers =new JLabel("Mentors: Prof. Shubhangi Tirpude , Prof. Vrushali Bongirwar CSE Dept. RCOEM");
        teachers.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        teachers.setFont(new Font("Courier", Font.PLAIN, 14));
        teachers.setForeground(Color.BLACK);

        panel.add(headerPanel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(heading);
        panel.add(Box.createVerticalStrut(20));
        panel.add(team);
        panel.add(Box.createVerticalStrut(20));
        panel.add(fileChoose);
        panel.add(Box.createVerticalStrut(20));
        panel.add(fileName);
        panel.add(Box.createVerticalStrut(20));
        panel.add(scrollPane);
        panel.add(Box.createVerticalStrut(20));
        panel.add(teachers);
        panel.add(Box.createVerticalStrut(20));

        add(panel);

        fileChoose.addMouseListener(new Listener(fileChoose, fileName, message, messagePanel, scrollPane));
    }
}

public class SSMain {
    public static void main(String[] args) {
        new MyFrame();
    }
}
