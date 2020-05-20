package jan;

import jan.model.Artist;
import jan.model.Datasource;
import jan.model.SongArtist;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open data source");
            return;
        }

        List<Artist> artists = datasource.queryArtists(5);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist: artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        for(String album: albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way",Datasource.ORDER_BY_ASC);
        if(songArtists == null) {
            System.out.println("Couldn't find the artist for the songs!");
            return;
        }

        for(SongArtist artist: songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtist();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();

        songArtists = datasource.querySongInfoView(title);
        if(songArtists.isEmpty()) {
            System.out.println("Could not find the artist for the song");
            return;
        }

        for(SongArtist artist: songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    "Album name = " + artist.getAlbumName() +
                    "Track number = " + artist.getTrack());
        }

        datasource.close();

    }
}
