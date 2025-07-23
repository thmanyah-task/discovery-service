package com.thmanyah.discovery_service.programme.dto;


import com.thmanyah.discovery_service.episode.EpisodeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    List<EpisodeDto> episodeDtoList;
}
