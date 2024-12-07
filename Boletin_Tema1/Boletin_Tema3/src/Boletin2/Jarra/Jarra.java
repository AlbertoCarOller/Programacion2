package Boletin2.Jarra;

public class Jarra {

    //Atributos
    private double capacidadJarra;
    private double cantidadAgua;
    private double totalAguaConsumida;

    // Creamos el constructor
    public Jarra() {

        this.cantidadAgua = 0;
        this.totalAguaConsumida = 0;
    }

    // Hacemos los get para acceder al valor de los atributos
    public double getCapacidadJarra() {
        return capacidadJarra;
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }

    public double getTotalAguaConsumida() {
        return totalAguaConsumida;
    }

    // Hacemos el set de 'capacidadJarra' ya que va a ser el único valor que nosotros introduciremos por teclado
    public void setCapacidadJarra(double capacidadJarra) throws JarraException {

        if (capacidadJarra < 0) {

            throw new JarraException("La capacidad de la jarra no puede ser negativa");
        }

        this.capacidadJarra = capacidadJarra;
    }

    // Hacemos el método para rellenar la jarra
    public void rellenarJarra() {

        // Rellenamos la jarra con los litros necesario para llenarla
        double litrosMetidos = this.capacidadJarra - this.cantidadAgua;
        // Sumamos los litros introducidos a la cantidad de agua que hay en la jarra
        this.cantidadAgua += litrosMetidos;
        // Le sumamos la cantidad de agua que se ha consumido
        this.totalAguaConsumida += litrosMetidos;
    }

    // Hacemos el método para vaciar la jarra
    public void vaciarJarra() {

        // Quitamos la cantidad de agua que había
        this.cantidadAgua = 0;
    }

    // Hacemos el método de volcar la jarra
    public void volcarJarra(Jarra j) {

        // Calculamos la capacidad de la jarra a la que se le va a echar el agua
        double capacidadJarraAVertir = j.capacidadJarra - j.cantidadAgua;

        /* Si la capacidad de la jarra "B" es mayor o igual que la cantidad de
        agua que la jarra "A", se echa toda el agua */
        if (capacidadJarraAVertir >= this.cantidadAgua) {

            // Le sumamos a la jarra "B" el agua de la jarra "A"
            j.cantidadAgua += this.cantidadAgua;
            // Como hemos pasado por completo el agua que había en la jarra "A" a la "B", la "A no tendrá agua"
            this.cantidadAgua = 0;

        } else {

            // Le sumamos a la jarra "B" la capacidad que le cabe
            j.cantidadAgua += capacidadJarraAVertir;
            // Restamos a la cantidad de agua de la jarra "A" la capacidad que le quedaba a la "B"
            this.cantidadAgua -= capacidadJarraAVertir;
        }
    }
    // Hacemos método para ver el estado de las jarras
    @Override
    public String toString() {
        return "Jarra{" +
                "capacidadJarra=" + capacidadJarra +
                ", cantidadAgua=" + cantidadAgua +
                ", totalAguaConsumida=" + totalAguaConsumida +
                '}';
    }
}