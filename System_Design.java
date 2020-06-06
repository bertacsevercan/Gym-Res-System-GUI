package aaaaa;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.util.ArrayList;
public class System_Design {

	public static void main(String[] args)  {
		
		
	
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		Object[] message = {
		    "Username:", username,
		    "Password:", password
		};

		int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
		   
		        System.out.println("Login successful");
		        
		        JFrame jf = new JFrame("CrossFit Box System");
		        jf.setBounds(300, 300, 400, 300);
		        jf.getContentPane().setBackground(Color.RED);
		       
		       jf.setLayout(null);
		        
		        JButton wod_button = new JButton(" WOD ");
				wod_button.setBounds(90, 50, 110,50 );
				jf.add(wod_button);
				wod_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
				
						JOptionPane.showMessageDialog(null, "Workout of the day:"
								+ "\nCindy "
								+ "\n20 Min AMRAP:"
										+ "\n5 Pull Up"
										+ "\n10 Push Up"
										+ "\n15 Air Squat");
						
					}
				});
				

		        JButton res_button = new JButton("Reservation");
				res_button.setBounds(90, 100, 110,50 );
				jf.add(res_button);
				res_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					
						
						JPanel  res = new JPanel();
						res.setBounds(0, 0, 400, 40);
						res.setBackground(Color.yellow);
						
						res.setVisible(true);
							
						JLabel name = new JLabel("Classes:");
						String [] clas = new String [] {"07:30","12:30","17:00","18:00","19:00"};					
						JComboBox cla = new JComboBox(clas);
						Integer [] days = new Integer [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};					
						JComboBox day = new JComboBox(days);
						Integer [] months = new Integer [] {1,2,3,4,5,6,7,8,9,10,11,12};					
						JComboBox month = new JComboBox(months);
						Integer [] years = new Integer [] {2020,2021,2022,2023,2024,2025};					
						JComboBox year = new JComboBox(years);
						JButton confirm = new JButton("Reserve");
						confirm.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "You have made a reservation!");
						
							}
						});
					
						
						res.add(confirm);
						res.add(name);
						res.add(cla);
						res.add(day);
						res.add(month);
						res.add(year);						
						jf.add(res);
						
					}
				});
				
				 JButton info_button = new JButton("Membership");
					info_button.setBounds(90, 150, 110,50 );
					jf.add(info_button);
					info_button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
					
							JOptionPane.showMessageDialog(null, "Your Membership:"
									+ "\n ?? Month "
									+ "\nStart Date: ??-??-????"
											+ "\nFinish Date: ??-??-????"
											);
							
						}
					});
				
					 JButton exit_button = new JButton("Exit");
						exit_button.setBounds(90, 200, 110,50 );
						jf.add(exit_button);
						exit_button.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
						
								System.exit(0);
									
							}
						});
		        
		        
		        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        jf.setVisible(true);
		   
}
}
}
