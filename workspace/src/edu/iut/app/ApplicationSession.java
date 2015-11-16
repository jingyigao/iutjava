package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	ApplicationSession Singleton;
	// Exercice 1 : Gérer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private static /*Qu'est ce qu'un singleton ? 单线程*/ ApplicationSession session = null;
	private ApplicationSession() {
		
		/* Definir US comme locale par défaut */
		Locale.setDefault(Locale.US);		
		locale = Locale.getDefault();
		resourceBundle =  ResourceBundle.getBundle("edu.iut.resources.string.res.properties");
		sessionGuiLogger = Logger.getLogger("LOGER");
		sessionGuiLogger.setLevel(Level.INFO);
		sessionExceptionLogger = Logger.getLogger("Exc.logger");
		sessionExceptionLogger.setLevel(Level.INFO);
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.string.res.properties");
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
