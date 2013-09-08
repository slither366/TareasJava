package Tarea5.tarea5a;

public class Administrativo extends Personal {

    private int seguro;

    public Administrativo(int seguro, int sueldoBasico) {
        super(sueldoBasico);
        this.seguro = seguro;

    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    @Override
    public void setSueldoBasico(double sueldo) {
        double sueldoBasico = sueldo + getSeguro();
        super.setSueldoBasico(sueldoBasico); //To change body of generated methods, choose Tools | Templates.
    }
}
