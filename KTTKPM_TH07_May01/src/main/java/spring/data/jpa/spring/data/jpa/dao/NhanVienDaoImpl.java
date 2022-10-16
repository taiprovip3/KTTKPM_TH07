package spring.data.jpa.spring.data.jpa.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.jpa.spring.data.jpa.entity.NhanVien;
import spring.data.jpa.spring.data.jpa.repository.NhanVienRepository;
import spring.data.jpa.spring.data.jpa.service.NhanVienService;

@Service
public class NhanVienDaoImpl implements NhanVienService{

	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Transactional
	@Override
	public List<NhanVien> getNhanVienByLuong(int Luong) {
		return nhanVienRepository.getNhanVienByLuong(Luong);
	}

	@Override
	public int getTotalLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getPhiCongBoeing() {
		return nhanVienRepository.getPhiCongBoeing();
	}

	@Override
	public List<NhanVien> getNhanVienHaveMaMB747() {
		return nhanVienRepository.getNhanVienHaveMaMB747();
	}
	
}
