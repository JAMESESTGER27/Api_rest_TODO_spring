package com.example.demo.service.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {
    private String title;
    private String Description;
    private LocalDateTime eta;
}
