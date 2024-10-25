package prestamo;

public class AppFecha {
    public static void main(String[] args) {
        
        Fecha data = new Fecha();
        data.imprimirFecha();
        System.out.println(data.toString());

        data.setAno(2024);
        data.imprimirFecha();
        System.out.println(data.toString());
        
        Fecha dataDos = new Fecha(24, 10, 2024);
        dataDos.imprimirFecha();

        System.out.println(dataDos.getDia());
        System.out.println(dataDos.getMes());
        System.out.println(dataDos.getAno());

        Fecha dataTres = new Fecha(10, 03, 2006);
        dataTres.imprimirFecha();
        System.out.println(dataTres.fechaActual());
    }
}
