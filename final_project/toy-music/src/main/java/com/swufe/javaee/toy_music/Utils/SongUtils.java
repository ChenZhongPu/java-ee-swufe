package com.swufe.javaee.toy_music.Utils;

import com.swufe.javaee.toy_music.model.Song;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SongUtils {
    /**
     * Load a list of Song from file.
     * Hint: what about reading from database?
     */
    public static List<Song> loadSongs() {
        List<Song> songs = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(CONSTANTS.SONG_FILE))) {
           songs = stream.map(line -> {
              String[] items = line.split("\\|") ;
              int id = Integer.parseInt(items[0]);
              String singer = items[1];
              String image = items[3];
              String title = items[2];
              Date date = new Date();
               try {
                   date = new SimpleDateFormat(CONSTANTS.DATE_FORMAT).parse(items[4]);
               } catch (ParseException e) {
                   e.printStackTrace();
               }
               String description = items[5];
               return new Song(id, title, image, date, singer, description);
           }).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return songs;
    }

    /**
     *
     *  Hint: any better way to obtain recent k songs
     */
    public static List<Song> recentSongs() {
        List<Song> songs = SongUtils.loadSongs();
        Collections.sort(songs, (song, t1) -> {
           if (song.getAddDate() == null || t1.getAddDate() == null)
               return 0;
          return t1.getAddDate().compareTo(song.getAddDate());
        });
        List<Song> recentSongs = new ArrayList<>();
        for (int i = 0; i < CONSTANTS.TOP_K; i++) {
            recentSongs.add(songs.get(i));
        }
        return recentSongs;
    }

    /**
     * add a song by append file
     * Hint: what about inserting into database?
     * Hint: this method takes too many arguments, so it is error-prone. Any good method to solve it?
     */
    public static boolean addSong(int id, String title, String singer, String image, String description) {
       String today = new SimpleDateFormat(CONSTANTS.DATE_FORMAT).format(new Date());
       List<String> data = Arrays.asList(String.valueOf(id), singer, title, image, today, description);
       String song = System.lineSeparator() + String.join("|", data);
       try{
           Files.write(Paths.get(CONSTANTS.SONG_FILE),
                   song.getBytes(), APPEND);
           return true;
       } catch (IOException e) {
           e.printStackTrace();
           return false;
       }
    }

    /**
     *
     * Hint: any good way to get a song quickly when reading from file
     */
    public static Song getSongByID(int id) {
        List<Song> songs = SongUtils.loadSongs();
        List<Song> results = songs.stream().filter(s -> s.getId() == id).collect(Collectors.toList());
        if (results.size() == 0)
            return null;
        else
            return results.get(0);
    }
}
