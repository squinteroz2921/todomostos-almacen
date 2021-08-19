package com.todomotos.almacen.web.controller;

import com.todomotos.almacen.domain.dto.AuthenticationRequest;
import com.todomotos.almacen.domain.dto.AuthenticationResponse;
import com.todomotos.almacen.domain.service.TodoMotosUserDetailsService;
import com.todomotos.almacen.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TodoMotosUserDetailsService todoMotosUserDetailsService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {

        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUser(), request.getPass()));
            UserDetails userDetails = todoMotosUserDetailsService.loadUserByUsername(request.getUser());
            String jwt = jwtUtil.generateToken(userDetails);
            return new ResponseEntity<>(new AuthenticationResponse(jwt),HttpStatus.OK);
        }
        catch (BadCredentialsException e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }


    }
}
