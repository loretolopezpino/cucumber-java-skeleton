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

}
