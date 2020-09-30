package com.ceiba.adn.futbolsiete.infraestructura;

import com.ceiba.adn.futbolsiete.FutbolSieteApplication;
import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCancha;
import com.ceiba.adn.futbolsiete.dominio.puerto.repositorio.RepositorioCancha;
import com.ceiba.adn.futbolsiete.testdatabuilder.ComandoCanchaTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = FutbolSieteApplication.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControladorCanchaTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RepositorioCancha repositorioCancha;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void actualizarCancha() throws Exception {

        // Arrange
        ComandoCancha comandoCancha = new ComandoCanchaTestDataBuilder().conDatos(50L, "LaCejaActualizado").build();

        // Act - Assert
        mockMvc.perform(put("/cancha")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCancha)))
                .andExpect(status().isOk())
                .andDo(a -> {
                    Assert.assertEquals(comandoCancha.getId().longValue(), 50L);
                    Assert.assertEquals(comandoCancha.getUbicacion(), "LaCejaActualizado");
                });
    }

    @Test
    public void listarCanchas() throws Exception {

        // Act - Assert
        mockMvc.perform(get("/cancha")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id", is(15))
                );
    }

    @Test
    public void crearCancha() throws Exception {
        // Arrange
        ComandoCancha comandoCancha = new ComandoCanchaTestDataBuilder().build();

        // Act - Assert
        mockMvc.perform(post("/cancha")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCancha)))
                .andExpect(status().isOk());
    }

    @Test
    public void eliminarCancha() throws Exception {

        // Arrange - Act - Assert
        mockMvc.perform(delete("/cancha/".concat("27"))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()
                );
    }



}
