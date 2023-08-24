class Movie implements Comparable<Movie> {
    String title;
    int start;
    int end;
    int value;

    public Movie(String title, int start, int end, int value) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.value = value;
    }

	@Override
	public int compareTo(Movie movie) {
		Integer.compare(start, movie.start);
		return 0;
	}
}

