
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Student {
    private int studentId;
    private String name;
    private String email;
    private String contactNumber;

    // Constructor
    public Student(int studentId, String name, String email, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        Student other = (Student) obj; // Typecast the object to Student
        if (studentId != other.studentId) // Compare the studentId
            return false;
        if (contactNumber == null) { // If the contactNumber is null
            if (other.contactNumber != null) // If the other contactNumber is not null
                return false;
        } else if (!contactNumber.equals(other.contactNumber)) // If the contactNumbers are not equal
            return false;
        if (email == null) { // If the email is null
            if (other.email != null) // If the other email is not null
                return false;
        } else if (!email.equals(other.email)) // If the emails are not equal
            return false;
        if (name == null) { // If the name is null
            if (other.name != null) // If the other name is not null
                return false;
        } else if (!name.equals(other.name)) // If the names are not equal
            return false;
        return true;
    }
}

class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private Date dueDate = new Date(assignmentId);
    private List<Question> questions;

    // Constructor
    public Assignment(int assignmentId, String title, String description, List<Question> questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    // Getters and setters
    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + assignmentId;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
        result = prime * result + ((questions == null) ? 0 : questions.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Assignment other = (Assignment) obj;
        if (assignmentId != other.assignmentId)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (dueDate == null) {
            if (other.dueDate != null)
                return false;
        } else if (!dueDate.equals(other.dueDate))
            return false;
        if (questions == null) {
            if (other.questions != null)
                return false;
        } else if (!questions.equals(other.questions))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}

class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    // Constructor
    public Trainer(int trainerId, String name, String email, String contactNumber, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStacks = techStacks;
    }

    // Getters and setters
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<TechStack> getTechStacks() {
        return techStacks;
    }

    public void setTechStacks(List<TechStack> techStacks) {
        this.techStacks = techStacks;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + trainerId;
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((techStacks == null) ? 0 : techStacks.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        Trainer other = (Trainer) obj; // Typecast the object to Trainer
        if (trainerId != other.trainerId) // Compare the trainerId
            return false;
        if (contactNumber == null) { // If the contactNumber is null
            if (other.contactNumber != null) // If the other contactNumber is not null
                return false;
        } else if (!contactNumber.equals(other.contactNumber)) // If the contactNumbers are not equal
            return false;
        if (email == null) { // If the email is null
            if (other.email != null) // If the other email is not null
                return false;
        } else if (!email.equals(other.email)) // If the emails are not equal
            return false;
        if (name == null) { // If the name is null
            if (other.name != null) // If the other name is not null
                return false;
        } else if (!name.equals(other.name)) // If the names are not equal
            return false;
        if (techStacks == null) { // If the techStacks is null
            if (other.techStacks != null) // If the other techStacks is not null
                return false;
        } else if (!techStacks.equals(other.techStacks)) // If the techStacks are not equal
            return false;
        return true;
    }
}

class TechStack {
    private int techStackId;
    private String name;
    private String description;

    // Constructor
    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + techStackId;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        TechStack other = (TechStack) obj; // Typecast the object to TechStack
        if (techStackId != other.techStackId) // Compare the techStackId
            return false;
        if (description == null) { // If the description is null
            if (other.description != null) // If the other description is not null
                return false;
        } else if (!description.equals(other.description)) // If the descriptions are not equal
            return false;
        if (name == null) { // If the name is null
            if (other.name != null) // If the other name is not null
                return false;
        } else if (!name.equals(other.name)) // If the names are not equal
            return false;
        return true;
    }
}

class Result {
    private Student student;
    private Assignment assignment;
    private List<Question> questions;
    private List<Answer> answers;
    private int score;

    public Result(Student student, Assignment assignment, List<Question> questions, List<Answer> answers, int score) {
        this.student = student;
        this.assignment = assignment;
        this.questions = questions;
        this.answers = answers;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class ResultsData {
    private List<Result> results;

    public void addResult(Result result) {
        // Add result to the list
    }

    public List<Result> getResultsByStudent(Student student) {
        // Return results for the given student
        return null;
    }

    // Other methods

    // Constructor
    public ResultsData(List<Result> results) {
        this.results = results;
    }

    // Getters and setters
    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        ResultsData other = (ResultsData) obj; // Typecast the object to ResultsData
        if (results == null) { // If the results is null
            if (other.results != null) // If the other results is not null
                return false;
        } else if (!results.equals(other.results)) // If the results are not equal
            return false;
        return true;
    }
}

class Question {
    private int questionId;
    private List<Answer> answers;
    private String answerKey;
    private int score;
    private int techStackId;
    private int assignmentId;

