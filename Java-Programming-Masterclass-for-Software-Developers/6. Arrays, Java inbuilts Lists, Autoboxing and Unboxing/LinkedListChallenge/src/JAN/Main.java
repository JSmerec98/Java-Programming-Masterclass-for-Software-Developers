package JAN;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Main
{
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args)
    {
        Album album = new Album("Album","Artist");
        album.addSong("Pierwsza",4.12);
        album.addSong("Druga",4.32);
        album.addSong("Trzecia",4.45);
        album.addSong("Czwarta",4.21);
        album.addSong("Piąta",4.13);
        album.addSong("Szósta",5.52);
        albums.add(album);

        album = new Album("Album 2", "Artist 2");
        album.addSong("Siódma",3.12);
        album.addSong("Ósma",2.53);
        album.addSong("Dzięwiąta",4.43);
        album.addSong("Dziesiąta",6.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Druga", playList);
        albums.get(0).addToPlayList("Cośtam", playList); // does not exist

        albums.get(0).addToPlayList(5,playList);

        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(6,playList); // does not exist

        play(playList);
    }

    private static void play(LinkedList<Song> playList)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0)
        {
            System.out.println("No song in playList");
            return;
        }
        else
        {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;

                case 1:
                    if(!forward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if(listIterator.hasNext())
                    {
                        System.out.println("Now playng " + listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("We have reached the end of the playList");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("We are at the start of the playList");
                        forward = true;
                    }

                    break;

                case 3:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else
                        {
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else
                    {
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else
                        {
                            System.out.println("We have reahed the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }

                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - to list song in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - to remove current song");
    }

    private static void printList(LinkedList<Song> playList)
    {
        Iterator<Song> iterator = playList.iterator();

        System.out.println("=====================");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("=====================");
    }
}
