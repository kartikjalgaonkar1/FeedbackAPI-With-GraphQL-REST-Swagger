package com.yash;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
	Optional<Feedback> findById(Integer id);
	Integer deleteById(Integer id);
	List<Feedback> findAllByOrderByIdDesc();
	Optional<Feedback> findById(Long id);
}
