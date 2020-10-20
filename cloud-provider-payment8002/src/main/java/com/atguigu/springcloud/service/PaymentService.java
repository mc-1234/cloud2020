package com.atguigu.springcloud.service;


import cloud.api.commons.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author mc
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
