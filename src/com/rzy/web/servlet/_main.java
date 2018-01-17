package com.rzy.web.servlet;

import com.todaytech.gfmis.webservices.face.ExternalInterfaceWS;
import com.todaytech.gfmis.webservices.face.ExternalInterfaceWSProxy;
import com.todaytech.gfmis.webservices.face.ExternalInterfaceWSServiceLocator;
import com.todaytech.gfmis.webservices.face.ExternalInterfaceWSSoapBindingStub;
import com.todaytech.gfmis.webservices.vo.GeneratePayNoteGTVO;
import com.todaytech.gfmis.webservices.vo.GeneratePayNoteRetVO;
import com.todaytech.gfmis.webservices.vo.LoginRetVO;
import com.todaytech.gfmis.webservices.vo.LoginVO;

public class _main {

	public static void main(String[] args) {
		try {
			ExternalInterfaceWSServiceLocator locator = new ExternalInterfaceWSServiceLocator();
			locator.setExternalInterfaceWSEndpointAddress("http://192.168.9.250:8080/ttfsws/services/ExternalInterfaceWS?wsdl");
			locator.setMaintainSession(true);
			ExternalInterfaceWSSoapBindingStub ws = (ExternalInterfaceWSSoapBindingStub)locator.getExternalInterfaceWS();
//			ExternalInterfaceWSProxy proxy = new ExternalInterfaceWSProxy();
//			ExternalInterfaceWSSoapBindingStub ws = (ExternalInterfaceWSSoapBindingStub)proxy.getExternalInterfaceWS();
//			GeneratePayNoteRetVO retVO = ws.generatePayNoteGt(new GeneratePayNoteGTVO());
			LoginRetVO login = ws.login(new LoginVO());
			System.out.println(login.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
