package com.thmanyah.discovery_service.episode.controller;


import com.thmanyah.discovery_service.episode.client.EpisodeClient;
import com.thmanyah.discovery_service.episode.dto.EpisodeDto;
import com.thmanyah.discovery_service.shared.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/episode")
@RequiredArgsConstructor
public class EpisodeController {

    private final EpisodeClient episodeClient;

    @GetMapping("/{episodeId}")
    public ApiResponse<EpisodeDto> getEpisodeById(@PathVariable("episodeId") Long episodeId){
        EpisodeDto episodeDto = episodeClient.getEpisodeById(episodeId).getData();
        return ApiResponse.<EpisodeDto>builder()
                .data(episodeDto)
                .status(HttpStatus.CREATED)
                .timestamp(LocalDateTime.now()).build();
    }
}
