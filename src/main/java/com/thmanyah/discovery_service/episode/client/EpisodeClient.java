package com.thmanyah.discovery_service.episode.client;


import com.thmanyah.discovery_service.episode.dto.EpisodeDto;
import com.thmanyah.discovery_service.shared.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "episode", url = "http://localhost:8668/cms-be/episode")
public interface EpisodeClient {

    @GetMapping("/{episodeId}")
    public ApiResponse<EpisodeDto> getEpisodeById(@PathVariable("episodeId") Long episodeId);
}
