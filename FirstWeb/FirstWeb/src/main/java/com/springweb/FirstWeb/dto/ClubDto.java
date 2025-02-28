package com.springweb.FirstWeb.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder

public class ClubDto {
    private Long id;
    private String title;
    private String photoUrl;
    private String content;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
