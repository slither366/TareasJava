package Tarea5.tarea5a;


public class Vendedor extends Personal{
   
    private int porcentajeComision;
    private double ventasMes;

    public Vendedor(int porcentajeComision, double sueldoBasico,double ventasMes) {
        super(sueldoBasico);
        this.porcentajeComision = porcentajeComision;
        this.ventasMes = ventasMes;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public void setSueldoBasico(double sueldoBasico) {
        double totalComision = getVentasMes() * (getPorcentajeComision()/100);
        super.setSueldoBasico(sueldoBasico+totalComision); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
