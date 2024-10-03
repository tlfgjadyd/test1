package com.chat.chatproject1;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker  // WebSocket 메시지 브로커를 활성화합니다.
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // 메시지 브로커를 설정합니다. "/topic" 경로로 오는 메시지를 브로커가 처리합니다.
        config.enableSimpleBroker("/topic");
        // 클라이언트에서 "/app"으로 시작하는 메시지들이 @MessageMapping으로 매핑됩니다.
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // "/ws" 엔드포인트에 SockJS fallback 옵션을 추가하여 클라이언트가 WebSocket을 연결할 수 있게 합니다.
        registry.addEndpoint("/ws").withSockJS();
    }
}
