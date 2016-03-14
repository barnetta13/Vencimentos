/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

/**
 *
 * @author Daniel Martins
 */
public class TesteVencimentos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva",20,30);
        TrabalhadorComissao cm1 = new TrabalhadorComissao("Susana Ferreira",500,1500,6);
        TrabalhadorHora tb1 = new TrabalhadorHora("Carlos Miguel",160, (float) 4.5);
        Object[] obj = new Object[10];
        
        obj[0] = tp1;
        obj[1] = cm1;
        obj[2] = tb1;
        
        // Polimorfismo
        System.out.println("Trabalhadores");
        for ( int i = 0; i < obj.length; i++)
        {
            if (obj[i] != null)
            {
                System.out.println(obj[i].toString());
                System.out.println();
            }
        }
        
        System.out.println("Trabalhadores à hora:");
        for ( int i = 0; i < obj.length; i++)
        {
            if (obj[i] instanceof TrabalhadorHora)
            {
                System.out.println(obj[i].toString());
                System.out.println();
            }
        }
        
        System.out.println("Vencimento dos trabalhadores");
        for ( int i = 0; i < obj.length; i++)
        {
            if (obj[i]!=null)
            {
                // downcasting
                System.out.println(((Trabalhador)obj[i]).getNome() + ": " + 
                ((Trabalhador)obj[i]).calcularVencimento());
                System.out.println();
            }
        }
    }
}
