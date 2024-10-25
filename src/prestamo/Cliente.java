package prestamo;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private Fecha fechaNaciemiento;
    private Cliente referencia;

    public Cliente() {

        this.idCliente = 0;
        this.nombreCliente  = "";
        this.correoCliente = "";
        this.telefonoCliente = "";
        this.direccionCliente = "";
        this.fechaNaciemiento = new Fecha();
        this.referencia = null;

    }

    public void carnetBiblio() {
        System.out.println(this.idCliente + ";" +this.nombreCliente+";"+this.correoCliente+";"+this.telefonoCliente+";"+this.direccionCliente+";"+this.fechaNaciemiento+";"
        +";"+this.referencia);
    }

}
