/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Token;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Juan Enríquez
 */
public class Analizador_lexico {

    String patron
            = ("(identifier|class|abstract|get|implements|import|interface|is|library|operator|set|static|tipedef|indentifier_no_dollar|identifier_start)|"
            /*2*/ + "(if|then|else|while)|"
            /*3*/ + "(for)|"
            /*4*/ + "(Integer|Long|Single|Double|String|Boolean|Variant)|"
            /*5*/ + "(int|double|float|String|boolean|var)|"
            /*6*/ + "(public|protected|private)|"
            /*7*/ + "(Next|Module|End|Format|Sub| Main|True|False|Dim |As|static|void|Console.WriteLine|Leer|Escribir|Incremento|Repeticion|Console.ReadLine|ReadLine|return)|"
            /*8*/ + "([+|/|*|-])|"
            /*9*/ + "(true|false)|"
            /*10*/ + "(using [a-zA-Z0-9.]+|using)|"
            /*11*/ + "(namespace)|"
            /*12*/ + "([a-z]+[a-zA-Z0-9.]*|[A-Z]+[a-zA-Z0-9.]*)|"
            /*13*/ + "(>=|>|<=|<|==)|"
            /*14*/ + "([0-9]+)|"
            /*15*/ + "([(])|"
            /*16*/ + "([)])|"
            /*17*/ + "([{])|"
            /*18*/ + "([}])|"
            /*19*/ + "(;)|"
            /*20*/ + "(=)|"
            /*21*/ + "(%)|"
            /*22*/ + "(&&)");

    String texto;
    //"using kajsdks.kajsdks; public class if(true){int=0;} while(true){}"

    Pattern p = Pattern.compile(patron);
    Matcher matcher;

    Hashtable<String, Token> tablaTokens = new Hashtable<String, Token>();
    int cont = 1;

    public Analizador_lexico(String texto) {
        this.texto = texto;
        matcher = p.matcher(texto);
    }

    public Hashtable analizar() {
        while (matcher.find()) {
            Token token = new Token();
            cont++;
            String tokenTipo1 = matcher.group(1);
            if (tokenTipo1 != null) {
                System.out.println("Identificador: " + tokenTipo1);
                token.setValor(tokenTipo1);
                token.setTipo("Identificador");
                tablaTokens.put(cont + "", token);
            }

            String tokenTipo2 = matcher.group(2);
            if (tokenTipo2 != null) {
                System.out.println("Condición: " + tokenTipo2);
                token.setValor(tokenTipo2);
                token.setTipo("Condición");
                tablaTokens.put(cont + "", token);
            }

            String tokenTipo3 = matcher.group(3);
            if (tokenTipo3 != null) {
                System.out.println("Ciclo: " + tokenTipo3);
                token.setValor(tokenTipo3);
                token.setTipo("Ciclo");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo4 = matcher.group(4);
            if (tokenTipo4 != null) {
                System.out.println("Clase Tipo de dato: " + tokenTipo4);
                token.setValor(tokenTipo4);
                token.setTipo("Clase Tipo de dato");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo5 = matcher.group(5);
            if (tokenTipo5 != null) {
                System.out.println("Tipo de dato: " + tokenTipo5);
                token.setValor(tokenTipo5);
                token.setTipo("Tipo de dato");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo6 = matcher.group(6);
            if (tokenTipo6 != null) {
                System.out.println("Privacidad: " + tokenTipo6);
                token.setValor(tokenTipo6);
                token.setTipo("Privacidad");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo7 = matcher.group(7);
            if (tokenTipo7 != null) {
                System.out.println("Escritura: " + tokenTipo7);
                token.setValor(tokenTipo7);
                token.setTipo("Escritura");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo8 = matcher.group(8);
            if (tokenTipo8 != null) {
                System.out.println("Operador: " + tokenTipo8);
                token.setValor(tokenTipo8);
                token.setTipo("Operador");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo9 = matcher.group(9);
            if (tokenTipo9 != null) {
                System.out.println("Booleano: " + tokenTipo9);
                token.setValor(tokenTipo9);
                token.setTipo("Booleano: ");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo10 = matcher.group(10);
            if (tokenTipo10 != null) {
                System.out.println("Declaración de nombre de espacio " + tokenTipo10);
                token.setValor(tokenTipo10);
                token.setTipo("Declaración de nombre de espacio");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo11 = matcher.group(11);
            if ((tokenTipo11 != null)) {
                System.out.println("Espacio " + tokenTipo11);
                token.setValor(tokenTipo11);
                token.setTipo("Espacio");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo12 = matcher.group(12);
            if ((tokenTipo12 != null)) {
                System.out.println("Variable: " + tokenTipo12);
                token.setValor(tokenTipo12);
                token.setTipo("Variable");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo13 = matcher.group(13);
            if (tokenTipo13 != null) {
                System.out.println("Comparador: " + tokenTipo13);
                token.setValor(tokenTipo13);
                token.setTipo("Comparador");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo14 = matcher.group(14);
            if (tokenTipo14 != null) {
                System.out.println("Número: " + tokenTipo14);
                token.setValor(tokenTipo14);
                token.setTipo("Número");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo15 = matcher.group(15);
            if (tokenTipo15 != null) {
                System.out.println("Abre paréntesis: " + tokenTipo15);
                token.setValor(tokenTipo15);
                token.setTipo("Abre paréntesis");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo16 = matcher.group(16);
            if (tokenTipo16 != null) {
                System.out.println("Cierra paréntesis: " + tokenTipo16);
                token.setValor(tokenTipo16);
                token.setTipo("Cierra paréntesis");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo17 = matcher.group(17);
            if (tokenTipo17 != null) {
                System.out.println("Abre llaves: " + tokenTipo17);
                token.setValor(tokenTipo17);
                token.setTipo("Abre llaves");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo18 = matcher.group(18);
            if (tokenTipo18 != null) {
                System.out.println("Cierra llaves: " + tokenTipo18);
                token.setValor(tokenTipo18);
                token.setTipo("Cierra llaves");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo19 = matcher.group(19);
            if (tokenTipo19 != null) {
                System.out.println("Fin de sentencia: " + tokenTipo19);
                token.setValor(tokenTipo19);
                token.setTipo("Fin de sentencia");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo20 = matcher.group(20);
            if (tokenTipo20 != null) {
                System.out.println("Asignación: " + tokenTipo20);
                token.setValor(tokenTipo20);
                token.setTipo("Asignación");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo21 = matcher.group(21);
            if (tokenTipo21 != null) {
                System.out.println("Módulo: " + tokenTipo21);
                token.setValor(tokenTipo21);
                token.setTipo("Módulo");
                tablaTokens.put(cont + "", token);
            }
            String tokenTipo22 = matcher.group(22);
            if (tokenTipo22 != null) {
                System.out.println("Conjunción: " + tokenTipo22);
                token.setValor(tokenTipo22);
                token.setTipo("Conjunción");
                tablaTokens.put(cont + "", token);
            }

        }
//        System.out.println("-------------------------");
//        for (int i = 0; i < tablaTokens.keySet().size() + 2; i++) {
//            if (tablaTokens.get(i + "") != null) {
//                System.out.println(tablaTokens.get(i + "").getTipo() + ": " + tablaTokens.get(i + "").getValor());
//            }
//        }
        return tablaTokens;
    }
}
