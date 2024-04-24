package com.coconut.springbootinit.bizmq;

/**
 * 给交换机一个固定的值
 */
public interface BiMqConstant {
    String BI_EXCHANGE_NAME = "bi_coconut_exchange";
    String BI_QUEUE_NAME = "bi_coconut_queue";

    String BI_ROUTING_KEY = "bi_coconut_routingKey";
}
