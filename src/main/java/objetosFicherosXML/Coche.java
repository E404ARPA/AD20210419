package objetosFicherosXML;

public class Coche{
    private String matricula;
    private String marca;
    private Persona persona;
    private String modelo;

    public Coche() {}

    public Coche(String matricula, String marca, Persona persona, String
            modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.persona = persona;
        this.modelo = modelo;
    }

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula){this.matricula = matricula;}
    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}
    public Persona getPersona(){return persona;}
    public void setPersona(Persona persona) {
        this.persona=persona;
    }
    public String getModelo(){return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
}
