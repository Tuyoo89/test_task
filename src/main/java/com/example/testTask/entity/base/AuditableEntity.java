package com.example.testTask.entity.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass

@EntityListeners(AuditingEntityListener.class)
public class AuditableEntity extends AbstractEntity {

    @CreatedDate
    @Column(name = "createdDate", nullable = false)
    protected Timestamp createdDate;

}
