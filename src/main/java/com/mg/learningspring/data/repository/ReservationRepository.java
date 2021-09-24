package com.mg.learningspring.data.repository;


import com.mg.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>  {

    Iterable<Reservation> findReservationByResDate(Date date);
}
