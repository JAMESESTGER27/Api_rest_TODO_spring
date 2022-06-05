package com.example.demo.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String Description;
    private LocalDateTime createDate;
    private LocalDateTime eta;
    private Boolean finished;
    private TaskStatus taskStatus;
}
