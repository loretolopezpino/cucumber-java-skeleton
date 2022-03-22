Feature: Cargar los módulos horarios desde la plataforma Omega
  Scenario Outline: El curso se dicta hoy
    Given Hoy es "<fecha>"
    When Se envia un request al servicio getModulos con la seccion del curso "<seccionId>" y fecha "<fecha>"
    Then La respuesta del JSON es "<modulos>"

    Examples:
      | fecha | seccionId | modulos |
      | 21-03-2022 | 31412 | 1, 2, 3 |
      | 22-03-2022 | 36954 | false |
