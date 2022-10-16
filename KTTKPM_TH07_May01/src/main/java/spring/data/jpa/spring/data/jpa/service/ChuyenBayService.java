package spring.data.jpa.spring.data.jpa.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import spring.data.jpa.spring.data.jpa.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> getChuyenBayByGaDe(String GaDen);
	public List<ChuyenBay> getChuyenBayByDoDaiFromTo(int From, int To);
//	Câu 5 Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	public List<ChuyenBay> getChuyenByFromTo(String GaDi, String GaDen);
//  Câu 6 Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN)
	public List<ChuyenBay> getChuyenBayFrom(String GaDi);
//	Câu 17 Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này
	public List<ChuyenBay> cau17(String GaDi, String GaDen);
//	Câu 18 Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
	public Map<String, Long> cau18();
}
