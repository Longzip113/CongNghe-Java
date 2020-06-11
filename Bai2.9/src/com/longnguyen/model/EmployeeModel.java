package com.longnguyen.model;

public class EmployeeModel {
	private String maNV;
	private String tenNV;
	private Integer luongNV;
	private DepartmentModel PB;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public Integer getLuongNV() {
		return luongNV;
	}

	public void setLuongNV(Integer luongNV) {
		this.luongNV = luongNV;
	}

	public DepartmentModel getPB() {
		return PB;
	}

	public void setPB(DepartmentModel pB) {
		PB = pB;
	}

	public EmployeeModel(String maNV, String tenNV, Integer luongNV, DepartmentModel pB) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.luongNV = luongNV;
		PB = pB;
	}
	
	public EmployeeModel(String maNV, String tenNV, Integer luongNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.luongNV = luongNV;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenNV;
	}
}
