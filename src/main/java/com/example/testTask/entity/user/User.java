package com.example.testTask.entity.user;

import com.example.testTask.entity.base.AuditableEntity;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.message.Message;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "users")
public class User extends AuditableEntity {
    private String username;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "chat_users",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "chat_id", referencedColumnName = "id")
    )
    @JsonIgnore
    private List<Chat> chats;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "author")
    @JsonIgnore
    private List<Message> messageList;
}

