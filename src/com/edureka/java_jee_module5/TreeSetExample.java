package com.edureka.java_jee_module5;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Set<Movie> movies = new TreeSet<>(new JounarComparatorDesc());
		movies.add(new Movie("Planet Of Apes", "action", new Date(2000, 10,18)));
		movies.add(new Movie("Anabelle", "horror", new Date(2000, 12,21)));
		movies.add(new Movie("comedyyyy", "comedy", new Date(2014, 10,18)));
		movies.add(new Movie("suspenseee", "suspense", new Date(2015, 9,5)));
		movies.add(new Movie("thriller", "thriller", new Date(2018, 4,4)));
		
		Iterator<Movie> iterator = movies.iterator();
		while(iterator.hasNext()) {
			Movie movie = iterator.next();
			System.out.println(movie);
		}

	}
	

}

class NameComparatorAsc implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class NameComparatorDesc implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}

class JounarComparatorAsc implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getJounar().compareTo(o2.getJounar());
	}
}

class JounarComparatorDesc implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o2.getJounar().compareTo(o1.getJounar());
	}
}



class Movie implements Comparable<Movie>{
	
	private String name;
	private String jounar;
	private Date releaseDate;
	
	
	public Movie(String name, String jounar, Date releaseDate) {
		super();
		this.name = name;
		this.jounar = jounar;
		this.releaseDate = releaseDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJounar() {
		return jounar;
	}
	public void setJounar(String jounar) {
		this.jounar = jounar;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", jounar=" + jounar + ", releaseDate=" + new SimpleDateFormat("dd/MM/yy").format(releaseDate) + "]";
	}
	@Override
	public int compareTo(Movie o) {
		return this.name.compareTo(o.name);
	}
	
}
