package com.yash.microservices.feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class FeedbackFieldError {

	private Date timestamp;
	private String error;
	private String description;
	public FeedbackFieldError(Date timestamp, String error, String description) {
		super();
		this.timestamp = timestamp;
		this.error = error;
		this.description = description;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
