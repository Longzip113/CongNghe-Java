package com.longnguyen.model;

import java.io.Serializable;
import java.util.Date;


public class NhanVienModel implements Serializable{
	private String tenNhanVien;
	private String maNhanVien;
	private Date ngayVaoLam;
	private Date ngaySinh;
	//từ nhân viên biết đc nhân viên của phòng ban nào 
	private PhongBanModel phongBan;
	
	
	public NhanVienModel() {
		super();
	}
	
	public NhanVienModel(String tenNhanVien, String maNhanVien, Date date, Date date2) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.maNhanVien = maNhanVien;
		this.ngayVaoLam = date;
		this.ngaySinh = date2;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public PhongBanModel getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(PhongBanModel phongBan) {
		this.phongBan = phongBan;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenNhanVien;
	}
	
}
