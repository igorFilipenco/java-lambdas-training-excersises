package com.lambda.chapter3;

import com.lambda.Album;
import com.lambda.Artist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task1 {
    public static int addUp(Stream<Integer> values) {
        return values.reduce(0, Integer::sum);
    }

    public static List<String> getArtistNameAndLocation(Stream<Artist> artists) {
        return artists
                .flatMap(artist -> Stream.of(artist.getName(), artist.getLocation()))
                .collect(toList());

    }

    public static List<String> getAlbumsWithLongNames(Stream<Album> albums) {
        return albums
                .flatMap(album -> Stream.of(album.getName()))
                .filter(albumName -> albumName.length() > 3)
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(addUp(Stream.of(1, 2, 3)));

        getArtistNameAndLocation(Stream.of(
                new Artist("a1", "California", Collections.singletonList(new Album("alb1", Arrays.asList("song1", "song2")))),
                new Artist("a2", "Philadelphia", Collections.singletonList(new Album("alb1", Arrays.asList("song1", "song2"))))
        )).forEach(System.out::println);


        getAlbumsWithLongNames(Stream.of(
                new Album("alb1", Arrays.asList("song1", "song2")),
                new Album("al2", Arrays.asList("song1", "song2"))
        )).forEach(System.out::println);
    }
}
