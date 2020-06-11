package com.longnguyen.model;

import java.io.Serializable;

public class NhanVienModel implements Serializable {
	private String tenNhanVien;
	private String maNhanVien;
	private float luong;

	public NhanVienModel() {
		super();
	}

	public NhanVienModel(String maNhanVien, String tenNhanVien, float luong) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.maNhanVien = maNhanVien;
		this.luong = luong;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.maNhanVien + " " + this.tenNhanVien + " " + this.luong;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}

}
