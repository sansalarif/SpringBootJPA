package com.example.ReservasiResto.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "reservationTime")
    private LocalDateTime reservationTime;


    public Reservation() {

    }

    public Reservation(Long id, String customerName, LocalDateTime reservationTime) {
        this.id = id;
        this.customerName = customerName;
        this.reservationTime = reservationTime;
    }

    public Long getId() {
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
        return "Reservation{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.example.ReservasiResto.model.Reservation)) return false;
        com.example.ReservasiResto.model.Reservation reservation = (com.example.ReservasiResto.model.Reservation) o;
        return getId().equals(reservation.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}