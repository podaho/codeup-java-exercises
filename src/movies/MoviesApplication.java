package movies;

import util.Input;
import java.util.ArrayList;

public class MoviesApplication {
    public static void mainMenu() {
        Input inp = new Input();
        int resp = inp.getInt(0,6,"\nWhat would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add a new movie\n\nEnter your choice:");
        MoviesArray.populate();
        switch(resp) {
            case 0:
                break;
            case 1:
                printMoviesArray(MoviesArray.getMovieArr());
                break;
            case 2:
                printMoviesArray(MoviesArray.getMovieArr(), "animated");
                break;
            case 3:
                printMoviesArray(MoviesArray.getMovieArr(), "drama");
                break;
            case 4:
                printMoviesArray(MoviesArray.getMovieArr(), "horror");
                break;
            case 5:
                printMoviesArray(MoviesArray.getMovieArr(), "scifi");
                break;
            case 6:
                addMovie();
                break;
        }
    }

    public static void printMoviesArray(ArrayList<Movie> moviesArr) {
        for(Movie mov : moviesArr) {
            System.out.println(mov.getName()+" -- "+mov.getCategory());
        }
        mainMenu();
    }

    public static void printMoviesArray(ArrayList<Movie> moviesArr, String displayCategory) {
        for(Movie mov : moviesArr) {
            if(mov.getCategory().equalsIgnoreCase(displayCategory.toLowerCase())) {
                System.out.println(mov.getName()+" -- "+mov.getCategory());
            }
        }
        mainMenu();
    }

    public static void addMovie() {
        Input inp = new Input();
        MoviesArray.addOne(new Movie(inp.getString("Enter the title of the movie:"), inp.getString("Enter the category of the movie:")));
        mainMenu();
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
