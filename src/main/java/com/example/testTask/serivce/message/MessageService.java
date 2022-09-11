package com.example.testTask.serivce.message;

import com.example.testTask.base.BaseUtils;
import com.example.testTask.dao.message.MessageRepository;
import com.example.testTask.dto.message.MessageDto;
import com.example.testTask.dto.message.UserMessageDto;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.enums.MessageType;
import com.example.testTask.entity.message.Message;
import com.example.testTask.entity.user.User;
import com.example.testTask.mapper.message.MessageMapper;
import com.example.testTask.serivce.base.AbstractService;
import com.example.testTask.serivce.image.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class MessageService extends AbstractService<MessageRepository, MessageMapper> {

    private ImageService imageService;

    public MessageService(MessageRepository repository, MessageMapper mapper, ImageService imageService) {
        super(repository, mapper);
        this.imageService = imageService;
    }

    public Long createUserMessage(UserMessageDto userMessageDto){
        User user = repository.findUserById(userMessageDto.getAuthor());
        Chat chat = repository.findChatById(userMessageDto.getChatId());
        Message message = mapper.toEntity(userMessageDto);
        message.setAuthor(user);
        message.setChat(chat);
        if (userMessageDto.getContentType().equals(MessageType.IMAGE)){
            message.setContent(null);
            imageService.saveImage(userMessageDto.getContent());
        }
        return repository.save(message).getId();
    }

}
