package com.sf.helloworld.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	
	@RequestMapping("/fileUploadController")
	public Map<String, Object> fileUpload(MultipartFile filename ) {
		String originalFilename = filename.getOriginalFilename();
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			filename.transferTo(new File("D:/"+filename.getOriginalFilename()));
			
			map.put("msg", "ok");
			
			
		} catch (IllegalStateException | IOException e) {
			map.put("msg", "failed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return map;
		}
		
		
	}
	

}
