package com.example.testTask.serivce.chat;

import com.example.testTask.dao.chat.ChatRepository;
import com.example.testTask.dto.chat.ChatCreateDto;
import com.example.testTask.dto.message.MessageDto;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.message.Message;
import com.example.testTask.entity.user.User;
import com.example.testTask.mapper.chat.ChatMapper;
import com.example.testTask.mapper.message.MessageMapper;
import com.example.testTask.serivce.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChatService extends AbstractService<ChatRepository, ChatMapper> {

    private MessageMapper messageMapper;

    public ChatService(ChatRepository repository, ChatMapper mapper, MessageMapper messageMapper) {
        super(repository, mapper);
        this.messageMapper = messageMapper;
    }


    public Long createUsersChat(ChatCreateDto chatCreateDto){
        List<User> userList = repository.getUserListById(chatCreateDto.getUsers());
        Chat chat = mapper.toEntity(chatCreateDto);
        chat.setUsers(userList);
        return repository.save(chat).getId();
    }

    public List<MessageDto> getChatMessages(Long id) {
        List<Message> chatMessages = repository.getChatMessages(id);
        return messageMapper.toDto(chatMessages);
    }
}
