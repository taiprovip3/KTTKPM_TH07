package com.example.demo.rest_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.service.ChuyenBayService;

@RestController
@RequestMapping("/may01")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/cau17")
	public List<ChuyenBay> cau17() {
		return chuyenBayService.cau17();
	}
	
	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello World";
	}
}
