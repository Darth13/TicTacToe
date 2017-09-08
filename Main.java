package kolkoikrzyzyk;

import java.awt.Color;





public class Main {
	public static boolean turagracza1 = true;
	public static boolean wygralgracz1 = false;
	public static boolean wygralgracz2 = false;
	
	
	
	public static kolkoikrzyzyk okno = new kolkoikrzyzyk();
	
	public static void main(String[] args){
		if(okno.isVisible()==false){
			okno.setVisible(true);
			okno.button11.setEnabled(false);
			okno.button12.setEnabled(false);
			okno.button13.setEnabled(false);
			okno.button14.setEnabled(false);
			okno.button1.setBackground(Color.white);
			okno.button2.setBackground(Color.white);
			okno.button3.setBackground(Color.white);
			okno.button4.setBackground(Color.white);
			okno.button5.setBackground(Color.white);
			okno.button6.setBackground(Color.white);
			okno.button7.setBackground(Color.white);
			okno.button8.setBackground(Color.white);
			okno.button9.setBackground(Color.white);
			okno.button12.setText("tura: X");
		}
		
	}
	public static void nowagra(){
		okno.setVisible(false);
		okno.button1.setBackground(Color.white);
		okno.button2.setBackground(Color.white);
		okno.button3.setBackground(Color.white);
		okno.button4.setBackground(Color.white);
		okno.button5.setBackground(Color.white);
		okno.button6.setBackground(Color.white);
		okno.button7.setBackground(Color.white);
		okno.button8.setBackground(Color.white);
		okno.button9.setBackground(Color.white);
		okno.button12.setText("tura: X");
		okno.button1.setEnabled(true);
    	okno.button2.setEnabled(true);
    	okno.button3.setEnabled(true);
    	okno.button4.setEnabled(true);
    	okno.button5.setEnabled(true);
    	okno.button6.setEnabled(true);
    	okno.button7.setEnabled(true);
    	okno.button8.setEnabled(true);
    	okno.button9.setEnabled(true);
    	okno.licznik=0;
    	
    	
    	
    	okno.button1.setText("");
    	okno.button2.setText("");
    	okno.button3.setText("");
    	okno.button4.setText("");
    	okno.button5.setText("");
    	okno.button6.setText("");
    	okno.button7.setText("");
    	okno.button8.setText("");
    	okno.button9.setText("");
    	okno.button11.setText("");
    	turagracza1=true;
    	wygralgracz1=false;
    	wygralgracz2=false;
    	okno.setVisible(true);
	}
	
