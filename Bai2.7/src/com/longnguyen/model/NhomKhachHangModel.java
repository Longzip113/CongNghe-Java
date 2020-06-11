package com.longnguyen.model;

import java.util.Vector;

public class NhomKhachHangModel {
	private String maNhom;
	private String tenNhom;
	
	private Vector<KhachHangModel> khanhHangS;
	
	public void themKhachHang(KhachHangModel kh) {
		khanhHangS.add(kh);
		kh.setNhom(this);
	}
	
	

	public NhomKhachHangModel() {
		super();
		khanhHangS = new Vector<KhachHangModel>();
	}

	

	public NhomKhachHangModel(String maNhom, String tenNhom) {
		super();
		this.maNhom = maNhom;
		this.tenNhom = tenNhom;
		khanhHangS = new Vector<KhachHangModel>();
	}



	public String getMaNhom() {
		return maNhom;
	}

	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}

	public String getTenNhom() {
		return tenNhom;
	}

	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}

	public Vector<KhachHangModel> getKhanhHangS() {
		return khanhHangS;
	}

	public void setKhanhHangS(Vector<KhachHangModel> khanhHangS) {
		this.khanhHangS = khanhHangS;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenNhom;
	}
}
