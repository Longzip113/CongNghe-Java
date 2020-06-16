package com.longnguyen.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.longnguyen.model.NhanVienModel;
import com.longnguyen.model.PhongBanModel;

public class MainView extends JFrame {
	
	JComboBox<PhongBanModel> jcbBoxPhongBan;
	JList<NhanVienModel> listNhanVien;
	JTextField txtMaNV, txtTenNV, txtNgayVaoLam, txtNamSinh;
	JButton btnLuu, btnXoa, btnThoat;
	
	ArrayList<PhongBanModel> dsPhongBans;
	ArrayList<NhanVienModel> dsNhanViens;
	
	PhongBanModel pbselected = null;
	NhanVienModel nvselected = null;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public MainView(String title)
	{
		super(title);
		addControls();
		addEvents();
		showWindow();
		fackData();
	}
	
	public void addControls()
	{
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		
		//--------Phan Phong ban
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout());
		pnMain.add(pnPhongBan);
		JLabel lblPhongBan = new JLabel("Chọn phòng ban: ");
		jcbBoxPhongBan = new JComboBox<PhongBanModel>();
		jcbBoxPhongBan.setPreferredSize(new Dimension(200, 15));
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(jcbBoxPhongBan);
		
		//-------Phan danh sach nhan vien
		JPanel pnDanhSachVaChiTiet = new JPanel();
		pnDanhSachVaChiTiet.setLayout(new BoxLayout(pnDanhSachVaChiTiet, BoxLayout.X_AXIS));
		pnMain.add(pnDanhSachVaChiTiet);
		
