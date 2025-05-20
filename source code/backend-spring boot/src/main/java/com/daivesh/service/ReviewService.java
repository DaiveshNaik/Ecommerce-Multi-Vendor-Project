package com.daivesh.service;

import com.daivesh.exception.ReviewNotFoundException;
import com.daivesh.model.Product;
import com.daivesh.model.Review;
import com.daivesh.model.User;
import com.daivesh.request.CreateReviewRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);

    List<Review> getReviewsByProductId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
