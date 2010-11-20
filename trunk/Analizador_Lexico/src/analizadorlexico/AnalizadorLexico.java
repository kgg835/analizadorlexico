/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlexico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author edison
 */
public class AnalizadorLexico {

    public enum TOKEN {
        NUMERO,
        IF, THEN, ELSE, FOR, WHILE, SWITCH, CASE, RETURN,
        IDENTIFICADOR,
        MENOR, MAYOR, MENOR_IGUAL, MAYOR_IGUAL, IGUAL, DIFERENTE,
        ERROR };

    private List<Lexico> lexicos;

    public AnalizadorLexico() {
        this.lexicos = new ArrayList<Lexico>();
    }

    public void crearTokens(String texto){
        getLexicos().clear();
        for (StringTokenizer stringTokenizer = new StringTokenizer(texto); stringTokenizer.hasMoreTokens();) {
            String palabra = stringTokenizer.nextToken();
            TOKEN token = AFDPalabrasReservadas.validaToken(palabra);
            
            if(TOKEN.ERROR== token){
                token=AFDNumero.validaToken(palabra);
            }

            if(TOKEN.ERROR== token){
                token=AFDId.validaToken(palabra);
            }

            if(TOKEN.ERROR== token){
                token=AFDOperadorRelacional.validaToken(palabra);
            }

            addLexico(new Lexico(token, palabra));
        }
    }

    public void addLexico(Lexico lexico){
        lexicos.add(lexico);
    }

    public List<Lexico> getLexicos() {
        return lexicos;
    }

    public void setLexicos(List<Lexico> lexicos) {
        this.lexicos = lexicos;
    }

}
