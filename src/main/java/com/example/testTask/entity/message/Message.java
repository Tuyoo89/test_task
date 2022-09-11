package com.example.testTask.entity.message;

import com.example.testTask.entity.base.AuditableEntity;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.enums.MessageType;
import com.example.testTask.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Message extends AuditableEntity {

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "author")
    private User author;

    @Enumerated(EnumType.STRING)
    @Column(name = "content_type", nullable = false)
    private MessageType contentType;

    private String content;
}
