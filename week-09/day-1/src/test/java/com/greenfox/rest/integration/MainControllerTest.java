package com.greenfox.rest.integration;

import com.greenfox.rest.controllers.MainController;
import com.greenfox.rest.repositories.LogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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

    @Test
    public void doUntilSumIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"until\": 5\n" +
                "}";

        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.result").value("15"));
    }

    @Test
    public void doUntilFactorIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"until\": 5\n" +
                "}";

        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.result").value("120"));
    }

    @Test
    public void doUntilErrorIsReturnedCorrectly() throws Exception {
        String content = "{\n" + "}";

        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide a number!"));
    }

    @Test
    public void arrayHandlerSumIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"what\": \"sum\",\n" +
                "  \"numbers\": [1, 2, 5, 10]\n" +
                "}";

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.result").value("18"));
    }

    @Test
    public void arrayHandlerMultiplyIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"what\": \"multiply\",\n" +
                "  \"numbers\": [1, 2, 5, 10]\n" +
                "}";

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.result").value("100"));
    }

    @Test
    public void arrayHandlerDoubleIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"what\": \"double\",\n" +
                "  \"numbers\": [1, 2, 5, 10]\n" +
                "}";

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.result[0]").value("2"))
                .andExpect(jsonPath("$.result[1]").value("4"))
                .andExpect(jsonPath("$.result[2]").value("10"))
                .andExpect(jsonPath("$.result[3]").value("20"));
    }

    @Test
    public void arrayErrorIsReturnedCorrectly() throws Exception {
        String content = "{\n" +
                "  \"what\": \"double\",\n" +
                "  \"numbers\": \n" +
                "}";

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andExpect(status().is(400));
    }

}
