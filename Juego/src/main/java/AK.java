
public class Ak {
    //atributos del objeto de manera general

    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;

    
    public Ak(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = " Bronce ";
                this.cargador = 5;
                this.precision = 75;
                this.velocidadCarga = 5;
                this.precio = 1000;
                this.danio = 10;
                this.velocidadDisparo = 10;
                break;
            case 2:
                this.tipo = " Plata ";
                this.cargador = 8;
                this.precision = 70;
                this.velocidadCarga = 4.5;
                this.precio = 2300;
                this.danio = 11;
                this.velocidadDisparo = 9.8;
                break;
            case 3:
                this.tipo = " Oro ";
                this.cargador = 10;
                this.precision = 85;
                this.velocidadCarga = 4.3;
                this.precio = 2500;
                this.danio = 13;
                this.velocidadDisparo = 9.7;
                break;
            case 4:
                this.tipo = " Diamante ";
                this.cargador = 20;
                this.precision = 95;
                this.velocidadCarga = 3;
                this.precio = 4000;
                this.danio = 20;
                this.velocidadDisparo = 9.4;
                break;
            case 5:
                this.tipo = " Adamantium ";
                this.cargador = 30;
                this.precision = 100;
                this.velocidadCarga = 1;
                this.precio = 10000;
                this.danio = 27;
                this.velocidadDisparo = 8;
                break;

        }

    }

    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio = danio;
        this.velocidadDisparo = velocidadDisparo;
    }

    //Constructor vacio
    public Ak() {

    }

    public String menuAk() {
        String menu = "         MENU\n";
        menu += "Elija la categoria del arma\n";
        menu += "1) Bronce\n";
        menu += "2) Plata\n";
        menu += "3) Oro\n";
        menu += "4) Diamante\n";
        menu += "5) Adamantium\n";
        return menu;
    }

    public double disparar() {
        return (this.danio * this.precision) / 100;
    }

//metodo predefinido por Oracle
    @Override
    public String toString() {
        return "Ak{" + "Tipo=" + tipo + "\n Cargador=" + cargador + "\n Precision=" + precision + "\n Velocidad de carga=" + velocidadCarga + "\n Precio=" + precio + "\n Daño=" + danio + "\n Velocidad de disparo=" + velocidadDisparo + '}';
    }
}
