import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

// Classe Quadrado
// subclasse de Figura
public class Quadrado extends Figura {

	@Override
	public void Desenha(Graphics2D g2d) {
		
		// Operacoes nas Coordenadas do quadrado
		int AcimaX = Math.min(getX1(), getX2());
		int AcimaY = Math.min(getY1(), getY2());
		
		int Largura = Math.abs( getX1() - getX2() );
				
		if (isFill() == true){
			
			// Desenha COM preenchimento
			g2d.setPaint(getCor());
			g2d.fill( new Rectangle2D.Double(AcimaX, AcimaY, Largura, Largura));
						
		}else{
			
			// Desenha SEM preenchimento
			g2d.setPaint(getCor());
			// Espessura do Quadrado
			g2d.setStroke( new BasicStroke(getEspessura()));
			g2d.draw( new Rectangle2D.Double(AcimaX, AcimaY, Largura, Largura));
		}
	}

	// Construtor sem parametro
	public Quadrado(){
		
		this( 0, 0, 0, 0, Color.BLACK, false, 0.0f);
	}

	// Construtor Com Parametros
	public Quadrado(int NewX1, int NewX2, int NewY1, int NewY2, Color NewColor, boolean NewFill, float NewEspessura){
		
		// invoca Construtor de Figura
		super(NewX1, NewX2, NewY1,NewY2, NewColor, NewFill, NewEspessura);	
	}
}
