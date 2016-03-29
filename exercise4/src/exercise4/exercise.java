package exercise4;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class exercise extends Application{
	public static void main(String []args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		String s1="12";
		String s3="13";
		primaryStage.setTitle("enter page");
		Label username1 = new Label("Username");
		Label ps2 = new Label("Password");
		TextField username = new TextField();
		TextField ps = new TextField();
		
		Button sublitBtn = new Button("sign in");
		sublitBtn.setOnAction(new EventHandler<ActionEvent>(){
			
			String s2="";
			
			String s4="";

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				s2 = username.getText();
				s4 = ps.getText();
				int i=0;
				boolean chack=(s1.equals(s2)&&s3.equals(s4));
				while(!chack && i<3){
					i++;
					JOptionPane.showMessageDialog(null,"wrong username or password please enter again");
					
					s2 = username.getText();
					s4 = ps.getText();
					
					
				}
					if(i<3){
						String [] sn={"student","teacher","worker"};
					JOptionPane.showInputDialog(null,"please choose your type","sn",JOptionPane.PLAIN_MESSAGE,null,sn,sn[2]);
					}else{
						JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!");
					}
				}
			
			
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		
		
		grid.add(username,1,0);
		grid.add(ps,1,1);
		grid.add(username1,0,0);
		grid.add(ps2,0,1);
		grid.add(sublitBtn,1,2);
		
		Scene scene = new Scene(grid,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}