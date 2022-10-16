package spring.data.jpa.spring.data.jpa.service;

import java.util.List;
import java.util.Map;

import spring.data.jpa.spring.data.jpa.entity.MayBay;

public interface MayBayService {
	public List<String> getMayBayByTamBay(int TamBay);
	
//	Câu 7 Có bao nhiêu loại máy báy Boeing.
	public int getCountBoeing();
	
//	Câu 16 Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
	public Map<Long, Object[]> getCau16();
}
