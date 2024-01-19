/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Morgan and Piper
 * @version 1/19/24
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist myplay = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        myplay.addSong("Ventura Highway", "America", "2:22");
        myplay.addSong("Willow", "Taylor Swift", "3:01");
        myplay.addSong("Sound of Silence", "Simon and Garfunkel", "4:38");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        myplay.allSongs();

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        myplay.likeSong(1);
        myplay.likeSong(3);

        System.out.println("Printing the songs...\n");


        System.out.println("\nRemoving the song in position A, B, C, etc...\n");


        System.out.println("Printing the songs...\n");


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
