package com.thmanyah.discovery_service.episode.service;

import com.thmanyah.discovery_service.episode.dto.EpisodeDto;

public interface EpisodeService {

    EpisodeDto findEpisodeById(Long episodeId);

}
