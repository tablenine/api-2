package com.tablenine.application.exam.api.controller;

import com.tablenine.application.exam.api.config.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
	private final Configuration configuration;
	@GetMapping("")
	public String getData() {
		return configuration.getDatasource().getUrl();
	}
}
