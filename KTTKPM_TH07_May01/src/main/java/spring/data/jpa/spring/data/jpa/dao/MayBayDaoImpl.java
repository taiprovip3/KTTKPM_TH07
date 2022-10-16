package spring.data.jpa.spring.data.jpa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.jpa.spring.data.jpa.entity.ChungNhan;
import spring.data.jpa.spring.data.jpa.entity.MayBay;
import spring.data.jpa.spring.data.jpa.repository.ChungNhanRepository;
import spring.data.jpa.spring.data.jpa.repository.MayBayRepository;
import spring.data.jpa.spring.data.jpa.service.MayBayService;

@Service
public class MayBayDaoImpl implements MayBayService{

	
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Autowired
	private ChungNhanRepository chungNhanRepository;

	@Transactional
	@Override
	public List<String> getMayBayByTamBay(int TamBay) {
		return mayBayRepository.getMayBayByTamBay(TamBay);
	}

	@Override
	public int getCountBoeing() {
		// TODO Auto-generated method stub dễ quá khỏi làm
		return 0;
	}

	@Transactional
	@Override
	public Map<Long, Object[]> getCau16() {
		//Lấy danh sách MaMB có người lái từ ChungNhan
		List<Object[]> danhSachMayBayCoNguoiLai = chungNhanRepository.getAllMayBayCoNguoiLai();
		Map<Long, Object[]> maps = new HashMap<>();
				for (Object[] obj : danhSachMayBayCoNguoiLai) {
					maps.put(Long.parseLong(String.valueOf(obj[0])), new Object[] { obj[1].toString(), Long.parseLong(String.valueOf(obj[2])) });
				}
				
		//Return: Map các cặp key value
		return maps;
	}
}
