package com.unwork.healthabsence.repository;
import com.unwork.healthabsence.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface VisitRepository extends JpaRepository<Visit, UUID> {
    List<Visit> findByStudent(Student student);
    List<Visit> findByStudentOrderByCreatedAtDesc(Student student);
    List<Visit> findByHospitalAndStatus(Hospital hospital, VisitStatus status);
    List<Visit> findByUniversityAndStatus(University university, VisitStatus status);
}
