package com.sentinel.dubbo.plat.service;

import com.sentinel.dubbo.plat.param.TestParam;
import com.sentinel.dubbo.plat.vo.TestVo;

public interface TestService {

	/**
	 * 处理方法
	 * @param param
	 */
	public TestVo testMetod(TestParam param);
	
}
