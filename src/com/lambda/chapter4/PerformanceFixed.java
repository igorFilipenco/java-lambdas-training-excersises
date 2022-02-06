package com.lambda.chapter4;


import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/** A Performance by some musicians - eg an Album or Gig. */
public interface PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians(List<Artist> artists) {
        return getMusicians()
                .flatMap(artist-> concat(Stream.of(artist), artist.getMembers()));
    }
}
