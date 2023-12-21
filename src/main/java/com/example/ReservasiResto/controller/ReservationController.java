package com.example.ReservasiResto.controller;

import com.example.ReservasiResto.entity.Reservation;
import com.example.ReservasiResto.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id).orElse(null);
    }

    @GetMapping("/customerName")
    public Optional<Reservation> getReservationsByCustomer(
            @RequestParam("customerName") Long customerName) {
        // Your logic to retrieve reservations for a specific customer
        // For example: reservationService.getReservationsByCustomer(customerId);
        return reservationService.getReservationByCustomer(customerName);
    }

}
