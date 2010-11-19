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
public abstract class AFD {

    public static TOKEN validaToken(String palabra){
        return TOKEN.ERROR;
    }

}
