import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class GuessGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess()
	{
		String guessText=txtGuess.getText();
		String message="";
		try {
			int guess=Integer.parseInt(guessText);
			if(guess<theNumber)
				message=guess+" is too low.Try Again.";
			else if(guess>theNumber)
				message=guess+" is too high.Try Again";
			else {message=guess+" is correct.You win.Let's Play Again.";newGame();}}
		catch(Exception e){
			message="Enter a whole number between 1 to 100";
		}
		finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}}
	public void newGame()
	{
		theNumber=(int)(Math.random()*100+1);
	}
	public GuessGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mohit HiLo Guess Game");
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Mohit's HiLo Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(135, 29, 178, 45);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Guess a Number Between 1 and 100:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(39, 103, 274, 37);
		getContentPane().add(lblNewLabel_1);

		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.LEFT);
		txtGuess.setBounds(323, 108, 96, 29);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);

		JButton btnNewButton = new JButton("Guess!");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnNewButton.setBounds(175, 170, 85, 21);
		getContentPane().add(btnNewButton);

		lblOutput = new JLabel("Enter Number Above and Click Guess");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblOutput.setBounds(76, 219, 237, 13);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame theGame=new GuessGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,500));
		theGame.setVisible(true);

	}
}
