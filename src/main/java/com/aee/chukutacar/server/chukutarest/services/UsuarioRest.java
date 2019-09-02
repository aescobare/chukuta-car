package com.aee.chukutacar.server.chukutarest.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UsuarioRest {

    @RequestMapping(value = "/usuario/", method = RequestMethod.GET)
    public ResponseEntity<String> listAllUsers() {

        return new ResponseEntity<String>("Test OK", HttpStatus.OK);
    }
}
