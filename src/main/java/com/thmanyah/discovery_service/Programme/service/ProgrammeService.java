package com.thmanyah.discovery_service.programme.service;

import com.thmanyah.discovery_service.programme.dto.ProgrammeDto;
import com.thmanyah.discovery_service.shared.ApiResponse;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;

public interface ProgrammeService {
    ProgrammeDto findById(Long programmeId);

    ApiResponse<List<ProgrammeDto>> getListOfProgrammes(
            String programmeSubject,
            String programmeDescription,
            LocalDate programmePublishedDate,
            String categoryNameAr,
            String languageNameAr,
            String episodeSubject,
            String episodeDescription,
            Integer episodeNumber,
            LocalDate episodePublishedDate,
            Integer page,
            Integer size
    );

}
