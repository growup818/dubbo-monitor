package com.sentinel.dubbo.plat.business.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sentinel.dubbo.constant.SentinelWebStatusEnum;
import com.sentinel.dubbo.plat.base.controller.BaseController;
import com.sentinel.dubbo.plat.business.service.TestDemoService;
import com.sentinel.dubbo.plat.vo.ResponseVo;
import com.sentinel.dubbo.plat.vo.TestVo;

/**
 * Controller Demo
 */
@RestController
@RequestMapping(value = "/demo")
public class TestController extends BaseController {
	
	@Resource(name = "testDemoService")
	private TestDemoService testDemoService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseVo saveMyGroupBond(
			HttpServletRequest request) {
		
		TestVo vo = testDemoService.test();
		
		return generateResponseVo(SentinelWebStatusEnum.SUCCESS, vo);
	}

}
