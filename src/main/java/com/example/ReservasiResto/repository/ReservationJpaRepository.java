package com.example.ReservasiResto.repository;

import com.example.ReservasiResto.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReservationJpaRepository  extends JpaRepository<Reservation, Long> {

}
