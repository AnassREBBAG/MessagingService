package com.example.messagingservice;

import org.aspectj.bridge.MessageWriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

    @Query("select m from Message m where m.receiver_id=?1")
    List<Message> listMessages(Long receiver_id);

}
