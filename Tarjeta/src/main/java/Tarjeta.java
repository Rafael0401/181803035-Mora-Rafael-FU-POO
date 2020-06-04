
public class Tarjeta {

    //Atributos de la clase 
    double noCuenta;
    String nombre;
    int nip;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;

    //Metodo vacio
    public Tarjeta() {

    }

    // Metodo con parametros
    public Tarjeta(double noCuenta, String nombre, int nip, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
        this.nip = nip;
        this.cv = cv;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
        this.apartado = apartado;
    }

    //metodo para verificar el dueño de la cuenta introducida
    public Tarjeta verificarCuenta(int noCuenta, int nip) {
        if (noCuenta == 123123 && nip == 1133) {
            //se regresan los parametros establecidos
            return new Tarjeta(123123, "Eduardo Diaz Flores", 1133, 31, 12, 2032, 543, 45987.52, 550);

        } else if (noCuenta == 456789 && nip == 3377) {
            //se regresan los parametros establecidos
            return new Tarjeta(456789, "Kevin Meza Gonzales", 3377, 31, 12, 2032, 544, 360, 5322.23);

        } else {
            return new Tarjeta();
        }

    }

    //metodo para sumar el monto establecido con otra cantidad
    public void depositar(double monto) {
        this.monto += monto;
    }

    //metodo para restar el monto establecido con otra cantidad
    public void retirar(double monto) {
        if (monto <= this.monto && monto >= 0) {
            this.monto -= monto;
        } else {
            System.out.println("Error Saldo insuficiente");
        }

    }
    
//metodo para restar el saldo apartado establecido y sumar lo restado al monto 
    public void eliminar(double apartado) {
        if (apartado <= this.apartado && apartado >= 0) {
            this.apartado -= apartado;
            this.monto += apartado;
        } else {
            System.out.println("Error la cantidad introducida supera al saldo apartado establecido");
        }

    }

    //metodo para sumar el monto con el saldo apartado
    public double Total() {
        return this.monto + this.apartado;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + noCuenta + "\nNombre: " + nombre + "\nNip: " + nip + "\nClave de seguridad: " + cv + "\nDia, mes y año de vencimiento: " + dia + "/" + mes + "/" + anio + "\nSaldo: " + monto + "$" + "\nApartado: " + apartado + "$" + "\nSaldo total: " + this.Total() + "$";
    }

}
