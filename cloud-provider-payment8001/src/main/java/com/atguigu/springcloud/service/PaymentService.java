package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: XINGXINGZI
 * @date 2022/08/30
 */

public interface PaymentService {
    //增加数据
    public int create(Payment payment);

    //查询数据
    public Payment getPaymentById(@Param("id") Long id);
}
