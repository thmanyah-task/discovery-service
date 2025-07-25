package com.thmanyah.discovery_service.episode.serviceImpl;

import com.thmanyah.discovery_service.episode.client.EpisodeClient;
import com.thmanyah.discovery_service.episode.dto.EpisodeDto;
import com.thmanyah.discovery_service.episode.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EpisodeServiceImpl implements EpisodeService {

    private final EpisodeClient episodeClient;


    @Override
    public EpisodeDto findEpisodeById(Long episodeId) {
        EpisodeDto episodeDto = episodeClient.getEpisodeById(episodeId).getData();
        return episodeDto;
    }

}
