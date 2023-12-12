package it.exolab.exobank.model;


	public class VerifyOtpRequest {
	    private String frontEndOtp;
	    private int userId;
		public String getFrontEndOtp() {
			return frontEndOtp;
		}
		public void setFrontEndOtp(String frontEndOtp) {
			this.frontEndOtp = frontEndOtp;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
}
