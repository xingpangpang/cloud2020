package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: XINGXINGZI
 * @date 2022/08/31
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    //使用rest风格对写操作进行区分
    @PostMapping(value = "/payment/creat")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        System.out.println("****结果输出"+result);
        if (result>0){
            return new CommonResult(200,"数据插入成功",result );

        }else {
            return new CommonResult(444,"插入数据失败",null);

        }

    }
    //使用rest风格对读操作进行区分
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("****结果输出"+payment);
        if (payment != null){
            return new CommonResult(200,"数据查询成功",payment);

        }else {
            return new CommonResult(444,"数据查询失败,ID为"+id,null);

        }

    }


}
