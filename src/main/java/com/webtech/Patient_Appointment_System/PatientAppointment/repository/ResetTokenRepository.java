package com.webtech.Patient_Appointment_System.PatientAppointment.repository;

import com.webtech.Patient_Appointment_System.PatientAppointment.model.ResetToken;
import com.webtech.Patient_Appointment_System.PatientAppointment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    void deleteByToken(String token);
    Optional<ResetToken> findByUser(User user);
    Optional<ResetToken> findByToken(String token);
}
