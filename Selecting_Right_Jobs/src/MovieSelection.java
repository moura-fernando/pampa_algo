import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSelection {
    public static void main(String[] args) {
    	
        // Defining movies list with values
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", 0, 10, 8));
        movies.add(new Movie("Movie 2", 5, 13, 12));
        movies.add(new Movie("Movie 3", 12, 18, 9));
        movies.add(new Movie("Movie 4", 17, 22, 15));
        movies.add(new Movie("Movie 5", 24, 35, 4));
  
        // Sorting movies by start time 
        Collections.sort(movies);
        
        // Initialize an array to sum pair value$.
        int[] max = new int[movies.size()];
        max[0] = movies.get(0).value;
        

        // Comparing movie x with movie x-1 until < 0. 
        for (int i = 1; i < movies.size(); i++) {
            int maxBuffer = 0;
            for (int j = i - 1; j >= 0; j--) {
            	if (movies.get(j).end <= movies.get(i).start) {
                    //keeping max between maxbuffer or array max
                	maxBuffer = Math.max(maxBuffer, max[j]);
                }
            }
            //adding max pair sum on array max 
            max[i] = maxBuffer + movies.get(i).value;
        }

        // Find the maximum value in the max array and last movie added
        int maxTotal = 0;
        int lastIndex = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > maxTotal) {
                maxTotal = max[i];
                lastIndex = i;
            }
        }

        // Backing to find the selected movies
        List<Movie> selectedMovies = new ArrayList<>();
        while (lastIndex >= 0) {
            selectedMovies.add(movies.get(lastIndex));
            int prevIndex = lastIndex - 1;
            //while movie >= 0 and while date final prev movie > date start last move prevIndex --
            while (prevIndex >= 0 && movies.get(prevIndex).end > movies.get(lastIndex).start) {
                prevIndex--;
            }
            lastIndex = prevIndex;
        }

        // Printing movies and values
        System.out.println("Selected movies:");
        for (Movie movie : selectedMovies) {
            System.out.println(movie.title + " - Value: " + movie.value);
        }

        System.out.println("Total Value: " + maxTotal);
    }
}