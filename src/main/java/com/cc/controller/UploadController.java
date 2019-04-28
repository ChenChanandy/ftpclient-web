package com.cc.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cc.service.UploadService;

@Controller
public class UploadController {
	@Resource
	private UploadService uploadServiceImpl;
	
	@RequestMapping("upload")
	public String upload(MultipartFile file) {
		try {
			boolean result = uploadServiceImpl.upload(file);
			if(result) {
				return "/success.jsp";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "/error.jsp";
	}
}
