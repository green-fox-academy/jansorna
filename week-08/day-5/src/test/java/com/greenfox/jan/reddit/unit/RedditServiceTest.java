package com.greenfox.jan.reddit.unit;

import com.greenfox.jan.reddit.models.RedditPost;
import com.greenfox.jan.reddit.repository.RedditRepo;
import com.greenfox.jan.reddit.services.RedditService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class RedditServiceTest {


    @Test
    public void voteIsAdded() {

        // Arrange
        RedditRepo mockRepository = Mockito.mock(RedditRepo.class);
        Mockito.when(mockRepository.findFirstById(any()))
                .thenReturn(new RedditPost());

        RedditService redditService = new RedditService(mockRepository);

        // Act
        redditService.addVote(1L);

        // Assert
        Assert.assertEquals(1, mockRepository.findFirstById(1L).getVotes());
    }

    @Test
    public void voteIsTaken() {

        // Arrange
        RedditRepo mockRepository = Mockito.mock(RedditRepo.class);
        Mockito.when(mockRepository.findFirstById(any()))
                .thenReturn(new RedditPost());

        RedditService redditService = new RedditService(mockRepository);

        // Act
        redditService.takeVote(1L);

        // Assert
        Assert.assertEquals(-1, mockRepository.findFirstById(1L).getVotes());
    }
}
