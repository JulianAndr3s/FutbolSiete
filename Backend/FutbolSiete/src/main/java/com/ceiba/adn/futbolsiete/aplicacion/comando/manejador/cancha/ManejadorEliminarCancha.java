package com.ceiba.adn.futbolsiete.aplicacion.comando.manejador.cancha;

import com.ceiba.adn.futbolsiete.dominio.servicios.cancha.ServicioEliminarCancha;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCancha {

        private final ServicioEliminarCancha servicioEliminarCancha;

        public ManejadorEliminarCancha(ServicioEliminarCancha servicioEliminarCancha) {
            this.servicioEliminarCancha = servicioEliminarCancha;
        }

        public void ejecutar(Long id) {
            servicioEliminarCancha.ejecutar(id);
        }
}
