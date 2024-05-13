package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Region;
//import javafx.scene.paint.Color;

public class GraficController {
	Region arrSug[]=new Region[30];
	Region arrBox[]=new Region[30];
	private int conta=0;
	private int row=0;
	private int life=5;
	private String css="-fx-background-radius: 15;";
	private String risp[]= new String[5];
	private String array[]= new String[5];
    
	@FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Region Box1;
    @FXML
    private Region Box10;
    @FXML
    private Region Box11;
    @FXML
    private Region Box12;
    @FXML
    private Region Box13;
    @FXML
    private Region Box14;
    @FXML
    private Region Box15;
    @FXML
    private Region Box16;
    @FXML
    private Region Box17;
    @FXML
    private Region Box18;
    @FXML
    private Region Box19;
    @FXML
    private Region Box2;
    @FXML
    private Region Box20;
    @FXML
    private Region Box21;
    @FXML
    private Region Box22;
    @FXML
    private Region Box23;
    @FXML
    private Region Box24;
    @FXML
    private Region Box25;
    @FXML
    private Region Box3;
    @FXML
    private Region Box4;
    @FXML
    private Region Box5;
    @FXML
    private Region Box6;
    @FXML
    private Region Box7;
    @FXML
    private Region Box8;
    @FXML
    private Region Box9;
    @FXML
    private Button Color1;
    @FXML
    private Button Color2;
    @FXML
    private Button Color3;
    @FXML
    private Button Color4;
    @FXML
    private Button Color5;
    @FXML
    private AnchorPane Pane;
    @FXML
    private Button btn_canc;
    @FXML
    private Button btn_check;
    @FXML
    private Label lbl_vite;
    @FXML
    private Label lbl_win;
    @FXML
    private Region sug_box1;
    @FXML
    private Region sug_box10;
    @FXML
    private Region sug_box11;
    @FXML
    private Region sug_box12;
    @FXML
    private Region sug_box13;
    @FXML
    private Region sug_box14;
    @FXML
    private Region sug_box15;
    @FXML
    private Region sug_box16;
    @FXML
    private Region sug_box17;
    @FXML
    private Region sug_box18;
    @FXML
    private Region sug_box19;
    @FXML
    private Region sug_box2;
    @FXML
    private Region sug_box20;
    @FXML
    private Region sug_box21;
    @FXML
    private Region sug_box22;
    @FXML
    private Region sug_box23;
    @FXML
    private Region sug_box24;
    @FXML
    private Region sug_box25;
    @FXML
    private Region sug_box3;
    @FXML
    private Region sug_box4;
    @FXML
    private Region sug_box5;
    @FXML
    private Region sug_box6;
    @FXML
    private Region sug_box7;
    @FXML
    private Region sug_box8;
    @FXML
    private Region sug_box9;

    @FXML
    void addBlack(ActionEvent event) {
    	arrBox[conta+row].setStyle(css+"-fx-background-color: #000000");
    	risp[conta]="N";
    	if(conta<4)
    		this.conta++;
    }

    @FXML
    void addBlue(ActionEvent event) {
    	arrBox[conta+row].setStyle(css+"-fx-background-color: #0000ff");
    	risp[conta]="B";
    	if(conta<4)
    		this.conta++;
    }

    @FXML
    void addGreen(ActionEvent event) {
    	arrBox[conta+row].setStyle(css+"-fx-background-color: #22c722");
    	risp[conta]="G";
    	if(conta<4)
    		this.conta++;
    }

    @FXML
    void addRed(ActionEvent event) {
    	arrBox[conta+row].setStyle(css+"-fx-background-color: #ff0000");
    	risp[conta]="R";
    	if(conta<4)
    		this.conta++;
    }

    @FXML
    void addWhite(ActionEvent event) {
    	arrBox[conta+row].setStyle(css+"-fx-background-color: #ffffff");
    	risp[conta]="W";
    	if(conta<4)
    		this.conta++;
    }
    
