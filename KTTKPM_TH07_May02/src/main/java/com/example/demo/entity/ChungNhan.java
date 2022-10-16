package com.example.demo.entity;

public class ChungNhan {
	
	private int MaCN;
	private NhanVien nhanVien;
	private MayBay mayBay;
	
	public int getMaCN() {
		return MaCN;
	}
	public void setMaCN(int maCN) {
		MaCN = maCN;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public MayBay getMayBay() {
		return mayBay;
	}
	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}

	@Override
	public String toString() {
		return "ChungNhan [MaCN=" + MaCN + ", MaNhanVien=" + nhanVien.getMaNV() + ", MaMayBay=" + mayBay.getMaMB() + "]";
	}
}
