package com.longnguyen.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainView extends JFrame {
	
	JLabel name,title,birth,email,sex,province,operations;
	JTextField textName, textBirth, textEmail;
	JButton register,reset;
	JRadioButton male,female;
	JPanel panelName,panelBirth,panelEmal,panelOperations,panelSex,panelProvince;
	JComboBox<String> city;
	
	public MainView(String title)
	{
		super(title);
		addControls();
		addEvents();
		showWindow();
	}
	
	public void addControls()
	{
		this.setLayout(new GridLayout(8,1));
		name = new JLabel("Name ");
		title = new JLabel("  Register infomation");
		birth = new JLabel("Date of Birth");
		email = new JLabel("Email");
		sex = new JLabel("Sex");
		province = new JLabel("Province");
		operations = new JLabel(" Operations");
		panelName= new JPanel();
		panelBirth= new JPanel();
		panelEmal= new JPanel();
		panelOperations = new JPanel();
		panelSex = new JPanel();
		panelProvince = new JPanel();
		textName = new JTextField(20);
		textBirth = new JTextField(20);
		textEmail = new JTextField(20);
		register = new JButton("Register");
		reset = new JButton("Reset");
		//-------------------------------------
		panelName.add(name);
		panelName.add(textName);
		panelBirth.add(birth);
		panelBirth.add(textBirth);
		panelEmal.add(email);
		panelEmal.add(textEmail);
		//-------------------------------------
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		panelSex.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelSex.add(sex);
		panelSex.add(male);
		panelSex.add(female);
		//-------------------------------------
		city = new JComboBox<String>();
		city.addItem("Hà Nội");
		city.addItem("Tp. HCM");
		panelProvince.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelProvince.add(province);
		panelProvince.add(city);
		//-------------------------------------
		panelOperations.add(register);
		panelOperations.add(reset);
		//-------------------------------------
		//-------------------------------------
		this.add(title);
		this.add(panelName);
		this.add(panelBirth);
		this.add(panelEmal);
		this.add(panelSex);
		this.add(panelProvince);
		this.add(operations);
		this.add(panelOperations);
		
		//Chinh sua
		textName.setPreferredSize(textBirth.getPreferredSize());
		textEmail.setPreferredSize(textBirth.getPreferredSize());
				
		email.setPreferredSize(birth.getPreferredSize());
		name.setPreferredSize(birth.getPreferredSize());
		sex.setPreferredSize(birth.getPreferredSize());
		province.setPreferredSize(birth.getPreferredSize());
		
	}
	public void addEvents() {
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textName.setText("");
				textBirth.setText("");
				textEmail.setText("");
			}
		});
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileOutputStream fow = new FileOutputStream("/Users/longnguyen/Desktop/dulieu.txt");
					OutputStreamWriter osw = new OutputStreamWriter(fow,"UTF-8");
					BufferedWriter bw = new BufferedWriter(osw);
					bw.write("Tên: "+textName.getText()+"\n");
					bw.write("Ngày sinh:"+textBirth.getText()+"\n");
					bw.write("Email: "+textEmail.getText()+"\n");
					bw.write("Địa chỉ: "+ city.getSelectedItem().toString()+"\n");
					bw.write("--------------------------------------------------\n");
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}

	public void showWindow() {
		this.setSize(350, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
