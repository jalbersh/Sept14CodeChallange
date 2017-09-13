package com.dish.ofm.service.Test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "Endpoint to modify the offering cart.")
@Controller
public class ChallengeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChallengeController.class);
    @RequestMapping(value = "/cipher",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPaymentExtension() {
        return "greeting";
    }
}

