package com.pojo;

import java.util.List;

public class Courses {

	//Child Array Json

		private List <WebAutomation> webAutomation;
		private List <Api> api;
		private List <Mobile> mobile;
		
		public List<WebAutomation> getWebAutomation() {
			return webAutomation;
		}
		public void setWebAutomation(List<WebAutomation> webAutomation) {
			this.webAutomation = webAutomation;
		}
		public List<Api> getApi() {
			return api;
		}
		public void setApi(List<Api> api) {
			this.api = api;
		}
		public List<Mobile> getMobile() {
			return mobile;
		}
		public void setMobile(List<Mobile> mobile) {
			this.mobile = mobile;
		}
		
		/*public WebAutomation getWebAutomation() {
			return webAutomation;
		}
		public void setWebAutomation(WebAutomation webAutomation) {
			this.webAutomation = webAutomation;
		}
		public Api getApi() {
			return api;
		}
		public void setApi(Api api) {
			this.api = api;
		}
		public Mobile getMobile() {
			return mobile;
		}
		public void setMobile(Mobile mobile) {
			this.mobile = mobile;
		}*/
}
