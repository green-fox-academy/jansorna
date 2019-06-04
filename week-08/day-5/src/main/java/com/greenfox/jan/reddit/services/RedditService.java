package com.greenfox.jan.reddit.services;

import com.greenfox.jan.reddit.models.RedditPost;
import com.greenfox.jan.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

    RedditRepo repo;

    @Autowired
    public RedditService(RedditRepo repo) {
        this.repo = repo;
    }

    public Page<RedditPost> getPaginatedRedditPosts(Pageable pageable) {
        return repo.findAllByIdGreaterThanOrderByVotesDesc(pageable, 0L);
    }

    public void addVote(long id){
        RedditPost post = repo.findFirstById(id);
        post.setVotes(post.getVotes() + 1);
        repo.save(post);
    }

    public void takeVote (long id){
        RedditPost post = repo.findFirstById(id);
        post.setVotes(post.getVotes() - 1);
        repo.save(post);
    }
}
