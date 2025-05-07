package budget.userservice.service.ticket;

import budget.userservice.entity.Ticket;
import java.util.*;

public interface ITicketService {
    Ticket createTicket(Ticket ticket);
    Ticket findTicketById(String id);
    Ticket findTicketByToken(int token);
    List<Ticket> findAllTicket();
}
