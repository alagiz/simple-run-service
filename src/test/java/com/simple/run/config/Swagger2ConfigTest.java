package com.simple.run.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class Swagger2ConfigTest {
    @InjectMocks
    private Swagger2Config swagger2Config;

    @Test
    public void shallCreateDocket_WhenApiIsCalled() {
        Docket docket = swagger2Config.api();

        assertNotEquals(null, docket);
        assertEquals(DocumentationType.SWAGGER_2, docket.getDocumentationType());
    }
}
