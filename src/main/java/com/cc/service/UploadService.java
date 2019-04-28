package com.cc.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
	boolean upload(MultipartFile file) throws IOException;
}
