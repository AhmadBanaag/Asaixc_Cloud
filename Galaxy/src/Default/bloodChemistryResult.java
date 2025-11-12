package Default;
import javax.swing.JOptionPane;

public class bloodChemistryResult {
	public static void main(String[] args) {
		
		double glucoseResult, bloodUreaNitrogenResult, serumUricAcidResult, creatinineResult, cholesterolResult, triglyceridesResults; 
		String message = "", gender;
		boolean allNormal = true;
		
		gender = JOptionPane.showInputDialog(
				null,
				"Hi! What's your gender? (M/F)",
				"Chemistry Blood Results",
				3);
		
		glucoseResult = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Glucose:",
				"Chemistry Blood Results",
				3));
		
		bloodUreaNitrogenResult = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Blood Urea Nitrogen:",
				"Chemistry Blood Results",
				3));
		
		serumUricAcidResult = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Serum Uric Acid:",
				"Chemistry Blood Results",
				3));
		
		creatinineResult = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Creatinine:",
				"Chemistry Blood Results",
				3));
		
	
		cholesterolResult = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Cholesterol:",
				"Chemistry Blood Results",
				3));
			
		triglyceridesResults = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Trigly	cerides:",
				"Chemistry Blood Results",
				3));
		
		//header for the result
		message = "--FOLLOWING ARE THE RESULTS--\n";
		
		// For MALES
		if (gender.equalsIgnoreCase("M")) {
			if (glucoseResult > 5.8 && cholesterolResult > 5.68 && triglyceridesResults > 1.86) {
				message += "Your Glucose, Cholesterol, and Triglycerides levels are high. You should be in a low carb and low fat diet. You should also take Telmisartan and Atorvastatin.\n";
			}
			
			if (glucoseResult >= 3.8 && glucoseResult <= 5.8) {
				message += "Your GLUCOSE is NORMAL.\n";
			} else if (glucoseResult < 3.8) {
				message += "---\n";
				allNormal = false;
			} else {
				glucoseResult-=5.8;
				message += String.format("Your GLUCOSE level is %.1f higher than normal. You should be in a low carb diet.\n", glucoseResult);
				allNormal = false;
			}
			
			if (bloodUreaNitrogenResult >= 5.35 && bloodUreaNitrogenResult <= 16.07) {
				message += "Your BLOOD UREA NITROGEN is NORMAL.\n";
			} else if (bloodUreaNitrogenResult < 5.35) {
				message += "---\n";
				allNormal = false;
			} else {
				bloodUreaNitrogenResult-=16.07;
				message += String.format("Your BLOOD UREA NITROGEN is %.1f higher than normal.\n", bloodUreaNitrogenResult);
				allNormal = false;
			}
			
			if (serumUricAcidResult >= 0.20 && serumUricAcidResult <= 0.41) {
				message += "Your URIC ACID is NORMAL.\n";
			} else if (serumUricAcidResult < 0.20) {
				message += "---\n"; 
				allNormal = false;
			} else {
				serumUricAcidResult-=0.41;
				message += String.format("Your URIC ACID is %.1f higher than normal. You should avoid foods that are high in purine and fat.\n", serumUricAcidResult);
				allNormal = false;
			}
			
			if (creatinineResult >= 53 && creatinineResult <= 115) {
				message += "Your CREATININE is NORMAL.\n";
			} else if (creatinineResult < 53) {
				message += "---\n"; 
				allNormal = false;
			} else {
				creatinineResult-=115;
				message += String.format("Your CREATININE is %.1f higher than normal. You should avoid caffeine, alcohol, carbonated drinks and salty foods.\n", creatinineResult);
				allNormal = false;
			}
			
			if (cholesterolResult >= 3.87 && cholesterolResult <= 5.68) {
				message += "Your CHOLESTEROL level is NORMAL.\n";
			} else if (cholesterolResult < 3.87) {
				message += "---\n"; 
				allNormal = false;
			} else {
				cholesterolResult-=5.68;
				message += String.format("Your CH0LESTEROL level is %.1f higher than normal.You should be in a low fat diet\n", cholesterolResult);
				allNormal = false;
			}	
			
			if (triglyceridesResults >= 0.57 && triglyceridesResults <= 1.86) {
				message += "Your TRIGLYCERIDES level is NORMAL.\n";
			} else if (triglyceridesResults < 0.57) {
				message += "---\n";
				allNormal = false;
			} else {
				triglyceridesResults-=1.86;
				message += String.format("Your TRIGLYCERIDES level is %.1f higher than normal. You should avoid sugary and starchy foods.\n", triglyceridesResults);
				allNormal = false;
			}
			if (allNormal) {
				message = "Your Blood Chem Result is NORMAL. You are generally HEALTHY.";
			}
			
		// For FEMALES
		} else if (gender.equalsIgnoreCase("F")) {
			if (glucoseResult > 5.8 && cholesterolResult > 5.68 && triglyceridesResults > 1.58) {
				message += "Your Glucose, Cholesterol, and Triglycerides levels are high. You should be in a low carb and low fat diet. You should also take Telmisartan and Atorvastatin.\n";
			}
			
			if (glucoseResult >= 3.8 && glucoseResult <= 5.8) {
			message += "Your GLUCOSE is NORMAL.\n";
			} else if (glucoseResult < 3.8) {
				message += "---\n";
				allNormal = false;
			} else {
				glucoseResult-=5.8;
				message += String.format("Your GLUCOSE level is %.1f higher than normal. You should be in a low carb diet.\n", glucoseResult);
				allNormal = false;
			}  
			
			if (bloodUreaNitrogenResult >= 5.35 && bloodUreaNitrogenResult <= 16.07) {
				message += "Your BLOOD UREA NITROGEN is NORMAL.\n";
			} else if (bloodUreaNitrogenResult < 5.35) {
				message += "---\n";
				allNormal = false;
			} else {
				bloodUreaNitrogenResult -= 16.07;
				message += String.format("Your BLOOD UREA NITROGEN is %.1f higher than normal.\n", bloodUreaNitrogenResult);
				allNormal = false;
			}
			
			if (serumUricAcidResult >= 0.13 && serumUricAcidResult <= 0.35) {
				message += "Your URIC ACID is NORMAL.\n";
			} else if (serumUricAcidResult < 0.13) {
				message += "---\n";
				allNormal = false;
			} else {
				serumUricAcidResult -= 0.35;
				message += String.format("Your URIC ACID is %.1f higher than normal.You should avoid foods that are high in purine and fat\n", serumUricAcidResult);
				allNormal = false;
			}
			
			if (creatinineResult >= 62 && creatinineResult <= 106) {
				message += "Your CREATININE is NORMAL.\n";
			} else if (creatinineResult < 62) {
				message += "---\n";
				allNormal = false;
			} else {
				creatinineResult-=106;
				message += String.format("Your CREATININE is %.1f higher than normal.You should avoid caffeine, alcohol, carbonated drinks and salty foods.\n", creatinineResult);
				allNormal = false;
			}
			
			if (cholesterolResult >= 3.87 && cholesterolResult <= 5.68) {
				message += "Your CHOLESTEROL level is NORMAL.\n";
			} else if (cholesterolResult < 3.87) {
				message += "---\n";
				allNormal = false;
			} else {
				cholesterolResult-=5.68;
				message += String.format("Your URIC ACID is %.1f higher than normal.You should be in a low fat diet\n", cholesterolResult);
				allNormal = false;
			}	 
			
			if (triglyceridesResults >= 0.45 && triglyceridesResults <= 1.58) {
				message += "Your TRIGLYCERIDES level is NORMAL.\n";
			} else if (triglyceridesResults < 0.45) {
				message += "---\n";
				allNormal = false;
			} else {
				triglyceridesResults -= 1.58;
				message += String.format("Your TRIGLYCERIDES level is %.1f higher than normal. You should avoid sugary and starchy foods.\n", triglyceridesResults );
				allNormal = false;
			}
			
			if (allNormal) {
				message = "Your Blood Chem Result is NORMAL. You are generally HEALTHY.";
			}
			
		} else {
			message = "Syntax Error! Please Try Again!";
		}
		JOptionPane.showMessageDialog(
				null,
				message,
				"Chemistry Blood Results",
				JOptionPane.PLAIN_MESSAGE);		
	}

}