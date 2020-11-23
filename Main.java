import java.util.Scanner;

/*
Fernandez Santillan Daniel
Fragoso Aguilar Mauricio
Quezada Lopez Quetzalli Abigail
Velazquez Gallegos Erick Jovany
*/

class Main extends Matriz{
  public Main (int a , int b){
    super(a,b);
  }


  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombres[] = {"Fernandez Santillan Daniel","Fragoso Aguilar Mauricio","Quezada Lopez Quetzalli Abigail","Velazquez Gallegos Erick Jovany"};
    for(int i=0 ; i< 4;i++){
      System.out.println("--------------------------");
      System.out.println(nombres[i]);
    }
    System.out.println("--------------------------\n\n\n\n\n");

    
    /*System.out.println("Fernandez Santillan Daniel\nFragoso Aguilar Mauricio\nQuezada Lopez Quetzalli Abigail\nVelazquez Gallegos Erick Jovany");*/
    
    /*for(int i=0; i<4; i++){
      switch(i){
        case 0:
          System.out.println("Fernandez Santillan Daniel");
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
          break;
        case 1:
          System.out.println("Fragoso Aguilar Mauricio");
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
          break;
        case 2:
          System.out.println("Quezada Lopez Quetzalli Abigail");
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
          break;
        case 3:
          System.out.println("Velazquez Gallegos Erick Jovany");
          System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>\n\n\n\n\n");
          break;
      }
    }*/
    
		System.out.println("Tamaño de la matriz: ");
    System.out.println("Ingrese numero de filas:");
		int x=leer.nextInt();
    System.out.println("Ingrese numero de columnas:");
    int y=leer.nextInt();
		 Matriz mat = new Matriz(x,y);//crea objeto
		 mat.setMatriz(rellenarMatrices(mat, mat.getNumFilas(),mat.getNumColumnas()));  
     leer.close();
     System.out.println(mat);  
    
  }


   public static int [][] rellenarMatrices(Matriz matriz, int filas, int columnas) {
			Scanner leer = new Scanner(System.in);

			int[][] m = new int[filas][columnas];
			for(int i=0; i<matriz.getNumFilas(); i++) {
				for(int j=0; j<matriz.getNumColumnas(); j++) {
					i++;
          j++;
          System.out.print(j+","+i+": ");
          i--;
          j--;
					m[i][j]=leer.nextInt();
				}
			}
			leer.close();
			return m;
		}
}