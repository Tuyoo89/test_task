package com.example.testTask.controller.message;

import com.example.testTask.controller.base.AbstractController;
import com.example.testTask.controller.base.GenericCRUDController;
import com.example.testTask.dto.message.MessageDto;
import com.example.testTask.dto.message.UserMessageDto;
import com.example.testTask.serivce.message.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("messages/")
public class MessageController extends AbstractController<MessageService> implements GenericCRUDController<MessageDto> {

    public MessageController(MessageService service) {
        super(service);
    }

    @Override
    public Long create(MessageDto DTO) {
        return null;
    }

    @Override
    public MessageDto update(MessageDto DTO) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @PostMapping("create/user/message")
    public Long createUserMessage(@Valid @RequestBody UserMessageDto userMessageDto){
        return service.createUserMessage(userMessageDto);
    }
}
