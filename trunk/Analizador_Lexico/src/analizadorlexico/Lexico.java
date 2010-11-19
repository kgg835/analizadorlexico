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
public class Lexico {

    private TOKEN token;
    private String lexema;

    public Lexico(TOKEN token, String lexema) {
        this.token = token;
        this.lexema = lexema;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public TOKEN getToken() {
        return token;
    }

    public void setToken(TOKEN token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token +": "+lexema;
    }


}
