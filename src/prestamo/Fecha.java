package prestamo;

import java.time.Year;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    // Aqui esta el constructor.
    // Con esto creamos un objeto Fecha generico (primer metodo de cosntructor) que instancia la fecha escrita dentro de fecha.
    // Es el objeto.
    public Fecha () { 
        // Esto es una inicializacion basica del objeto.
        // Estos son los atributos del objeto.
        dia =1;
        mes=1;
        ano=1970;
    }

    // Segundo tipo de constructor
    public Fecha (int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    // Esto es a lo que nos referimos con los set.
    // Si vemos el espacio desues de los paramatreos es una forma adecuada de escribir el codigo, no cambia.
    public void setDia(int dia) {

        this.dia = dia;

    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }

    // Aqui podemos ver la reasginacion que modifica al objeto
    public void setAno(int nuevoAnio) {
        this.ano = nuevoAnio;
    }

    public int getDia() {

        return this.dia;

    }

    public int getMes() {

        return this.mes;
    }
    
    public int getAno() {
        return this.ano;
    }

    public int fechaActual(){
        return Year.now().getValue() - this.ano;
    }

    public void imprimirFecha() {

        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    // Implementar la funcion de cuantos dias se llevo. dentro de 8 dias.
    
}
