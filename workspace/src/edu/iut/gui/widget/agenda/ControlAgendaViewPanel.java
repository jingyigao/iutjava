package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		
		
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		Calendar cal = Calendar.getInstance();
		int annee = cal.get(Calendar.YEAR);
		SpinnerModel model =   new SpinnerNumberModel(annee, annee - 5, annee + 5,1);  
		JSpinner spinner = new JSpinner(model);
		
		
		String[] lesMois = { "janurary", "february", "march", "april","may","june","july","august","september",
		"october","november","december"};
		
		int mois = cal.get(Calendar.MONTH);
		JComboBox Combomois = new JComboBox(lesMois);
		Combomois.setSelectedIndex(mois);
		
		String[] lesJours = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int jour = cal.get(Calendar.DAY_OF_WEEK);
		JComboBox Combojour = new JComboBox(lesJours);
		Combojour.setSelectedIndex(jour);
		
		this.add(spinner);
		this.add(Combomois);
		this.add(Combojour);
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
