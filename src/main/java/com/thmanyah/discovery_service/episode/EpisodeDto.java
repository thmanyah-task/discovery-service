package com.thmanyah.discovery_service.episode;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeDto {
    private Long id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate publishedDate;
    private Integer episodeNumber;
    private String subject;
    private String description;
    private Double duration;
    private String episodeUrl;
    private String thumbnail;
}
