package com.longnguyen.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class MainView extends JFrame {
	
	JLabel a, b, c,title, result;
	JTextField textA, textB, textResult, textC;
	JButton del, exit, solve;
	JPanel panelABC,panelA, panelB, panelBtn,panelC,panelResult,panelTitle;
	TitledBorder borderText,borderButton;
	
	public MainView(String title)
	{
		super(title);
		addControls();
		addEvents();
		showWindow();
	}
	
	public void addControls()
	{
		this.setLayout(new GridLayout(3, 1));
		panelABC = new JPanel();
		borderText = new TitledBorder(BorderFactory.createLineBorder(Color.RED),"Nhập a,b,c");
		borderButton = new TitledBorder(BorderFactory.createLineBorder(Color.PINK),"Chọn thao tác");
		title = new JLabel("Giải phương trình bậc 2", SwingConstants.CENTER);
		panelTitle = new JPanel();
		panelTitle.setBackground(Color.GRAY);
		title.setForeground(Color.blue);
		title.setFont(title.getFont().deriveFont(32f));
		panelTitle.add(title);
		this.add(panelTitle);
		// ----------------------------------------
		a = new JLabel("a: ");
		textA = new JTextField(20);
		panelA = new JPanel();
		panelA.add(a);
		panelA.add(textA);
		panelABC.add(panelA);
		// ----------------------------------------
		b = new JLabel("b: ");
		textB = new JTextField(20);
		panelB = new JPanel();
		panelB.add(b);
		panelB.add(textB);
		panelABC.add(panelB);
		// ----------------------------------------
		c = new JLabel("c: ");
		textC = new JTextField(20);
		panelC = new JPanel();
		panelC.add(c);
		panelC.add(textC);
		panelABC.add(panelC);

		// -----------------------------------------
		result = new JLabel("Kết quả ",SwingConstants.CENTER);
		textResult = new JTextField(20);
		panelResult = new JPanel();
		panelResult.add(result);
		panelResult.add(textResult);
		panelABC.add(panelResult);
		//------------------------------------------
		panelABC.setBorder(borderText);
		
		this.add(panelABC);
		// ----------------------------------------
		del = new JButton("Xóa");
		solve = new JButton("Giải");
		exit = new JButton("Thoát");
		panelBtn = new JPanel();
		panelBtn.add(solve);
		panelBtn.add(del);
		panelBtn.add(exit);
		panelBtn.setBorder(borderButton);
		this.add(panelBtn);
		
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
				if(textA.getText().isEmpty() || textB.getText().isEmpty()||textC.getText().isEmpty()) {
					textResult.setText("a, b or c is(are) empty!!");
					return;
				}
				Float a =Float.parseFloat(textA.getText());
				Float b =Float.parseFloat(textB.getText());
				Float c =Float.parseFloat(textC.getText());
				if(a==0 && b==0 && c==0) {
					textResult.setText("Infinitive!!");
				}
				else if(a==0 && b==0) {
					textResult.setText("No Solution!!");
				}
				else if(a==0) {
					textResult.setText(""+-c/b);
				}
				else {
					Float delta = b*b - 4*a*c;
					if(delta < 0) {
						textResult.setText("No Solution!!");
					}
					else if(delta ==0) {
						textResult.setText("x= "+-b/(2*a));
					}
					else{
						textResult.setText("x1= "+Math.round((-b-Math.sqrt(delta))/(2*a)) + "   ;x2= "+Math.round((-b+Math.sqrt(delta))/(2*a)));
					}
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
