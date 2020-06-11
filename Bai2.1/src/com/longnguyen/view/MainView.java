package com.longnguyen.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainView extends JFrame {
	
	JLabel a, b, title, result;
	JTextField textA, textB, textResult;
	JButton del, exit, solve;
	JPanel panelA, panelB, panelBtn, panelResult;
	
	public MainView(String title)
	{
		super(title);
		addControls();
		addEvents();
		showWindow();
	}
	
	public void addControls()
	{
		this.setLayout(new GridLayout(5, 1));
		title = new JLabel("Giải phương trình bậc 1", SwingConstants.CENTER);
		title.setForeground(Color.blue);
		title.setFont(title.getFont().deriveFont(32f));
		this.add(title);
		// ----------------------------------------
		a = new JLabel("Hệ số a: ");
		textA = new JTextField(20);
		panelA = new JPanel();
		panelA.add(a);
		panelA.add(textA);
		this.add(panelA);
		// ----------------------------------------
		b = new JLabel("Hệ số b: ");
		textB = new JTextField(20);
		panelB = new JPanel();
		panelB.add(b);
		panelB.add(textB);
		this.add(panelB);
		// ----------------------------------------
		del = new JButton("Xóa");
		solve = new JButton("Giải");
		exit = new JButton("Thoát");
		panelBtn = new JPanel();
		panelBtn.add(del);
		panelBtn.add(solve);
		panelBtn.add(exit);
		this.add(panelBtn);
		// -----------------------------------------
		result = new JLabel("Kết quả ");
		textResult = new JTextField(20);
		panelResult = new JPanel();
		panelResult.add(result);
		panelResult.add(textResult);
		this.add(panelResult);
		
	}
	
	
	
	public void addEvents() {
		del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textA.setText("");
				textB.setText("");
				textResult.setText("");
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		solve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textA.getText().isEmpty() || textB.getText().isEmpty()) {
					textResult.setText("a or b is empty!!");
					System.out.println("llll");
					return;
				}
				Float a =Float.parseFloat(textA.getText());
				Float b =Float.parseFloat(textB.getText());
				if(a==0 && b==0) {
					textResult.setText("Infinitive!!");
				}
				else if(a==0) {
					textResult.setText("No Solution!!");
				}
				else {
					textResult.setText(""+-b/a);
				}
			}
		});
	}

	public void showWindow() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
