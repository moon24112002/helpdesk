package budget.userservice.service.email;

public interface IEmailService {
    void sendEmail(String to, String subject,String name, String message);
}
