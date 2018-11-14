package com.sentinel.dubbo.plat.base.controller;

import com.sentinel.dubbo.constant.SentinelWebStatusEnum;
import com.sentinel.dubbo.plat.vo.ResponseVo;

public class BaseController {
	
    public <T> ResponseVo generateResponseVo(SentinelWebStatusEnum webStatusEnum, T data) {
        return new ResponseVo(webStatusEnum.getCode(), webStatusEnum.getDesc(), data);
    }

}
