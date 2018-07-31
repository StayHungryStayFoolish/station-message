package com.stationmessage.www.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by bonismo@hotmail.com on 2018/4/22 下午9:26
 *
 * @Version: V1.0.0
 * <p>
 * Description: WebSocket Configuration
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    // 这个方法的作用是添加一个服务端点(withSockJS() 开启 SockJS 支持)，来接收客户端的连接。
    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
    }

    // 这个方法的作用是定义消息代理，通俗一点讲就是设置消息连接请求的各种规范信息。
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        super.configureMessageBroker(registry);
        // 表示客户端订阅地址的前缀信息，也就是客户端接收服务端消息的地址的前缀信息
        registry.enableSimpleBroker("/topic");
        // 指服务端接收地址的前缀，意思就是说客户端给服务端发消息的地址的前缀
//        registry.setApplicationDestinationPrefixes("/app");
    }
}


