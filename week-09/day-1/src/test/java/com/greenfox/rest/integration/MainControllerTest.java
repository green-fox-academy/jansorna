package com.greenfox.rest.integration;

import com.greenfox.rest.controllers.MainController;
import com.greenfox.rest.repositories.LogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
@AutoConfigureMockMvc
public class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    LogRepository logRepository;

    @Test
    public void doublingIsReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.received").value("15"))
                .andExpect(jsonPath("$.result").value("30"));
    }

    @Test
    public void doublingErrorIsReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/doubling"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide an input!"));
    }

    @Test
    public void greeterIsReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Petike, my dear student!"));
    }

    @Test
    public void greeterErrorsAreReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/greeter"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide a name and a title!"));

        mockMvc.perform(get("/greeter?name=Petike"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide a title!"));

        mockMvc.perform(get("/greeter?title=student"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide a name!"));
    }

    @Test
    public void appendIsReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/appenda/Checki"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.appended").value("Checkia"));
    }

    @Test
    public void appendErrorIsReturnedCorrectly() throws Exception {

        mockMvc.perform(get("/appenda/"))
                .andExpect(status().is(404));
    }


}
