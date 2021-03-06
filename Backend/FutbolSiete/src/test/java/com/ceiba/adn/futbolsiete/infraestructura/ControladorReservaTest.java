package com.ceiba.adn.futbolsiete.infraestructura;

import com.ceiba.adn.futbolsiete.FutbolSieteApplication;
import com.ceiba.adn.futbolsiete.dominio.modelo.Reserva;
import com.ceiba.adn.futbolsiete.testdatabuilder.ReservaTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = FutbolSieteApplication.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControladorReservaTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void listarReservas() throws Exception {
        //Arrange
        Reserva reserva = new ReservaTestDataBuilder().conDatos().build();

        mockMvc.perform(post("/reserva")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(reserva)))
                .andExpect(status().isOk());

        // Act - Assert
        mockMvc.perform(get("/reserva")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].pagoTotal", is(150000)));
    }

    @Test
    public void crearReserva() throws Exception {

        Reserva reserva = new ReservaTestDataBuilder().conDatos().build();

        // Act - Assert
        mockMvc.perform(post("/reserva")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(reserva)))
                .andExpect(status().isOk());
    }


    @Test
    public void eliminarReserva() throws Exception {

        Reserva reserva = new ReservaTestDataBuilder().conDatos().conId(2L).build();

        // Act - Assert
        mockMvc.perform(post("/reserva")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(reserva)))
                .andExpect(status().isOk());

        // Act - Assert
        mockMvc.perform(delete("/reserva/".concat("2"))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()
                );
    }
}
