package com.huios.proxiBanque.presentation.fenetre;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*private JPanel conteneurAddPersonne = new JPanel();
	private JPanel conteneurAddVoiture = new JPanel();
	private JPanel conteneurAttribuate = new JPanel();
	private JPanel conteneurDeletePersonne = new JPanel();
	private JPanel conteneurChange = new JPanel();
	private JPanel conteneurActualize = new JPanel();
	private JPanel conteneurDisplayPersonneVoiture = new JPanel();
	private JPanel conteneurDeleteVoiture = new JPanel();
	private JPanel conteneur = new JPanel();
	private JPanel conteneurCombo = new JPanel();
	private JPanel conteneurComboLabel = new JPanel();
	
	
	
	private JLabel label1 = new JLabel("nom");
	private JLabel label2 = new JLabel("prenom");
	private JLabel label3 = new JLabel("age");
	private JLabel label4 = new JLabel("marque");
	private JLabel label5 = new JLabel("concessionaire");
	private JLabel label6 = new JLabel("id personne");
	private JLabel label7 = new JLabel("id voiture");
	private JLabel label8 = new JLabel("Menu des personnes                                                                  ");
	private JLabel label9 = new JLabel("Mes voitures");
	private JLabel label10 = new JLabel("Menu des voitures              ");
	
	private JButton boutonAddPersonne = new JButton("Add p");
	private JButton boutonAddVoiture = new JButton("Add V");
	private JButton boutonAttribuate = new JButton("Attribuate");
	private JButton boutonDeletePersonne = new JButton("Delete P");
	private JButton boutonChange = new JButton("Change");
	private JButton boutonActualize = new JButton("Actualize All");
	private JButton boutonActualizeVoiture = new JButton("Actualize V");
	private JButton boutonDisplayPersonneVoiture = new JButton("Display P to V");
	private JButton boutonDeleteVoiture = new JButton("Delete V");
	
	*/		
	private JComboBox<String> comboSingle1 = new JComboBox<String>();
	private JComboBox<String> comboSingle2 = new JComboBox<String>();
	private JComboBox<String> comboSingle3 = new JComboBox<String>();
	private JComboBox<String> comboSingle4 = new JComboBox<String>();
	private JComboBox<String> comboSingle5 = new JComboBox<String>();	
	private JComboBox<String> comboSociety6 = new JComboBox<String>();
	private JComboBox<String> comboSociety7 = new JComboBox<String>();
	private JComboBox<String> comboSociety8 = new JComboBox<String>();
	private JComboBox<String> comboSociety9 = new JComboBox<String>();
	private JComboBox<String> comboSociety10 = new JComboBox<String>();	
	private JComboBox<String> comboCurrentAccount11 = new JComboBox<String>();
	private JComboBox<String> comboCurrentAccount12 = new JComboBox<String>();
	private JComboBox<String> comboCurrentAccount13 = new JComboBox<String>();
	private JComboBox<String> comboCurrentAccount14 = new JComboBox<String>();
	private JComboBox<String> comboCurrentAccount15 = new JComboBox<String>();	
	private JComboBox<String> comboCurrentthriftness16 = new JComboBox<String>();
	private JComboBox<String> comboCurrentthriftness17 = new JComboBox<String>();
	private JComboBox<String> comboCurrentthriftness18 = new JComboBox<String>();
	private JComboBox<String> comboCurrentthriftness19 = new JComboBox<String>();
	private JComboBox<String> comboCurrentthriftness20 = new JComboBox<String>();
	private JComboBox<String> comboCard21 = new JComboBox<String>();
	
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

	private JLabel label1 = new JLabel("");
	private JLabel label2 = new JLabel("");
	private JLabel label3 = new JLabel("");
	private JLabel label4 = new JLabel("");
	private JLabel label5 = new JLabel("");
	private JLabel label6 = new JLabel("");
	private JLabel label7 = new JLabel("");
	private JLabel label8 = new JLabel("");
	private JLabel label9 = new JLabel("");
	private JLabel label10 = new JLabel("");
	private JLabel label11 = new JLabel("");
	private JLabel label12 = new JLabel("");
	private JLabel label13 = new JLabel("");
	private JLabel label14 = new JLabel("");
	private JLabel label15 = new JLabel("");
	private JLabel label16 = new JLabel("");
	private JLabel label17 = new JLabel("");
	private JLabel label18 = new JLabel("");
	private JLabel label19 = new JLabel("");
	private JLabel label20 = new JLabel("");
	
	private JButton boutonAddSingle = new JButton("Validate");
	private JButton boutonAddSociety = new JButton("Validate");
	private JButton boutonAddCurrentAccount = new JButton("Validate");
	private JButton boutonAddthriftness = new JButton("Validate");
	
	private JButton boutonAttribuateTriftness = new JButton("Validate");
	private JButton boutonAttribuateCurrentAccount = new JButton("Validate");
	
	
	private JButton boutonDeleteTriftness = new JButton("Validate");
	private JButton boutonDeleteCurrentAccount = new JButton("Validate");
	private JButton boutonDeleteClient = new JButton("Validate");
	
	
	private JButton boutonAddVoiture = new JButton("Add V");
	private JButton boutonAttribuate = new JButton("Attribuate");
	private JButton boutonDeletePersonne = new JButton("Delete P");
	private JButton boutonChange = new JButton("Change");
	private JButton boutonActualize = new JButton("Actualize All");
	private JButton boutonActualizeVoiture = new JButton("Actualize V");
	private JButton boutonDisplayPersonneVoiture = new JButton("Display P to V");
	private JButton boutonDeleteVoiture = new JButton("Delete V");
	
	JPanel pannel = new JPanel();
	
	
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
		
		
		
		pannel.add(onglets);		
		setContentPane(pannel);
		pack();
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
}