	public static void sprawdzktowygral(){
		
		if(okno.button1.getText().equals("X")){
			if(okno.button2.getText().equals("X")){
				if(okno.button3.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button1.setBackground(Color.GREEN);
					okno.button2.setBackground(Color.GREEN);
					okno.button3.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button4.getText().equals("X")){
			if(okno.button5.getText().equals("X")){
				if(okno.button6.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button4.setBackground(Color.GREEN);
					okno.button5.setBackground(Color.GREEN);
					okno.button6.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button7.getText().equals("X")){
			if(okno.button8.getText().equals("X")){
				if(okno.button9.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button7.setBackground(Color.GREEN);
					okno.button8.setBackground(Color.GREEN);
					okno.button9.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button1.getText().equals("X")){
			if(okno.button4.getText().equals("X")){
				if(okno.button7.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button1.setBackground(Color.GREEN);
					okno.button4.setBackground(Color.GREEN);
					okno.button7.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button2.getText().equals("X")){
			if(okno.button5.getText().equals("X")){
				if(okno.button8.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button2.setBackground(Color.GREEN);
					okno.button5.setBackground(Color.GREEN);
					okno.button8.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button3.getText().equals("X")){
			if(okno.button6.getText().equals("X")){
				if(okno.button9.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button3.setBackground(Color.GREEN);
					okno.button6.setBackground(Color.GREEN);
					okno.button9.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button1.getText().equals("X")){
			if(okno.button5.getText().equals("X")){
				if(okno.button9.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button1.setBackground(Color.GREEN);
					okno.button5.setBackground(Color.GREEN);
					okno.button9.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button7.getText().equals("X")){
			if(okno.button5.getText().equals("X")){
				if(okno.button3.getText().equals("X")){
					wygralgracz1= true;
					wygralgracz2=false;
					okno.button11.setText("Wygra³ gracz 1! (X)");
					okno.button7.setBackground(Color.GREEN);
					okno.button5.setBackground(Color.GREEN);
					okno.button3.setBackground(Color.GREEN);
					okno.krzyzyk++;
				}
			}
		}
		if(okno.button1.getText().equals("O")){
			if(okno.button2.getText().equals("O")){
				if(okno.button3.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button1.setBackground(Color.YELLOW);
					okno.button2.setBackground(Color.YELLOW);
					okno.button3.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button4.getText().equals("O")){
			if(okno.button5.getText().equals("O")){
				if(okno.button6.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button4.setBackground(Color.YELLOW);
					okno.button5.setBackground(Color.YELLOW);
					okno.button6.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button7.getText().equals("O")){
			if(okno.button8.getText().equals("O")){
				if(okno.button9.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button7.setBackground(Color.YELLOW);
					okno.button8.setBackground(Color.YELLOW);
					okno.button9.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button1.getText().equals("O")){
			if(okno.button4.getText().equals("O")){
				if(okno.button7.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button1.setBackground(Color.YELLOW);
					okno.button4.setBackground(Color.YELLOW);
					okno.button7.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button2.getText().equals("O")){
			if(okno.button5.getText().equals("O")){
				if(okno.button8.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button2.setBackground(Color.YELLOW);
					okno.button5.setBackground(Color.YELLOW);
					okno.button8.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button3.getText().equals("O")){
			if(okno.button6.getText().equals("O")){
				if(okno.button9.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button3.setBackground(Color.YELLOW);
					okno.button6.setBackground(Color.YELLOW);
					okno.button9.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button1.getText().equals("O")){
			if(okno.button5.getText().equals("O")){
				if(okno.button9.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button1.setBackground(Color.YELLOW);
					okno.button5.setBackground(Color.YELLOW);
					okno.button9.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		if(okno.button7.getText().equals("O")){
			if(okno.button5.getText().equals("O")){
				if(okno.button3.getText().equals("O")){
					wygralgracz1= false;
					wygralgracz2=true;
					okno.button11.setText("Wygra³ gracz 2! (O)");
					okno.button7.setBackground(Color.YELLOW);
					okno.button5.setBackground(Color.YELLOW);
					okno.button3.setBackground(Color.YELLOW);
					okno.kolko++;
				}
			}
		}
		
		if(wygralgracz1==true || wygralgracz2==true){
		okno.button1.setEnabled(false);
    	okno.button2.setEnabled(false);
    	okno.button3.setEnabled(false);
    	okno.button4.setEnabled(false);
    	okno.button5.setEnabled(false);
    	okno.button6.setEnabled(false);
    	okno.button7.setEnabled(false);
    	okno.button8.setEnabled(false);
    	okno.button9.setEnabled(false);
    	okno.button12.setText("");
    	okno.button13.setText("X: "+okno.krzyzyk);
    	okno.button14.setText("O: "+okno.kolko);
    	}else if(okno.licznik==9 && wygralgracz1==false && wygralgracz2==false){
			okno.button11.setText("Remis!");
			okno.button12.setText("");
			okno.button1.setEnabled(false);
	    	okno.button2.setEnabled(false);
	    	okno.button3.setEnabled(false);
	    	okno.button4.setEnabled(false);
	    	okno.button5.setEnabled(false);
	    	okno.button6.setEnabled(false);
	    	okno.button7.setEnabled(false);
	    	okno.button8.setEnabled(false);
	    	okno.button9.setEnabled(false);
			}
		
			}
		}
	
	


