package com.shristi.basic;

public class Movie {
	private String mobieName;
	private int movieId;
	private String language;
	private String showTime;
	@Override
	public String toString() {
		return "Movie [mobieName=" + mobieName + ", movieId=" + movieId + ", language=" + language + ", showTime="
				+ showTime + "]";
	}
	public String getMobieName() {
		return mobieName;
	}
	public void setMobieName(String mobieName) {
		this.mobieName = mobieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public Movie(String mobieName, int movieId, String language, String showTime) {
		super();
		this.mobieName = mobieName;
		this.movieId = movieId;
		this.language = language;
		this.showTime = showTime;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
