package com.example.testTask.entity.chat;

import com.example.testTask.entity.base.AuditableEntity;
import com.example.testTask.entity.message.Message;
import com.example.testTask.entity.user.User;
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
public class Chat extends AuditableEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "chat_users",
            joinColumns = @JoinColumn(name = "chat_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id")
    )
    private List<User> users;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "chat")
    @JsonIgnore
    private List<Message> messageList;

}
