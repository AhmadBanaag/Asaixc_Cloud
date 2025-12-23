package allAboutJ;

class employeeTimeInSystemSolving {
	
		private String employName;
		private String employID;
		private boolean employStatus;
		private boolean employBeforeStatus;
		private String status = "";
		
		
		employeeTimeInSystemSolving (String employName, String employID) {
			this.employName = employName;
			this.employID = employID;
			employStatus = false; //false == not timed in
		}
		public void timeIn() {
			if (!employStatus) {
				employStatus = true;
				employBeforeStatus = true;
				System.out.println("Time-in Successful");
			} else {
				System.out.printf("%s is already timed in.\n", this.employName);
			}
		}
		public void timeOut() {
			if(employStatus) {
				employStatus = false;
				System.out.println("Time-out Successful");
			} else {
				System.out.printf("%s hasn't timed in yet.\n", this.employName);
			}
			
		}
		public void employStatus() {
			status = employStatus ? "IN" : "OUT";
			
			if (!employStatus && !employBeforeStatus) {
				status = "NOT YET TIMED IN";
			}
			System.out.printf("\nName: %s \nEmployee ID: %s \nStatus: %s\n", employName, employID, status);
		}
}
