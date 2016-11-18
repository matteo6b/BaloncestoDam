package com.example.Service;

/**
 * Created by Mateo on 17/11/16.
 */

import org.springframework.data.domain.PageRequest;
        import com.example.Domain.Equipo;
        import com.example.Domain.Jugador;
        import com.example.Repository.EquipoRepository;
        import com.example.Repository.JugadorRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.stereotype.Service;
        import java.time.LocalDate;
        import java.util.List;

@Service
public class EquipoService {


    @Autowired
    private JugadorRepository jugadorRepository;


    @Autowired
    private EquipoRepository equipoRepository;


    private void showStatistics(List<Object[]> list) {
        for (Object[] statistic : list) {
            System.out.println("Posición: " + statistic[0]);
            System.out.println("Media de Canastas = " + statistic[1]);
            System.out.println("Media de Asistencias = " + statistic[2]);
            System.out.println("Media de Rebotes = " + statistic[3] + System.lineSeparator());
        }
    }

    private  void estadisticasLiST(List<Object[]> list) {
        for (Object[] statistic : list) {
            System.out.println("Posición: " + statistic[0]);
            System.out.println("Max Canastas ="+ statistic[1]);
            System.out.println("Min Canastas ="+ statistic[2]);
            System.out.println("Media de Canastas = " + statistic[3]);
            System.out.println("Max Asistencias ="+ statistic[4]);
            System.out.println("Min Asistencias ="+ statistic[5]);
            System.out.println("Media de Asistencias = " + statistic[6]);
            System.out.println("Max Rebotes ="+ statistic[7]);
            System.out.println("Min Rebotes ="+ statistic[8]);
            System.out.println("Media de Rebotes = " + statistic[9] + System.lineSeparator());
        }
    }

    private void bestPlayer(Page<Jugador> jugadorPage) {
        jugadorPage.getContent().forEach(jugador->{
            System.out.println(jugador);

        });
    }


