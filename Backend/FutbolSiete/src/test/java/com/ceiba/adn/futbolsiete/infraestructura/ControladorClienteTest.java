package com.ceiba.adn.futbolsiete.infraestructura;

import com.ceiba.adn.futbolsiete.FutbolSieteApplication;
import com.ceiba.adn.futbolsiete.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.futbolsiete.testdatabuilder.ComandoClienteTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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
public class ControladorClienteTest {

    private static final String CEDULA_ELIMINAR = "1036400";

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
    public void listarClientes() throws Exception {

        // Act - Assert
        mockMvc.perform(get("/cliente")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id", is(15)))
                .andExpect(jsonPath("$[0].nombre", is("JulianBD"))
        );
    }

    @Test
    public void actualizarCliente() throws Exception {

        // Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().conDatos("123456", 15L)
                .conNombre("JulianActualizado").build();

        // Act - Assert
        mockMvc.perform(put("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk())
                .andDo(a -> {
                    Assert.assertEquals(comandoCliente.getId().longValue(), 15L);
                    Assert.assertEquals(comandoCliente.getCedula(), "123456");
                    Assert.assertEquals(comandoCliente.getNombre(), "JulianActualizado");

                });

    }

    @Test
    public void eliminarCliente() throws Exception {

        // Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().conCedula("1036400").build();

        mockMvc.perform(post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk());

        // Act - Assert
        mockMvc.perform(delete("/cliente/".concat(CEDULA_ELIMINAR))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()
                );
    }


    @Test
    public void excepcionAlCrearCliente() throws Exception {
        // Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().conDatos("123",14L).build();

        mockMvc.perform(post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk()

                );

        // Act - Assert

        try {
            mockMvc.perform(post("/cliente")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(comandoCliente)))
                    .andExpect(status().is5xxServerError());
        } catch(Exception excepcionTest){
            Assertions.assertEquals(excepcionTest.getCause().getMessage(), "El cliente que intentas agregar ya existe" );
        }

    }

    @Test
    public void crearCliente() throws Exception {
        // Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().build();

        // Act - Assert
        mockMvc.perform(post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk()
                );
    }

}
