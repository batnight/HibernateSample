package model;

import java.util.Map;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Question {
    private int id;
    private String qName;
    private Map<String,User> answers;

    public Question() {
    }

    public Question(int id, String qName, Map<String, User> answers) {
        this.id = id;
        this.qName = qName;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public Map<String, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, User> answers) {
        this.answers = answers;
    }
}
