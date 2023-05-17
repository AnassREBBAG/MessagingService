package com.example.messagingservice;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageRequest {

    private final Long sender_id;
    private final Long receiver_id;
    private final String content;
}
