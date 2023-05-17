package com.example.messagingservice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messaging")
@AllArgsConstructor
public class MessageController {

    MessageService messageService;

    @PostMapping("/write")
    private void write_message(@RequestBody MessageRequest request){
        messageService.write_message(request);
    }

    @GetMapping("/read/{receiver_id}")
    private void read_message(@PathVariable Long receiver_id){

        messageService.read_message(receiver_id);

    }

}
