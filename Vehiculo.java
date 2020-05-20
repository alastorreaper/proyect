/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author salva
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int potencia;
    private int velocidadMax;
    private String color;
    private double precio;
    private boolean elevalunas;
    private boolean airbag;
    private boolean cierre;
    private char motor;
    private static int contadoropel;
    
    public Vehiculo(String matricula,String marca,String modelo,int cilindrada, int potencia,int velocidadMax,String color,double precio,String elevalunas,String airbag,String cierre,String motor){
    
            this.matricula=matricula;
            this.marca=marca;
            this.modelo=modelo;
            this.cilindrada=cilindrada;
            this.potencia=potencia;
            this.velocidadMax=velocidadMax;
            this.color=color;
            this.precio=precio;
            char aux=elevalunas.charAt(0);
            if(aux==89){
                this.elevalunas=true;
            }
            else if(aux==78){
            
                this.elevalunas=false;
            }
            char aux1=airbag.charAt(0);
            if(aux1==89){
                this.airbag=true;
            }
            else if(aux1==78){
            
                this.airbag=false;
            }
            char aux2=cierre.charAt(0);
            if(aux2==89){
                this.cierre=true;
            }
            else if(aux2==78){
            
                this.cierre=false;
            }
            this.motor=motor.charAt(0);
            

            char letra=marca.charAt(0);
            if((int)letra==79){
                contadoropel++;
            }
            
            //O79,Y89,N78
            
    
    }
    
    
    public static void main(String[] args){
    
         Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
         
       Vehiculo arrayobjetos[]=new Vehiculo[100];
         
       int v=1;
       for(int i=0;i<v;i++){
            System.out.print("introduzca matriculal: ");
            String matricula;
            matricula= teclado.nextLine();
            System.out.print("introduzca la marca: ");
            String marca;
            marca= teclado.nextLine();
            System.out.print("introduzca modelo: ");
            String modelo;
            modelo= teclado.nextLine();
            System.out.print("introduzca cilindrada: ");
            int cilindrada;
            cilindrada= teclado.nextInt();
            teclado.nextLine();
            System.out.print("introduzca la potencia: ");
            int potencia;
            potencia= teclado.nextInt();
            teclado.nextLine();
            System.out.print("introduzca velociada maxima: ");
            int velocidad;
            velocidad= teclado.nextInt();
            teclado.nextLine();
            System.out.print("introduzca color: ");
            String color;
            color= teclado.nextLine();
            System.out.print("introduzca precio base: ");
            double precio;
            precio= teclado.nextDouble();
            teclado.nextLine();
            System.out.print("¿tiene elevalunas?(Y/N): ");
            String elevalunas;
            elevalunas= teclado.nextLine();
            System.out.print("¿tiene airbag?(Y/N): ");
            String airbag;
            airbag= teclado.nextLine();
            System.out.print("¿tiene cierre centralizado?(Y/N): ");
            String cierre;
            cierre= teclado.nextLine();
            System.out.print("motor(Diesel/Gasolina): ");
            String motor;
            motor= teclado.nextLine();
    
            arrayobjetos[i]=new Vehiculo(matricula,marca,modelo,cilindrada,potencia,velocidad,color,precio,elevalunas,airbag,cierre,motor);
            
            System.out.print("¿crear nueva instancia?(Y/N): ");
            String instancia;
            instancia= teclado.nextLine();
            
            char aux=instancia.charAt(0);
            if(aux==89){
                v++;
            }
            else if(aux==78){
            
                break;
            }
            
        }
       
       System.out.println("");
       System.out.println("estos son los datos de los vehiculos introducidos: ");
       System.out.println("");
       
        for(int j=0;j<arrayobjetos.length;j++){
            if(arrayobjetos[j]==null){
                break;
            }
            else{
                arrayobjetos[j].mostrarVehiculo();
                System.out.println("");
            }
            
        }
        System.out.println("");
        System.out.println("el numero total de vehiculos de marca Opel es de: "+Vehiculo.mostrarOpel());
                
    }
     public String getMatricula(){
    
        return this.matricula;
    }
    public String getMarca(){
    
        return this.marca;
    }
    public String getModelo(){
    
        return this.modelo;
    }
    public int getCilindrada(){
    
        return this.cilindrada;
    }
    public int getPotencia(){
    
        return this.potencia;
    }
    public int getVelociadaMax(){
    
        return this.velocidadMax;
    }
    public String getColor(){
    
        return this.color;
    }
    public double getPrecio(){
    
        return this.precio;
    }
    public boolean getElevalunas(){
    
        return this.elevalunas;
    }
    public boolean getCierre(){
    
        return this.cierre;
    }
    public char getMotor(){
    
        return this.motor;
    }
    
    public void setMatricula(String matricula){
    
        this.matricula=matricula;
    }
    public void setMarca(String marca){
    
        this.marca=marca;
    }
    public void setCilindrada(int cilindrada){
    
        this.cilindrada=cilindrada;
    }
    public void setPotencia(int potencia){
    
        this.potencia=potencia;
    }
    public void setVelocidadMax(int velocidadMax){
    
        this.velocidadMax=velocidadMax;
    }
    public void setColor(String color){
    
        this.color=color;
    }
    public void setPrecio(double precio){
    
        this.precio=precio;
    }
    public void setElevalunas(String elevalunas){
    
        char aux=elevalunas.charAt(0);
            if(aux==89){
                this.elevalunas=true;
            }
            else if(aux==78){
            
                this.elevalunas=false;
            }
    }
    public void setAirbag(String airbag){
    
        char aux=airbag.charAt(0);
            if(aux==89){
                this.airbag=true;
            }
            else if(aux==78){
            
                this.airbag=false;
            }
    }
    public void setCierre(String cierre){
    
        char aux=cierre.charAt(0);
            if(aux==89){
                this.cierre=true;
            }
            else if(aux==78){
            
                this.cierre=false;
            }
    }
     public void setMotor(String motor){
    
        this.motor=motor.charAt(0);
    }
    public double calculaIVA(){
    
        return (this.precio+this.importeExtra())*1.21;    
    }
    public double importeExtra(){
    
        double extra=0;
        if((int)this.motor==68){
            extra=extra+2000;
        }
        if(this.cierre==true){
        
            extra=extra+500;
        }
        if(this.airbag==true){
            extra=extra+1000;
        }
        if(this.elevalunas==true){
            extra=extra+750;
        }
        return extra;
    }
    public void mostrarVehiculo(){
    
        System.out.println("matricula: "+this.matricula);
        System.out.println("marca: "+this.marca);
        System.out.println("modelo: "+this.modelo);
        System.out.println("cilindrada: "+this.cilindrada);
        System.out.println("potencia: "+this.potencia);
        System.out.println("velocidad maxima: "+this.velocidadMax);
        System.out.println("color: "+this.color);
        String aux="";
        if((int)this.motor==68){
            
            aux="Diesel";
        }
        else if((int)this.motor==71){aux="Gasolina";}
        
        System.out.println("motor: "+aux);
        
        if(this.elevalunas==true){
            
            aux="Si";
        }
        else{aux="No";}
        System.out.println("elevalunas electricos: "+aux);
        if(this.airbag==true){
            
            aux="Si";
        }
        else{aux="No";}
        System.out.println("airbag: "+aux);
        if(this.cierre==true){
            
            aux="Si";
        }
        else{aux="No";}
        System.out.println("cierre centralizado: "+aux);
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        
        System.out.println("precio base: "+this.precio);
        System.out.println("precio extras: "+this.importeExtra());
        double imponible=this.precio+this.importeExtra();
        System.out.println("total base imponible: "+imponible);
        double resta=this.calculaIVA()-imponible;
        System.out.println("cuota IVA: "+df.format(resta));
        System.out.println("precio total IVA incluido: "+df.format(this.calculaIVA()));
    }
    public static int mostrarOpel(){
    
        return contadoropel;
    }
}
