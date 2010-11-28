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
public class AFDPalabrasReservadas  extends AFD{

    public static TOKEN validaToken(String palabra){
        if(palabra.equalsIgnoreCase("if"))
            return TOKEN.IF;
        if(palabra.equalsIgnoreCase("then"))
            return TOKEN.THEN;
        if(palabra.equalsIgnoreCase("else"))
            return TOKEN.ELSE;
        if(palabra.equalsIgnoreCase("for"))
            return TOKEN.FOR;
        if(palabra.equalsIgnoreCase("while"))
            return TOKEN.WHILE;
        if(palabra.equalsIgnoreCase("switch"))
            return TOKEN.SWITCH;
        if(palabra.equalsIgnoreCase("case"))
            return TOKEN.CASE;
        if(palabra.equalsIgnoreCase("return"))
            return TOKEN.RETURN;
        return TOKEN.ERROR;
    }

}