    void hint() {
    	int r=0,g=0,b=0,n=0,w=0;
		for(int x=0;x<5;x++) {
			switch(this.array[x]) {
			case "R":
				r++;
				break;
			case "G":
				g++;
				break;
			case "B":
				b++;
				break;
			case "N":
				n++;
				break;
			case "W":
				w++;
				break;
			default:
				break;
			}
		}
		for(int x=0;x<5;x++) {
			if(!this.array[x].equals(this.risp[x])) {
				switch(this.risp[x]) {
				case "R":
					if(r>0) {
						hint_color(x,"/");
						r--;
					}
					else
						hint_color(x,"x");
					break;
				case "G":
					if(g>0) {
						hint_color(x,"/");
						g--;
					}
					else
						hint_color(x,"x");
					break;
				case "B":
					if(b>0) {
						hint_color(x,"/");
						b--;
					}
					else
						hint_color(x,"x");
					break;
				case "N":
					if(n>0) {
						hint_color(x,"/");
						n--;
					}
					else
						hint_color(x,"x");
					break;
				case "W":
					if(w>0) {
						hint_color(x,"/");
						w--;
					}
					else
						hint_color(x,"x");
					break;
				}
			}
			else {
				switch(this.array[x]) {
				case "R":
					r--;
					break;
				case "G":
					g--;
					break;
				case "B":
					b--;
					break;
				case "N":
					n--;
					break;
				case "W":
					w--;
					break;
				}
			}
		}
    }
    
    void hint_color(int index,String op){
    	switch(op) {
    	case "/":
    		arrSug[index+row].setStyle(css+"-fx-background-color: #fc9d28");
    		break;
	    case "x":
	    	arrSug[index+row].setStyle(css+"-fx-background-color: #6b1515");
			break;
	    case "v":
	    	arrSug[index+row].setStyle(css+"-fx-background-color: #7be37b");
			break;
    	}

    }
    
    @FXML
    void canc(ActionEvent event) {
    	if(conta>0&&conta<4)
    		conta--;
    	else if(conta>0&&arrBox[conta+row].getStyle()=="")
    		conta--;
    	arrBox[conta+row].setStyle(null);
    	risp[conta]=null;
    }

    @FXML
    void check(ActionEvent event) {
    	int bool=0;
    	if(risp[0]!=null&&risp[4]!=null) {
	    	for(int x=0;x<5;x++) {
				if(this.array[x].equals(this.risp[x])) {
					hint_color(x,"v");
					bool++;
				}
			}
	    	hint();
	    	row+=5;
	    	conta=0;
	    	risp[0]=null;
	    	risp[1]=null;
	    	risp[2]=null;
	    	risp[3]=null;
	    	risp[4]=null;
	    	if(bool==5) {
	    		win();
	    	}
	    	else
	    		life--;
	    		lbl_vite.setText("VITE: "+life);
    	}
    }
    
    void rand() {
    	int randomNum = (int)(Math.random() * 5);
		for(int x=0;x<5;x++) {
			randomNum = (int)(Math.random() * 5);
			switch(randomNum) {
			case 0:
				this.array[x]="R";
				break;
			case 1:
				this.array[x]="G";
				break;
			case 2:
				this.array[x]="B";
				break;
			case 3:
				this.array[x]="N";
				break;
			case 4:
				this.array[x]="W";
				break;
			}
		}
    }
    
    void win() {
    	Color1.setVisible(false);
    	Color2.setVisible(false);
    	Color3.setVisible(false);
    	Color4.setVisible(false);
    	Color5.setVisible(false);
    	btn_check.setVisible(false);
    	btn_canc.setVisible(false);
    	lbl_win.setVisible(true);
    }

