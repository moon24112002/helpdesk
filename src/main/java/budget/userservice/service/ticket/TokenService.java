package budget.userservice.service.ticket;

import budget.userservice.entity.Ticket;
import budget.userservice.repository.TicketRepository;
import budget.userservice.service.email.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class TokenService implements ITicketService {
    @Autowired
    private TicketRepository _ticketRepository;

    @Autowired
    private IEmailService _emailService;


    @Override
    public Ticket createTicket(Ticket ticket) {
        int token = ThreadLocalRandom.current().nextInt(1000, 10000);
        ticket.setToken(token);
        var t = _ticketRepository.save(ticket);
        _emailService.sendEmail(ticket.getEmail(),ticket.getToken()+"",ticket.getName(),ticket.getMessage());
        return t;
    }

    @Override
    public Ticket findTicketById(String id) {
        Optional<Ticket> op= _ticketRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        return null;
    }

    @Override
    public Ticket findTicketByToken(int token) {
        return null;
    }

    @Override
    public List<Ticket> findAllTicket() {
        return List.of();
    }
}
