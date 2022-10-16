package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.service.ChuyenBayService;

@Service
public class ChuyenBayDaoImpl implements ChuyenBayService {

	private RestTemplate restTemplate;
	private String serverURL;
	
	@Autowired
	public ChuyenBayDaoImpl(RestTemplate restTemplate, @Value("${crm.rest.url}") String serverURL) {
		this.restTemplate = restTemplate;
		this.serverURL = serverURL;
	}
	
	@Override
	public List<ChuyenBay> cau17() {
		ResponseEntity<List<ChuyenBay>> responseEntity = restTemplate.exchange(serverURL + "/cau17", HttpMethod.GET, null, new ParameterizedTypeReference<List<ChuyenBay>>() {
		});
		List<ChuyenBay> ls = responseEntity.getBody();
		return ls;
	}
	
}
