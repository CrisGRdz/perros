//Universidad Nacional Autonoma De Mexico
//Facultad de Estudios Superiores Acatlan
//Materia: Programacion Orientada a Objetos
//Rodriguez Rodriguez Cristian Gerardo
package ejecuta;//paquete al qu epertenece la clase ejecuta
/*Sirve para ejecutar aaciones */
import perro.Perro; //importa a la clase Perro del paquete perro

public class Ejecuta {
     public static void main(String[] args){
         //se crean dos objetos de clase Perro
        Perro Frida = new Perro("Fibi","poodle",2,'p');
        Perro Fido = new Perro("Fido","Pastor Aleman",3,'g');
        Perro Illidan = new Perro("Illidan","schnauzer",1,'m');
        
        //Se impriman los atributos de los objetos
        Frida.imprimirAtributos();
        Fido.imprimirAtributos();
        Illidan.imprimirAtributos();
        //Frida muerde a fido
        Frida.muerdeA(Fido);
        //Vemos cuantas vidas le quedan a fido
        Fido.imprimirVidas();
        
        //Frida muerde a Fido
        Frida.muerdeA(Fido);
        //Veamos cuantas vids le quedan a Fido 
        Fido.imprimirVidas();
        //Illidan lame a fido para recuperar la vida perdida
        Illidan.lamerA(Fido);
        //vemos que recupera la vida perdida
        Fido.imprimirVidas();
        
        
       
        
    }
}
