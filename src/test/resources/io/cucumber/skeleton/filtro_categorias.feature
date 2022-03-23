Feature: Filtro de categorias para ordenes de impresion
  Scenario: El usuario tiene el rol central de apuntes
    Given El menu de ordenes de impresion es visible para un usuario con rol central de apuntes
    When El usuario ingresa a ordenes de impresion
    Then Se muestra un filtro con el listado de categorias asignadas al usuario