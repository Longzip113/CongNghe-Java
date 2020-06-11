package com.longnguyen.model;

import java.io.Serializable;
import java.util.Vector;

public class PhongBanModel implements Serializable{
	private String maPhongBan;
	private String tenPhongBan;
	
	// một phòng ban có nhiều nhân viên 
	private Vector<NhanVienModel> nhanViens;
	
	public void themNhanVien(NhanVienModel nv) {
		//Thêm nhân viên vào phòng ban
		this.nhanViens.add(nv);
		
		nv.setPhongBan(this);
		//Chỉ định nhân viên của phòng ban này 
		
	}

	public PhongBanModel() {
		super();
		this.nhanViens = new Vector<NhanVienModel>();
	}
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	public Vector<NhanVienModel> getNhanViens() {
		return nhanViens;
	}
	public void setNhanViens(Vector<NhanVienModel> nhanViens) {
		this.nhanViens = nhanViens;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenPhongBan;
	}
	
}
