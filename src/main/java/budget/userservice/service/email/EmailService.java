package budget.userservice.service.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {

    @Autowired
    private JavaMailSender _javaMailSender;

    @Override
    public void sendEmail(String to, String token,String name ,String message) {
       SimpleMailMessage mail= new SimpleMailMessage();
       mail.setTo(to);
        String subject = "Token : "+token;
        mail.setSubject(subject);
        String text = "Hi " + name + ",\n\n" +
                "You have raised a ticket : " + token + "\n"+
                "For "+message+". \n"+
                "One of us will reach out to you soon.\n\n" +
                "Thanks and regards,\n" +
                "IT Help Desk";
       mail.setText(text);
       _javaMailSender.send(mail);
    }
}
