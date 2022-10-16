package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

public class NhanVien {
	
	private String MaNV;
	private String Ten;
	private int Luong;
	private Set<ChungNhan> chungNhans = new HashSet<>();
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String ten, int luong) {
		super();
		MaNV = maNV;
		Ten = ten;
		Luong = luong;
	}
	
	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", Ten=" + Ten + ", Luong=" + Luong + ", chungNhans=" + chungNhans + "]";
	}
}