    @FXML
    void initialize() {
    	 assert Box1 != null : "fx:id=\"Box1\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box10 != null : "fx:id=\"Box10\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box11 != null : "fx:id=\"Box11\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box12 != null : "fx:id=\"Box12\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box13 != null : "fx:id=\"Box13\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box14 != null : "fx:id=\"Box14\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box15 != null : "fx:id=\"Box15\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box16 != null : "fx:id=\"Box16\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box17 != null : "fx:id=\"Box17\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box18 != null : "fx:id=\"Box18\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box19 != null : "fx:id=\"Box19\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box2 != null : "fx:id=\"Box2\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box20 != null : "fx:id=\"Box20\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box21 != null : "fx:id=\"Box21\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box22 != null : "fx:id=\"Box22\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box23 != null : "fx:id=\"Box23\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box24 != null : "fx:id=\"Box24\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box25 != null : "fx:id=\"Box25\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box3 != null : "fx:id=\"Box3\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box4 != null : "fx:id=\"Box4\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box5 != null : "fx:id=\"Box5\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box6 != null : "fx:id=\"Box6\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box7 != null : "fx:id=\"Box7\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box8 != null : "fx:id=\"Box8\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Box9 != null : "fx:id=\"Box9\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Color1 != null : "fx:id=\"Color1\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Color2 != null : "fx:id=\"Color2\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Color3 != null : "fx:id=\"Color3\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Color4 != null : "fx:id=\"Color4\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Color5 != null : "fx:id=\"Color5\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert Pane != null : "fx:id=\"Pane\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert btn_canc != null : "fx:id=\"btn_canc\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert btn_check != null : "fx:id=\"btn_check\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert lbl_vite != null : "fx:id=\"lbl_vite\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert lbl_win != null : "fx:id=\"lbl_vite\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box1 != null : "fx:id=\"sug_box1\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box10 != null : "fx:id=\"sug_box10\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box11 != null : "fx:id=\"sug_box11\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box12 != null : "fx:id=\"sug_box12\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box13 != null : "fx:id=\"sug_box13\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box14 != null : "fx:id=\"sug_box14\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box15 != null : "fx:id=\"sug_box15\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box16 != null : "fx:id=\"sug_box16\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box17 != null : "fx:id=\"sug_box17\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box18 != null : "fx:id=\"sug_box18\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box19 != null : "fx:id=\"sug_box19\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box2 != null : "fx:id=\"sug_box2\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box20 != null : "fx:id=\"sug_box20\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box21 != null : "fx:id=\"sug_box21\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box22 != null : "fx:id=\"sug_box22\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box23 != null : "fx:id=\"sug_box23\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box24 != null : "fx:id=\"sug_box24\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box25 != null : "fx:id=\"sug_box25\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box3 != null : "fx:id=\"sug_box3\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box4 != null : "fx:id=\"sug_box4\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box5 != null : "fx:id=\"sug_box5\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box6 != null : "fx:id=\"sug_box6\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box7 != null : "fx:id=\"sug_box7\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box8 != null : "fx:id=\"sug_box8\" was not injected: check your FXML file 'Grafic.fxml'.";
         assert sug_box9 != null : "fx:id=\"sug_box9\" was not injected: check your FXML file 'Grafic.fxml'.";
        
        rand();
         
        arrSug[0]=sug_box1;
        arrSug[1]=sug_box2;
        arrSug[2]=sug_box3;
        arrSug[3]=sug_box4;
        arrSug[4]=sug_box5;
        arrSug[5]=sug_box6;
        arrSug[6]=sug_box7;
        arrSug[7]=sug_box8;
        arrSug[8]=sug_box9;
        arrSug[9]=sug_box10;
        arrSug[10]=sug_box11;
        arrSug[11]=sug_box12;
        arrSug[12]=sug_box13;
        arrSug[13]=sug_box14;
        arrSug[14]=sug_box15;
        arrSug[15]=sug_box16;
        arrSug[16]=sug_box17;
        arrSug[17]=sug_box18;
        arrSug[18]=sug_box19;
        arrSug[19]=sug_box20;
        arrSug[20]=sug_box21;
        arrSug[21]=sug_box22;
        arrSug[22]=sug_box23;
        arrSug[23]=sug_box24;
        arrSug[24]=sug_box25;
        
        arrBox[0]=Box1;
        arrBox[1]=Box2;
        arrBox[2]=Box3;
        arrBox[3]=Box4;
        arrBox[4]=Box5;
        arrBox[5]=Box6;
        arrBox[6]=Box7;
        arrBox[7]=Box8;
        arrBox[8]=Box9;
        arrBox[9]=Box10;
        arrBox[10]=Box11;
        arrBox[11]=Box12;
        arrBox[12]=Box13;
        arrBox[13]=Box14;
        arrBox[14]=Box15;
        arrBox[15]=Box16;
        arrBox[16]=Box17;
        arrBox[17]=Box18;
        arrBox[18]=Box19;
        arrBox[19]=Box20;
        arrBox[20]=Box21;
        arrBox[21]=Box22;
        arrBox[22]=Box23;
        arrBox[23]=Box24;
        arrBox[24]=Box25;
    }
}  
