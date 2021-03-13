package com.lipanxi.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

	@RequestMapping("/hello")
	public String helloJenkins(){
		return "helloJenkins";
	}
}
