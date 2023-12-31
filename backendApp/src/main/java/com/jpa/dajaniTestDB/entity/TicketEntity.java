package com.jpa.dajaniTestDB.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "ticketId")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Data
@Entity
@Table(name = "ticket")
public class TicketEntity {

    @Id
    @SequenceGenerator(
            name = "ticket_sequence",
            sequenceName = "ticket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticket_sequence"
    )
    private Integer ticketId;

    @Column(name = "title")
    private String title;

    @Column(name = "description", length = 65555)
    private String description;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @Column(name = "completed_at")
    private String completedAt;

    @Column(name = "status")
    private String status;

    //child in relationship with commentEntity
    @OneToMany( fetch = FetchType.LAZY,
            mappedBy = "ticketEntity",
            orphanRemoval = true)
    private List<CommentEntity> commentEntityList = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "ticketEntities")
            //cascade = { CascadeType.DETACH })
    private List<UserEntity> ticketUsers = new ArrayList<>();

    //used to find the user who made the ticket request
    @Column(name = "requester")
    private Integer requesterId;

    //used to find the user who is assigned to fix the ticket
    @Column(name = "agent")
    private Integer agentId;
}