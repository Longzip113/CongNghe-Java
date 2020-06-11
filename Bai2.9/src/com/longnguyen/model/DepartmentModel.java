package com.longnguyen.model;

import java.util.Vector;

public class DepartmentModel {
	private String maPB;
	private String tenPB;

	private Vector<EmployeeModel> nhanVien;

	public void themKhachHang(EmployeeModel kh) {
		nhanVien.add(kh);
		kh.setPB(this);
	}

	public DepartmentModel() {
		super();
		nhanVien = new Vector<EmployeeModel>();
	}

	public DepartmentModel(String maNhom, String tenNhom) {
		super();
		this.maPB = maNhom;
		this.tenPB = tenNhom;
		nhanVien = new Vector<EmployeeModel>();
	}

	public String getMaPB() {
		return maPB;
	}

	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	public String getTenPB() {
		return tenPB;
	}

	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	public Vector<EmployeeModel> getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(Vector<EmployeeModel> nhanVien) {
		this.nhanVien = nhanVien;
	}

	public void setKhanhHangS(Vector<EmployeeModel> khanhHangS) {
		this.nhanVien = khanhHangS;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenPB;
	}
}
