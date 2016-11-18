package com.example.Repository;

/**
 * Created by Mateo on 17/11/16.
 */

import com.example.Domain.Jugador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;


public interface JugadorRepository extends JpaRepository<Jugador, Long> {


    List<Jugador> findBynombreContaining (String nombre);

    List<Jugador> findBycanastastotalesGreaterThanEqual(int canastastotales);

    List<Jugador> findByasistenciastotalesBetween(int min, int max);

    List<Jugador> findByposicionIs(String posicion);

    List<Jugador> findByfechanacimiento (LocalDate fechanacimiento);

    @Query("select jugador.posicion , avg(jugador.canastastotales) , avg(jugador.asistenciastotales) ," +
            " AVG (jugador.rebotestotales) FROM Jugador jugador GROUP BY jugador.posicion ")
    List<Object[]> AVGcanastasasistenciasrebotesPorPosicion();

    @Query("select jugador.posicion ,max(jugador.canastastotales),min (jugador.canastastotales), avg(jugador.canastastotales)" +
            " ,max(jugador.asistenciastotales) ,min(jugador.asistenciastotales) , avg(jugador.asistenciastotales) " +
            ",max (jugador.rebotestotales) ,min(jugador.rebotestotales)" +
            "  , AVG (jugador.rebotestotales) FROM Jugador jugador GROUP BY jugador.posicion ")
    List<Object[]> MaxMincanastasasistenciasrebotesPorPosicion();


    List<Jugador> findByEquipoNombreequipo(String nombreEquipo);


    @Query("SELECT  jugador " +"FROM Jugador jugador "
            +"WHERE jugador.equipo.nombreequipo=:nombreEquipo "
            +"ORDER BY jugador.canastastotales DESC")
    Page<Jugador> JugadorMaxCanastasEquipo(@Param("nombreEquipo") String nombreequipo, Pageable pageable);

}