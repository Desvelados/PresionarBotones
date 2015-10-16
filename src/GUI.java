import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class GUI implements KeyListener {

	private JFrame ventana;
	private JButton boton,boton2;
	private JRadioButton arrancar,frenar;
	private ButtonGroup uno;
	private Presionar pepe=new Presionar();
	private int i;
	private ImageIcon imagen= new ImageIcon(getClass().getResource("Imagen/pokebola.jpg"));
	private JLabel firma,tit;
	private TextField campo,repeticion;
	
	
	public GUI(){
		
		ventana=new JFrame("POKEMON DD");
		ventana.setBounds(550,200,450,260);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setContentPane(new JLabel(imagen));
		ventana.setLayout(null);
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Imagen/Poke2.png"));
		ventana.setIconImage(icon);
		
		tit=new JLabel("Repeticiones");
		tit.setBounds(260, 10, 100, 30);
		
		campo=new TextField(10);
		campo.setBounds(250, 40, 100, 25);
		campo.setText("1");
		
		repeticion=new TextField(10);
		repeticion.setBounds(330, 180, 100, 25);
		repeticion.setEditable(false);
		
		
		arrancar=new JRadioButton("Arrancar",true);
		arrancar.setBounds(50,0,100,100);
		arrancar.setBackground(new Color(255,52,55));
		arrancar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				i=0;
				int tope=Integer.parseInt(campo.getText());
				while(i<tope){
					pepe.metodo();
					tope=Integer.parseInt(campo.getText());
					repeticion.setText(""+i++);
					ventana.revalidate();
					ventana.repaint();
					if(i++ == tope){
						break;
					}
					else{
						i++;
					}
				}
			}});
		
		
		frenar=new JRadioButton("Frenar",false);
		frenar.setBounds(160,0,100,100);
		frenar.setBackground(new Color(255,52,55));
		frenar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				i=100;
			}});
		
		
		uno=new ButtonGroup();
		
		uno.add(arrancar);
		uno.add(frenar);
		
		firma=new JLabel(new ImageIcon(getClass().getResource("Imagen/DD.png")));
		firma.setBounds(-25, 110, 150, 150);
		
		/*boton=new JButton("Arranca");
		boton.setBounds(0, 0, 100, 100);
		boton.setBackground(Color.orange);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
					boolean x=true;
					pepe.metodo();
				}});
		
		boton2=new JButton("Para");
		boton2.setBounds(150, 0, 100, 100);
		boton2.setBackground(Color.orange);
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
					boolean x=false;
					pepe.metodo();
				}});
		ventana.add(boton);
		ventana.add(boton2);*/
		arrancar.addKeyListener(this);
		frenar.addKeyListener(this);
		campo.addKeyListener(this);
		
		ventana.add(repeticion);
		ventana.add(tit);
		ventana.add(campo);
		ventana.add(arrancar);
		ventana.add(frenar);
		ventana.add(firma);
		ventana.setVisible(true);
	}
	
	public void keyPressed(KeyEvent e){
		int i=0;
		switch(e.getKeyCode()){
		case KeyEvent.VK_F1:
			int tope=Integer.parseInt(campo.getText());
			while(i<tope){
					pepe.metodo();
					i++;
					repeticion.setText(""+i);
					ventana.revalidate();
					ventana.repaint();
					System.out.println(""+i);
					/*try{
						Thread.sleep(100);
					}
					catch(Exception jose){}*/
			}
			break;
			
		case KeyEvent.VK_F2:
			arrancar.setSelected(false);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
