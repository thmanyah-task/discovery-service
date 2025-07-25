package com.thmanyah.discovery_service.programme.serviceImpl;

import com.thmanyah.discovery_service.programme.client.ProgrammeClient;
import com.thmanyah.discovery_service.programme.dto.ProgrammeDto;
import com.thmanyah.discovery_service.programme.service.ProgrammeService;
import com.thmanyah.discovery_service.shared.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgrammeServiceImpl implements ProgrammeService {

    private final ProgrammeClient programmeClient;


    @Override
    public ProgrammeDto findById(Long programmeId) {
        return programmeClient.getProgramme(programmeId).getData();
    }

    @Override
    public ApiResponse<List<ProgrammeDto>> getListOfProgrammes(
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
            Integer size) {

        return programmeClient.getListOfProgrammes(
                programmeSubject,
                programmeDescription,
                programmePublishedDate,
                categoryNameAr,
                languageNameAr,
                episodeSubject,
                episodeDescription,
                episodeNumber,
                episodePublishedDate,
                page,
                size
        );
    }



}
