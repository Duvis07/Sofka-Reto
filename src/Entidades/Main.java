
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARLEY BOTERO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        // En esta Categoria 1 vamos a encontrar algunas preguntas de Cultura general

        Pregunta  pregunta1 = new Pregunta(1 , "¿Cuales son los unicos maniferos que pueden volar?", "Cultura general", "d", "A. La Cabra", "B. El ganso", "C. El cerdo", "D. El murcielago");
        Pregunta  pregunta2 = new Pregunta(2 , "¿Cuantas notas musicales existen?", "Cultura general", "c", "A. 23", "B. 22", "C. 12", "D. 9");
        Pregunta  pregunta3 = new Pregunta(3 , "¿Quien invento la electricidad?", "Cultura general", "b", "A. pitagoras", "B. Aleksandr Lodygin", "C. Fleming", "D. Don quijote");
        Pregunta  pregunta4 = new Pregunta(4 , "¿Cuál es el océano más grande del mundo?", "Cultura general", "b", "A. Indico", "B. Pacifico", "C. Atlantico", "D. Artico");
        Pregunta  pregunta5 = new Pregunta(5 , "¿Cuál es el planeta más grande del Sistema Solar?", "Cultura general", "d", "A. Saturno", "B. Tierra", "C. Neptuno", "D. Jupiter");

        // En est Categoria 2 vamos a encontrar preguntas sobre la ubicacion de diversos Lugares del mundo

        Pregunta  pregunta6 = new Pregunta(6 , "¿Donde esta ubicado el rio de janeiro?", "Lugares", "c", "A. Múnich", "B. Hamburgo", "C. Brazil", "D. Moscu");
        Pregunta  pregunta7 = new Pregunta(7 , "¿Donde esta ubicado el mar Rojo?", "Lugares", "b", "A. España", "B. Egipto", "C. Argentina", "D. Rusia");
        Pregunta  pregunta8 = new Pregunta(8 , "¿Donde esta ubicada la peninsula italica?", "Lugares", "d", "A. Peru", "B. Suecia", "C. Dubai", "D. Italia");
        Pregunta  pregunta9 = new Pregunta(9 , "¿Donde esta ubicada la piedra del peñol?", "Lugares", "a", "A. Colombia", "B. Guatemala", "C. Venezuela", "D. Chile");
        Pregunta  pregunta10 = new Pregunta(10 ,"¿Donde esta ubicado el monte everest?", "Lugares", "c", "A. Paises bajos", "B. Montreal", "C. Nepal", "D. Francia");

        // En esta Categoria 3 vamos a encontrar preguntas sobre el departamento de antioquia

        Pregunta  pregunta11 = new Pregunta(11 , "¿Cuántos municipios posee el departamento de Antioquia?", "Antioquia", "b", "A. 133", "B. 125", "C. 123", "D. 100");
        Pregunta  pregunta12 = new Pregunta(12 , "¿En que año se construyo el metro de Medellín?", "Antioquia", "a", "A. 1979", "B. 2000", "C. 1666", "D. 2002");
        Pregunta  pregunta13 = new Pregunta(13 , "¿Cuál es la extensión (tamaño) del departamento de Antioquia?", "Antioquia", "b", "A.63.500 km²", "B. 63.000 km² ", "C.69.000 km²", "D. 73.000 km²");
        Pregunta  pregunta14 = new Pregunta(14 , "¿Cuál es el municipio de mayor extensión de Antioquia?", "Antioquia", "a", "A. Turbo", "B. Abejorral", "C. Rionegro", "D. Sonson");
        Pregunta  pregunta15 = new Pregunta(15 , "¿Qué versión se celebró este año de la feria de las flores?", "Antioquia", "b", "A. 50-90", "B. 50-56", "C. 90-94", "D. 23-35");

        //En esta Categoria 4 vamos a encontrar preguntassobre logica de razonamiento en el cual podras a prueba tu agilidad mental 
        
        Pregunta  pregunta16 = new Pregunta(16 , "Un oso camina 10km hacia el sur, 10 hacia el este y 10 hacia el norte, y de esta manera vuelve al sitio del que salió. ¿De qué color es el oso?", "Lógica", "a", "A. blanco", "B. cafe", "C. negro", "D. panda");
        Pregunta  pregunta17 = new Pregunta(17 , "Le das una patada a una pelota, esta se aleja 5 metros, pero vuelve directamente a ti sin que nadie te la devuelva. ¿Por qué?", "Lógica", "c", "A. Porque la has lanzado con efecto", "B. Porque la has lanzado contra un muro", "C. Porque la has lanzado hacia arriba", "D. Porque la has lanzado a un compañero");
        Pregunta  pregunta18 = new Pregunta(18 , "En un cuarto hay gatos, cada gato mira cinco gatos ¿Cuántos gatos hay?", "Lógica", "d", "A. 4", "B. 25", "C. 20", "D. 6");
        Pregunta  pregunta19 = new Pregunta(19 , "Si María habla más bajo que Carmen y Lola habla más alto que Carmen, ¿María habla más alto o más bajo que Lola?", "Lógica", "c", "A. María habla más alto que Lola", "B. María habla más alto que Carmen", "C. María habla más bajo que Lola", "D. María habla igual que Lola");
        Pregunta  pregunta20 = new Pregunta(20 , "“Cansado” es a “trabajar” como “orgulloso” es a:", "Lógica", "b", "A. Sonreír", "B. Tener éxito", "C. Ser feliz", "D. Ninguna de las anteriores");

        // En esta Categoria 5 vamos a encontrar preguntas sobre logica y razonamiento matematico a apartir de unos pequeños problemas

        Pregunta  pregunta21 = new Pregunta(21 , "Una madre tiene 40 años y su hijo tiene 10. ¿Cuántos años deben pasar para que la edad de la madre sea el triple que la edad de su hijo?", "Razonamiento matemático", "c", "A. 7", "B. 15", "C. 5", "D. 1");
        Pregunta  pregunta22 = new Pregunta(22 , "Una persona compra tres docenas de lápices, 12 cuadernos y 10 resmas de papel en $62.4, si cada lápiz cuesta $0.30 y cada cuaderno $1.80, el costo de cada resma es:", "Razonamiento matemático", "d", "A. $1.5", "B. $1.2", "C. $1.0", "D. $3.0");
        Pregunta  pregunta23 = new Pregunta(23 , "Si tengo 7/8 de dólar. ¿Cuánto me falta para tener un dólar?", "Razonamiento matemático", "c", "A. 5/9", "B. 11/8", "C. 1/8", "D. 3/10");
        Pregunta  pregunta24 = new Pregunta(24 , "Un niño consume 500 gramos diarios de pan. ¿Cuál será el consumo diario en kilos de un comedor compuesto por 126 niños?", "Razonamiento matemático", "b", "A.  53 kg ", "B.  63 kg ", "C.  223 kg ", "D.  653 kg ");
        Pregunta  pregunta25 = new Pregunta(25 , "Se vende un artículo con una ganancia del 15% sobre el precio del costo. Si se ha comprado en $80. Hallar el precio total de la venta.", "Razonamiento matemático", "c", "A. $95", "B. $90", "C. $92", "D. $91");

        //En este paso  se va asignar arreglo de cada grupo de preguntas por categoria en la cual  se encotraran pregunas de nivel: muy_facil,facil,moderado,dificil,experto

        ArrayList<Pregunta> muy_facil = new ArrayList<Pregunta>();
        muy_facil.add(0, pregunta1);
        muy_facil.add(1, pregunta2);
        muy_facil.add(2, pregunta3);
        muy_facil.add(3, pregunta4);
        muy_facil.add(4, pregunta5);

        ArrayList<Pregunta> facil = new ArrayList<Pregunta>();
        facil.add(0, pregunta6);
        facil.add(1, pregunta7);
        facil.add(2, pregunta8);
        facil.add(3, pregunta9);
        facil.add(4, pregunta10);

        ArrayList<Pregunta> moderada = new ArrayList<Pregunta>();
        moderada.add(0, pregunta11);
        moderada.add(1, pregunta12);
        moderada.add(2, pregunta13);
        moderada.add(3, pregunta14);
        moderada.add(4, pregunta15);

        ArrayList<Pregunta> dificil = new ArrayList<Pregunta>();
        dificil.add(0, pregunta16);
        dificil.add(1, pregunta17);
        dificil.add(2, pregunta18);
        dificil.add(3, pregunta19);
        dificil.add(4, pregunta20);

        ArrayList<Pregunta> experto = new ArrayList<Pregunta>();
        experto.add(0, pregunta21);
        experto.add(1, pregunta22);
        experto.add(2, pregunta23);
        experto.add(3, pregunta24);
        experto.add(4, pregunta25);

        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Ronda ronda = new Ronda();

        // Iniciar el Juego
        System.out.println("<-------JUEGO DE PREGUNTAS ESTAS LISTO PARA GANAR--------->");
        System.out.println("Responde de manera correcta para que puedas ganar muchos puntos y poder asi acumular dinero");
        System.out.println("");
        System.out.println("Ingresa tu nombre completo :");
        jugador.setNombre(scanner.nextLine());
        System.out.println("");
        System.out.println("Puntos actuales: "+ronda.getPuntos());

        ronda.primeraRonda(muy_facil);
        ronda.segundaRonda(facil);
        ronda.terceraRonda(moderada);
        ronda.cuartaRonda(dificil);
        ronda.quintaRonda(experto);
        ronda.puntosPorDinero(jugador);
        System.out.println(jugador.getNombre() +", El dinero ganado en total es: $"+ jugador.getDineroAcumulado()+" Gracias por jugar");

    }
}

    
