/**
 * Created by zach on 5/17/16.
 */
public class Email {
    Person author;
    String subject;
    String body;
    String destination;
    int time;

    public Email(Person author, String subject, String body, String destination, int time) {
        this.author = author;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = time;
    }

    public Email(String subject, String body, String destination) {
        this.author = null;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = 0;
    }

    @Override
    public String toString() {
        return "Email{" +
                "author=" + author +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", destination='" + destination + '\'' +
                ", time=" + time +
                '}';
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}