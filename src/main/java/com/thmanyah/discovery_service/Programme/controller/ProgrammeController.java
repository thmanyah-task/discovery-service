package com.thmanyah.discovery_service.programme.controller;


import com.thmanyah.discovery_service.programme.client.ProgrammeClient;
import com.thmanyah.discovery_service.shared.ApiResponse;
import com.thmanyah.discovery_service.programme.dto.ProgrammeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/programme")
@RequiredArgsConstructor
public class ProgrammeController {

    private final ProgrammeClient programmeClient;

    @GetMapping("/{programmeId}")
    public ApiResponse<ProgrammeDto> getProgramme(@PathVariable("programmeId") Long programmeId){
        ProgrammeDto programmeDto = programmeClient.getProgramme(programmeId).getData();
        return ApiResponse.<ProgrammeDto>builder()
                .data(programmeDto)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now()).build();
    }

    @GetMapping("/list")
    public ApiResponse<List<ProgrammeDto>> getListOfProgrammes(
            @RequestParam(name = "programmeSubject", required = false) String programmeSubject,
            @RequestParam(name = "programmeDescription", required = false) String programmeDescription,
            @RequestParam(name = "programmePublishedDate", required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate programmePublishedDate,
            @RequestParam(name = "categoryNameAr", required = false) String categoryNameAr,
            @RequestParam(name = "languageNameAr", required = false) String languageNameAr,
            @RequestParam(name = "episodeSubject", required = false) String episodeSubject,
            @RequestParam(name = "episodeDescription", required = false) String episodeDescription,
            @RequestParam(name = "episodeNumber", required = false) Integer episodeNumber,
            @RequestParam(name = "episodePublishedDate", required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate episodePublishedDate,
            @RequestParam(name = "page", required = true) Integer page,
            @RequestParam(name = "size", required = true) Integer size
    ) {

        ApiResponse<List<ProgrammeDto>> programmeDtos = programmeClient.getListOfProgrammes(programmeSubject,
                programmeDescription,programmePublishedDate,categoryNameAr,languageNameAr,episodeSubject,episodeDescription,
                episodeNumber,episodePublishedDate,page,size);

        return ApiResponse.<List<ProgrammeDto>>builder()
                .data(programmeDtos.getData())
                .totalPages(programmeDtos.getTotalPages())
                .totalCount(programmeDtos.getTotalCount())
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
                .build();
    }

}
