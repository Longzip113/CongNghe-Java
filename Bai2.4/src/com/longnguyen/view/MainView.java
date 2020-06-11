package com.longnguyen.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JFrame {
	
	JTextField txtManHinh;
	JButton btn1, btn2, btn3, btn4, btn5,
	btn6, btn7, btn8, btn9, btn10,
	btn11, btn12, btn13, btn14, btn15,
	btn16, btn17, btn18, btn19, btn20;
	
	private boolean newOperation = true;
	private float score = 0;
	private String operation = null;
	
	public MainView(String title)
	{
		super(title);
		addControls();
		addEvents();
		showWindow();
	}
	
	public void addControls()
	{
		Container con = getContentPane();

		JPanel pnTop = new JPanel();
		JPanel pnButtom = new JPanel();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.add(pnTop);
		con.add(pnButtom);
		pnTop.setLayout(new BorderLayout());
		JPanel pnManHinh = new JPanel();
		txtManHinh = new JTextField(25);
		txtManHinh.setPreferredSize(new Dimension(100, 50));
		pnManHinh.add(txtManHinh);
		pnTop.add(pnManHinh, BorderLayout.CENTER);
		
		pnButtom.setLayout(new BoxLayout(pnButtom, BoxLayout.Y_AXIS));
		JPanel pnButtom1 = new JPanel();
		JPanel pnButtom2 = new JPanel();
		JPanel pnButtom3 = new JPanel();
		JPanel pnButtom4 = new JPanel();
		
		pnButtom.add(pnButtom1);
		pnButtom1.setLayout(new FlowLayout());
		pnButtom.add(pnButtom2);
		pnButtom2.setLayout(new FlowLayout());
		pnButtom.add(pnButtom3);
		pnButtom3.setLayout(new FlowLayout());
		pnButtom.add(pnButtom4);
		pnButtom4.setLayout(new FlowLayout());
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn1.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn1.getText());
				}
			}
		});
		btn1.setPreferredSize(new Dimension(50, 50));
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn2.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn2.getText());
				}
			}
		});
		btn2.setPreferredSize(new Dimension(50, 50));
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn3.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn3.getText());
				}
			}
		});
		btn3.setPreferredSize(new Dimension(50, 50));
		
		
		btn4 = new JButton("/");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(txtManHinh.getText());
						break;
					case "-":
						score -= Float.parseFloat(txtManHinh.getText());
						break;
					case "/":
						score /= Float.parseFloat(txtManHinh.getText());
						break;
					case "*":
						score *= Float.parseFloat(txtManHinh.getText());
						break;
					}
				} else {
					score = Float.parseFloat(txtManHinh.getText());
				}
				txtManHinh.setText("");
				newOperation = true;
				operation = "/";
			}
		});
		btn4.setPreferredSize(new Dimension(50, 50));
	
		btn5 = new JButton("sqrt");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				Double kq = Math.sqrt(Double.parseDouble(txtManHinh.getText()));
				txtManHinh.setText(String.valueOf(new DecimalFormat("##.##").format(kq)));
				newOperation = true;
				operation = null;
			}
		});
		btn5.setPreferredSize(new Dimension(50, 50));
		
		btn6 = new JButton("4");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn6.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn6.getText());
				}
			}
		});
		btn6.setPreferredSize(new Dimension(50, 50));
		
		btn7 = new JButton("5");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn7.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn7.getText());
				}
			}
		});
		btn7.setPreferredSize(new Dimension(50, 50));
		
		btn8 = new JButton("6");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn8.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn8.getText());
				}
			}
		});
		btn8.setPreferredSize(new Dimension(50, 50));
		
		btn9 = new JButton("*");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(txtManHinh.getText());
						break;
					case "-":
						score -= Float.parseFloat(txtManHinh.getText());
						break;
					case "/":
						score /= Float.parseFloat(txtManHinh.getText());
						break;
					case "*":
						score *= Float.parseFloat(txtManHinh.getText());
						break;
					}
				} else {
					score = Float.parseFloat(txtManHinh.getText());
				}
				txtManHinh.setText("");
				newOperation = true;
				operation = "*";
			}
		});
		btn9.setPreferredSize(new Dimension(50, 50));
		
		btn10 = new JButton("%");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn10.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn10.getText());
				}
			}
		});
		btn10.setPreferredSize(new Dimension(50, 50));
		
		btn11 = new JButton("7");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn11.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn11.getText());
				}
			}
		});
		btn11.setPreferredSize(new Dimension(50, 50));
		
		btn12 = new JButton("8");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn12.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn12.getText());
				}
			}
		});
		btn12.setPreferredSize(new Dimension(50, 50));
		
		btn13 = new JButton("9");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn13.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn13.getText());
				}
			}
		});
		btn13.setPreferredSize(new Dimension(50, 50));
		
		btn14 = new JButton("-");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(txtManHinh.getText());
						break;
					case "-":
						score -= Float.parseFloat(txtManHinh.getText());
						break;
					case "/":
						score /= Float.parseFloat(txtManHinh.getText());
						break;
					case "*":
						score *= Float.parseFloat(txtManHinh.getText());
						break;
					}
				} else {
					score = Float.parseFloat(txtManHinh.getText());
				}
				txtManHinh.setText("");
				newOperation = true;
				operation = "-";
			}
		});
		btn14.setPreferredSize(new Dimension(50, 50));
		
		btn15 = new JButton("1/x");
		btn15.setPreferredSize(new Dimension(50, 50));
		
		btn16 = new JButton("0");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					txtManHinh.setText(btn16.getText());
					newOperation = false;
				} else {
					String currentText = txtManHinh.getText();
					txtManHinh.setText(currentText + btn16.getText());
				}
			}
		});
		btn16.setPreferredSize(new Dimension(50, 50));
		
		btn17 = new JButton("+/-");
		btn17.setPreferredSize(new Dimension(50, 50));
		
		btn18 = new JButton("C");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtManHinh.setText("0");
				newOperation = true;
				operation = null;
			}
		});
		btn18.setPreferredSize(new Dimension(50, 50));
		
		btn19 = new JButton("+");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(txtManHinh.getText());
						break;
					case "-":
						score -= Float.parseFloat(txtManHinh.getText());
						break;
					case "/":
						score /= Float.parseFloat(txtManHinh.getText());
						break;
					case "*":
						score *= Float.parseFloat(txtManHinh.getText());
						break;
					}
				} else {
					score = Float.parseFloat(txtManHinh.getText());
				}
				txtManHinh.setText("");
				newOperation = true;
				operation = "+";
			}
		});
		btn19.setPreferredSize(new Dimension(50, 50));
		
		btn20 = new JButton("=");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtManHinh.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(txtManHinh.getText());
						break;
					case "-":
						score -= Float.parseFloat(txtManHinh.getText());
						break;
					case "/":
						score /= Float.parseFloat(txtManHinh.getText());
						break;
					case "*":
						score *= Float.parseFloat(txtManHinh.getText());
						break;
					}
				} else {
					score = Float.parseFloat(txtManHinh.getText());
				}
				txtManHinh.setText(String.valueOf(score));
				newOperation = true;
				operation = null;
			}
		});
		btn20.setPreferredSize(new Dimension(50, 50));
		
//		for (int i = 1; i < 21; i++) {
//			pnButtom.add("btn"+i);
//		}
		pnButtom1.add(btn1);
		pnButtom1.add(btn2);
		pnButtom1.add(btn3);
		pnButtom1.add(btn4);
		pnButtom1.add(btn5);
		pnButtom2.add(btn6);
		pnButtom2.add(btn7);
		pnButtom2.add(btn8);
		pnButtom2.add(btn9);
		pnButtom2.add(btn10);
		pnButtom3.add(btn11);
		pnButtom3.add(btn12);
		pnButtom3.add(btn13);
		pnButtom3.add(btn14);
		pnButtom3.add(btn15);
		pnButtom4.add(btn16);
		pnButtom4.add(btn17);
		pnButtom4.add(btn18);
		pnButtom4.add(btn19);
		pnButtom4.add(btn20);
		
		
	}
	
	
	
	public void addEvents() {
		
	}

	public void showWindow() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
