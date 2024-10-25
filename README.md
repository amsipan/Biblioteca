# ***POO***

## ***Terminologia***

`Constructor:` Puede haber dos tipos, uno es por defecto y no requiere
parametros, siempre es publico.  

**`public Clase() {};`**  

El segundo tipo de constructor es el que tiene parametros, es importante tener en cuenta el orden de ingreso de los parametrospara evitar errores.  
**`public Clase(lleva parametro) {};`**  

*Pueden estar los dos contructores al mimos tiempo, esto no dara problemas, pero es importante recalcar que
deberemos saber escoger cual usar, cuando y como, asi mimso si estan los dos no habra inconveniente, pero si
no pasamos el parametro llamara directamente al cosntructor por defecto, si hay paramatro llamara al contructor
por parametros*

----

`Set:` Son funciones que modifican direcatamente el objeto sin devolver nada.  
**`public void setClase() {};`**  
Para escribir atributos del objeto usaremos **`this.Objeto`**, esto sirve para modificar el objeto.  