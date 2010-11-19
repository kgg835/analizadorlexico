/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlexico;

import analizadorlexico.AnalizadorLexico.TOKEN;

/**
 *
 * @author edison
 */
public class AFDOperadorRelacional  extends AFD{


    public static TOKEN validaToken(String palabra){
        if(palabra.equalsIgnoreCase("<"))
            return TOKEN.MENOR;
        if(palabra.equalsIgnoreCase(">"))
            return TOKEN.MAYOR;
        if(palabra.equalsIgnoreCase("=="))
            return TOKEN.IGUAL;
        if(palabra.equalsIgnoreCase("<="))
            return TOKEN.MENOR_IGUAL;
        if(palabra.equalsIgnoreCase(">="))
            return TOKEN.MAYOR_IGUAL;
        if(palabra.equalsIgnoreCase("!="))
            return TOKEN.DIFERENTE;
        return TOKEN.ERROR;
    }

}
