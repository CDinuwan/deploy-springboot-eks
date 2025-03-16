package org.cdinuwan.aws.deployspringbooteks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {

    @GetMapping("/eks")
    public ResponseEntity<String> sayHelloFromEKS() {
        return new ResponseEntity<>("Hello World From EKS", HttpStatus.OK);
    }
}
