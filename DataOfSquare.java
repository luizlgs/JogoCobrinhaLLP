import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	
	//ArrayList que determinara a cor dos objetos
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: cobra , 1: comida, 0: sem nada
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Lets add the color to the arrayList
		C.add(Color.green);//0
		C.add(Color.red);    //1
		C.add(Color.black);   //2
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
