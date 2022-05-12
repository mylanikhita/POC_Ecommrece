package com.demo.service;



import org.json.simple.JSONObject;

import org.springframework.stereotype.Service;

import com.demo.dto.WatchesDto;
import com.demo.entity.Watches;


@Service
public class ProductsService {

	public JSONObject productsResponse(String status, String message, String access) {
		JSONObject obj=new JSONObject();
		obj.put("status",status);
		obj.put("message",message);
		obj.put("accessToken",access);
		return obj;
	}

	
	












	
}
