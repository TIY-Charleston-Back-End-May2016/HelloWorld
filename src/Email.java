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
}
