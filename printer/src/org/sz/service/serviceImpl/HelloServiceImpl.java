package org.sz.service.serviceImpl;

import com.temp.service.HelloService;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
	
	//×Ö·û´®ÄÚÈÝ [{"age":42,"id":1,"male":true,"name":"Sherlock Holmes","schoolId":1},
	//{"age":42,"id":2,"male":false,"name":"John Watson","schoolId":1}]
	
	public static final String json_array = 
			"[{\"age\":42,\"id\":1,\"male\":true,\"name\":\"Sherlock Holmes\",\"schoo" 
					+ "lId\":1},{\"age\":42,\"id\":2,\"male\":false,\"name\":\"John Watson\",\"schoolId\":1}]";

	@Override
	public String getJosnString() {
		// TODO Auto-generated method stub
		return json_array;
		//"{'firstName': 'Brett', 'lastName': 'McLaughlin'}";
	}

}
