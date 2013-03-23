import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

public class Tablero extends Ventana implements Runnable{
	
	 ImageIcon img1;
	 ImageIcon img2;
	 ImageIcon img3;
	 ImageIcon img4;
	 ImageIcon img5;
	 ImageIcon img6;
	 ImageIcon img7;
	 ImageIcon img8;
	 ImageIcon img9;
	 ImageIcon img10;
	 ImageIcon img11;
	 ImageIcon img12;
	 ImageIcon img13;
	 ImageIcon img14;
	 ImageIcon img15;
	 ImageIcon img16;
	 ImageIcon img17;
	 ImageIcon img18;
	 
	 
	 JButton btn1;
	 JButton btn2;
	 JButton btn3;
	 JButton btn4;
	 JButton btn5;
	 JButton btn6;
	 JButton btn7;
	 JButton btn8;
	 JButton btn9;
	 JButton btn10;
	 JButton btn11;
	 JButton btn12;
	 JButton btn13;
	 JButton btn14;
	 JButton btn15;
	 JButton btn16;
	 JButton btn17;
	 JButton btn18;
	 JButton btn19;
	 JButton btn20;
	 JButton btn21;
	 JButton btn22;
	 JButton btn23;
	 JButton btn24;
	 JButton btn25;
	 JButton btn26;
	 JButton btn27;
	 JButton btn28;
	 JButton btn29;
	 JButton btn30;
	 JButton btn31;
	 JButton btn32;
	 JButton btn33;
	 JButton btn34;
	 JButton btn35;
	 JButton btn36;
	 
	 JButton carta1,carta2;
	 
	 JButton btnFacil;
	 JButton btnMedio;
	 JButton btnAvanzado;
	 
	 JLabel lblReloj;
	 Thread crono;
	 
	 private Icon fondo;
		private JLabel imagen;
	 
	 int  contador=0;
	 
	 boolean voltear=false;
	 