    // Constructor
    public Question(int questionId, List<Answer> answers, String answerKey, int score, int techStackId,
            int assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.score = score;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // Getters and setters
    public int getQuestionId() {
        return questionId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getAnswerKey() {
        return answerKey;
    }

    public int getScore() {
        return score;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + questionId;
        result = prime * result + ((answerKey == null) ? 0 : answerKey.hashCode());
        result = prime * result + ((answers == null) ? 0 : answers.hashCode());
        result = prime * result + assignmentId;
        result = prime * result + score;
        result = prime * result + techStackId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        Question other = (Question) obj; // Typecast the object to Question
        if (questionId != other.questionId) // Compare the questionId
            return false;
        if (answerKey == null) { // If the answerKey is null
            if (other.answerKey != null) // If the other answerKey is not null
                return false;
        } else if (!answerKey.equals(other.answerKey)) // If the answerKeys are not equal
            return false;
        if (answers == null) { // If the answers is null
            if (other.answers != null) // If the other answers is not null
                return false;
        } else if (!answers.equals(other.answers)) // If the answers are not equal
            return false;
        if (assignmentId != other.assignmentId) // If the assignmentIds are not equal
            return false;
        if (score != other.score) // If the scores are not equal
            return false;
        if (techStackId != other.techStackId) // If the techStackIds are not equal
            return false;
        return true;
    }
}

class Answer {
    private int answerId;
    private String answerText;

    // Constructor
    public Answer(int answerId, String answerText) {
        this.answerId = answerId;
        this.answerText = answerText;
    }

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + answerId;
        result = prime * result + ((answerText == null) ? 0 : answerText.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        Answer other = (Answer) obj; // Typecast the object to Answer
        if (answerId != other.answerId) // Compare the answerId
            return false;
        if (answerText == null) { // If the answerText is null
            if (other.answerText != null) // If the other answerText is not null
                return false;
        } else if (!answerText.equals(other.answerText)) // If the answerTexts are not equal
            return false;
        return true;
    }
}

public class App {
    public static void main(String[] args) {
        // Create 10 student objects with constructor parameters
        Student student1 = new Student(1, "John", "john@example.com", "1234567890");
        Student student2 = new Student(2, "Jane", "jane@example.com", "9876543210");
        Student student3 = new Student(3, "Mike", "mike@example.com", "4567891230");
        Student student4 = new Student(4, "Emily", "emily@example.com", "7891234560");

        // Create 3 trainers
        Trainer trainer1 = new Trainer(1, "Trainer1", "trainer1@example.com", "1234567890", new ArrayList<>());
        Trainer trainer2 = new Trainer(2, "Trainer2", "trainer2@example.com", "9876543210", new ArrayList<>());
        Trainer trainer3 = new Trainer(3, "Trainer3", "trainer3@example.com", "4567891230", new ArrayList<>());

        // Create 4 assignments
        Assignment assignment1 = new Assignment(1, "Assignment 1", "Description 1", new ArrayList<>());
        Assignment assignment2 = new Assignment(2, "Assignment 2", "Description 2", new ArrayList<>());
        Assignment assignment3 = new Assignment(3, "Assignment 3", "Description 3", new ArrayList<>());
        Assignment assignment4 = new Assignment(4, "Assignment 4", "Description 4", new ArrayList<>());

        // Create 4 questions for assignment1
        Question question1 = new Question(1, new ArrayList<>(), "Answer 1", 10, 1, assignment1.getAssignmentId());
        Question question2 = new Question(2, new ArrayList<>(), "Answer 2", 10, 1, assignment1.getAssignmentId());
        Question question3 = new Question(3, new ArrayList<>(), "Answer 3", 10, 1, assignment1.getAssignmentId());
        Question question4 = new Question(4, new ArrayList<>(), "Answer 4", 10, 1, assignment1.getAssignmentId());

        // Create 4 questions for assignment2
        Question question5 = new Question(5, new ArrayList<>(), "Answer 5", 10, 2, assignment2.getAssignmentId());
        Question question6 = new Question(6, new ArrayList<>(), "Answer 6", 10, 2, assignment2.getAssignmentId());
        Question question7 = new Question(7, new ArrayList<>(), "Answer 7", 10, 2, assignment2.getAssignmentId());
        Question question8 = new Question(8, new ArrayList<>(), "Answer 8", 10, 2, assignment2.getAssignmentId());

        // Create 4 questions for assignment3
        Question question9 = new Question(9, new ArrayList<>(), "Answer 9", 10, 3, assignment3.getAssignmentId());
        Question question10 = new Question(10, new ArrayList<>(), "Answer 10", 10, 3, assignment3.getAssignmentId());
        Question question11 = new Question(11, new ArrayList<>(), "Answer 11", 10, 3, assignment3.getAssignmentId());
        Question question12 = new Question(12, new ArrayList<>(), "Answer 12", 10, 3, assignment3.getAssignmentId());

        // Create 4 questions for assignment4
        Question question13 = new Question(13, new ArrayList<>(), "Answer 13", 10, 4, assignment4.getAssignmentId());
        Question question14 = new Question(14, new ArrayList<>(), "Answer 14", 10, 4, assignment4.getAssignmentId());
        Question question15 = new Question(15, new ArrayList<>(), "Answer 15", 10, 4, assignment4.getAssignmentId());
        Question question16 = new Question(16, new ArrayList<>(), "Answer 16", 10, 4, assignment4.getAssignmentId());

        // Create 5 tech stacks
        TechStack techStack1 = new TechStack(1, "Java", "Object-oriented programming language");
        TechStack techStack2 = new TechStack(2, "Python", "High-level programming language");
        TechStack techStack3 = new TechStack(3, "JavaScript", "Scripting language for web development");
        TechStack techStack4 = new TechStack(4, "C#", "General-purpose programming language");
        TechStack techStack5 = new TechStack(5, "Ruby", "Dynamic, reflective, object-oriented language");

        // Create 4 answers for above questions
        Answer answer1 = new Answer(1, "Answer 1");
        Answer answer2 = new Answer(2, "Answer 2");
        Answer answer3 = new Answer(3, "Answer 3");
        Answer answer4 = new Answer(4, "Answer 4");
        Answer answer5 = new Answer(5, "Answer 5");
        Answer answer6 = new Answer(6, "Answer 6");
        Answer answer7 = new Answer(7, "Answer 7");
        Answer answer8 = new Answer(8, "Answer 8");
        Answer answer9 = new Answer(9, "Answer 9");
        Answer answer10 = new Answer(10, "Answer 10");
        Answer answer11 = new Answer(11, "Answer 11");
        Answer answer12 = new Answer(12, "Answer 12");
        Answer answer13 = new Answer(13, "Answer 13");
        Answer answer14 = new Answer(14, "Answer 14");
        Answer answer15 = new Answer(15, "Answer 15");
        Answer answer16 = new Answer(16, "Answer 16");

        // Create results
        List<Result> results = new ArrayList<>();

        // Result for student1 and assignment1
        List<Question> questions1 = new ArrayList<>();
        questions1.add(question1);
        questions1.add(question2);
        questions1.add(question3);
        questions1.add(question4);
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(answer1);
        answers1.add(answer2);
        answers1.add(answer3);
        answers1.add(answer4);
        Result result1 = new Result(student1, assignment1, questions1, answers1, 40);
        results.add(result1);

        // Result for student2 and assignment2
        List<Question> questions2 = new ArrayList<>();
        questions2.add(question5);
        questions2.add(question6);
        questions2.add(question7);
        questions2.add(question8);
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(answer5);
        answers2.add(answer6);
        answers2.add(answer7);
        answers2.add(answer8);
        Result result2 = new Result(student2, assignment2, questions2, answers2, 40);
        results.add(result2);

        // Result for student3 and assignment3
        List<Question> questions3 = new ArrayList<>();
        questions3.add(question9);
        questions3.add(question10);
        questions3.add(question11);
        questions3.add(question12);
        List<Answer> answers3 = new ArrayList<>();
        answers3.add(answer9);
        answers3.add(answer10);
        answers3.add(answer11);
        answers3.add(answer12);
        Result result3 = new Result(student3, assignment3, questions3, answers3, 40);
        results.add(result3);

        // Result for student4 and assignment4
        List<Question> questions4 = new ArrayList<>();
        questions4.add(question13);
        questions4.add(question14);
        questions4.add(question15);
        questions4.add(question16);
        List<Answer> answers4 = new ArrayList<>();
        answers4.add(answer13);
        answers4.add(answer14);
        answers4.add(answer15);
        answers4.add(answer16);
        Result result4 = new Result(student4, assignment4, questions4, answers4, 40);
        results.add(result4);
        for (Result result : results) {
            System.out.println("Student: " + result.getStudent().getName());
            System.out.println("Assignment: " + result.getAssignment().getTitle());
            System.out.println("Score: " + result.getScore());
            System.out.println("Questions:");
            for (Question question : result.getQuestions()) {
                System.out.println("  - " + question.getQuestionId() + ": " + question.getAnswerKey());
            }
            System.out.println("Answers:");
            for (Answer answer : result.getAnswers()) {
                System.out.println("  - " + answer.getAnswerId() + ": " + answer.getAnswerText());
            }
            System.out.println();
        }

    }
}
