package com.capgemini.stream;

import java.util.Arrays;
import java.util.List;

public class News {
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static void main(String[] args) {

		List<News> list = Arrays.asList(
				new News(1, "ABC", "XYZ", "Covid situation is decreasing day by day."),
				new News(2, "DEF", "DEF", "PM visited Odisha budget today."),
				new News(3, "GHI", "PKM","Petrol price is dectrased by Rs.10/-, and budget of the indian economy decreases., and Deasel price decteased by RS.5"),
				new News(4, "KLM", "DEF","All IT Sectors are going to open next year by March. and the budget of the IT sector is on hike."));

		// Question 5
		System.out.println("Question 5");
		int count = (int) list.stream().filter(x -> x.comment.contains("budget")).count();
		System.out.println(count + "     <<<<---- budget present ");

	}	
	
}
