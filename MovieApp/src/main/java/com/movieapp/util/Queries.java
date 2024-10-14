package com.movieapp.util;

public class Queries {
	
	public static final String INSERTQUERY=
			"insert into movie(movie_name,language,format,genre,duration) values(?,?,?,?,?)";
		
		public static final String UPDATEQUERY="Update movie set format= ? where movie_Id=?";
		public static final String DELETEQUERY="delete from movie where movie_id=?";
		public static final String SELECTQUERY= "select * from movie";
		public static final String SELECTONEQUERY= "select * from movie where movie_id=?";
		
		public static final String SELECTNAMESQUERY= "select movie_name from movie where language=?";
		
		public static final String SELECTLANGQUERY = "SELECT * FROM movie WHERE language = ?";
		public static final String SELECTGENREQUERY= "SELECT * FROM movie WHERE genre = ?";
		public static final String SELECTLANGFORMQUERY = "SELECT * FROM movie WHERE language = ? AND format = ?";
		public static final String SELCETLANGGENREQUERY= "SELECT * FROM movie WHERE language = ? AND genre = ?";
		public static final String SELECTGENREFORMQUERY= "SELECT * FROM movie WHERE genre = ? AND format = ?";
		public static final String SELECTLANGGENRESEARCH = "SELECT * FROM movie WHERE movie_name LIKE ? OR language = ? OR genre = ?";
		public static final String SELECTLANGUAGE = "SELECT movie_name FROM movie WHERE language = ?";

}
