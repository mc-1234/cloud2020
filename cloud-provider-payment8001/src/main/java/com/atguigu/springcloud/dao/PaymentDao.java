package com.atguigu.springcloud.dao;


import cloud.api.commons.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author mc
 */
@Mapper
public interface PaymentDao {

    /**
     * 创建支付记录
     * @param payment
     * @return
     */
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