    public void run() {


        Equipo warriors = new Equipo();
        warriors.setNombreequipo("Warriors");
        warriors.setLocalidad("San antonio");
        warriors.setFechacreacion(LocalDate.of(1884, 3, 30));
        equipoRepository.save(warriors);

        //WARRIORS
        Jugador curry = new Jugador();
        curry.setNombre("Curry");
        curry.setFechanacimiento(LocalDate.of(1996, 03, 30));
        curry.setCanastastotales(10);
        curry.setAsistenciastotales(20);
        curry.setRebotestotales(14);
        curry.setPosicion("base");
        curry.setEquipo(warriors);
        jugadorRepository.save(curry);

        Jugador thomson = new Jugador();
        thomson.setNombre("thomson");
        thomson.setFechanacimiento(LocalDate.of(1997, 02, 21));
        thomson.setCanastastotales(20);
        thomson.setAsistenciastotales(25);
        thomson.setRebotestotales(2);
        thomson.setPosicion("alero");
        thomson.setEquipo(warriors);
        jugadorRepository.save(thomson);
        //J3
        Jugador camil = new Jugador();
        camil.setNombre("camil");
        camil.setFechanacimiento(LocalDate.of(1993, 01, 01));
        camil.setCanastastotales(80);
        camil.setAsistenciastotales(25);
        camil.setRebotestotales(2);
        camil.setPosicion("Escolta");
        camil.setEquipo(warriors);
        jugadorRepository.save(camil);

        Jugador felipe = new Jugador();
        felipe.setNombre("felipe");
        felipe.setFechanacimiento(LocalDate.of(1992, 04, 04));
        felipe.setCanastastotales(89);
        felipe.setAsistenciastotales(15);
        felipe.setRebotestotales(4);
        felipe.setPosicion("Escolta");
        felipe.setEquipo(warriors);
        jugadorRepository.save(felipe);

        Equipo lakers = new Equipo();
        lakers.setNombreequipo("lakers");
        lakers.setLocalidad("los angeles");
        lakers.setFechacreacion(LocalDate.of(1934, 6, 20));
        equipoRepository.save(lakers);


        Jugador lorena = new Jugador();
        lorena.setNombre("lorena");
        lorena.setFechanacimiento(LocalDate.of(1991, 12, 12));
        lorena.setCanastastotales(2);
        lorena.setAsistenciastotales(5);
        lorena.setRebotestotales(22);
        lorena.setPosicion("Ala-pivot");
        lorena.setEquipo(lakers);
        jugadorRepository.save(lorena);
        //J2
        Jugador yolanda = new Jugador();
        yolanda.setNombre("yolanda");
        yolanda.setFechanacimiento(LocalDate.of(1992, 11, 11));
        yolanda.setCanastastotales(12);
        yolanda.setAsistenciastotales(4);
        yolanda.setRebotestotales(23);
        yolanda.setPosicion("Pivot");
        yolanda.setEquipo(lakers);

        jugadorRepository.save(yolanda);
        //J3
        Jugador nati = new Jugador();
        nati.setNombre("nati");
        nati.setFechanacimiento(LocalDate.of(1984, 5, 6));
        nati.setCanastastotales(42);
        nati.setAsistenciastotales(20);
        nati.setRebotestotales(15);
        nati.setPosicion("Escolta");
        nati.setEquipo(lakers);

        jugadorRepository.save(nati);
        
        
        
        

        Equipo bulls = new Equipo();
        bulls.setNombreequipo("buls");
        bulls.setLocalidad("New York");
        bulls.setFechacreacion(LocalDate.of(1929, 2, 13));
        equipoRepository.save(bulls);

        Jugador aurelio = new Jugador();
        aurelio.setNombre("aurelio");
        aurelio.setFechanacimiento(LocalDate.of(1981, 3, 4));
        aurelio.setCanastastotales(85);
        aurelio.setAsistenciastotales(45);
        aurelio.setRebotestotales(34);
        aurelio.setPosicion("Escolta");
        jugadorRepository.save(aurelio);
        //j2
        Jugador jacinto = new Jugador();
        jacinto.setNombre("jacinto");
        jacinto.setFechanacimiento(LocalDate.of(1984, 2, 2));
        jacinto.setCanastastotales(47);
        jacinto.setAsistenciastotales(15);
        jacinto.setRebotestotales(45);
        jacinto.setPosicion("Alero");
        jugadorRepository.save(jacinto);
        //j3
        Jugador tere = new Jugador();
        tere.setNombre("tere");
        tere.setFechanacimiento(LocalDate.of(1983, 12, 12));
        tere.setCanastastotales(24);
        tere.setAsistenciastotales(14);
        tere.setRebotestotales(34);
        tere.setPosicion("Base");
        jugadorRepository.save(tere);
        
        
        
        

        Equipo suns = new Equipo();
        suns.setNombreequipo("Suns");
        suns.setLocalidad("Boston");
        suns.setFechacreacion(LocalDate.of(1939, 8, 15));
        equipoRepository.save(suns);

        Jugador marcos = new Jugador();
        marcos.setNombre("marcos");
        marcos.setFechanacimiento(LocalDate.of(1992, 4, 5));
        marcos.setCanastastotales(46);
        marcos.setAsistenciastotales(15);
        marcos.setRebotestotales(16);
        marcos.setPosicion("Base");
        jugadorRepository.save(marcos);
        //j2
        Jugador veronica = new Jugador();
        veronica.setNombre("veronica");
        veronica.setFechanacimiento(LocalDate.of(1986, 6, 6));
        veronica.setCanastastotales(86);
        veronica.setAsistenciastotales(46);
        veronica.setRebotestotales(16);
        veronica.setPosicion("Escolta");
        jugadorRepository.save(veronica);
        //j3
        Jugador andrea = new Jugador();
        andrea.setNombre("andrea");
        andrea.setFechanacimiento(LocalDate.of(1986, 5, 4));
        andrea.setCanastastotales(46);
        andrea.setAsistenciastotales(84);
        andrea.setRebotestotales(15);
        andrea.setPosicion("Base");
        jugadorRepository.save(andrea);
        
        

        Equipo spurs = new Equipo();
        spurs.setNombreequipo("spus");
        spurs.setLocalidad("San Antonio");
        spurs.setFechacreacion(LocalDate.of(1979, 3, 4));
        equipoRepository.save(spurs);

        Jugador alex = new Jugador();
        alex.setNombre("alex");
        alex.setFechanacimiento(LocalDate.of(1979, 2, 4));
        alex.setCanastastotales(35);
        alex.setAsistenciastotales(84);
        alex.setRebotestotales(89);
        alex.setPosicion("Alero");
        jugadorRepository.save(alex);
        //j2
        Jugador sergio = new Jugador();
        sergio.setNombre("sergio");
        sergio.setFechanacimiento(LocalDate.of(1973, 11, 12));
        sergio.setCanastastotales(81);
        sergio.setAsistenciastotales(15);
        sergio.setRebotestotales(16);
        sergio.setPosicion("Pivot");
        jugadorRepository.save(sergio);
        //j3
        Jugador alberto = new Jugador();
        alberto.setNombre("alberto");
        alberto.setFechanacimiento(LocalDate.of(1989, 4, 11));
        alberto.setCanastastotales(15);
        alberto.setAsistenciastotales(61);
        alberto.setRebotestotales(48);
        alberto.setPosicion("Escolta");
        jugadorRepository.save(alberto);
    
     
        //Selects




        //a. Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.
        

        System.out.println(jugadorRepository.findBynombreContaining("alber"));

        //b. Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas  especificado como parámetro.


        System.out.println(jugadorRepository.findBycanastastotalesGreaterThanEqual(50));

        //c. Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.

 

        System.out.println(jugadorRepository.findByasistenciastotalesBetween(20, 40));

    

     

        System.out.println(jugadorRepository.findByposicionIs("Alero"));


        //e. Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.

      
        System.out.println(jugadorRepository.findByfechanacimiento(LocalDate.of(199, 3, 30)));

        //f. Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente  información: la media de canastas, asistencias y rebotes.
       
        showStatistics(jugadorRepository.AVGcanastasasistenciasrebotesPorPosicion());


        estadisticasLiST(jugadorRepository.MaxMincanastasasistenciasrebotesPorPosicion());

        // 2. Consultas que tienes que implementar y demostrar que funcionan correctamente

        //a.Consulta los equipos existentes en una localidad determinada.
       

        System.out.println(equipoRepository.findBylocalidadIs("San Antonio"));

        //b.Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.

 
        System.out.println(jugadorRepository.findByEquipoNombreequipo("spurs"));

        // c. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.

     

        System.out.println(equipoRepository.findJugadoresByequipoAndposicion("suns", "Base"));

        //d. Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
        Pageable topOne = new PageRequest(0, 1);
        bestPlayer(jugadorRepository.JugadorMaxCanastasEquipo("lakers", topOne));



    }



}
