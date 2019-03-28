package com.yash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver {

	@Autowired
	private FeedbackRepository feedbackRepository;

	public QueryResolver(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}

	public List<Feedback> getFeedbacks() {
		return (List<Feedback>) feedbackRepository.findAll();
	}

	public Feedback getFeedback(Integer id) {
		// Optional<Feedback> feedbackResouce = feedbackRepository.findById(id);
		Feedback feedback = feedbackRepository.findById(id).orElseThrow(() -> new FeedbackNotFoundException(id));
		return feedback;
	}
}
