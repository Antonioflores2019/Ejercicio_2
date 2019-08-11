package flores;
import flores.excepciones.ErrorValidacion;

import java.util.ArrayList;
import  java.util.InputMismatchException;

public class Visitante {
    public int indice;
    public String nombre_completo;
    public String telefono;


    public void setNombre_completo(String nombre_completo) throws ErrorValidacion {
        if (nombre_completo.length()>50){
            throw new ErrorValidacion("El nombre que ingreso es demasiado largo");
        }
        this.nombre_completo=nombre_completo;

    }

    public String getNombre_completo() {

        return nombre_completo;
    }

    public void setTelefono(String telefono) throws ErrorValidacion {
        if (!telefono.matches("^(\\+504\\s?)?[0-9]{4}\\-?[0-9]{4}")) {
            throw new ErrorValidacion("El numero de telefono es invalido");
        }
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
    public int getIndice() {

        return indice;
    }

    public void setIndice(int indice) {
        this.indice += indice;
    }
}

