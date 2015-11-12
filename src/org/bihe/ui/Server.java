package org.bihe.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Server extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{183, 57, 0, 0, 0, 0, 0, 18, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("\u062E\u0631\u0648\u062C");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel User = new JPanel();
		tabbedPane.addTab("\u06A9\u0627\u0631\u0628\u0631", null, User, null);
		GridBagLayout gbl_User = new GridBagLayout();
		gbl_User.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 44, 39, 0};
		gbl_User.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_User.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_User.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		User.setLayout(gbl_User);
		
		JButton button = new JButton("\u0627\u0641\u0632\u0648\u062F\u0646");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridheight = 2;
		gbc_button.gridwidth = 3;
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 11;
		gbc_button.gridy = 1;
		User.add(button, gbc_button);
		
		JButton button_1 = new JButton("\u0648\u06CC\u0631\u0627\u06CC\u0634");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridheight = 2;
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.gridwidth = 4;
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 11;
		gbc_button_1.gridy = 3;
		User.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("\u062D\u0630\u0641");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridheight = 2;
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridwidth = 4;
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.gridx = 11;
		gbc_button_2.gridy = 5;
		User.add(button_2, gbc_button_2);
		
		JPanel Logs = new JPanel();
		tabbedPane.addTab("\u06AF\u0632\u0627\u0631\u0634\u0627\u062A", null, Logs, null);
		Logs.setLayout(new BorderLayout(0, 0));
	}

}
