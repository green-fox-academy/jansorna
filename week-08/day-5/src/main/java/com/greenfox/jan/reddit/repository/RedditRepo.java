package com.greenfox.jan.reddit.repository;

import com.greenfox.jan.reddit.models.RedditPost;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RedditRepo extends CrudRepository<RedditPost, Long> {

    List<RedditPost> findAllByIdGreaterThanOrderByVotesDesc(Long number);

    RedditPost findFirstById(Long number);
}
