package com.lambda.chapter4;

import java.util.stream.Stream;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();
}