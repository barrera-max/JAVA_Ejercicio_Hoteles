import java.util.Arrays;

public class Matriz {
    private int m[][];

    public Matriz(int filas, int columnas) {
        if (filas <= 0) filas = 10;
        if (columnas <= 0) columnas = 10;
        m = new int[filas][columnas];
    }


    public void generate()
    {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j ++) {
                m[i][j] = (int) Math.round(100* Math.random());
            }
        }
    }
    public int buscarMenorEnFila(int fila){
        int menor = m[fila][0];
        for(int j = 1; j< m[fila].length; j++) {
            if(m[fila][j] < menor) {
                menor = m[fila][j];}
        }
        return menor;}

    public String toString() {
        StringBuilder stb = new StringBuilder("");
        for(int i = 0; i < m.length; i ++) {
            stb.append("\n\t");
            for(int j= 0; j < m[i].length; j++) {
                stb.append(" " + "\t\t");
                stb.append(m[i][j]);
            }
        }
        return stb.toString();}
        public float promediarColumna(int col) {
            int suma = 0;
            for(int i=0; i< m.length; i++){
                suma += m[i][col];
            }
            return (float) suma /m.length;
        }
}
