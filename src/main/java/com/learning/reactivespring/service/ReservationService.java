package com.learning.reactivespring.service;

import com.learning.reactivespring.model.Reservation;
import reactor.core.publisher.Mono;

public interface ReservationService {

    Mono<Reservation> getReservations(String id);
    Mono<Reservation> createReservation(Mono<Reservation> reservationMono);
    Mono<Reservation> updateReservation(String id, Mono<Reservation> reservationMono);
    Mono<Boolean> deleteReservation(String id);

}