		//------- Tao danh sach nhan vien
		JPanel pnDanhSach = new JPanel();
		listNhanVien = new JList<NhanVienModel>();
		JScrollPane sc = new JScrollPane(listNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
														JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDanhSach.setLayout(new BorderLayout());
		pnDanhSach.add(sc,BorderLayout.CENTER);
		pnDanhSachVaChiTiet.add(pnDanhSach);
		
		//-------Tao border cho Danh sach nhan vien
		Border borderDanhSach = BorderFactory.createLineBorder(Color.blue);
		TitledBorder titledBorderDanhSach = new TitledBorder(borderDanhSach,"So Thich");
		pnDanhSach.setBorder(titledBorderDanhSach);
		
		//-------- Tao chi tiet nhan vien
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		pnDanhSachVaChiTiet.add(pnChiTiet);
		
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout());
		JLabel lblMa = new JLabel("Ma:");
		txtMaNV = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMaNV);
		pnChiTiet.add(pnMa);
		
		
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Ten:");
		txtTenNV = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTenNV);
		pnChiTiet.add(pnTen);
		
		JPanel pnNgayVaoLam = new JPanel();
		pnNgayVaoLam.setLayout(new FlowLayout());
		JLabel lblNgayVaoLam = new JLabel("Ngay Vao Lam:");
		txtNgayVaoLam = new JTextField(20);
		pnNgayVaoLam.add(lblNgayVaoLam);
		pnNgayVaoLam.add(txtNgayVaoLam);
		pnChiTiet.add(pnNgayVaoLam);
		
		JPanel pnNgaySinh = new JPanel();
		pnNgaySinh.setLayout(new FlowLayout());
		JLabel lblNgaySinh = new JLabel("Ngay sinh:");
		txtNamSinh = new JTextField(20);
		pnNgaySinh.add(lblNgaySinh);
		pnNgaySinh.add(txtNamSinh);
		pnChiTiet.add(pnNgaySinh);
		
		Border borderChiTiet = BorderFactory.createLineBorder(Color.blue);
		TitledBorder titledBorderChiTiet = new TitledBorder(borderDanhSach,"Chi Tiet");
		pnChiTiet.setBorder(titledBorderChiTiet);
		
		
		JPanel pnButon = new JPanel();
		pnButon.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnMain.add(pnButon);
		
		btnLuu = new JButton("Save");
		btnXoa = new JButton("Delete");
		btnThoat = new JButton("Exit");
		
		pnButon.add(btnLuu);
		pnButon.add(btnXoa);
		pnButon.add(btnThoat);
		
		lblMa.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblTen.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		
	}
	
	public void fackData() {
		dsPhongBans = new ArrayList<PhongBanModel>();
		PhongBanModel pNhanSu = new PhongBanModel();
		pNhanSu.setMaPhongBan("p1");
		pNhanSu.setTenPhongBan("Phòng Nhân Sư");
		PhongBanModel pKeToan = new PhongBanModel();
		pKeToan.setMaPhongBan("p2");
		pKeToan.setTenPhongBan("Phòng Kế Toán ");
		PhongBanModel pMarkerting = new PhongBanModel();
		pMarkerting.setMaPhongBan("p3");
		pMarkerting.setTenPhongBan("Phòng Markerting ");
		PhongBanModel pDieuHanh = new PhongBanModel();
		pDieuHanh.setMaPhongBan("p4");
		pDieuHanh.setTenPhongBan("Phòng Điều Hành ");
		
		dsPhongBans.add(pNhanSu);
		dsPhongBans.add(pDieuHanh);
		dsPhongBans.add(pMarkerting);
		dsPhongBans.add(pKeToan);
		
		pNhanSu.themNhanVien(new NhanVienModel("Nguyen Thanh Long","NV1",new Date(2020-1900,12,1), new Date(1999-1900,5,25)));
		pNhanSu.themNhanVien(new NhanVienModel("Nguyen Van Dat","NV2",new Date(2020-1900,12,1), new Date(2007-1900,5,25)));
		pMarkerting.themNhanVien(new NhanVienModel("Nguyen Thi B","NV3",new Date(2010-1900,12,1), new Date(1990-1900,5,25)));
		pMarkerting.themNhanVien(new NhanVienModel("Tran Van C","NV4",new Date(2015-1900,15,1), new Date(1999-1900,5,25)));
		pMarkerting.themNhanVien(new NhanVienModel("Nguyen Van D","NV1",new Date(2020-1900,12,1), new Date(1999-1900,5,25)));
		pDieuHanh.themNhanVien(new NhanVienModel("Nguyen Thanh Cao","NV1",new Date(2020-1900,12,1), new Date(1999-1900,5,25)));
		pMarkerting.themNhanVien(new NhanVienModel("Tran Van E","NV4",new Date(2015-1900,15,1), new Date(1999-1900,5,25)));
		pKeToan.themNhanVien(new NhanVienModel("Nguyen Van H","NV1",new Date(2020-1900,12,1), new Date(1999-1900,5,25)));
		pKeToan.themNhanVien(new NhanVienModel("Nguyen Thanh G","NV1",new Date(2020,12,1), new Date(1999-1900,5,25)));
		
		
		
		for (PhongBanModel phongban : dsPhongBans) {
			jcbBoxPhongBan.addItem(phongban);
		}
	}
	
	public void addEvents() {
		jcbBoxPhongBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jcbBoxPhongBan.getSelectedIndex() == -1) return;
				
				pbselected = (PhongBanModel) jcbBoxPhongBan.getSelectedItem();
				listNhanVien.setListData(pbselected.getNhanViens());
			}
		});
		listNhanVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(listNhanVien.getSelectedIndex() == -1) return;
				nvselected = listNhanVien.getSelectedValue();
				txtMaNV.setText(nvselected.getMaNhanVien());
				txtTenNV.setText(nvselected.getTenNhanVien());
				txtNamSinh.setText(sdf.format(nvselected.getNgaySinh()));
				txtNgayVaoLam.setText(sdf.format(nvselected.getNgayVaoLam()));
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuu();
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	protected void xuLyXoa() {
		if(nvselected != null)
		{
			pbselected.getNhanViens().remove(nvselected);
			nvselected = null;
			listNhanVien.setListData(pbselected.getNhanViens());
		}
	}

	protected void xuLyLuu() {
		try {
			NhanVienModel nv = new NhanVienModel();
			nv.setMaNhanVien(txtMaNV.getText());
			nv.setTenNhanVien(txtTenNV.getText());
			nv.setNgayVaoLam(sdf.parse(txtNgayVaoLam.getText()));
			nv.setNgaySinh(sdf.parse(txtNamSinh.getText()));
			if(pbselected != null)
			{
				pbselected.themNhanVien(nv);
				listNhanVien.setListData(pbselected.getNhanViens());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showWindow() {
		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
