package com.example.messagingservice;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long sender_id;
    private Long receiver_id;
    private LocalDateTime time;
    private String content;

    public Message(Long sender_id, Long receiver_id, LocalDateTime time, String content) {
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.time = time;
        this.content = content;
    }
}
