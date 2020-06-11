package com.longnguyen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.sun.jdi.event.Event;

public class MainView extends JFrame{

	private static final long serialVersionUID = -8049750123119220951L;
	
	JLabel a,b,title,result;
	JTextField textA, textB, textResult;
	JPanel panelPress,panelPressSP,panelChose,panelA,panelB,panelResult,panelBtn;
	TitledBorder borderPress,borderPressSP,borderChose;
	JButton del, exit, solve;
	ButtonGroup btnG;
	public MainView(){
		this.setTitle("Cộng trừ nhân chia");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		initconponents();
		Event();
	}
	private void Event() {
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		
	}
	public void initconponents() {
		
		borderPress = new TitledBorder(BorderFactory.createLineBorder(Color.RED),"Nhập 2 sô a và b:");
		borderChose = new TitledBorder(BorderFactory.createLineBorder(Color.RED),"Chọn tác vụ:");
		borderPressSP = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Chọn phép toán:");
		

		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		JPanel pnTop = new JPanel();
		JPanel pnCenter = new JPanel();
		JPanel pnButtom = new JPanel();
		this.add(pnTop);
		this.add(pnCenter);
		this.add(pnButtom);
		
		
		title = new JLabel("Cộng trừ nhân chia", SwingConstants.CENTER);
		title.setForeground(Color.blue);
		title.setFont(title.getFont().deriveFont(32f));
		pnTop.add(title);
		// ----------------------------------------
		
		pnCenter.setLayout(new FlowLayout());
		// ----------------------------------------
		del = new JButton("Xóa  ");
		solve = new JButton("Giải  ");
		exit = new JButton("Thoát  ");
		panelBtn = new JPanel();
		panelBtn.setLayout(new BoxLayout(panelBtn, BoxLayout.Y_AXIS));
		panelBtn.add(solve);
		panelBtn.add(del);
		panelBtn.add(exit);
		panelBtn.setBorder(borderChose);
		panelBtn.setPreferredSize(new Dimension(150, 150));
		panelBtn.setBackground(Color.GRAY);
		pnCenter.add(panelBtn);
		
		
		
		panelPress = new JPanel();
		panelPress.setLayout(new BoxLayout(panelPress, BoxLayout.Y_AXIS));
		a = new JLabel("nhập a: ");
		textA = new JTextField(20);
		panelA = new JPanel();
		panelA.add(a);
		panelA.add(textA);
		panelPress.add(panelA);
		// ----------------------------------------
		b = new JLabel("nhập b: ");
		textB = new JTextField(20);
		panelB = new JPanel();
		panelB.add(b);
		panelB.add(textB);
		panelPress.add(panelB);
		
		//------------------------------------------
		panelPressSP = new JPanel();
		JRadioButton addition = new JRadioButton("Cộng");
		panelPressSP.add(addition);
		JRadioButton subtraction = new JRadioButton("Trừ");
		panelPressSP.add(subtraction);
		JRadioButton multiplication = new JRadioButton("Nhân");
		panelPressSP.add(multiplication);
		JRadioButton division = new JRadioButton("Chia");
		panelPressSP.add(division);
		panelPress.add(panelPressSP);
		btnG = new ButtonGroup();
		btnG.add(addition);
		btnG.add(subtraction);
		btnG.add(multiplication);
		btnG.add(division);		
		
		// ----------------------------------------
		result = new JLabel("Kết quả ");
		textResult = new JTextField(20);
		panelResult = new JPanel();
		panelResult.add(result);
		panelResult.add(textResult);
		panelPress.add(panelResult);
		panelPress.setBorder(borderPress);
		pnCenter.add(panelPress);
		
		

	}

}
