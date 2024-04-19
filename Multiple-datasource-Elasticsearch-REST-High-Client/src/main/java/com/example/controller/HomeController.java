package com.example.controller;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private RestHighLevelClient firstElasticsearchClient;

	@Autowired
	private RestHighLevelClient secondElasticsearchClient;

	@GetMapping
	public String doGetHome() {
		return "";
	}
}
