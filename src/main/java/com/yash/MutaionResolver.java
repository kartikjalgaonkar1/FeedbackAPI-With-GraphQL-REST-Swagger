package com.yash;


import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class MutaionResolver implements GraphQLMutationResolver{

	@Autowired
	private com.yash.FeedbackRepository feedbackRepository;
	@Autowired
	ModelMapper mapper;
	
	@Transactional
	public Feedback updateFeedback(UpdateFeedbackInput feedbackInput) {
		Feedback feedback = feedbackRepository.findById(feedbackInput.getId()).get();
		feedback.setRating(feedbackInput.getRating());
		feedback.setComment(feedbackInput.getComment());
		feedback.setUsername(feedbackInput.getUsername());
		return feedback;
	}
	
	@Transactional
	public Integer deleteFeedback(Integer id) {
		return feedbackRepository.deleteById(id);
	}
	
	@Transactional
	public Feedback createFeedback(CreateFeedbackInput feedbackInput) {
		Feedback feedback = mapper.map(feedbackInput, Feedback.class);
		return feedbackRepository.save(feedback);
	}
}