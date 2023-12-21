package com.example.ReservasiResto.service;

//import com.example.ReservasiResto.model.Reservation;
import com.example.ReservasiResto.entity.Reservation;
import com.example.ReservasiResto.repository.ReservationJpaRepository;
import com.example.ReservasiResto.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationJpaRepository reservationJpaRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, ReservationJpaRepository reservationJpaRepository) {
        this.reservationRepository = reservationRepository;
        this.reservationJpaRepository = reservationJpaRepository;
    }


    public Reservation createReservation(Reservation reservation){
        return  reservationJpaRepository.save(reservation);
    }

    public List<Reservation> getAllReservations(){
//        return reservationRepository.findAll();
        return reservationJpaRepository.findAll();
    }

    public Optional<Reservation> getUserById(Long id) {
        return reservationJpaRepository.findById(id);
    }

    public Optional<Reservation> getReservationById(Long id){
        return reservationJpaRepository.findById(id);
    }

    public Optional<Reservation> getReservationByCustomer(Long name){
        return reservationJpaRepository.findById(name);
    }



}
