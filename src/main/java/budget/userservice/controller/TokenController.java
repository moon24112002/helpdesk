package budget.userservice.controller;

import budget.userservice.entity.Ticket;
import budget.userservice.service.ticket.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TokenController {
    @Autowired
    ITicketService _ticketService;

    @PostMapping
    public String createTicket(@RequestBody Ticket ticket){
        Ticket t = _ticketService.createTicket(ticket);
        return t.getId();
    }
    @GetMapping("/{id}")
    public Ticket createTicket(@PathVariable String id){
        Ticket t = _ticketService.findTicketById(id);
        return t;
    }
}
