package com.zyq.web.recevier;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
@EnableBinding(Sink.class)
public class SinkRecevier {

    /**
     * @EnableBinding注解，绑定消息通道。该注解用来指定一个或者多个定义了@Input或@Output注解的接口。
         在代码中，我们通过@EnableBinding(Sink.class)，绑定了Sink接口，Sink接口是Spring Cloud 中默认绑定输入通道
     ，除此之外，还有绑定输出通道Source，还有绑定输入输出通道的Processor通道。除了Spring Cloud定义的接口外，
     我们也可以自定义。
      @StreamListener注解是将被修饰的方法注册为消息中间件上数据流的事件监听器，注解中的属性值对应了监听的消息通道名。
      在代码中，我们通过receive方注册为input消息通道的处理方法，当监听到input消息通道的消息的时候
     receive方法会运行。
     * @param payload
     */
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("接收到消息:" + payload);
    }

}
