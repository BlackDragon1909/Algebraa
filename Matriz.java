public class Matriz {
	private static int [][]matriz;
	private static int fila;
	private static int columna;	
	
	public Matriz(int a, int b) {//constructor
		matriz= new int [a][b];
		fila=b;
		columna=a;
	}

	public String toString() {
		String texto="\n";
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                texto+="\t "+(double)Math.round(1000*matriz[i][j])/1000;
            }
            texto+="\n";
        }
        texto+="\n";
        return texto;
	}
  public void setMatriz(int[][] matriz) {
		Matriz.matriz = matriz;
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	public int getNumFilas() {
		return fila;
	}
	
	public int getNumColumnas() {
		return columna;
	}

}  