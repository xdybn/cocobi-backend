package com.coconut.springbootinit.config;


import com.coconut.springbootinit.common.ErrorCode;
import com.coconut.springbootinit.exception.BusinessException;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * @author daiyifei
 * 自定义线程池
 */
@Configuration
public class ThreadPoolExecutorConfig {

    /**
     * Spring 单例
     *
     * @return
     */
    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {

        //创建一个线程工厂
        ThreadFactory threadFactory = new ThreadFactory() {
            //初始化线程数为1
            private int count = 1;

            @Override
            public Thread newThread(@NotNull Runnable r) {
                //创建一个新的线程
                Thread thread = new Thread(r);
                thread.setName("线程" + count);
                count++;
                return thread;
            }
        };

        // 自定义拒绝策略
        RejectedExecutionHandler customRejectedExecutionHandler = (r, executor) -> {
            // 这里可以添加自定义逻辑，比如记录日志
            throw new BusinessException(ErrorCode.OPERATION_ERROR, "系统繁忙，请稍后重试");
        };
        // 创建一个新的线程池，线程池核心大小为2，最大线程数为4，
        // 非核心线程空闲时间为100秒，任务队列为阻塞队列，长度为4，使用自定义的线程工厂创建线程
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 100,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), threadFactory, customRejectedExecutionHandler);

        //放回新创建的线程池
        return threadPoolExecutor;
    }
}
