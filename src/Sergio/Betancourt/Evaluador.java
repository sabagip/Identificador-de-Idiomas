/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sergio.Betancourt;

import javax.swing.JOptionPane;

/**
 *
 * @author SABAGIP
 */
public class Evaluador {

    boolean mixto = false; // Bandera para entrar a la condicional de un solo idioma 
    /**
     * ******************************************************************************
     * TRUE = Un solo idioma FALSE = Idioma mixto
     *
     * de, entre
     *
     *
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

    Evaluador(String lectura) {
        
        TablaNormalizacion tablaNormalizacion = new TablaNormalizacion();
        
        String texto = lectura.replaceAll("[\n\r\t]", "");
        String recorrido = "";
        int contadorEspanol = 0;
        int contadorIngles = 0;
        int contadorFrances = 0;
        
        double mediaAritmetica = 0;
        double desviacionEstandar = 0;
        
        double datoNormalizadoEspañol = 0;
        double datoNormalizadoIngles = 0;
        double datoNormalizadoFrances = 0;

        String comparador;
        for (int i = 0; i < texto.length(); i++) {
            //Si lo leido es igual a un enter o espacio. 

            if (texto.charAt(i) != ' ') {
                recorrido = recorrido + texto.charAt(i);
            } else {
                for (int j = 0; j < espanol.length; j++) {
                    comparador = espanol[j];
                    if (recorrido.equals(espanol[j])) {
                        contadorEspanol += 1;
                        recorrido = "";
                        break;
                    }
                    if (j == espanol.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }

        for (int i = 0; i < texto.length(); i++) {
            //Si lo leido es igual a un enter o espacio. 

            if (texto.charAt(i) != ' ') {
                recorrido = recorrido + texto.charAt(i);
            } else {
                for (int j = 0; j < ingles.length; j++) {
                    comparador = ingles[j];
                    if (recorrido.equals(ingles[j])) {
                        contadorIngles += 1;
                        recorrido = "";
                        break;
                    }
                    if (j == ingles.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }

        for (int i = 0; i < texto.length(); i++) {
            //Si lo leido es igual a un enter o espacio. 

            if (texto.charAt(i) != ' ') {
                recorrido = recorrido + texto.charAt(i);
            } else {
                for (int j = 0; j < frances.length; j++) {
                    comparador = frances[j];
                    if (recorrido.equals(frances[j])) {
                        contadorFrances += 1;
                        recorrido = "";
                        break;
                    }
                    if (j == frances.length - 1) {
                        recorrido = "";
                    }
                }

            }
        }
        
        /**
         * **************************************************************************
         * **************************************************************************
         * PROCESOS PARA SACAR LA MEDIA Y LA DESVIACION ESTANDAR DE LOS CONTADORES
         * ASI COMO SUS VALORES NORMALIZADOS
         * **************************************************************************
         * **************************************************************************
         * **************************************************************************
         */
        
        mediaAritmetica = mediaAritmetica(contadorEspanol, contadorIngles, contadorFrances);
        desviacionEstandar = desviacionEstandar(contadorEspanol, contadorIngles, contadorFrances, mediaAritmetica);
        
        datoNormalizadoEspañol = normalizacion(mediaAritmetica, desviacionEstandar, contadorEspanol);
        datoNormalizadoFrances = normalizacion(mediaAritmetica, desviacionEstandar, contadorFrances);
        datoNormalizadoIngles = normalizacion(mediaAritmetica, desviacionEstandar, contadorIngles);
        
        
        
        double porcentajeEspañol = tablaNormalizacion.normalizacion(datoNormalizadoEspañol);
        double porcentajeFrances = tablaNormalizacion.normalizacion(datoNormalizadoFrances);
        double porcentajeIngles = tablaNormalizacion.normalizacion(datoNormalizadoIngles);
        
        
        

        /**
         * ******************************************************************************
         *************** CONDICIONALES PARA TEXTO EN DOS O MAS IDIOMAS
         * *******************
         * *******************************************************************************
         */
        if ((contadorEspanol > contadorFrances && contadorEspanol > contadorIngles)
                && (contadorFrances > porcentajeFrances || contadorIngles > porcentajeIngles)) {
            System.out.println("El texto es mixto");
            JOptionPane.showMessageDialog(null, "El texto es mixto");
            mixto = true;
        } else {
            if ((contadorFrances > contadorEspanol && contadorFrances > contadorIngles)
                    && (contadorEspanol > porcentajeEspañol || contadorIngles > porcentajeIngles)) {
                System.out.println("El texto es mixto");
                JOptionPane.showMessageDialog(null, "El texto es mixto");
                mixto = true;
            } else {
                if ((contadorIngles > contadorEspanol && contadorIngles > contadorFrances)
                        && (contadorEspanol > porcentajeEspañol || contadorFrances > porcentajeFrances)) {
                    System.out.println("El texto es mixto");
                    JOptionPane.showMessageDialog(null, "El texto es mixto");
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
        if ((contadorEspanol > contadorFrances && contadorEspanol > contadorIngles) && mixto == false) {
            System.out.println("El texto está en español " + "con un total de preposiciones de " + contadorEspanol);
            JOptionPane.showMessageDialog(null, "El texto está en español " + "con un total de preposiciones de " + contadorEspanol);
        }

        if ((contadorFrances > contadorEspanol && contadorFrances > contadorIngles) && mixto == false) {
            System.out.println("El texto está en francés " + "con un total de preposiciones de " + contadorFrances);
            JOptionPane.showMessageDialog(null, "El texto está en francés " + "con un total de preposiciones de " + contadorFrances);
        }

        if ((contadorIngles > contadorEspanol && contadorIngles > contadorFrances) && mixto == false) {
            System.out.println("El texto está en inglés " + "con un total de preposiciones de " + contadorIngles);
            JOptionPane.showMessageDialog(null, "El texto está en inglés " + "con un total de preposiciones de " + contadorIngles);
        }

        

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
    
    
    /***
     * *******************************************************************************************************
     * *******************************METODOS PARA SACAR LA MEDIA ARITMETICA Y *******************************
     * *******************************LA DESVIACION ESTANDAR DE LOS CONTADORES *******************************
     * *******************************************************************************************************
     * *******************************************************************************************************
    */

    //texto.charAt(i) == 10  || texto.charAt(i) == 13 || texto.charAt(i) == 00
    private float mediaAritmetica(int contadorEspañol, int contadorIngles, int contadorFrances) {
        float mediaAritmetica;

        mediaAritmetica = (float) (0.3333333 * (contadorEspañol + contadorFrances + contadorIngles));

        return mediaAritmetica;
    }

    private float desviacionEstandar(int contadorEspañol, int contadorIngles, int contadorFrances, double mediaAritmetica) {

        float desviacionEstandar;

        mediaAritmetica = (float) (0.5 * (contadorEspañol + contadorFrances + contadorIngles));

        desviacionEstandar = (float) Math.sqrt(0.5 * (Math.pow(contadorEspañol - mediaAritmetica, 2)
                + Math.pow(contadorIngles - mediaAritmetica, 2)
                + Math.pow(contadorFrances - mediaAritmetica, 2)));

        return desviacionEstandar;

    }

    private double normalizacion(double mediaAritmetica, double desviacionEstandar, int contador) {
        double datoNormalizado;

        datoNormalizado = (contador - mediaAritmetica) / desviacionEstandar;

        return datoNormalizado;
    }

   

}
