package com.example.juego_del_uno;
import java.util.Scanner;

public class Battle_Naval {

    static Scanner sc = new Scanner(System.in);
    static String p2, p1;
    static int fila[][];
    static int tirosJugador1 = 4;
    static int tirosJugador2 = 4;
    static int campo[][];
    static int fil, col;
    static int disparoj1,Sdisparoj1;
    static  int disparoj2,Sdisparoj2;

    public static  void main(String[] args){
        System.out.println("Ingresa el numero de fila del tablero");
        fil =  sc.nextInt();

        System.out.println("Ingresa el numero de columnas del tablero");
        col = sc.nextInt();

        fila = new int [fil][col];
        campo = new int [fil][col];


        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                fila  [i][j] = 0;
            }
        }

        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                campo[i][j] = 0;
            }
        }

        System.out.println("Tablero: ");

        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                System.out.print(fila[i][j] + " ");
            }
            System.out.println("");
        }


        System.out.println("Ingresa tu Usuario player 1");
        p1 = sc.next();
        System.out.println("Ingresa tu Usuario player 2");
        p2 = sc.next();
        System.out.println("Quieres empezar la partida si o no");
        String inicio = sc.next();

        if(inicio.equalsIgnoreCase("si")){
            System.out.println("Bienvenido " + p1);
            System.out.println("Quieres ingresar tus barcos Si/No");
            String opcion = sc.next();
            if(opcion.equalsIgnoreCase("si")){
                turno1();
            }
            System.out.println("Bienvenido " + p2);
            System.out.println("Quieres ingresar tus barcos Si/No");
            String opc = sc.next();
            if(opc.equalsIgnoreCase("si")){
                turno2();
            }
            comienzo();
        }
    }
    public static void comienzo(){
        System.out.println("Turno de " + p1);
        while(tirosJugador1 > 0){
            System.out.println("Intentos restantes " + tirosJugador1 );
            System.out.println("Ingresa disparo en el eje x");
            disparoj1 = sc.nextInt();

            System.out.println("Ingresa disparo en el eje y");
            Sdisparoj1 =sc.nextInt();

            if(disparoj1 >= 1 && disparoj1 <= fil && Sdisparoj1 >= 1 && Sdisparoj1 <= col){

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){

                    }
                }

                if(campo[disparoj1][Sdisparoj1] == 1){
                    System.out.println("!En el blanco");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            campo[disparoj1][Sdisparoj1] = 2;
                        }
                    }
                }else if(campo[disparoj1][Sdisparoj1] == 0){
                    System.out.println("Has fallado");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            campo[disparoj1][Sdisparoj1] = 2;
                        }
                    }
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                }
                System.out.println("");
                    }

            }


            tirosJugador1--;




        }

        System.out.println("Turno de " + p2);
        do{
            System.out.println("Ingresa disparo en el eje x");
            disparoj2 = sc.nextInt();

            System.out.println("Ingresa disparo en el eje y");
            Sdisparoj2 =sc.nextInt();

            if(disparoj2 >= 1 && disparoj2 <= fil && Sdisparoj2 >= 1 && Sdisparoj2 <= col){

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){

                    }
                }

                if(fila[disparoj2][Sdisparoj2] == 1){
                    System.out.println("!En el Blanco sigue asi");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            fila[disparoj2][Sdisparoj2] = 2;
                        }
                    }
                }else if(fila[disparoj2][Sdisparoj2] == 0){
                    System.out.println("Has fallado tu puedes");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            fila[disparoj2][Sdisparoj2] = 2;
                        }
                    }
                }
                tirosJugador2--;
            }



        }while(tirosJugador2 > 0);


        for(int i =0; i < campo.length; i++){
            for(int j = 0; j < campo.length - 1; j++){
                if(campo[i][j] == 1){
                    System.out.println("Perdiste");
                    for(int x = 0; x < fil; x++){
                        for(int y = 0; y < col; y++){
                            System.out.print(campo[x][y] + " ");
                        }
                        System.out.println("");
                    }

                }else{
                    System.out.println("Ganaste");
                }
                return;

            }
        }

        for(int i =0; i < fila.length; i++){
            for(int j = 0; j < fila.length - 1; j++){
                if(fila[i][j] == 1){
                    System.out.println("Perdiste");
                    for(int x = 0; x < fil; x++){
                        for(int y = 0; y < col; y++){
                            System.out.print(fila[x][y] + " ");
                        }
                        System.out.println("");
                    }

                }else{
                    System.out.println("Ganaste");
                }
                return;

            }
        }

    }
    public static void turno2(){
        String direccion2;

        System.out.println("Ingresa la direcion del  barco 1  ---Horizontal / Vertical----");
        direccion2 = sc.next();

        if(direccion2.equalsIgnoreCase("horizontal")){
            System.out.println("Ingresa la posicion del eje x del barco 1");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 1");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= 7 ){
                for(int i = 0; i < 4; i++){
                    campo[x][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(direccion2.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion del eje x del barco 1 ");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 1");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 4; i++){
                    campo[x - 1][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[j][i] + " ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Ingresa una cordenada valida");
        }

        System.out.println("Ingresa la direccion del barco 2 ---Horizontal / Vertical----");
        direccion2 = sc.next();

        if(direccion2.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion del eje x del barco 2");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 2");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= 7 ){
                for(int i = 0; i < 3; i++){
                    campo[x][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(direccion2.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco 2");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco 2");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 3; i++){
                    campo[x + i][y] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }


        System.out.println("Ingresa la posicion de tu barco 3 ---Horizontal / Vertical----");
        direccion2 = sc.next();

        if(direccion2.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion del eje x del barco 3 ");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 3 ");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 2; i++){
                    campo[x][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(direccion2.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion del eje x del barco 3");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 3");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 2; i++){
                    campo[x + i][y] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        System.out.println("Ingresa la direecion del barco 4 ---Horizontal / Vertical----");
        direccion2 = sc.next();

        if(direccion2.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion del eje x del barco 4");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 4");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 1; i++){
                    campo[x - 1][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(direccion2.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion del eje x del barco 4");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 4");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 1; i++){
                    campo[x + i][y - 1] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

    }
    public static void turno1(){
        String direccion;

        System.out.println("Ingresa la posicion de tu Primer barco ");
        System.out.println("Horizontal o Vertical");
        direccion = sc.next();

        if(direccion.equalsIgnoreCase("horizontal")){
            System.out.println("Ingresa la posicion del eje x del barco 1");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 1");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= 7 ){
                for(int i = 0; i < 4; i++){
                    fila[x][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(fila[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(direccion.equalsIgnoreCase("vertical")){
            System.out.println("Ingresa la posicion del eje x del barco 1 ");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 1");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 4; i++){
                    fila[x - 1][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(fila[j][i] + " ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Ingresa una cordenada valida");
        }

        System.out.println("Ingresa la direccion del barco 2 ---Horizontal / Vertical----");
        direccion = sc.next();

        if(direccion.equalsIgnoreCase("horizontal")){
            System.out.println("Ingresa la posicion horizontal de tu barco 2");
            int horizontal = sc.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco 2");
            int columna =sc.nextInt();

            if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= 7 ){
                for(int i = 0; i < 3; i++){
                    fila[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(fila[i][j] + " ");
                }
                System.out.println("");
                    }

            }
        }else if(direccion.equalsIgnoreCase("vertical")){
                 System.out.println("Ingresa la posicion del eje x del barco 2");
                 int x = sc.nextInt();

                System.out.println("Ingresa la posicion del eje y del barco 2");
                int y =sc.nextInt();

                if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                    for(int i = 0; i < 3; i++){
                     fila[x + i][y] = 1;
                    }

                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(fila[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }


        System.out.println("Ingresa la dirrecion del barco 3 ---Horizontal / Vertical----");
        direccion = sc.next();

        if(direccion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion del eje x del barco 3 ");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion del eje y del barco 3 ");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 2; i++){
                    fila[x][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(fila[i][j] + " ");
                }
                System.out.println("");
                    }

            }
        }else if(direccion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 3");
                 int x = sc.nextInt();

                System.out.println("Ingresa la posicion vertical de tu barco 3");
                int y =sc.nextInt();

                if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                    for(int i = 0; i < 2; i++){
                     fila[x + i][y] = 1;
                    }

                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(fila[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }

        System.out.println("Ingresa la posicion de tu barco 4 ---Horizontal / Vertical----");
        direccion = sc.next();

        if(direccion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 4");
            int x = sc.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco 4");
            int y =sc.nextInt();

            if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                for(int i = 0; i < 1; i++){
                    fila[x - 1][y + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(fila[i][j] + " ");
                }
                System.out.println("");
                    }

            }
        }else if(direccion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 4");
                 int x = sc.nextInt();

                System.out.println("Ingresa la posicion vertical de tu barco 4");
                int y =sc.nextInt();

                if(x >= 1 && x <= fil && y >= 1 && y <= col ){
                    for(int i = 0; i < 1; i++){
                     fila[x + i][y - 1] = 1;
                    }

                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(fila[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }

    }


}
