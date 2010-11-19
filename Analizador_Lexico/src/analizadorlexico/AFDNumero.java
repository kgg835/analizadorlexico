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
public class AFDNumero extends AFD{

    public static TOKEN validaToken(String palabra){
        TOKEN token = TOKEN.ERROR;
        int estado=0;
        for (int i = 0; i < palabra.length(); i++) {
            Character c = palabra.charAt(i);
            switch (estado) {
                case 0:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 1;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }
                    break;
                case 1:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 2:
                    if(Character.isDigit(c)){
                        estado = 4;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 3:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 4:
                    if(Character.isDigit(c)){
                        estado = 4;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 5:
                    if(Character.isDigit(c)){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                default:
                    token = TOKEN.ERROR;
            }


        }
        return token;

    }

}
