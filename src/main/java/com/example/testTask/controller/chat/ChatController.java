package com.example.testTask.controller.chat;

import com.example.testTask.controller.base.AbstractController;
import com.example.testTask.controller.base.GenericCRUDController;
import com.example.testTask.controller.base.GenericGLController;
import com.example.testTask.dto.chat.ChatCreateDto;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.dto.message.MessageDto;
import com.example.testTask.serivce.chat.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chats/")
public class ChatController extends AbstractController<ChatService>
        implements GenericCRUDController<ChatDto>,
        GenericGLController<ChatDto> {

    public ChatController(ChatService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Long> create(ChatDto DTO) {
        return null;
    }

    @Override
    public ChatDto update(ChatDto DTO) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public ChatDto get(Long id) {
        return null;
    }

    @Override
    public List<ChatDto> list() {
        return null;
    }

    @PostMapping("create/users/chat")
    public Long createUsersChat(@RequestBody ChatCreateDto chatCreateDto){
        return service.createUsersChat(chatCreateDto);
    }

    @GetMapping("get/chat/messages/{id}")
    public ResponseEntity<List<MessageDto>> getChatMessages(@PathVariable Long id){
        return ResponseEntity.ok(service.getChatMessages(id));
    }
}
