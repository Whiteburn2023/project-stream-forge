package io.hammerhall.streamforge.service;

import java.util.Collection;

import io.hammerhall.streamforge.domain.movie.Movie;

public interface MovieService {
    Collection<Movie> findAllMovies();
}
