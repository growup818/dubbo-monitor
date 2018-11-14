package com.sentinel.dubbo.plat.service.impl;

import org.springframework.stereotype.Service;

import com.sentinel.dubbo.plat.param.TestParam;
import com.sentinel.dubbo.plat.service.TestService;
import com.sentinel.dubbo.plat.vo.TestVo;

/**
 * 测试服务
 * @author sdc
 *
 */
@Service("testService")
public class TestServiceImpl implements TestService{

	@Override
	public TestVo testMetod(TestParam param) {
		TestVo vo = new TestVo();
		vo.setBody("dubbo sentinel 整合测试，demo");
		vo.setHead("流量监控");
		
		return vo;
	}

}
