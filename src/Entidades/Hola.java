package Entidades;

public class Hola {
    private String mensaje;

    public Hola(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Hola{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
