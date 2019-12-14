package temperaturegui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class TemperatureDriver extends JFrame {

	private static final long serialVersionUID = -1603988035674137020L;

	private JPanel contentPane;
	StringBuilder stringToCalculate = new StringBuilder();
	Temperature temperatureInput = new Temperature();
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton backSpaceButton;
	JButton zeroButton;
	JButton enterButton;
	private JLabel resultLabel;
	private JLabel calculationLabel;
	private JRadioButton fahrenheitRadioButton;
	private JRadioButton celsiusRadioButton;
	private JRadioButton kelvinRadioButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureDriver frame = new TemperatureDriver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TemperatureDriver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(1, 2, 332, 169);
		contentPane.add(resultPanel);
		resultPanel.setLayout(new GridLayout(2, 1, 0, 0));

		resultLabel = new JLabel("");
		resultLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		resultPanel.add(resultLabel);

		calculationLabel = new JLabel("0");
		calculationLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calculationLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		calculationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		resultPanel.add(calculationLabel);

		JPanel calculatorPanel = new JPanel();
		calculatorPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		calculatorPanel.setBounds(0, 171, 333, 340);
		contentPane.add(calculatorPanel);
		calculatorPanel.setLayout(new GridLayout(5, 3, 0, 0));

		fahrenheitRadioButton = new JRadioButton("C \r\nTo \r\nF");
		fahrenheitRadioButton.setSelected(true);
		buttonGroup.add(fahrenheitRadioButton);
		fahrenheitRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		calculatorPanel.add(fahrenheitRadioButton);

		celsiusRadioButton = new JRadioButton("F To C");
		buttonGroup.add(celsiusRadioButton);
		celsiusRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		calculatorPanel.add(celsiusRadioButton);

		kelvinRadioButton = new JRadioButton("F To K");
		buttonGroup.add(kelvinRadioButton);
		kelvinRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		calculatorPanel.add(kelvinRadioButton);

		oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberOne;
				numberOne = 1;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberOne).toString());
			}
		});
		calculatorPanel.add(oneButton);

		twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberTwo;
				numberTwo = 2;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberTwo).toString());
			}
		});
		calculatorPanel.add(twoButton);

		threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberThree;
				numberThree = 3;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberThree).toString());
			}
		});
		calculatorPanel.add(threeButton);

		fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberFour;
				numberFour = 4;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberFour).toString());
			}
		});
		calculatorPanel.add(fourButton);

		fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberFive;
				numberFive = 5;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberFive).toString());
			}
		});
		calculatorPanel.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberSix;
				numberSix = 6;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberSix).toString());
			}
		});
		calculatorPanel.add(sixButton);

		sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberSeven;
				numberSeven = 7;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberSeven).toString());
			}
		});
		calculatorPanel.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberEight;
				numberEight = 8;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberEight).toString());
			}
		});
		calculatorPanel.add(eightButton);

		nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberNine;
				numberNine = 9;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberNine).toString());
			}
		});
		calculatorPanel.add(nineButton);

		backSpaceButton = new JButton("Backspace");
		backSpaceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (stringToCalculate.length() > 0) {
					stringToCalculate.setLength(stringToCalculate.length() - 1);
					calculationLabel.setText(stringToCalculate.toString());
				}

				if (stringToCalculate.length() == 0) {
					calculationLabel.setText("0");
				}
			}
		});
		calculatorPanel.add(backSpaceButton);

		zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer numberZero;
				numberZero = 0;
				if (calculationLabel.getText() == "0") {
					calculationLabel.removeAll();
					;
				}
				calculationLabel.setText(stringToCalculate.append(numberZero).toString());
			}
		});
		calculatorPanel.add(zeroButton);

		enterButton = new JButton("Enter");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fahrenheitRadioButton.isSelected()) {
					Double input = 0.0;
					Double result = 0.0;
					input = Double.parseDouble(calculationLabel.getText().toString());
					result = temperatureInput.celsiusToFahrenheit(input);
					DecimalFormat resultFormatted = new DecimalFormat("#.##");
					resultLabel.setText(resultFormatted.format(result).toString());
				}
				if (celsiusRadioButton.isSelected()) {
					Double input = 0.0;
					Double result = 0.0;
					input = Double.parseDouble(calculationLabel.getText().toString());
					result = temperatureInput.fahrenheitToCelsius(input);
					DecimalFormat resultFormatted = new DecimalFormat("#.##");
					resultLabel.setText(resultFormatted.format(result).toString());
				}
				if (kelvinRadioButton.isSelected()) {
					Double input = 0.0;
					Double result = 0.0;
					input = Double.parseDouble(calculationLabel.getText().toString());
					result = temperatureInput.fahrenheitToKelvin(input);
					DecimalFormat resultFormatted = new DecimalFormat("#.##");
					resultLabel.setText(resultFormatted.format(result).toString());
				}
			}
		});
		calculatorPanel.add(enterButton);
	}

}
