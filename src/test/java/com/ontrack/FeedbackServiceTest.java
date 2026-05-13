package com.ontrack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FeedbackServiceTest {

	@Test
    public void testViewFeedbackValidTask() {

        FeedbackService service = new FeedbackService();

        String result = service.getFeedback(1, 101);

        assertEquals("Good work, keep improving!", result);
    }

    @Test
    public void testInvalidStudent() {

        FeedbackService service = new FeedbackService();

        String result = service.getFeedback(99, 101);

        assertEquals("Invalid student", result);
    }

    @Test
    public void testTaskNotFound() {

        FeedbackService service = new FeedbackService();

        String result = service.getFeedback(1, 999);

        assertEquals("No feedback available", result);
    }

}


