/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivewritechars;

import java.io.*;

/**
 *
 * @author Xavier
 */
public class PrimitiveWrite {
    public static void escribirCadena(){
        String cadena="o tempo está xélido";
        File dirArch;
        DataOutputStream salida=null;
        dirArch=new File("texto3.txt");
        try{
            salida=new DataOutputStream(new FileOutputStream(dirArch));
            for(int i=0;i<3;++i){
                System.out.println("Escribiendo la cadena: " + cadena);
                salida.writeUTF(cadena);
                System.out.println("tamano del archivo: " + salida.size() + " Bytes");
            }
            System.out.println("Tamano final del archivo: " + salida.size() + " Bytes");
        }catch(IOException e){
            System.out.println("Error al operar con el archivo");
        }finally{
            if(salida != null){
                try{
                    salida.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
    public static void leerArchivo(){
        File dirArch;
        DataInputStream entrada=null;
        dirArch=new File("texto3.txt");
        try{
            entrada=new DataInputStream(new FileInputStream(dirArch));
            while(entrada.available()!=0){
                System.out.println("Quedan: " + entrada.available() + " Bytes por leer");
                System.out.println("cadena: " + entrada.readUTF());
            }
            if(entrada.available()==0){
                System.out.println("Ya no queda nada por leer");
            }
        }catch(IOException e){
            System.out.println("Error al operar con el archivo");
        }finally{
            if(entrada != null){
                try{
                    entrada.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
    public static void escribirChars(){
        File dirArch;
        String str="o tempo está xélido";
        DataOutputStream salida=null;
        dirArch=new File("texto4.dat");
        try{
            salida=new DataOutputStream(new FileOutputStream(dirArch));
            for(int i=0;i<2;++i){
                System.out.println("Escribiendo la cadena: " + str);
                salida.writeChars(str);
                System.out.println("Tamano del string: " +str.length() + " caracteres");
                System.out.println("Se escribieron: " + salida.size() + " Bytes");
            }
            
        }catch(IOException e){
            System.out.println("Error al operar con el archivo");
        }finally{
            if(salida != null){
                try{
                    salida.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
    public static void leerChars(){
        File dirArch;
        DataInputStream entrada=null;
        String str="";
        
        dirArch=new File("texto4.dat");
        try{
            entrada=new DataInputStream(new FileInputStream(dirArch));
            while(entrada.available()!=0){
                for(int i=0;i<19;i++){
                    str=str+entrada.readChar();
                }
                System.out.println("cadena leida: " + str);
                System.out.println("Quedan: " + entrada.available() + " bytes por leer");
                str="";
            }
        }catch(IOException e){
            System.out.println("Error al operar con el archivo");
        }finally{
            if(entrada != null){
                try{
                    entrada.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
}
