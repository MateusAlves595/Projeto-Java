package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;

	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(Color.GRAY);
		
		//Componentes
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada");
		labelTabuada.setBounds(30, 20, 200, 50);
		labelTabuada.setForeground(Color.RED);
		labelTabuada.setFont(new Font("Arial", Font.BOLD, 40));
		
		JLabel labelSubtexto1 = new JLabel();
		labelSubtexto1.setText("Problemas com contas? ");
		labelSubtexto1.setBounds(30, 70, 200, 30);;
		labelSubtexto1.setFont(new Font("Arial", Font.BOLD, 15));
		labelSubtexto1.setForeground(Color.WHITE);
		
		JLabel labelSubtexto2 = new JLabel();
		labelSubtexto2.setText("Com essa calculadora os seus problemas acabaram");
		labelSubtexto2.setBounds(30, 90, 400, 30);;
		labelSubtexto2.setFont(new Font("Arial", Font.BOLD, 15));
		labelSubtexto2.setForeground(Color.WHITE);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(200, 150, 160, 50);
		labelMultiplicando.setFont(new Font("Arial", Font.ITALIC, 25));
		labelMultiplicando.setForeground(Color.WHITE);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(400, 150, 160, 50);
		
		JLabel labelMinimo = new JLabel();
		labelMinimo.setText("Mínimo Multiplicador:");
		labelMinimo.setBounds(125, 250, 250, 50);
		labelMinimo.setFont(new Font("Arial", Font.ITALIC, 25));
		labelMinimo.setForeground(Color.WHITE);
		
		JTextField textFieldMinimo = new JTextField();
		textFieldMinimo.setBounds(400, 250, 160, 50);
		
		JLabel labelMaximo = new JLabel();
		labelMaximo.setText("Máximo Multiplicador:");
		labelMaximo.setBounds(115, 350, 250, 50);
		labelMaximo.setFont(new Font("Arial", Font.ITALIC, 25));
		labelMaximo.setForeground(Color.WHITE);
		
		JTextField textFieldMaximo = new JTextField();
		textFieldMaximo.setBounds(400, 350, 160, 50);
		
		JLabel labelResultado = new JLabel();
		
		//Adicionando
		painel.add(labelTabuada);
		painel.add(labelSubtexto1);
		painel.add(labelSubtexto2);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimo);
		painel.add(textFieldMinimo);
		painel.add(labelMaximo);
		painel.add(textFieldMaximo);
		painel.add(labelResultado);
		
		tela.setVisible(true);
	}
}
