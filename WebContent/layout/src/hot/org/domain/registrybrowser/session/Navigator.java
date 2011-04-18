package org.domain.registrybrowser.session;

import org.jboss.seam.annotations.Name;

@Name("navigator")
public class Navigator {

	private String mainOptionPanel = "/xsamsForm/XSAMSMainOption.xhtml";

	private String subOptionPanel = "/xsamsForm/empty.xhtml";
	
	// Number of Form Panels are equal to Number of Main Options
	private String formPanel1 = "/xsamsForm/empty.xhtml";
	private String formPanel2 = "/xsamsForm/empty.xhtml";
	private String formPanel3 = "/xsamsForm/empty.xhtml";

	public void mainOptionFirst() {
		subOptionPanel = "/xsamsForm/mainOptionFirst.xhtml";
	}

	public void mainOptionSecond() {
		subOptionPanel = "/xsamsForm/mainOptionSecond.xhtml";
	}

	public void mainOptionThird() {
		subOptionPanel = "/xsamsForm/mainOptionThird.xhtml";
	}

	public String getMainOptionPanel() {
		return mainOptionPanel;
	}

	public void setMainOptionPanel(String mainOptionPanel) {
		this.mainOptionPanel = mainOptionPanel;
	}

	public String getSubOptionPanel() {
		return subOptionPanel;
	}

	public void setSubOptionPanel(String subOptionPanel) {
		this.subOptionPanel = subOptionPanel;
	}

	public String getFormPanel1() {
		return formPanel1;
	}

	public void setFormPanel1(String formPanel) {
		this.formPanel1 = formPanel;
	}
	
}
