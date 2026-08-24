package com.unwork.healthabsence.repository;
import com.unwork.healthabsence.entity.QrToken;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface QrTokenRepository extends JpaRepository<QrToken, Long> {
    Optional<QrToken> findByTokenHash(String tokenHash);
}
