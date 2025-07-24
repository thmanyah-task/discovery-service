package com.thmanyah.discovery_service.programme.client;

import com.thmanyah.discovery_service.shared.ApiResponse;
import com.thmanyah.discovery_service.programme.dto.ProgrammeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "programme", url = "http://localhost:8668/cms-be/programme")
public interface ProgrammeClient {

    @GetMapping("/{programmeId}")
    public ApiResponse<ProgrammeDto> getProgramme(@PathVariable("programmeId") Long programmeId);

    @GetMapping("/list")
    public ApiResponse<List<ProgrammeDto>> getListOfProgrammes(
            @RequestParam(name = "programmeSubject",value = "programmeSubject", required = false) String programmeSubject,
            @RequestParam(name = "programmeDescription",value = "programmeDescription", required = false) String programmeDescription,
            @RequestParam(name = "programmePublishedDate",value = "programmePublishedDate", required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate programmePublishedDate,
            @RequestParam(name = "categoryNameAr",value = "categoryNameAr", required = false) String categoryNameAr,
            @RequestParam(name = "languageNameAr",value = "languageNameAr", required = false) String languageNameAr,
            @RequestParam(name = "episodeSubject",value = "episodeSubject", required = false) String episodeSubject,
            @RequestParam(name = "episodeDescription",value = "episodeDescription", required = false) String episodeDescription,
            @RequestParam(name = "episodeNumber",value = "episodeNumber", required = false) Integer episodeNumber,
            @RequestParam(name = "episodePublishedDate",value = "episodePublishedDate", required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate episodePublishedDate,
            @RequestParam(name = "page",value = "page", required = true) Integer page,
            @RequestParam(name = "size",value = "size", required = true) Integer size
    ) ;
}
