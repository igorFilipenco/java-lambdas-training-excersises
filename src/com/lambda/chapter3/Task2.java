package com.lambda.chapter3;

import com.lambda.Album;
import com.lambda.Artist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Task2 {

    private static int countBandMembers(Stream<Artist> artists) {
        return artists
                .map(artist -> artist.getMembers().size())
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(countBandMembers(Stream.of(
                new Artist("a1", "California",
                        new ArrayList<>(Arrays.asList("Bob", "Jimmy")),
                        Collections.singletonList(new Album("alb1", Arrays.asList("song1", "song2")))
                ),
                new Artist("a2", "Philadelphia",
                        new ArrayList<>(Arrays.asList("Rob", "Daniel", "Bob")),
                        Collections.singletonList(new Album("alb1", Arrays.asList("song1", "song2")))))
        ));
    }
}
