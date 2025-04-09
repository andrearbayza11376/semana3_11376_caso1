package Caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnSumarEnteros;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(26, 24, 83, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número");
			lblNewLabel_1.setBounds(26, 49, 83, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número");
			lblNewLabel_2.setBounds(26, 74, 83, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(140, 21, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(140, 46, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(140, 71, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnSumarEnteros = new JButton("Sumar dos enteros");
			btnSumarEnteros.addActionListener(this);
			btnSumarEnteros.setBounds(236, 20, 156, 23);
			contentPane.add(btnSumarEnteros);
		}
		{
			btnNewButton_1 = new JButton("Sumar tres enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(236, 45, 156, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Sumar dos reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(236, 70, 156, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 103, 366, 128);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnSumarEnteros) {
			do_btnSumarEnteros_actionPerformed(e);
		}
	}
	protected void do_btnSumarEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			Calculadora c = new Calculadora(n1,n2);
			txtS.append("La suma es: "+c.Sumar(n1, n2));
		}
		catch(Exception e2)
		{
			MostrarError();
		}
	    }
	private void MostrarError()
	{
		JOptionPane.showMessageDialog(this, "Ingrese número(s) válido(s)");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			Calculadora c1 = new Calculadora(n1,n2,n3);
			txtS.append("La suma es: "+c1.Sumar(n1, n2, n3));
		}
		catch(Exception e3)
		{
		    MostrarError();	
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(txtN1.getText());
			double num2 = Double.parseDouble(txtN2.getText());
			Calculadora c2 = new Calculadora(num1,num2);
			txtS.append("La suma es: "+c2.Sumar(num1,num2));
		}
		catch(Exception e4)
		{
			MostrarError();
		}
		
	}
}