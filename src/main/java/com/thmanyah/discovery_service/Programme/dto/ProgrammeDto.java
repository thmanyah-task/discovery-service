package com.thmanyah.discovery_service.programme.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.thmanyah.discovery_service.episode.dto.EpisodeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammeDto {
    private Long id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String subject;
    private String description;
    private CategoryDto category;
    private LanguageDto language;
    private String programmeUrl;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate publishedDate;
    private String thumbnail;
    List<EpisodeDto> episodeDtoList;
}
