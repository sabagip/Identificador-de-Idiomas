/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sergio.Betancourt;

import javax.swing.JOptionPane;

/**
 * *******************************************************************************
 * La clase Evaluador tiene la funcion principal de tomar la informacion que
 * contiene el area de texto y decir el idioma en el que está escrito.
 *
 * En el caso de las preposiciones "de, entre" que se encuentran en los idiomas
 * frances y español, se tomó la desicion de eliminarlos de sus respectivos
 * idiomas.
 *
 * @author SABAGIP
 * *******************************************************************************
 */
public class Evaluador {

    /**
     * ******************************************************************************
     * Bandera para entrar a la condicional de un solo idioma TRUE = Un solo
     * idioma FALSE = Idioma mixto
     * ******************************************************************************
     */
    boolean mixto = false;

    /**
     * *****************************************************************************
     * Los siguientes arreglos contienen en su conteido las preposiciones de los
     * idiomas español, frances e ingles. Ciertas preposiciones estan escritas
     * de como se encuentran en los textos normalmente, solo en minusculas, solo
     * en mayusculas y la letra inicial de cada preposicion en mayuscula y las
     * restantes en minusculas
     * *******************************************************************************
     */
    String[] espanol = {"a", "ante", "bajo", "cabe", "con", "contra", "desde",
        "en", "hacia", "hasta", "para", "por", "según", "sin", "sobre", "tras",
        "A", "Ante", "Bajo", "Cabe", "Con", "Contra", "Desde",
        "En", "Entre", "Hacia", "Hasta", "Para", "Por", "Según", "Sin", "Sobre", "Tras",
        "A", "ANTE", "BAJO", "CABE", "CON", "CONTRA", "DESDE",
        "EN", "ENTRE", "HACIA", "HASTA", "PARA", "POR", "SEGÚN", "SIN", "SOBRE", "TRAS"
    };

    String[] frances = {"sur", "sous", "devant", "derrière", "dans", "chez",
        "avant", "après", "vers", "depuis", "pendant", "pour", "vers", "à", "jusqu’à", "par",
        "Sur", "Sous", "Devant", "Derrière", "Dans", "Chez", "Avant", "Après", "Vers",
        "Depuis", "Pendant", "Pour", "Vers", "À", "Jusqu’à", "De", "Par",
        "SUR", "SOUS", "DEVANT", "DERRIÈRE", "DANS", "CHEZ",
        "AVANT", "APRÈS", "VERS", "DEPUIS", "PENDANT", "POUR", "VERS", "À", "JUSQU’À", "DE", "PAR"
    };

    String[] ingles = {"about", "above", "after", "among", "at", "before", "behind",
        "below", "beneath", "beside", "between", "but", "by", "down", "except", "for", "from",
        "into", "like", "near", "of", "off", "on", "over", "since", "through", "throughout",
        "until", "to", "under", "up", "upon", "with", "without", "About", "Above", "After",
        "Among", "At", "Before", "Behind", "Below", "Beneath", "Beside", "Between", "But", "By",
        "Down", "Except", "For", "From", "Into", "Like", "Near", "Of", "Off", "On", "Over", "Since",
        "Through", "Throughout", "Until", "To", "Under", "Up", "Upon", "With", "Without",
        "ABOUT", "ABOVE", "AFTER", "AMONG", "AT", "BEFORE", "BEHIND",
        "BELOW", "BENEATH", "BESIDE", "BETWEEN", "BUT", "BY", "DOWN", "EXCEPT", "FOR", "FROM",
        "INTO", "LIKE", "NEAR", "OF", "OFF", "ON", "OVER", "SINCE", "THROUGH", "THROUGHOUT",
        "UNTIL", "TO", "UNDER", "UP", "UPON", "WITH", "WITHOUT"
    };

