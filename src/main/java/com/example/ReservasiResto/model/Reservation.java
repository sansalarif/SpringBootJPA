package com.example.ReservasiResto.model;

import javax.persistence.Entity;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import java.time.LocalDateTime;


public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private LocalDateTime reservationTime;


    public Reservation(){

    }


    public Reservation(Long id, String customerName, LocalDateTime reservationTime){
        this.id = id;
        this.customerName = customerName;
        this.reservationTime = reservationTime;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation reservation = (Reservation) o;
        return getId().equals(reservation.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
