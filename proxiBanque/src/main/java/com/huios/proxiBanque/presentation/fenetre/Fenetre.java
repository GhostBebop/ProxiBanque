package com.huios.proxiBanque.presentation.fenetre;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.huios.proxiBanque.metier.Entreprise;
import com.huios.proxiBanque.metier.Particulier;
import com.huios.proxiBanque.service.IserviceConseiller;
import com.huios.proxiBanque.service.ServiceImple;
public class Fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private JPanel conteneur1 = new JPanel();
	private JPanel conteneur2 = new JPanel();
	private JPanel conteneur3 = new JPanel();
	private JPanel conteneur4 = new JPanel();
	private JPanel conteneur5 = new JPanel();
	private JPanel conteneur6 = new JPanel();
	private JPanel conteneur7 = new JPanel();
	private JPanel conteneur8 = new JPanel();
	private JPanel conteneur9 = new JPanel();
	private JPanel conteneur10 = new JPanel();
	private JPanel conteneur11 = new JPanel();
	private JPanel conteneur12 = new JPanel();
	private JPanel conteneur13 = new JPanel();
			
	private JTextField text1 = new JTextField(25);
	private JTextField text2 = new JTextField(25);
	private JTextField text3 = new JTextField(25);
	private JTextField text4 = new JTextField(25);
	private JTextField text5 = new JTextField(25);
	private JTextField text6 = new JTextField(25);
	private JTextField text7 = new JTextField(25);
	private JTextField text8 = new JTextField(25);
	private JTextField text9 = new JTextField(25);
	private JTextField text10 = new JTextField(25);
	private JTextField text11 = new JTextField(25);
	private JTextField text12 = new JTextField(25);
	private JTextField text13 = new JTextField(25);
	private JTextField text14 = new JTextField(25);
	private JTextField text15 = new JTextField(25);

	private JLabel label1 = new JLabel("name");
	private JLabel label2 = new JLabel("first name");
	private JLabel label3 = new JLabel("address");
	private JLabel label4 = new JLabel("phone number");
	private JLabel label5 = new JLabel("name");
	private JLabel label6 = new JLabel("address");
	private JLabel label7 = new JLabel("phone number");
	private JLabel label8 = new JLabel("code");
	private JLabel label9 = new JLabel("remant sale");
	private JLabel label10 = new JLabel("creation date");
	private JLabel label11 = new JLabel("discovered");
	private JLabel label12 = new JLabel("code");
	private JLabel label13 = new JLabel("remant sale");
	private JLabel label14 = new JLabel("creation date");
	private JLabel label15 = new JLabel("rate");
	private JLabel label16 = new JLabel("client");
	private JLabel label17 = new JLabel("thriftiness available");
	private JLabel label18 = new JLabel("client");
	private JLabel label19 = new JLabel("accurent account available");
	private JLabel label20 = new JLabel("client");
	private JLabel label21 = new JLabel("thriftiness");
	private JLabel label22 = new JLabel("client");
	private JLabel label23 = new JLabel("current account");
	private JLabel label24 = new JLabel("client");
	private JLabel label25 = new JLabel("client");
	private JLabel label26 = new JLabel("current account");
	private JLabel label27 = new JLabel("client");
	private JLabel label28 = new JLabel("thriftiness");
	private JLabel label29 = new JLabel("single");
	private JLabel label30 = new JLabel("society");
	
	private JButton boutonAddSingle = new JButton("Validate");
	private JButton boutonAddSociety = new JButton("Validate");
	private JButton boutonAddCurrentAccount = new JButton("Validate");
	private JButton boutonAddThriftness = new JButton("Validate");	
	private JButton boutonAttribuateTriftness = new JButton("Validate");
	private JButton boutonAttribuateCurrentAccount = new JButton("Validate");
	private JButton boutonDeleteThriftness = new JButton("Validate");
	private JButton boutonDeleteCurrentAccount = new JButton("Validate");
	private JButton boutonDeleteClient = new JButton("Validate");
	private JButton boutonShowAllCurrentAccount = new JButton("Actualize");
	private JButton boutonShowAllThriftness = new JButton("Actualize");
	private JButton boutonShowAllSingle = new JButton("Actualize");
	private JButton boutonShowAllSociety = new JButton("Actualize");
	
	private JPanel onglet1 = new JPanel();
	private JPanel onglet2 = new JPanel();
	private JPanel onglet3 = new JPanel();
	private JPanel onglet4 = new JPanel();
	private JPanel onglet5 = new JPanel();
	private JPanel onglet6 = new JPanel();
	private JPanel onglet7 = new JPanel();
	private JPanel onglet8 = new JPanel();
	private JPanel onglet9 = new JPanel();
	private JPanel onglet10 = new JPanel();
	private JPanel onglet11 = new JPanel();
	private JPanel onglet14 = new JPanel();
	private JPanel onglet15 = new JPanel();
	private JPanel onglet16 = new JPanel();
	private JPanel onglet17 = new JPanel();
	private JPanel onglet18 = new JPanel();
	private JPanel onglet19 = new JPanel();
	private JPanel onglet20 = new JPanel();
	private JPanel onglet21 = new JPanel();
	private JPanel onglet12 = new JPanel();
	private JPanel onglet13 = new JPanel();
	
	private JComboBox<String> combo1 = new JComboBox<String>();
	private JComboBox<String> combo2 = new JComboBox<String>();
	private JComboBox<String> combo3 = new JComboBox<String>();
	private JComboBox<String> combo4 = new JComboBox<String>();
	private JComboBox<String> combo5 = new JComboBox<String>();
	private JComboBox<String> combo6 = new JComboBox<String>();
	private JComboBox<String> combo7 = new JComboBox<String>();
	private JComboBox<String> combo8 = new JComboBox<String>();
	private JComboBox<String> combo9 = new JComboBox<String>();
	private JComboBox<String> combo10 = new JComboBox<String>();
	private JComboBox<String> combo11 = new JComboBox<String>();
	private JComboBox<String> combo12 = new JComboBox<String>();
	private JComboBox<String> combo13 = new JComboBox<String>();
	private JComboBox<String> combo14 = new JComboBox<String>();
	private JComboBox<String> combo15 = new JComboBox<String>();
	
	
	JPanel pannel = new JPanel();
	
	List<Particulier> particuliers = new ArrayList<Particulier>();
	List<Entreprise> entreprise = new ArrayList<Entreprise>();
	public Fenetre() {
		setTitle("PROXIBANQUE");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsAdd = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsAttribuate = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsDelete = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsModify = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsShowAll = new JTabbedPane(SwingConstants.TOP);
		JTabbedPane ongletsOperation = new JTabbedPane(SwingConstants.TOP);	
		
		onglet1.setPreferredSize(new Dimension(900,150 ));
					
		ongletsAdd.addTab("Add single", onglet1);
		ongletsAdd.addTab("Add society", onglet2);
		ongletsAdd.addTab("Add current account", onglet3);
		ongletsAdd.addTab("Add thriftness", onglet4);
		ongletsAdd.addTab("Add card", onglet20);		
		ongletsAttribuate.addTab("Attribuate thriftness", onglet5);
		ongletsAttribuate.addTab("Attribuate current account", onglet6);
		ongletsAttribuate.addTab("Attribuate card", onglet21);		
		ongletsDelete.addTab("Delete thriftness", onglet7);
		ongletsDelete.addTab("Delete current account", onglet8);	
		ongletsDelete.addTab("Delete client", onglet14);		
		ongletsModify.addTab("Modify current account", onglet9);
		ongletsModify.addTab("Modify thriftness", onglet10);
		ongletsModify.addTab("Modify customer", onglet11);								
		ongletsShowAll.addTab("Show all current account", onglet15);
		ongletsShowAll.addTab("Show all thriftness", onglet16);
		ongletsShowAll.addTab("Show all single", onglet17);
		ongletsShowAll.addTab("Show all society", onglet18);
		ongletsOperation.addTab("Transfer account to account", onglet19);
		ongletsOperation.addTab("Simulation account", onglet12);
		ongletsOperation.addTab("Simulation patrimony", onglet13);		
		onglets.add("Add", ongletsAdd);
		onglets.add("Attribuate", ongletsAttribuate);
		onglets.add("Delete", ongletsDelete);
		onglets.add("Modify", ongletsModify);
		onglets.add("ShowAll", ongletsShowAll);
		onglets.add("Operation", ongletsOperation);		
		ongletsAdd.setOpaque(true);
		ongletsAttribuate.setOpaque(true);
		ongletsModify.setOpaque(true);
		ongletsDelete.setOpaque(true);
		ongletsOperation.setOpaque(true);
		ongletsShowAll.setOpaque(true);
		onglets.setOpaque(true);
		
		conteneur1.setLayout(new BoxLayout(conteneur1,BoxLayout.PAGE_AXIS));
		conteneur1.add(label1, BorderLayout.NORTH);conteneur1.add(text1, BorderLayout.NORTH);
		conteneur1.add(label2, BorderLayout.SOUTH);conteneur1.add(text2, BorderLayout.SOUTH);
		conteneur1.add(label3, BorderLayout.CENTER);conteneur1.add(text3, BorderLayout.CENTER);
		conteneur1.add(label4, BorderLayout.AFTER_LAST_LINE);conteneur1.add(text4, BorderLayout.AFTER_LAST_LINE);
		onglet1.add(conteneur1);
		onglet1.add(boutonAddSingle);
		
		
		conteneur2.setLayout(new BoxLayout(conteneur2,BoxLayout.PAGE_AXIS));
		conteneur2.add(label5, BorderLayout.NORTH);conteneur2.add(text5, BorderLayout.NORTH);
		conteneur2.add(label6, BorderLayout.SOUTH);conteneur2.add(text6, BorderLayout.SOUTH);
		conteneur2.add(label7, BorderLayout.CENTER);conteneur2.add(text7, BorderLayout.CENTER);
		onglet2.add(conteneur2);
		onglet2.add(boutonAddSociety);
		
		conteneur3.setLayout(new BoxLayout(conteneur3,BoxLayout.PAGE_AXIS));
		conteneur3.add(label8, BorderLayout.NORTH);conteneur3.add(text8, BorderLayout.NORTH);
		conteneur3.add(label9, BorderLayout.SOUTH);conteneur3.add(text9, BorderLayout.SOUTH);
		conteneur3.add(label10, BorderLayout.CENTER);conteneur3.add(text10, BorderLayout.CENTER);
		conteneur3.add(label11, BorderLayout.CENTER);conteneur3.add(text11, BorderLayout.CENTER);
		onglet3.add(conteneur3);
		onglet3.add(boutonAddCurrentAccount);
		
		conteneur4.setLayout(new BoxLayout(conteneur4,BoxLayout.PAGE_AXIS));
		conteneur4.add(label12, BorderLayout.NORTH);conteneur4.add(text12, BorderLayout.NORTH);
		conteneur4.add(label13, BorderLayout.SOUTH);conteneur4.add(text13, BorderLayout.SOUTH);
		conteneur4.add(label14, BorderLayout.CENTER);conteneur4.add(text14, BorderLayout.CENTER);
		conteneur4.add(label15, BorderLayout.CENTER);conteneur4.add(text15, BorderLayout.CENTER);
		onglet4.add(conteneur4);
		onglet4.add(boutonAddThriftness);
		
		conteneur5.setLayout(new BoxLayout(conteneur5,BoxLayout.PAGE_AXIS));
		conteneur5.add(label16, BorderLayout.NORTH);conteneur5.add(combo1, BorderLayout.NORTH);
		conteneur5.add(label17, BorderLayout.SOUTH);conteneur5.add(combo2, BorderLayout.SOUTH);
		onglet5.add(conteneur5);
		onglet5.add(boutonAttribuateTriftness);
		
		conteneur6.setLayout(new BoxLayout(conteneur6,BoxLayout.PAGE_AXIS));
		conteneur6.add(label18, BorderLayout.NORTH);conteneur6.add(combo3, BorderLayout.NORTH);
		conteneur6.add(label19, BorderLayout.SOUTH);conteneur6.add(combo4, BorderLayout.SOUTH);
		onglet6.add(conteneur6);
		onglet6.add(boutonAttribuateCurrentAccount);
		
		conteneur7.setLayout(new BoxLayout(conteneur7,BoxLayout.PAGE_AXIS));
		conteneur7.add(label20, BorderLayout.NORTH);conteneur7.add(combo5, BorderLayout.NORTH);
		conteneur7.add(label21, BorderLayout.SOUTH);conteneur7.add(combo6, BorderLayout.SOUTH);
		onglet7.add(conteneur7);
		onglet7.add(boutonDeleteThriftness);
		
		conteneur8.setLayout(new BoxLayout(conteneur8,BoxLayout.PAGE_AXIS));
		conteneur8.add(label22, BorderLayout.NORTH);conteneur8.add(combo7, BorderLayout.NORTH);
		conteneur8.add(label23, BorderLayout.SOUTH);conteneur8.add(combo8, BorderLayout.SOUTH);
		onglet8.add(conteneur8);
		onglet8.add(boutonDeleteCurrentAccount);
		
		conteneur9.setLayout(new BoxLayout(conteneur9,BoxLayout.PAGE_AXIS));
		conteneur9.add(label24, BorderLayout.NORTH);conteneur9.add(combo9, BorderLayout.NORTH);
		onglet14.add(conteneur9);
		onglet14.add(boutonDeleteClient);
		
		
		conteneur10.setLayout(new BoxLayout(conteneur10,BoxLayout.PAGE_AXIS));
		conteneur10.add(label25, BorderLayout.NORTH);conteneur10.add(combo10, BorderLayout.NORTH);
		conteneur10.add(label26, BorderLayout.NORTH);conteneur10.add(combo11, BorderLayout.NORTH);
		onglet15.add(conteneur10);
		onglet15.add(boutonShowAllCurrentAccount);
		
		conteneur11.setLayout(new BoxLayout(conteneur11,BoxLayout.PAGE_AXIS));
		conteneur11.add(label27, BorderLayout.NORTH);conteneur11.add(combo12, BorderLayout.NORTH);
		conteneur11.add(label28, BorderLayout.NORTH);conteneur11.add(combo13, BorderLayout.NORTH);
		onglet16.add(conteneur11);
		onglet16.add(boutonShowAllThriftness);
		
		conteneur12.setLayout(new BoxLayout(conteneur12,BoxLayout.PAGE_AXIS));
		conteneur12.add(label29, BorderLayout.NORTH);conteneur12.add(combo14, BorderLayout.NORTH);
		onglet17.add(conteneur12);
		onglet17.add(boutonShowAllSingle);
		
		conteneur13.setLayout(new BoxLayout(conteneur13,BoxLayout.PAGE_AXIS));
		conteneur13.add(label30, BorderLayout.NORTH);conteneur13.add(combo15, BorderLayout.NORTH);
		onglet18.add(conteneur13);
		onglet18.add(boutonShowAllSociety);

		
		
		pannel.add(onglets);		
		setContentPane(pannel);
		pack();
		
		boutonAddSingle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Particulier p = new Particulier();
				p.setNom(text1.getText());
				p.setPrenom(text2.getText());
				p.setAdresse(text3.getText());
				p.setNumTelephone(Integer.parseInt(text4.getText()));
				IserviceConseiller is = new ServiceImple();
				is.ajouterParticulier(p);				 
				text1.setText("");
				text2.setText("");	
				text3.setText("");
				text4.setText("");
			}
		});									
	}
		
		/*conteneurAddPersonne.setLayout(new BoxLayout(conteneurAddPersonne,BoxLayout.PAGE_AXIS));
		conteneurAddPersonne.add(label1,BorderLayout.NORTH);conteneurAddPersonne.add(text1,BorderLayout.NORTH);
		conteneurAddPersonne.add(label2,BorderLayout.CENTER);conteneurAddPersonne.add(text2,BorderLayout.CENTER);
		conteneurAddPersonne.add(label3,BorderLayout.SOUTH);conteneurAddPersonne.add(text3,BorderLayout.SOUTH);
		conteneurAddPersonne.add(boutonAddPersonne);
		onglet1.add(conteneurAddPersonne);
		onglet1.add(comboPersonne);
	
		
		
		conteneurAddVoiture.setLayout(new BoxLayout(conteneurAddVoiture,BoxLayout.PAGE_AXIS));
		conteneurAddVoiture.add(label4,BorderLayout.NORTH);conteneurAddVoiture.add(text4,BorderLayout.NORTH);
		conteneurAddVoiture.add(label5,BorderLayout.CENTER);conteneurAddVoiture.add(text5,BorderLayout.CENTER);
		conteneurAddVoiture.add(boutonAddVoiture);
		onglet2.add(conteneurAddVoiture);
		onglet2.add(comboVoiture);
	
		
		
		conteneurAttribuate.setLayout(new BoxLayout(conteneurAttribuate,BoxLayout.PAGE_AXIS));
		conteneurAttribuate.add(boutonAttribuate);
		onglet3.add(conteneurAttribuate);
		onglet3.add(comboAttribuatePersonne);
		onglet3.add(comboAttribuateVoiture);
		
		
		conteneurDeletePersonne.setLayout(new BoxLayout(conteneurDeletePersonne,BoxLayout.PAGE_AXIS));
		conteneurDeletePersonne.add(boutonDeletePersonne);
		conteneurDeletePersonne.add(comboDeletePersonne);
		onglet4.add(conteneurDeletePersonne);
		
		
		conteneurDeleteVoiture.setLayout(new BoxLayout(conteneurDeleteVoiture,BoxLayout.PAGE_AXIS));
		conteneurDeleteVoiture.add(boutonDeleteVoiture);
		conteneurDeleteVoiture.add(comboDeleteVoiture);
		onglet9.add(conteneurDeleteVoiture);
		
		
		conteneurActualize.add(boutonActualize);
		onglet6.add(conteneurActualize);
		
		
		
		conteneurDisplayPersonneVoiture.add(boutonDisplayPersonneVoiture);	
		onglet8.add(conteneurDisplayPersonneVoiture);
		onglet8.add(comboPersonneVoiture);
		onglet8.add(comboVoiturePersonne);
		
		onglets.setOpaque(true);
		pannel.add(onglets);		
		setContentPane(pannel);
		pack();
		
		
		boutonAddPersonne.addActionListener(new ActionListener() {
						
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Personne p = new Personne();
				p.setNom(text1.getText());
				p.setPrenom(text2.getText());
				p.setAge(Integer.parseInt(text3.getText()));
				IservicePersonne is = new ServiceImpl();
				is.CreatePersonne(p);				 
				text1.setText("");
				text2.setText("");	
				text3.setText("");
				comboPersonne.removeAllItems();
				comboDeletePersonne.removeAllItems();
				comboAttribuatePersonne.removeAllItems();
				comboPersonneVoiture.removeAllItems();
				IservicePersonne is2 = new ServiceImpl();
				personnes = is2.FindAllPersonne();
				for(Personne p1:personnes) {
					comboPersonne.addItem(p1.toString());
					comboDeletePersonne.addItem(p1.toString());
					comboAttribuatePersonne.addItem(p1.toString());
					comboPersonneVoiture.addItem(p1.toString());
				}
			}
		});
										 
		boutonAddVoiture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Voiture v = new Voiture();
				v.setMarque(text4.getText());
				v.setConcessionaire(text5.getText());
				IserviceVoiture is = new ServiceImpl();
				is.CreateVoiture(v);
				text4.setText("");
				text5.setText("");
				comboVoiture.removeAllItems();
				IserviceVoiture is1 = new ServiceImpl();
				 voitures = is1.FindAllVoiture();
				for(Voiture v1:voitures) {
					comboVoiture.addItem(v1.toString());
					comboDeleteVoiture.addItem(v1.toString());
					comboAttribuateVoiture.addItem(v1.toString());
				}
									 				
			}
		});
		
		boutonAttribuate.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Personne p = new Personne();
				Voiture v = new Voiture();
				p.setId(personnes.get(comboAttribuatePersonne.getSelectedIndex()).getId());
				v.setId(voitures.get(comboAttribuateVoiture.getSelectedIndex()).getId());
				IserviceVoiture is = new ServiceImpl();
				is.attribuerVoiture(p, v);
				
				comboDeleteVoiture.removeAllItems();
				comboAttribuateVoiture.removeAllItems();
				comboVoiture.removeAllItems();
				voitures = is.FindAllVoiture();
				for(Voiture v1:voitures) {
					comboDeleteVoiture.addItem(v1.toString());
					comboAttribuateVoiture.addItem(v1.toString());
					comboVoiture.addItem(v1.toString());
					
				}
				comboPersonne.removeAllItems();
				comboDeletePersonne.removeAllItems();
				comboAttribuatePersonne.removeAllItems();
				comboPersonneVoiture.removeAllItems();
				IservicePersonne is2 = new ServiceImpl();
				personnes = is2.FindAllPersonne();
				for(Personne p1:personnes) {
					comboPersonne.addItem(p1.toString());
					comboDeletePersonne.addItem(p1.toString());
					comboAttribuatePersonne.addItem(p1.toString());
					comboPersonneVoiture.addItem(p1.toString());
				}
				/*int idPersonne;
				int idVoiture;
				idPersonne = Integer.parseInt(text6.getText());
				idVoiture = Integer.parseInt(text7.getText());
				p.setId(idPersonne);
				v.setId(idVoiture);
				IserviceVoiture is = new ServiceImpl();
				is.attribuerVoiture(p, v);
				text6.setText("");
				text7.setText("");
			}				
			
		});
		
		boutonActualize.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				IserviceVoiture is = new ServiceImpl();
				
				comboDeleteVoiture.removeAllItems();
				comboAttribuateVoiture.removeAllItems();
				comboVoiture.removeAllItems();
				voitures = is.FindAllVoiture();
				for(Voiture v1:voitures) {
					comboDeleteVoiture.addItem(v1.toString());
					comboAttribuateVoiture.addItem(v1.toString());
					comboVoiture.addItem(v1.toString());
					
				}
				comboPersonne.removeAllItems();
				comboDeletePersonne.removeAllItems();
				comboAttribuatePersonne.removeAllItems();
				comboPersonneVoiture.removeAllItems();
				IservicePersonne is2 = new ServiceImpl();
				personnes = is2.FindAllPersonne();
				for(Personne p1:personnes) {
					comboPersonne.addItem(p1.toString());
					comboDeletePersonne.addItem(p1.toString());
					comboAttribuatePersonne.addItem(p1.toString());
					comboPersonneVoiture.addItem(p1.toString());
				}
			}
		});
		
		boutonDisplayPersonneVoiture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				comboVoiturePersonne.removeAllItems();
				int index =comboPersonneVoiture.getSelectedIndex();
				int id;
				id = personnes.get(index).getId();
				IserviceVoiture is = new ServiceImpl();				
				voitures = is.mesVoitures(id);
				for(Voiture v:voitures) {
					comboVoiturePersonne.addItem(v.toString());	
				}
			}
		});
	
		
		boutonDeletePersonne.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				IservicePersonne is = new ServiceImpl();
				is.deletePersonne(personnes.get(comboPersonne.getSelectedIndex()).getId());
				
				comboDeletePersonne.removeAllItems();
				comboPersonne.removeAllItems();
				comboAttribuatePersonne.removeAllItems();
				comboPersonneVoiture.removeAllItems();
				IservicePersonne is1 = new ServiceImpl();
				personnes = is1.FindAllPersonne();
				for(Personne p:personnes) {
					comboDeletePersonne.addItem(p.toString());
					comboPersonne.addItem(p.toString());
					comboAttribuatePersonne.addItem(p.toString());
					comboPersonneVoiture.addItem(p.toString());
				}
			}
		});						
		boutonDeleteVoiture.addActionListener(new ActionListener() {
			@Override		
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				IserviceVoiture is = new ServiceImpl();
				is.deleteVoiture(voitures.get(comboDeleteVoiture.getSelectedIndex()).getId());			
				comboDeleteVoiture.removeAllItems();
				comboAttribuateVoiture.removeAllItems();
				comboVoiture.removeAllItems();
				voitures = is.FindAllVoiture();
				for(Voiture v:voitures) {
					comboDeleteVoiture.addItem(v.toString());
					comboAttribuateVoiture.addItem(v.toString());
					comboVoiture.addItem(v.toString());	
				}
			}
		});*/
}					

