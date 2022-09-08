package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.AppTabuada;
import br.senai.sp.jandira.model.Calculo;

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
		textFieldMultiplicando.setBorder(new LineBorder(Color.BLACK));
		textFieldMultiplicando.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel labelMinimo = new JLabel();
		labelMinimo.setText("Mínimo Multiplicador:");
		labelMinimo.setBounds(125, 250, 250, 50);
		labelMinimo.setFont(new Font("Arial", Font.ITALIC, 25));
		labelMinimo.setForeground(Color.WHITE);
		
		JTextField textFieldMinimo = new JTextField();
		textFieldMinimo.setBounds(400, 250, 160, 50);
		textFieldMinimo.setBorder(new LineBorder(Color.BLACK));
		textFieldMinimo.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel labelMaximo = new JLabel();
		labelMaximo.setText("Máximo Multiplicador:");
		labelMaximo.setBounds(115, 350, 250, 50);
		labelMaximo.setFont(new Font("Arial", Font.ITALIC, 25));
		labelMaximo.setForeground(Color.WHITE);
		
		JTextField textFieldMaximo = new JTextField();
		textFieldMaximo.setBounds(400, 350, 160, 50);
		textFieldMaximo.setBorder(new LineBorder(Color.BLACK));
		textFieldMaximo.setFont(new Font("Arial", Font.BOLD, 30));
		
		JButton botaoCalcular = new JButton();
		botaoCalcular.setText("Calcular");
		botaoCalcular.setBounds(25, 450, 270, 40);
		botaoCalcular.setBackground(new Color(39, 140, 222));
		botaoCalcular.setFont(new Font("Arial", Font.BOLD, 15));
		botaoCalcular.setBorder(new LineBorder(Color.BLACK));
		
		JButton botaoLimpar = new JButton();
		botaoLimpar.setText("Limpar");
		botaoLimpar.setBounds(310, 450, 250, 40);
		botaoLimpar.setBackground(new Color(228, 216, 52));
		botaoLimpar.setFont(new Font("Arial", Font.BOLD, 15));
		botaoLimpar.setBorder(new LineBorder(Color.BLACK));
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(25, 500, 530, 250);
		JList<String> listLista = new JList<>();
		listLista.setBorder(new LineBorder(Color.BLACK));
		
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
		painel.add(botaoCalcular);
		painel.add(botaoLimpar);
		painel.add(listLista);
		painel.add(scroll);
		
		tela.setVisible(true);
		
		botaoCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Calculo calculo = new Calculo();
			calculo.numero = Integer.parseInt(textFieldMultiplicando.getText());
			calculo.minimo = Integer.parseInt(textFieldMinimo.getText());
			calculo.maximo = Integer.parseInt(textFieldMaximo.getText());
			
	//if's
		if(calculo.minimo > calculo.maximo) {
				JOptionPane.showInternalMessageDialog(null, "O minimo multiplicador é maior que o maximo", "Erro",
						JOptionPane.ERROR_MESSAGE);
			textFieldMultiplicando.setText(null);
			textFieldMinimo.setText(null);
			textFieldMaximo.setText(null);
		}else if(calculo.numero > 999){
			JOptionPane.showInternalMessageDialog(null, "A calculadora não é capaz de fazer essa equação", "Erro",
					JOptionPane.ERROR_MESSAGE);
			textFieldMultiplicando.setText(null);
			textFieldMinimo.setText(null);
			textFieldMaximo.setText(null);
		}else if(calculo.minimo > 999) {
			JOptionPane.showInternalMessageDialog(null, "A calculadora não é capaz de fazer essa equação", "Erro",
					JOptionPane.ERROR_MESSAGE);
			textFieldMultiplicando.setText(null);
			textFieldMinimo.setText(null);
			textFieldMaximo.setText(null);
		}else if(calculo.maximo > 999) {
			JOptionPane.showInternalMessageDialog(null, "A calculadora não é capaz de fazer essa equação", "Erro",
					JOptionPane.ERROR_MESSAGE);
			textFieldMultiplicando.setText(null);
			textFieldMinimo.setText(null);
			textFieldMaximo.setText(null);
		}
			
	//
			
			DefaultListModel<String> model = new DefaultListModel<String>();
			for(String percorrer : calculo.getResultado()) {
				model.addElement(percorrer);
			}
			listLista.setModel(model);
			scroll.getViewport().add(listLista);
				
			}
			
		});
		
		botaoLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == botaoLimpar);
				textFieldMultiplicando.setText(null);
				textFieldMinimo.setText(null);
				textFieldMaximo.setText(null);
				
				DefaultListModel<String> model2 =  new DefaultListModel<>();
				listLista.setModel(model2);
				
				
			}
		});
		
		
	}
}
