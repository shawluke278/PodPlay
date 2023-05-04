package com.raywenderlich.podplay.repository

import com.raywenderlich.podplay.service.ItunesService

class ItunesRepo(private val itunesService: ItunesService) {
    // 2
    suspend fun searchByTerm(term: String) =
        itunesService.searchPodcastByTerm(term) // 3
}