	public Tablero(){
		this.setLayout(null);

		/*fondo=new ImageIcon("img/dulces.jpeg");
		imagen=new JLabel(fondo);
		imagen.setBounds(0, 0, 800, 900);
		this.add(imagen);*/
				
				btn1=new  JButton();
				img1=new ImageIcon("img/portada.jpg");		
				btn1.setBounds(50,50,100,100);
				btn1.setIcon(img1);
				this.add(btn1);
				//btn.addMouseListener(this);
				btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img1=new ImageIcon("img/qeqe1.jpg");
						btn1.setIcon(img1);
						comparar(btn1);
					}
				});
				;
				
				btn2=new  JButton();
				img2=new ImageIcon("img/portada.jpg");		
				btn2.setBounds(160,50,100,100);
				btn2.setIcon(img2);
				this.add(btn2);
				//btn.addMouseListener(this);
				btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img2=new ImageIcon("img/qeqe4.jpg");
						btn2.setIcon(img2);
						comparar(btn2);
						
					}
				});
			
				btn3=new  JButton();
				img3=new ImageIcon("img/portada.jpg");		
				btn3.setBounds(270,50,100,100);
				btn3.setIcon(img3);
				this.add(btn3);
				//btn.addMouseListener(this);
				btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						img3=new ImageIcon("img/qeqe2.jpg");
						btn3.setIcon(img3);
						comparar(btn3);
					}
				});
				
				
				btn4=new  JButton();
				img4=new ImageIcon("img/portada.jpg");		
				btn4.setBounds(380,50,100,100);
				btn4.setIcon(img4);
				this.add(btn4);
				//btn.addMouseListener(this);
				btn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img4=new ImageIcon("img/qeqe5.jpg");
						btn4.setIcon(img4);
						comparar(btn4);
					}
				});
				
				
				btn5=new  JButton();
				img5=new ImageIcon("img/portada.jpg");		
				btn5.setBounds(490,50,100,100);
				btn5.setIcon(img5);
				this.add(btn5);
				//btn.addMouseListener(this);
				btn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img5=new ImageIcon("img/qeqe3.jpg");
						btn5.setIcon(img5);
						comparar(btn5);
					}
				});
				

				btn6=new  JButton();
				img6=new ImageIcon("img/portada.jpg");		
				btn6.setBounds(600,50,100,100);
				btn6.setIcon(img6);
				this.add(btn6);
				//btn.addMouseListener(this);
				btn6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img6=new ImageIcon("img/qeqe6.jpg");
						btn6.setIcon(img6);
						comparar(btn6);
					}
				});
				
				
				btn7=new  JButton();
				img7=new ImageIcon("img/portada.jpg");		
				btn7.setBounds(160,160,100,100);
				btn7.setIcon(img7);
				this.add(btn7);
				//btn.addMouseListener(this);
				btn7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img7=new ImageIcon("img/qeqe3.JPG");
						btn7.setIcon(img7);
						comparar(btn7);
					}
				});
				
				
				btn8=new  JButton();
				img8=new ImageIcon("img/portada.jpg");		
				btn8.setBounds(160,270,100,100);
				btn8.setIcon(img8);
				this.add(btn8);
				//btn.addMouseListener(this);
				btn8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img8=new ImageIcon("img/qeqe1.jpg");
						btn8.setIcon(img8);
						comparar(btn8);
					}
				});
				
				
				btn9=new  JButton();
				img9=new ImageIcon("img/portada.jpg");		
				btn9.setBounds(50,160,100,100);
				btn9.setIcon(img9);
				this.add(btn9);
				//btn.addMouseListener(this);
				btn9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img9=new ImageIcon("img/qeqe4.jpg");
						btn9.setIcon(img9);
						comparar(btn9);
					}
				});
				
				
				
				btn10=new  JButton();
				img10=new ImageIcon("img/portada.jpg");		
				btn10.setBounds(50,270,100,100);
				btn10.setIcon(img10);
				this.add(btn10);
				//btn.addMouseListener(this);
				btn10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img10=new ImageIcon("img/qeqe5.jpg");
						btn10.setIcon(img10);
						comparar(btn10);
					}
				});
				
				
				btn11=new  JButton();
				img11=new ImageIcon("img/portada.jpg");		
				btn11.setBounds(380,160,100,100);
				btn11.setIcon(img11);
				this.add(btn11);
				//btn.addMouseListener(this);
				btn11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img11=new ImageIcon("img/qeqe2.jpg");
						btn11.setIcon(img11);
						comparar(btn11);
					}
				});
				btn12=new  JButton();
				img12=new ImageIcon("img/portada.jpg");		
				btn12.setBounds(270,160,100,100);
				btn12.setIcon(img12);
				this.add(btn12);
				//btn.addMouseListener(this);
				btn12.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img12=new ImageIcon("img/qeqe6.jpg");
						btn12.setIcon(img12);
						comparar(btn12);
					}
				});
				
				btn13=new  JButton();
				img13=new ImageIcon("img/portada.jpg");		
				btn13.setBounds(490,160,100,100);
				btn13.setIcon(img13);
				this.add(btn13);
				//btn.addMouseListener(this);
				btn13.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img13=new ImageIcon("img/qeqe3.jpg");
						btn13.setIcon(img13);
						comparar(btn13);
					}
				});

				btn14=new  JButton();
				img14=new ImageIcon("img/portada.jpg");		
				btn14.setBounds(270,270,100,100);
				btn14.setIcon(img14);
				this.add(btn14);
				//btn.addMouseListener(this);
				btn14.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img14=new ImageIcon("img/qeqe2.jpg");
						btn14.setIcon(img14);
						comparar(btn14);
					}
				});
				
				btn15=new  JButton();
				img15=new ImageIcon("img/portada.jpg");		
				btn15.setBounds(380,270,100,100);
				btn15.setIcon(img15);
				this.add(btn15);
				//btn.addMouseListener(this);
				btn15.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img15=new ImageIcon("img/qeqe4.jpg");
						btn15.setIcon(img15);
						comparar(btn15);
					}
				});
				
				btn16=new  JButton();
				img16=new ImageIcon("img/portada.jpg");		
				btn16.setBounds(600,160,100,100);
				btn16.setIcon(img16);
				this.add(btn16);
				//btn.addMouseListener(this);
				btn16.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img16=new ImageIcon("img/qeqe6.jpg");
						btn16.setIcon(img16);
						comparar(btn16);
					}
				});
			
					
					
				btn17=new  JButton();
				img16=new ImageIcon("img/portada.jpg");		
				btn17.setBounds(490,270,100,100);
				btn17.setIcon(img16);
				this.add(btn17);
				//btn.addMouseListener(this);
				btn17.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img16=new ImageIcon("img/qeqe1.jpg");
						btn17.setIcon(img16);
						comparar(btn17);
					}
				});
				

				btn18=new  JButton();
				img15=new ImageIcon("img/portada.jpg");		
				btn18.setBounds(600,270,100,100);
				btn18.setIcon(img15);
				this.add(btn18);
				//btn.addMouseListener(this);
				btn18.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img15=new ImageIcon("img/qeqe5.jpg");
						btn18.setIcon(img15);
						comparar(btn18);
					}
				});


				btn19=new  JButton();
				img14=new ImageIcon("img/portada.jpg");		
				btn19.setBounds(50,380,100,100);
				btn19.setIcon(img14);
				this.add(btn19);
				//btn.addMouseListener(this);
				btn19.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img14=new ImageIcon("img/qeqe2.jpg");
						btn19.setIcon(img14);
						comparar(btn19);
					}
				});


				btn20=new  JButton();
				img13=new ImageIcon("img/portada.jpg");		
				btn20.setBounds(160,380,100,100);
				btn20.setIcon(img13);
				this.add(btn20);
				//btn.addMouseListener(this);
				btn20.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img13=new ImageIcon("img/qeqe1.jpg");
						btn20.setIcon(img13);
						comparar(btn20);
					}
				});
				
				
				btn21=new  JButton();
				img12=new ImageIcon("img/portada.jpg");		
				btn21.setBounds(270,380,100,100);
				btn21.setIcon(img12);
				this.add(btn21);
				//btn.addMouseListener(this);
				btn21.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img12=new ImageIcon("img/qeqe4.jpg");
						btn21.setIcon(img12);
						comparar(btn21);
					}
				});
				
				btn22=new  JButton();
				img11=new ImageIcon("img/portada.jpg");		
				btn22.setBounds(380,380,100,100);
				btn22.setIcon(img11);
				this.add(btn22);
				//btn.addMouseListener(this);
				btn22.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img11=new ImageIcon("img/qeqe6.jpg");
						btn22.setIcon(img11);
						comparar(btn22);
					}
				});
				
				btn23=new  JButton();
				img10=new ImageIcon("img/portada.jpg");		
				btn23.setBounds(490,380,100,100);
				btn23.setIcon(img10);
				this.add(btn23);
				//btn.addMouseListener(this);
				btn23.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img10=new ImageIcon("img/qeqe5.jpg");
						btn23.setIcon(img10);
						comparar(btn23);
					}
				});
				
				btn24=new  JButton();
				img9=new ImageIcon("img/portada.jpg");		
				btn24.setBounds(600,380,100,100);
				btn24.setIcon(img9);
				this.add(btn24);
				//btn.addMouseListener(this);
				btn24.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img9=new ImageIcon("img/qeqe3.jpg");
						btn24.setIcon(img9);
						comparar(btn24);
					}
				});
				
				btn25=new  JButton();
				img8=new ImageIcon("img/portada.jpg");		
				btn25.setBounds(50,490,100,100);
				btn25.setIcon(img8);
				this.add(btn25);
				//btn.addMouseListener(this);
				btn25.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img8=new ImageIcon("img/qeqe4.jpg");
						btn25.setIcon(img8);
						comparar(btn25);
					}
				});
				
				

				btn26=new  JButton();
				img7=new ImageIcon("img/portada.jpg");		
				btn26.setBounds(160,490,100,100);
				btn26.setIcon(img7);
				this.add(btn26);
				//btn.addMouseListener(this);
				btn26.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img7=new ImageIcon("img/qeqe6.jpg");
						btn26.setIcon(img7);
						comparar(btn26);
					}
				});
				
				btn27=new  JButton();
				img6=new ImageIcon("img/portada.jpg");		
				btn27.setBounds(270,490,100,100);
				btn27.setIcon(img6);
				this.add(btn27);
				//btn.addMouseListener(this);
				btn27.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img6=new ImageIcon("img/qeqe1.jpg");
						btn27.setIcon(img6);
						comparar(btn27);
					}
				});
				
				btn28=new  JButton();
				img5=new ImageIcon("img/portada.jpg");		
				btn28.setBounds(380,490,100,100);
				btn28.setIcon(img5);
				this.add(btn28);
				//btn.addMouseListener(this);
				btn28.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img5=new ImageIcon("img/qeqe2.jpg");
						btn28.setIcon(img5);
						comparar(btn28);
					}
				});
				
				btn29=new  JButton();
				img4=new ImageIcon("img/portada.jpg");		
				btn29.setBounds(490,490,100,100);
				btn29.setIcon(img4);
				this.add(btn29);
				//btn.addMouseListener(this);
				btn29.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img4=new ImageIcon("img/qeqe3.jpg");
						btn29.setIcon(img4);
						comparar(btn29);
					}
				});
				
				btn30=new  JButton();
				img3=new ImageIcon("img/portada.jpg");		
				btn30.setBounds(600,490,100,100);
				btn30.setIcon(img3);
				this.add(btn30);
				//btn.addMouseListener(this);
				btn30.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img3=new ImageIcon("img/qeqe5.jpg");
						btn30.setIcon(img3);
						comparar(btn30);
					}
				});
				
				btn31=new  JButton();
				img2=new ImageIcon("img/portada.jpg");		
				btn31.setBounds(50,600,100,100);
				btn31.setIcon(img2);
				this.add(btn31);
				//btn.addMouseListener(this);
				btn31.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img2=new ImageIcon("img/qeqe2.jpg");
						btn31.setIcon(img2);
						comparar(btn31);
					}
				});

				btn32=new  JButton();
				img1=new ImageIcon("img/portada.jpg");		
				btn32.setBounds(160,600,100,100);
				btn32.setIcon(img1);
				this.add(btn32);
				//btn.addMouseListener(this);
				btn32.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img1=new ImageIcon("img/qeqe5.jpg");
						btn32.setIcon(img1);
						comparar(btn32);
					}
				});

				btn33=new  JButton();
				img17=new ImageIcon("img/portada.jpg");		
				btn33.setBounds(270,600,100,100);
				btn33.setIcon(img17);
				this.add(btn33);
				//btn.addMouseListener(this);
				btn33.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img17=new ImageIcon("img/qeqe3.jpg");
						btn33.setIcon(img17);
						comparar(btn33);
					}
				});
				
				btn34=new  JButton();
				img18=new ImageIcon("img/portada.jpg");		
				btn34.setBounds(380,600,100,100);
				btn34.setIcon(img18);
				this.add(btn34);
				//btn.addMouseListener(this);
				btn34.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img18=new ImageIcon("img/qeqe4.jpg");
						btn34.setIcon(img18);
						comparar(btn34);
					}
				});
				btn35=new  JButton();
				img17=new ImageIcon("img/portada.jpg");		
				btn35.setBounds(490,600,100,100);
				btn35.setIcon(img17);
				this.add(btn35);
				//btn.addMouseListener(this);
				btn35.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img17=new ImageIcon("img/qeqe1.jpg");
						btn35.setIcon(img17);
						comparar(btn35);
					}
				});

				btn36=new  JButton();
				img18=new ImageIcon("img/portada.jpg");		
				btn36.setBounds(600,600,100,100);
				btn36.setIcon(img18);
				this.add(btn36);
				//btn.addMouseListener(this);
				btn36.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						img18=new ImageIcon("img/qeqe6.jpg");
						btn36.setIcon(img18);
						comparar(btn36);
					}
				});
				
			
			
		
		
		
		
		this.lblReloj=new JLabel("Hola");
		this.lblReloj.setBounds(750,250,100,100);
		this.add(lblReloj);
		crono=new Thread(this);
		crono.start();

	   
		
		}
	
	public void comparar(JButton carta){
		
		if(contador==0)
		{
			carta1=carta;
			contador++;
		}
		else
		{
			if(carta1!=carta)
			{
				carta2=carta;
			
				if(carta1.getIcon().toString().equals(carta2.getIcon().toString()))
				{
					carta1.setEnabled(false);
					carta2.setEnabled(false);
					
					contador=0;
				}
				else
				{
					voltear=true;
				}
			}
			
		}
	}
	
	

	int minutos=0,segundo=0,horas=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(;;){
				
				if(segundo==59){segundo=0;minutos++;}
				if(minutos==59){minutos=0;horas++;}
				segundo++;
				this.lblReloj.setText(horas+":"+minutos+":"+segundo);
				crono.sleep(1000);
				if(voltear){
					crono.sleep(1000);
					img1=new ImageIcon("img/portada.jpg");
					carta1.setIcon(img1);
					carta2.setIcon(img1);
					contador=0;
					Tablero.this.repaint();
					voltear=false;
				}
			}
			
			}catch(InterruptedException e){
				System.out.println();
			}
		
	}
	

	
}
