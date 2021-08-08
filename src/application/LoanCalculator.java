package application;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
private TextField annualInterestRate=new TextField();
private TextField numberOfYears=new TextField();
private TextField loanAmount=new TextField();
private TextField monthlyPayment=new TextField();
private TextField totalPayment =new TextField();
private Button calculate=new Button("Calculate");

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
	GridPane gridPane=new GridPane();
	gridPane.setHgap(5);
	gridPane.setVgap(5);
	gridPane.add(new Label("Annual Interest Rate"), 0, 0);
	gridPane.add(new Label("Number of Years"),0,1);
	gridPane.add(new Label("Loan Amount"), 0, 2);
	gridPane.add(new Label("Monthly payment"),0,3);
	gridPane.add(new Label("Total payment"), 0, 4);
	gridPane.add(this.annualInterestRate,1,0);
	gridPane.add(this.numberOfYears, 1, 1);
	gridPane.add(this.loanAmount, 1, 2);
	gridPane.add(this.monthlyPayment, 1, 3);
	gridPane.add(this.totalPayment, 1, 4);
	gridPane.add(calculate, 1, 5);
	gridPane.setAlignment(Pos.CENTER);
	annualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
	GridPane.setHalignment(calculate,HPos.RIGHT);
this.numberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
this.loanAmount.setAlignment(Pos.BOTTOM_RIGHT);
this.monthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
this.totalPayment.setAlignment(Pos.BOTTOM_RIGHT);
	calculate.setOnAction((e)->{
		this.monthlyPayment.setText(calculateLoanPayment()[0]);
		this.totalPayment.setText(calculateLoanPayment()[1]);
	});
	
	//set scene
	Scene scene=new Scene(gridPane);
	arg0.setScene(scene);
	arg0.show();
		
	}
	private String[] calculateLoanPayment() {
		String[] calcs=new String[2];
	double interest=Double.parseDouble(this.annualInterestRate.getText());	
	int year=Integer.parseInt(this.numberOfYears.getText());
	double loanAmount=
			Double.parseDouble(this.loanAmount.getText());
	calcs[0]=String.format("$%.2f",(interest*loanAmount)/1200+loanAmount/240);
	calcs[1]=String.format("$%.2f",interest*year*loanAmount/100+loanAmount);
	
	return calcs;

	}

}
