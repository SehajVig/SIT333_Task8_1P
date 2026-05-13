package com.ontrack;

public class FeedbackService {

	public String getFeedback(int studentId, int taskId) {

        //Validate student
        if (studentId != 1) {
            return "Invalid student";
        }

        //Valid task feedback
        if (taskId == 101) {
            return "Good work, keep improving!";
        }

        //Task not founds
        return "No feedback available";
    }
}
