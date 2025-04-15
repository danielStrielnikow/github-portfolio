package pl.danielstrielnikow.portfoliojava.service;

import jakarta.mail.MessagingException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail( String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("koveevip@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        javaMailSender.send(message);
    }
}
