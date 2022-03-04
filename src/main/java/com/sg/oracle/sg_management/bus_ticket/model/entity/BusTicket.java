package com.sg.oracle.sg_management.bus_ticket.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "BUS_TICKET")
public class BusTicket
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_generator")
    @SequenceGenerator(name="ticket_generator", sequenceName = "ticket_seq", initialValue = 1, allocationSize=1)
    @Column(name = "TICKET_ID")
    private Integer tickedID;
	   
    private String company;
	
    @Column(name = "FROM_PLACE")
    private String from;
    
    @Column(name = "TO_PLACE")
    private String to;

    @Temporal(TemporalType.DATE)
    @Column(name = "DEPARTURE_TIME")
    private Date departureTime;

}
