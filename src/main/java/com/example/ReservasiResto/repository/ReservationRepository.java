package com.example.ReservasiResto.repository;

import com.example.ReservasiResto.model.Reservation;
import com.example.ReservasiResto.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@Repository
public class ReservationRepository {
    private final List<Reservation> reservations = new ArrayList<>();

    public Reservation save(Reservation reservation){
        reservation.setId((long) (reservations.size() + 1));
        reservations.add(reservation);
        return  reservation;
    }

    public List<Reservation> findAll(){
        return reservations;
    }

    public Optional<Reservation> findById(Long id){
        return reservations.stream()
                .filter(reservation -> reservation.getId().equals(id))
                .findFirst();
    }

    public Optional<Reservation> findByName(String name){
        return reservations.stream()
                .filter(reservation -> reservation.getCustomerName().equals(name))
                .findFirst();
    }




}
