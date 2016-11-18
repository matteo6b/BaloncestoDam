package com.example.Repository;

/**
 * Created by Mateo on 17/11/16.
 */

import com.example.Domain.Equipo;




        import com.example.Domain.Jugador;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import java.util.List;


public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo> findBylocalidadIs (String localidad);

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.equipo.nombreequipo is :nombre AND jugador.posicion is :posicion")

    List<Jugador> findJugadoresByequipoAndposicion(@Param("nombre") String nombreequipo, @Param("posicion") String posicion);


}