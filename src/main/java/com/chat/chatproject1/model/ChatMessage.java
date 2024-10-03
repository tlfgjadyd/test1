package com.chat.chatproject1.model;

public class ChatMessage {

    private String sender;  // 메시지를 보낸 사람
    private String content; // 메시지 내용
    private MessageType type; // 메시지 타입 (채팅 메시지, 참가 메시지 등)

    // 메시지 타입을 정의합니다.
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    // Getter, Setter
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}