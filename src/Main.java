import java.util.Scanner;
public class Main {
    public class tablero {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int  tablero[][]=new int[8][8];
            int movimiento[][]=new int[3][65];
            int jugada,fila,columna,i,j,op;
            System.out.println("Ingrese la posición del caballo");
            System.out.print("fila: ");
            fila=sc.nextInt();
            System.out.print("Columna: ");
            columna=sc.nextInt();
            tablero[fila][columna]=1;
            movimiento[0][1]=fila;
            movimiento[1][1]=columna;
            jugada=1;
            while(jugada<64){
                for(op=1;op<=9;op++){
                    switch(op){
                        case 1: i=fila-2;
                            j=columna+1;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 2: i=fila-1;
                            j=columna+2;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 3: i=fila+1;
                            j=columna+2;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 4: i=fila+2;
                            j=columna+1;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 5: i=fila+2;
                            j=columna-1;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 6: i=fila+1;
                            j=columna-2;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 7: i=fila-1;
                            j=columna-2;
                            if(i>=0&&i<8&&j>=0&&j<8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 8: i=fila-2;
                            j=columna-1;
                            if(i  >= 0 && i < 8 && j >=0 && j < 8&&tablero[i][j]==0)
                            {
                                fila=i;
                                columna=j;
                                movimiento[2][jugada]=op;
                                jugada++;
                                tablero[fila][columna]=jugada;
                                movimiento[0][jugada]=fila;
                                movimiento[1][jugada]=columna;
                                op=9;
                            }
                            break;
                        case 9: tablero[fila][columna]=0;
                            jugada--;
                            fila=movimiento[0][jugada];
                            columna=movimiento[1][jugada];
                            op=movimiento[2][jugada];
                            //System.out.println("Fin del juego");
                            System.out.println("jugada "+jugada+" opción "+op);
                            break;


                    }//fin switch
                }//fin for
            }//while
            for(int k=0;k<8;k++)
            {
                for(int l=0;l<8;l++)
                    System.out.print("\t"+tablero[k][l]);
                System.out.println(" ");
                System.out.println(" ");
            }
            for(int k=0;k<3;k++)
            {
                for(int l=0;l<65;l++)
                    System.out.print("\t\t"+movimiento[k][l]);
                System.out.println(" ");
                System.out.println(" ");
                    }
            }
    }
}