    /**
     * ******************************************************************************
     * Lo siguiente es un constructor que recibe una variable de tipo String, el
     * cual tiene la funcion de tomar una desicion, el constructor tiene
     * basicamente un contador para cada idioma, y se hace un recorrido al
     * contenido de la variable de tipo String, segun encuentre un espacio,
     * evalua la palabra y la compara con los arreglos anteriores, si ecuentra
     * una coincidencia se aumenta el contador de dicho idioma, si no, se pasa a
     * la siguiente palabra, hasta llegar al final del contenido.
     * *******************************************************************************
     */
    Evaluador(String lectura) {

        // Se crea un objeto TablaNormalizacion para normalizar los valores de los
        // Contadores
        TablaNormalizacion tablaNormalizacion = new TablaNormalizacion();

        // Se reemplazan los retornos de carro, nuevas lineas y tabulaciones para
        // dejar el texto en una sola linea.
        String texto = lectura.replaceAll("[\n\r\t]", "");

        //Variable que guardará las palabras del texto
        String recorrido = "";

        //Contadores de las preposiciones 
        int contadorEspanol = 0;
        int contadorIngles = 0;
        int contadorFrances = 0;

        // Las siguientes variables son para normalizar los contadores
        double mediaAritmetica = 0;
        double desviacionEstandar = 0;

        double datoNormalizadoEspañol = 0;
        double datoNormalizadoIngles = 0;
        double datoNormalizadoFrances = 0;

        // Variable que comparará las preposiciones de cada idioma con cada palabra
        // del texto
        // Ciclo que recorrerá todo el texto que se quiere evaluar y comparará
        // el texto con las preposiciones en español
        for (int i = 0; i < texto.length(); i++) {

            //Si lo leido es diferente a un espacio
            if (texto.charAt(i) != ' ') {

                //Guarda el caracter de la posicion i en la variable recorrido
                recorrido = recorrido + texto.charAt(i);
            } else {

                // De lo contrario, si lo leido es igual a un espacio, quiere decir
                // que ya se recorrió una palabra entera, por lo tanto se comparará
                // esa palabra con las preposiciones de los arreglos
                for (int j = 0; j < espanol.length; j++) {

                    // Si la preposicion del español en la posicion j es gual a
                    // la palabra evaluada
                    if (recorrido.equals(espanol[j])) {

                        // Aumenta el contador de español en 1 
                        contadorEspanol += 1;

                        // Reiniciamos la variable recorrido que contiene la 
                        // palabra evaluada
                        recorrido = "";

                        // Se rompe el ciclo para evitar evaluar todas las 
                        // preposiciones
                        break;
                    }
                    // Si ya se recorrio todo el arreglo, quiere decir que 
                    // no se encontraron coincidencias entre las preposiciones
                    // y la palabra evaluada y se reinicia la variable recorrido
                    if (j == espanol.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }

        // Ciclo que recorrerá todo el texto que se quiere evaluar y comparará
        // el texto con las preposiciones en ingles
        for (int i = 0; i < texto.length(); i++) {

            //Si lo leido es diferente a un espacio
            if (texto.charAt(i) != ' ') {

                //Guarda el caracter de la posicion i en la variable recorrido
                recorrido = recorrido + texto.charAt(i);
            } else {

                // De lo contrario, si lo leido es igual a un espacio, quiere decir
                // que ya se recorrió una palabra entera, por lo tanto se comparará
                // esa palabra con las preposiciones de los arreglos
                for (int j = 0; j < ingles.length; j++) {

                    // Si la preposicion del ingles en la posicion j es gual a
                    // la palabra evaluada
                    if (recorrido.equals(ingles[j])) {

                        // Aumenta el contador de ingles en 1 
                        contadorIngles += 1;

                        // Reiniciamos la variable recorrido que contiene la 
                        // palabra evaluada
                        recorrido = "";

                        // Se rompe el ciclo para evitar evaluar todas las 
                        // preposiciones
                        break;
                    }

                    // Si ya se recorrio todo el arreglo, quiere decir que 
                    // no se encontraron coincidencias entre las preposiciones
                    // y la palabra evaluada y se reinicia la variable recorrido
                    if (j == ingles.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }

        // Ciclo que recorrerá todo el texto que se quiere evaluar y comparará
        // el texto con las preposiciones en frances
        for (int i = 0; i < texto.length(); i++) {

            //Si lo leido es diferente a un espacio
            if (texto.charAt(i) != ' ') {

                //Guarda el caracter de la posicion i en la variable recorrido
                recorrido = recorrido + texto.charAt(i);
            } else {

                // De lo contrario, si lo leido es igual a un espacio, quiere decir
                // que ya se recorrió una palabra entera, por lo tanto se comparará
                // esa palabra con las preposiciones de los arreglos
                for (int j = 0; j < frances.length; j++) {

                    // Si la preposicion del frances en la posicion j es gual a
                    // la palabra evaluada
                    if (recorrido.equals(frances[j])) {

                        //Aumeta el contador frances en 1
                        contadorFrances += 1;

                        // Reiniciamos la variable recorrido que contiene la 
                        // palabra evaluada
                        recorrido = "";

                        // Se rompe el ciclo para evitar evaluar todas las 
                        // preposiciones
                        break;
                    }

                    // Si ya se recorrio todo el arreglo, quiere decir que 
                    // no se encontraron coincidencias entre las preposiciones
                    // y la palabra evaluada y se reinicia la variable recorrido
                    if (j == frances.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }

        /**
         * **************************************************************************
         * **************************************************************************
         * PROCESOS PARA SACAR LA MEDIA Y LA DESVIACION ESTANDAR DE LOS
         * CONTADORES ASI COMO SUS VALORES NORMALIZADOS
         * **************************************************************************
         * **************************************************************************
         * **************************************************************************
         */
        mediaAritmetica = tablaNormalizacion.mediaAritmetica(contadorEspanol, contadorIngles, contadorFrances);
        desviacionEstandar = tablaNormalizacion.desviacionEstandar(contadorEspanol, contadorIngles, contadorFrances, mediaAritmetica);

        datoNormalizadoEspañol = tablaNormalizacion.normalizacion(mediaAritmetica, desviacionEstandar, contadorEspanol);
        datoNormalizadoFrances = tablaNormalizacion.normalizacion(mediaAritmetica, desviacionEstandar, contadorFrances);
        datoNormalizadoIngles = tablaNormalizacion.normalizacion(mediaAritmetica, desviacionEstandar, contadorIngles);

        double porcentajeEspañol = tablaNormalizacion.normalizacion(datoNormalizadoEspañol);
        double porcentajeFrances = tablaNormalizacion.normalizacion(datoNormalizadoFrances);
        double porcentajeIngles = tablaNormalizacion.normalizacion(datoNormalizadoIngles);

        /**
         * ******************************************************************************
         *************** CONDICIONALES PARA TEXTO EN DOS O MAS IDIOMAS En caso
         * de que una condicion se cumpla, quiere decir que el texto está en dos
         * idiomas y que no es necesario entrar a las condicionales de un solo
         * idioma, tomando una decision.
         * *******************************************************************************
         */
        // Si el contador español es mayor al contador ingles y frances y el 
        // contador frances o ingles es mayor a su valor normalizado, entonces el 
        // texto introducido está escrito en dos o mas idiomas.
        if ((contadorEspanol > contadorFrances && contadorEspanol > contadorIngles)
                && (contadorFrances > porcentajeFrances || contadorIngles > porcentajeIngles)) {
            System.out.println("El texto es mixto");
            JOptionPane.showMessageDialog(null, "El texto es mixto");

            // Se cambia la bandera a true para evitar entrar a las condicionales
            // de un solo idioma
            mixto = true;
        } else {

            // Si el contador frances es mayor al contador ingles y español y el 
            // contador español o ingles es mayor a su valor normalizado, entonces el 
            // texto introducido está escrito en dos o mas idiomas.
            if ((contadorFrances > contadorEspanol && contadorFrances > contadorIngles)
                    && (contadorEspanol > porcentajeEspañol || contadorIngles > porcentajeIngles)) {
                System.out.println("El texto es mixto");
                JOptionPane.showMessageDialog(null, "El texto es mixto");

                // Se cambia la bandera a true para evitar entrar a las condicionales
                // de un solo idioma
                mixto = true;
            } else {

                //Si el contador ingles es mayor al contador español y frances y el 
                //contador frances o español es mayor a su valor normalizado, entonces el 
                //texto introducido está escrito en dos o mas idiomas.
                if ((contadorIngles > contadorEspanol && contadorIngles > contadorFrances)
                        && (contadorEspanol > porcentajeEspañol || contadorFrances > porcentajeFrances)) {
                    System.out.println("El texto es mixto");
                    JOptionPane.showMessageDialog(null, "El texto es mixto");

                    // Se cambia la bandera a true para evitar entrar a las condicionales
                    // de un solo idioma
                    mixto = true;
                }
            }
        }

        /**
         * ******************************************************************************
         ******************** CONDICIONALES PARA UN SOLO
         * IDIOMA**************************
         * ******************************************************************************
         */
        // Si la bandera mixto, no fue cambiada quiere decir que no se cumplieron
        // las condiciones anteriores, por lo tanto quiere decir que el texto
        // está escrito en un solo idioma
        // Si el contador español es mayor al contador frances y al ingles entonces
        // el texto está escrito en español
        if ((contadorEspanol > contadorFrances && contadorEspanol > contadorIngles) && mixto == false) {
            System.out.println("El texto está en español " + "con un total de preposiciones de " + contadorEspanol);
            JOptionPane.showMessageDialog(null, "El texto está en español " + "con un total de preposiciones de " + contadorEspanol);
        } else {

            // Si el contador frances es mayor al contador español y al ingles entonces
            // el texto está escrito en español
            if ((contadorFrances > contadorEspanol && contadorFrances > contadorIngles) && mixto == false) {
                System.out.println("El texto está en francés " + "con un total de preposiciones de " + contadorFrances);
                JOptionPane.showMessageDialog(null, "El texto está en francés " + "con un total de preposiciones de " + contadorFrances);
            } else {

                // Si el contador ingles es mayor al contador frances y al español entonces
                // el texto está escrito en español
                if ((contadorIngles > contadorEspanol && contadorIngles > contadorFrances) && mixto == false) {
                    System.out.println("El texto está en inglés " + "con un total de preposiciones de " + contadorIngles);
                    JOptionPane.showMessageDialog(null, "El texto está en inglés " + "con un total de preposiciones de " + contadorIngles);
                }
            }
        }
        
        
        /*************************************************************************
         * Se regresan las variables y banderas a su valor inicial para iniciar
         * un nuevo proceso (En caso que el usuario lo indique)
         * ***********************************************************************
         */

        recorrido = "";
        contadorEspanol = 0;
        contadorIngles = 0;
        contadorFrances = 0;
        mixto = false;

        mediaAritmetica = 0;
        desviacionEstandar = 0;

        datoNormalizadoEspañol = 0;
        datoNormalizadoIngles = 0;
        datoNormalizadoFrances = 0;

        porcentajeEspañol = 0;
        porcentajeFrances = 0;
        porcentajeIngles = 0;

    }

}
