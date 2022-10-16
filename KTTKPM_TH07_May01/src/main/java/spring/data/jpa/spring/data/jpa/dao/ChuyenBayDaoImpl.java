package spring.data.jpa.spring.data.jpa.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.jpa.spring.data.jpa.entity.ChuyenBay;
import spring.data.jpa.spring.data.jpa.repository.ChuyenBayRepository;
import spring.data.jpa.spring.data.jpa.service.ChuyenBayService;

@Service
public class ChuyenBayDaoImpl implements ChuyenBayService{
	
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Transactional
	@Override
	public List<ChuyenBay> getChuyenBayByGaDe(String GaDen) {
		return chuyenBayRepository.getChuyenBayByGaDen(GaDen);
	}

	@Override
	public List<ChuyenBay> getChuyenBayByDoDaiFromTo(int From, int To) {
		return chuyenBayRepository.getChuyenBayByDoDaiFromTo(From, To);
	}

	@Override
	public List<ChuyenBay> getChuyenByFromTo(String GaDi, String GaDen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChuyenBay> getChuyenBayFrom(String GaDi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<ChuyenBay> cau17(String GaDi, String GaDen) {
		return chuyenBayRepository.cau17(GaDi, GaDen);
	}

	@Transactional
	@Override
	public Map<String, Long> cau18() {
		List<Object[]> danhSachGaVaTongSoChuyenBayCuaGaDo = chuyenBayRepository.cau18();
		Map<String, Long> maps = new HashMap<>();
		for (Object[] obj : danhSachGaVaTongSoChuyenBayCuaGaDo) {
			maps.put(obj[0].toString(), Long.parseLong(String.valueOf(obj[1])));
		}
		return maps;
	}
}
