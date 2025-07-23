package com.thmanyah.discovery_service.shared;


import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ApiResponse<T> {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private T data;
    private Integer totalPages;
    private Long totalCount;
}
