Feature: Login
  Como usuario quiero iniciar sesión para acceder a mi cuenta.

  Scenario: Login exitoso
    Given el usuario está en la página de login
    When ingresa sus credenciales válidas
    Then el sistema permite el acceso

  Scenario Outline: Login inválido
    When ingresa usuario "<user>" y contraseña "<pass>"
    Then el sistema muestra "<mensaje>"

    Examples:
      | user  | pass  | mensaje                |
      | admin | 0000  | Credenciales inválidas |
      | pepe  | 1234  | Credenciales inválidas |
