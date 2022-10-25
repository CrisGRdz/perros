//Universidad Nacional Autonoma De Mexico
//Facultad de Estudios Superiores Acatlan
//Materia: Programacion Orientada a Objetos
//Rodriguez Rodriguez Cristian Gerardo

package perro;//paquete al que pertence la clase Perro 
/*Clase perro.Sirve para generar objetos que 
son la abstraccion de un perro real*/


public class Perro {
    /*Atributos del Objeto*/
    private String nombre;
    private String raza; 
    private int edad;//anios
    private char tamanio;//'p': pequeño, 'm': mediano, 'g': grande
     
    private int numVidas;
    
    //Metodo constructor
    public Perro(String n, String r, int e, char t){
        nombre = n;
        raza = r;
        edad = e;
        tamanio = t;
        numVidas = 2;
        
    }

  
    //obtiene el valor del atributo nombre
    public String getNombre(){
        return nombre; 
    }    
    //Coloca un valor al atributo nombre 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //obtiene el valor del atributo raza
    public String getRaza(){
        return raza;
    }
    //coloca un valor al atributo raza
    public void setRaza(String raza){
        this.raza = raza;
    }
    //obtiene el valor del atributo edad
    public int getEdad(){
        return edad;
    }
    //obtiene un valor del atributo edad 
    public void setEdad(int edad){
        this.edad = edad;
    }
    //obtiene el valor del atributo tamanio 
    public char setTamanio(){
        return tamanio;
    }
    //obtiene el valor del atributo tamanio 
    public void getTamanio(char tamanio){
        this.tamanio = tamanio;
    }
    //Muerde a otro perro
    public void muerdeA(Perro perroMordido){
        //muerde al otro perro y por tanto le quita una vida 
       perroMordido.numVidas = perroMordido.numVidas - 1;
       System.out.println(this.nombre + "muerde a " + perroMordido.nombre);
       //Checa si el perro al que mordio ya esta muerto 
        perroMordido.estaMuerto(perroMordido);
    }
    /*Checa si el perro esta muerto*/
    public boolean estaMuerto(Perro perro_a_Checar){
        if(perro_a_Checar.numVidas<= 0){
            System.out.println(this.nombre+": Guauuuuuuuu +_+");
            return true;
        }else{
             System.out.println(this.nombre+": Sigo vivo!");
            return false;
        } 
        
    }
    public void imprimirAtributos(){
        System.out.println("Nombre: " +nombre+"\nRaza: " +raza);
        System.out.println("Edad: " +edad+"\nTamanio:"+tamanio);
        System.out.println("Vidas: "+numVidas+"\n\n");
    }
    
    public void imprimirVidas(){
        System.out.println(this.nombre+" "+this.numVidas+"\n");
    }
    //Olfatea al perro para verificar que este muerto 
    public boolean olfateA(Perro perro_Olfatear){
        if(perro_Olfatear.numVidas>=1 && perro_Olfatear.numVidas<=1){
            System.out.print("Lamio al perro sigue vivo ");
            return true;
        }else{
            System.out.println(this.nombre+": ya esta muerto :c");
            return false;
        }
    }
    //Lame al perro para que recupere una vida
    public void lamerA(Perro perroCurar){
        //lamera al perro herido para recuperar una vida
        perroCurar.numVidas = perroCurar.numVidas +1;
        System.out.println(this.nombre +" lamea a "+perroCurar.nombre);
        perroCurar.olfateA(perroCurar);
    }
    
}
