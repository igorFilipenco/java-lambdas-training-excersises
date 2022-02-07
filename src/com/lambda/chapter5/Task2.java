package com.lambda.chapter5;


import com.lambda.chapter4.Artist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class Task2 {
    private static final List<Artist> artists = Arrays.asList(
            new Artist("John Lennon"),
            new Artist("Paul Maccartney"),
            new Artist("George Harrison"),
            new Artist("Ringo Star"),
            new Artist("Pete Best"),
            new Artist("Stuart Sutcliffe")
    );

    private static final Comparator<Artist> nameComparator = comparing(artist -> artist.getName().length());

    /**
     * 2a
     */
    public static Artist byReduce(List<Artist> ar) throws Exception {
        return artists.stream()
                .reduce((artist, artistToCompare) -> {
                    return nameComparator.compare(artist, artistToCompare) >= 0 ? artist : artistToCompare;
                }).orElseThrow(Exception::new);
    }

    /**
     * 2a
     */
    public static Artist byCollecting(List<Artist> ar) throws Exception {
        return artists.stream()
                .collect(Collectors.maxBy(nameComparator))
                .orElseThrow(Exception::new);
    }

    public static void main(String[] args) {
        try {
            System.out.println(byCollecting(new ArrayList<>()).getName());
        } catch (Exception e) {
            //
        }
    }
}
