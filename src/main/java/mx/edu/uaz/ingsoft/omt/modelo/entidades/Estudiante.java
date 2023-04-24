package mx.edu.uaz.ingsoft.omt.modelo.entidades;

public class Estudiante {
    private int id;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String email;
    private int telefono;
    private int promedio;


    public Estudiante(int id, String nombre, String apPaterno, String apMaterno, String email, int telefono, int promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.email=email;
        this.telefono= telefono;
        this.promedio=promedio;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }


    public String toString() {
        String nomCompleto=nombre+" "+apPaterno;
        if (apPaterno!=null){
            nomCompleto+=apPaterno;
        }
        return nomCompleto;
    }
}
