package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeDictaHoy{
    static String seDictaHoy(String seccionId, String fecha){
        String response = "false";
        System.out.println("Seccion: "+seccionId);
        System.out.println("Fecha: "+fecha);
        if (fecha.equals("21-03-2022") && seccionId.equals("31412")){
            response = "1, 2, 3";
        }
        //return "21-03-2022".equals(fecha) ? "1, 2, 3" : "false";
        return response;
    }
}

public class StepDefinitions {

    public String fecha;
    public String modulos;

    @Given("Hoy es {string}")
    public void hoy_es(String fecha) {
        this.fecha = fecha;
    }

    @When("Se envia un request al servicio getModulos con la seccion del curso {string} y fecha {string}")
    public void se_envia_un_request_al_servicio_get_modulos_con_la_seccion_del_curso_y_fecha(String seccionId, String fecha) {
        modulos = SeDictaHoy.seDictaHoy(seccionId, fecha);
    }

    @Then("La respuesta del JSON es {string}")
    public void la_respuesta_del_json_es(String response) {
        assertEquals(response, modulos);
    }
    /*
     * Scneario normal*/

    @Given("El menu de ordenes de impresion es visible para un usuario con rol central de apuntes")
    public void el_menu_de_ordenes_de_impresion_es_visible_para_un_usuario_con_rol_central_de_apuntes() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Menú órdenes de impresión visible para el usuario");
    }
    @When("El usuario ingresa a ordenes de impresion")
    public void el_usuario_ingresa_a_ordenes_de_impresion() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("El usuario ingresa a órdenes impresión");
    }

    @Then("Se muestra un filtro con el listado de categorias asignadas al usuario")
    public void se_muestra_un_filtro_con_el_listado_de_categorias_asignadas_al_usuario() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Se muestra filtro con el listado de categorías");
    }
}
