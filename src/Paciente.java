public class Paciente {
    //  ATRIBUTOS
    private String nombre;
    private  int edad;
    private  double peso;
    private double presionArterial;
    private boolean estable;

    //CONSTRUCTOR VACIO
    public Paciente() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public Paciente(String nombre, int edad, double peso, double presionArterial, boolean estable) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.presionArterial = presionArterial;
        this.estable = estable;
    }
    //GET-SET


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }

    public boolean isEstable() {
        return estable;
    }

    public void setEstable(boolean estable) {
        this.estable = estable;
    }
    //METODO TO STRING


    @Override
    public String toString() {
        return "Paciente{" +
                "estable=" + estable +
                ", presionArterial=" + presionArterial +
                ", peso=" + peso +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //METODOS PROPIOS
    public int cumplirAnos(){
       return this.edad++;
    }
    public double aumentarPeso(double cantidad){
        if (cantidad>0){
            return this.peso+=cantidad;
        }
        return  this.peso;
    }
    public double disminuirPeso(double cantidad){
        if (cantidad>0){
           return this.peso-=cantidad;
        }
        return this.peso;
    }
    public double subirPresion(double valor){
        if (valor>0){
           return this.presionArterial+=valor;
        }
        return this.presionArterial;
    }
    public double bajarPresion(double valor){
        if (valor>0){
            return this.presionArterial-=valor;
        }
        return this.presionArterial;
    }
    public boolean empeorarEstado(){
        return this.estable=false;
    }
    public boolean mejorarEstado(){
        return this.estable=true;
    }
    public void mostrarHistoriaClinica(){
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("EDAD: "+this.edad);
        System.out.println("PESO: "+this.peso);
        System.out.println("PA: "+this.presionArterial);
        System.out.println("ESTADO DEL PACIENTE: "+this.estable);
    }

}
