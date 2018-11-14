package com.sentinel.dubbo.plat.business.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sentinel.dubbo.plat.param.TestParam;
import com.sentinel.dubbo.plat.service.TestService;
import com.sentinel.dubbo.plat.vo.TestVo;


@Service("testDemoService")
public class TestDemoService {
	
	@Resource(name = "testService")
	private TestService testService;
	
	public TestVo test() {
		TestParam param = new TestParam();
		
		//调用dubbo服务
		TestVo vo = testService.testMetod(param);
		
		return vo;
	}
	
}
