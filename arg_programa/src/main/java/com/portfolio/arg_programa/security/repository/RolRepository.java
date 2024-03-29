
package com.portfolio.arg_programa.security.repository;

import com.portfolio.arg_programa.security.entity.Rol;
import com.portfolio.arg_programa.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
