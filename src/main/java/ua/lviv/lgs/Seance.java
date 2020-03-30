package ua.lviv.lgs;

public class Seance implements Comparable<Seance>{
	private Movie movie;
	private Time startTime;
	private Time endTime;
	
	public Seance(Movie movie, Time startTime) throws MyTimeException {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = startTime.plusTime(movie.getDuration());
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "\n" + movie + ", Початок показу: " + startTime + ", кінець показу:" + endTime ;
	}
	
	public int compareTo(Seance anouserSeance) {
		if (this.startTime.compareTo(startTime) == anouserSeance.startTime.compareTo(startTime)) {
			return 0;
		} else if (this.startTime.compareTo(startTime) < anouserSeance.startTime.compareTo(startTime)) {
			return -1;
		} else {
			return 1;
		}

	}
}
