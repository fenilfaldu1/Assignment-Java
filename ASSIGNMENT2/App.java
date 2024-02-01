package ASSIGNMENT2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    static class Student {
        private int studentId;
        private String name;
        private String email;
        private String contactNumber;

        public Student() {
        }

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

    static class Assignment {
        private int assignmentId;
        private String title;
        private String description;
        private Date dueDate = new Date(assignmentId);
        private List<Question> questions;

        public Assignment() {
        }

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

    static class Trainer {
        private int trainerId;
        private String name;
        private String email;
        private String contactNumber;
        private List<TechStack> techStacks;

        public Trainer() {
        }

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

    static class TechStack {
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

    static class Result {
        private int resultId;
        private Student student;
        private Assignment assignment;
        private Trainer trainer;
        private int score;
        private String feedback;
        private Date submissionDate;

        // Constructor
        public Result(int resultId, Student student, Assignment assignment, Trainer trainer, int score, String feedback,
                Date submissionDate) {
            this.resultId = resultId;
            this.student = student;
            this.assignment = assignment;
            this.trainer = trainer;
            this.score = score;
            this.feedback = feedback;
            this.submissionDate = submissionDate;
        }

        // Getters and setters
        public int getResultId() {
            return resultId;
        }

        public Student getStudent() {
            return student;
        }

        public Assignment getAssignment() {
            return assignment;
        }

        public Trainer getTrainer() {
            return trainer;
        }

        public int getScore() {
            return score;
        }

        public String getFeedback() {
            return feedback;
        }

        public Date getSubmissionDate() {
            return submissionDate;
        }

        public void setResultId(int resultId) {
            this.resultId = resultId;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public void setAssignment(Assignment assignment) {
            this.assignment = assignment;
        }

        public void setTrainer(Trainer trainer) {
            this.trainer = trainer;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public void setSubmissionDate(Date submissionDate) {
            this.submissionDate = submissionDate;
        }

        public String toString() {
            return resultId + " " + student.name + " " + assignment.assignmentId + " " + trainer.name + " " + score
                    + " "
                    + feedback + " "
                    + submissionDate + " ";

        }

        // HashCode and equals
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + resultId;
            result = prime * result + ((assignment == null) ? 0 : assignment.hashCode());
            result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
            result = prime * result + score;
            result = prime * result + ((student == null) ? 0 : student.hashCode());
            result = prime * result + ((submissionDate == null) ? 0 : submissionDate.hashCode());
            result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
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
            Result other = (Result) obj; // Typecast the object to Result
            if (resultId != other.resultId) // Compare the resultId
                return false;
            if (assignment == null) { // If the assignment is null
                if (other.assignment != null) // If the other assignment is not null
                    return false;
            } else if (!assignment.equals(other.assignment)) // If the assignments are not equal
                return false;
            if (feedback == null) { // If the feedback is null
                if (other.feedback != null) // If the other feedback is not null
                    return false;
            } else if (!feedback.equals(other.feedback)) // If the feedbacks are not equal
                return false;
            if (score != other.score) // If the scores are not equal
                return false;
            if (student == null) { // If the student is null
                if (other.student != null) // If the other student is not null
                    return false;
            } else if (!student.equals(other.student)) // If the students are not equal
                return false;
            if (submissionDate == null) { // If the submissionDate is null
                if (other.submissionDate != null) // If the other submissionDate is not null
                    return false;
            } else if (!submissionDate.equals(other.submissionDate)) // If the submissionDates are not equal
                return false;
            if (trainer == null) { // If the trainer is null
                if (other.trainer != null) // If the other trainer is not null
                    return false;
            } else if (!trainer.equals(other.trainer)) // If the trainers are not equal
                return false;
            return true;
        }
    }

    static class ResultsData {
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

    static class Question {
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

    static class Answer {
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

    private static List<String> needImprovement(List<Result> printResults) {
        // TODO Auto-generated method stub
        Map<Student, Integer> totalScoreByStudent = printResults.stream()
                .collect(Collectors.groupingBy(Result::getStudent,
                        Collectors.summingInt(Result::getScore)));
        Map<Student, Integer> sortedTotalScoreByStudent = sortByValueDescending(totalScoreByStudent);

        List<String> Names = new ArrayList<>();
        for (Map.Entry<Student, Integer> entry : sortedTotalScoreByStudent.entrySet()) {
            int score = entry.getValue();
            Student s = entry.getKey();
            if (score / 2 < 60) {
                // System.out.println(s.getName() + " needs improvement as he has scored " +
                // (score / 2) + " percentage");
                Names.add(s.getName() + " needs improvement as he has scored " + (score / 2) + " percentage");
            }

        }
        return Names;
    }

    private static List<String> getOverallRanking(List<Result> printResults) {
        // TODO Auto-generated method stub
        Map<Student, Integer> totalScoreByStudent = printResults.stream()
                .collect(Collectors.groupingBy(Result::getStudent,
                        Collectors.summingInt(Result::getScore)));
        Map<Student, Integer> sortedTotalScoreByStudent = sortByValueDescending(totalScoreByStudent);
        List<String> Names = new ArrayList<>();
        int i = 1;
        for (Map.Entry<Student, Integer> entry : sortedTotalScoreByStudent.entrySet()) {
            Student student = entry.getKey();
            Names.add("Student:" + student.getName() + " Rank:" + i);
            // System.out.println("Student:" + student.getName() + " Rank:" + i);
            i++;
        }
        return Names;
    }

    private static List<String> getSecondHighestScorer(List<Result> printResults) {
        // TODO Auto-generated method stub
        Map<Student, Integer> totalScoreByStudent = printResults.stream()
                .collect(Collectors.groupingBy(Result::getStudent,
                        Collectors.summingInt(Result::getScore)));
        Map<Student, Integer> sortedTotalScoreByStudent = sortByValueDescending(totalScoreByStudent);

        Iterator<Map.Entry<Student, Integer>> iterator = sortedTotalScoreByStudent.entrySet().iterator();

        List<String> secondHighest = new ArrayList<>();
        if (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                Map.Entry<Student, Integer> secondEntry = iterator.next();
                Student secondStudent = secondEntry.getKey();
                int secondTotalScore = secondEntry.getValue();
                // System.out.println("Second Highest Scorer:" + secondStudent.getName());
                // System.out.println("Percentage:" + secondTotalScore / 2);
                secondHighest
                        .add("Second Highest Scorer:" + secondStudent.getName() + "Percentage:" + secondTotalScore / 2);
            }
            // else {
            // System.out.println("There is no second entry in the map.");
            // }
        } else {
            System.out.println("The map is empty.");
        }
        return secondHighest;
    }

    public static void getHighestScorer(List<Result> results) {
        Map<Student, Integer> totalScoreByStudent = results.stream()
                .collect(Collectors.groupingBy(Result::getStudent,
                        Collectors.summingInt(Result::getScore)));
        Map<Student, Integer> sortedTotalScoreByStudent = sortByValueDescending(totalScoreByStudent);

        Map.Entry<Student, Integer> firstEntry = sortedTotalScoreByStudent.entrySet().iterator()
                .next();
        System.out.println("Highest Scorer:" + firstEntry.getKey().getName());
        System.out.println("Percentage:" + firstEntry.getValue() / 2);

    }

    private static Map<Student, Integer> sortByValueDescending(Map<Student, Integer> totalScoreByStudent) {
        // TODO Auto-generated method stub
        return totalScoreByStudent.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    private static List<Trainer> createDummyTrainers() {
        // TODO Auto-generated method stub
        List<Trainer> Trainers = new ArrayList<>();
        Trainers.add(new Trainer(1, "FENIL FALDU", "fenilfaldu1@gmail.com", "1234567", null));
        Trainers.add(new Trainer(1, "FENIL FALDU", "fenilfaldu1@gmail.com", "1234567", null));
        Trainers.add(new Trainer(1, "FENIL FALDU", "fenilfaldu1@gmail.com", "1234567", null));

        return Trainers;
    }

    private static List<Result> printResults(List<Student> dummyStudents, List<Assignment> dummyAssignments,
            List<Trainer> dummyTrainers) {
        // TODO Auto-generated method stub
        List<Result> Result = new ArrayList<>();
        Result.add(new Result(1, dummyStudents.get(0), dummyAssignments.get(0), dummyTrainers.get(0), 40,
                "NEED TO IMPROVE", null));
        Result.add(new Result(2, dummyStudents.get(0), dummyAssignments.get(1), dummyTrainers.get(1), 50,
                "IMPROVED", null));
        Result.add(new Result(3, dummyStudents.get(1), dummyAssignments.get(0), dummyTrainers.get(2), 90,
                "EXCELLENT", null));
        Result.add(new Result(4, dummyStudents.get(1), dummyAssignments.get(1), dummyTrainers.get(0), 80,
                "VERY GOOD", null));

        return Result;
    }

    private static List<TechStack> createDummyTechStacks() {
        List<TechStack> TechStack = new ArrayList<>();

        TechStack t1 = new TechStack(1, "JAVA", "THIS IS THE BEST PROGRAMMING LANGUAGE");
        TechStack.add(t1);
        return TechStack;
    }

    private static List<Assignment> createDummyAssignments() {
        List<Assignment> assignments = new ArrayList<>();

        // Assignment 1
        Assignment assignment1 = new Assignment();
        assignment1.setAssignmentId(201);
        assignment1.setTitle("Java Basics");
        assignment1.setDescription("Introduction to Java programming language");
        assignment1.setDueDate(new Date());
        assignment1.setQuestions(createQuestionsForAssignment1());
        assignments.add(assignment1);

        Assignment assignment2 = new Assignment();
        assignment1.setAssignmentId(202);
        assignment1.setTitle("python Basics");
        assignment1.setDescription("Introduction to python programming language");
        assignment1.setDueDate(new Date());
        assignment1.setQuestions(createQuestionsForAssignment2());
        assignments.add(assignment1);
        return assignments;
    }

    private static List<Question> createQuestionsForAssignment2() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    private static List<Question> createQuestionsForAssignment1() {
        // Implement logic to create questions for Assignment 1
        return new ArrayList<>();
    }

    private static List<Student> createDummyStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "John Doe", "john.doe@example.com", "123-456-7890"));
        students.add(new Student(2, "Jane Smith", "jane.smith@example.com", "987-654-3210"));
        // students.add(new Student(3, "Bob Johnson", "bob.johnson@example.com",
        // "555-123-4567"));
        // students.add(new Student(4, "Alice Williams", "alice.williams@example.com",
        // "777-888-9999"));
        // students.add(new Student(5, "Charlie Brown", "charlie.brown@example.com",
        // "444-555-6666"));
        // students.add(new Student(6, "Eva Martinez", "eva.martinez@example.com",
        // "111-222-3333"));
        // students.add(new Student(7, "David Miller", "david.miller@example.com",
        // "999-888-7777"));
        // students.add(new Student(8, "Grace Davis", "grace.davis@example.com",
        // "333-222-1111"));
        // students.add(new Student(9, "Sam Wilson", "sam.wilson@example.com",
        // "666-777-8888"));
        // students.add(new Student(10, "Olivia Lee", "olivia.lee@example.com",
        // "222-333-4444"));

        return students;
    }

    public static void main(String[] args) {
        // Create 10 students Objects
        // Create 3 trainers
        // Create 4 Assignments
        // Create 4 questions in each assignment
        // Create 5 tech stacks
        // Create Results on the above data
        // Create ResultData on the above Data
        List<Student> dummyStudents = createDummyStudents();
        // System.out.println("STUDENTS" + dummyStudents);

        List<Trainer> dummyTrainers = createDummyTrainers();
        // System.out.println("Trainers" + dummyTrainers);
        List<Assignment> dummyAssignments = createDummyAssignments();
        // System.out.println("Assignment" + dummyAssignments);

        List<TechStack> dummTechStacks = createDummyTechStacks();
        // System.out.println("Assignment" + dummTechStacks);

        List<Result> printResults = printResults(dummyStudents, dummyAssignments, dummyTrainers);
        // System.out.println(printResults);
        for (Result printl : printResults) {

            System.out.println(printl.toString());
        }

        getHighestScorer(printResults);

        List<String> Names1 = getSecondHighestScorer(printResults);
        for (String printl : Names1) {

            System.out.println(printl.toString());
        }

        List<String> Names = getOverallRanking(printResults);
        for (String printl : Names) {

            System.out.println(printl.toString());
        }

        List<String> Names2 = needImprovement(printResults);
        for (String i : Names2) {
            System.out.println(i.toString());
        }
    }
}
