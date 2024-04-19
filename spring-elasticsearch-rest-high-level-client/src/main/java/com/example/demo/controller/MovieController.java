package com.example.demo.controller;

import com.example.demo.service.MovieService;
import com.example.demo.model.Movie;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.index.IndexResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @PostMapping
    public Mono<IndexResponse> createDocument(@RequestBody Movie movie) {
        return movieService.createMovieDocument(movie);
    }

    @GetMapping("/{movie-name}")
    public Mono<Movie> findById(@PathVariable("movie-name") String movieName) {
        return movieService.findByMovieName(movieName);
    }

   /* @PutMapping
    public ResponseEntity<String> updateProfile(@RequestBody Movie movie) throws Exception {
        return new ResponseEntity<>(movieService.updateMovie(movie), HttpStatus.CREATED);
    }*/

    @GetMapping
    public Flux<Movie> findAll() {
        return movieService.findAll();
    }

    @GetMapping(value = "/search")
    public Flux<Movie> search(
            @RequestParam(value = "genre") String genre) {
        return movieService.searchByGenre(genre);
    }

}
