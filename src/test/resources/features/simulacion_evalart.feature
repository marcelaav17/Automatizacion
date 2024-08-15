#language: es

Característica: Automatizar el envío de formularios

  Escenario: Completar el formulario 10 veces
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario inicia sesión con credenciales válidas
      | userName | password                                         |
      | 898914   | 10df2f32286b7120Mi00LTQxOTg5OA==30e0c83e6c29f1c3 |
    Entonces el usuario completa el formulario 10 veces
    Y el usuario valida el hash de éxito "Se encuentra en el ciclo 2 de 10"
