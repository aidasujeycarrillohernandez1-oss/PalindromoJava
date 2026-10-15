/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author aidas
 */
public class Palindromo {
    
    // 1. Método wrapper
    public static boolean esPalindromo(String texto)
    {
        // Validación y normalización
        if (texto == null) 
        {
            throw new IllegalArgumentException("el texto no puede ser nulo");
        }
        String textoNormalizado = texto.toLowerCase().replace(" ","");
        if(textoNormalizado.isEmpty())
        {
            throw new IllegalArgumentException("El texto no puede quedar vacio");
        }
               
        // Inicialización de índices
        int izquierdo = 0;
        int derecho = textoNormalizado.length() -1;
         // Llamada recursiva
        return esPalindromoRecursivo(textoNormalizado, izquierdo, derecho);

    }
    
    // 2. Método recursivo
    public static boolean esPalindromoRecursivo(String texto, int izquierdo, int derecho )
    {
        if( izquierdo >= derecho)
        {
            return true;
        }
        if (texto.charAt(izquierdo) != texto.charAt(derecho)) 
        {
            return false;
        }
        return esPalindromoRecursivo(texto, izquierdo +1, derecho-1);       
    
    }
    // 3. Método principal para las pruebas
    public static void main(String[] args) 
    {
        System.out.println(esPalindromo("radar"));
    }
    

    
    
}
