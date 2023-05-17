package com.example.messagingservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MessageService {

    private MessageRepository messageRepository;

    public void write_message(MessageRequest request){

        Message message = new Message(request.getSender_id(), request.getReceiver_id(), LocalDateTime.now(), request.getContent());

        messageRepository.save(message);

    }
    public void read_message(Long receiver_id){
        List<Message> messages = new ArrayList();

        messages = messageRepository.listMessages(receiver_id);

        for(Message m : messages){
            System.out.println(m.getSender_id() + " sent you a message at "+m.getTime()+" :" +m.getContent() );
        }


    }

}
