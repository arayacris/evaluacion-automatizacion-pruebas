package com.iplacex.stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private String mensaje;

    
    @Given("el usuario está en la página de login")
    public void usuario_en_login() {
        
    }

    @When("ingresa sus credenciales válidas")
    public void ingresa_credenciales_validas() {
        
        mensaje = "Bienvenido admin";
    }

    @Then("el sistema permite el acceso")
    public void el_sistema_permita_el_acceso() {
        assertEquals("Bienvenido admin", mensaje);
    }

    
    @When("ingresa usuario {string} y contraseña {string}")
    public void ingresa_usuario_y_contrasena(String user, String pass) {
        if ("admin".equals(user) && "1234".equals(pass)) {
            mensaje = "Bienvenido admin";
        } else {
            mensaje = "Credenciales inválidas";
        }
    }

    @Then("el sistema muestra {string}")
    public void el_sistema_muestra(String esperado) {
        assertEquals(esperado, mensaje);
    }
}
