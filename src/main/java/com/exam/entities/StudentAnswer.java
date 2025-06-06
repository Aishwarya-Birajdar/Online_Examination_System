package com.exam.entities;

import javax.persistence.*;

// This class represents the answers submitted by students for each question in an exam.
@Entity // Marks this class as a JPA entity, meaning it's mapped to a table in the database.
@Table(name = "student_answers") // Specifies the table name to store student answers in the database.
public class StudentAnswer {

    // Primary key for the StudentAnswer entity.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // The answerId is automatically generated by the database.
    private int answerId;

    // The actual answer text provided by the student for a specific question.
    @Column(nullable = false) // This field is required (cannot be null).
    private String answerText;

    // Many-to-one relationship: Each answer is linked to a specific question.
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false) // Foreign key column in this table for the question.
    private Question question;

    // Many-to-one relationship: Each answer is linked to a specific student.
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false) // Foreign key column in this table for the student.
    private Student student;

    // Default constructor required by JPA.
    public StudentAnswer() {}

    // Constructor to initialize a StudentAnswer with the answer text, the related question, and the student.
    public StudentAnswer(String answerText, Question question, Student student) {
        this.answerText = answerText;
        this.question = question;
        this.student = student;
    }

    // Getters and setters for each field in the StudentAnswer entity.

    public int getAnswerId() {
        return answerId; // Returns the ID of the student answer.
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId; // Sets the ID for the student answer.
    }

    public String getAnswerText() {
        return answerText; // Returns the text of the student's answer.
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText; // Sets the text of the student's answer.
    }

    public Question getQuestion() {
        return question; // Returns the associated question for which this answer was submitted.
    }

    public void setQuestion(Question question) {
        this.question = question; // Sets the question related to this student answer.
    }

    public Student getStudent() {
        return student; // Returns the student who submitted this answer.
    }

    public void setStudent(Student student) {
        this.student = student; // Sets the student who provided this answer.
    }

    // Override toString to provide a human-readable string representation of the StudentAnswer entity.
    @Override
    public String toString() {
        return "StudentAnswer [ID=" + answerId + ", Text=" + answerText + "]"; // Display answer ID and text.
    }
}
