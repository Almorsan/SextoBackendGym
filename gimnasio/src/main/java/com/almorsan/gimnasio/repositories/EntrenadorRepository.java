package com.almorsan.gimnasio.repositories;

import com.almorsan.gimnasio.models.Entrenador;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
    
    // Método que devuelve un Entrenador directamente
    Entrenador findByNick(String nick);

    // Método que devuelve un Optional<Entrenador>
    //Optional<Entrenador> findByNickOptional(String nick);
}