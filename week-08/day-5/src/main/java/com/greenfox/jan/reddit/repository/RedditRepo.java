package com.greenfox.jan.reddit.repository;

import com.greenfox.jan.reddit.models.RedditPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepo extends CrudRepository<RedditPost, Long> {

    RedditPost findFirstById(Long number);

    Page<RedditPost> findAllByIdGreaterThanOrderByVotesDesc(Pageable pageable, Long number);
}
