package com.midnightnoon.learn2code.model;

import org.hibernate.annotations.CreationTimestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Message")
public class Message {

    private static Logger logger = LoggerFactory.getLogger(Message.class);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MESSAGE")
    private String message;

    //ak má field rovnaký názov ako stĺpec v tabuľke databázy, nemusím nastavovať @Column(name="")
    //mapovanie nie je case sensitive
    @CreationTimestamp
    private Date CREATE_DATE;

    public Message(){};

    public Message(String message){
        logger.debug("Som v konštruktore Message Debug.");
        logger.warn("Som v konštruktore Message Warn");
        logger.error("Som v konštruktore Message Error");
        this.message = message;
    };

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
