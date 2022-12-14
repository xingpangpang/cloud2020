package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: XINGXINGZI
 * @date 2022/08/30
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

   public Payment getPaymentById(@Param("id") Long id);

}
