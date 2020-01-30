package com.studyskymate.dinesh.corejava.rest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ConnectionEx {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://www.google.com");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			HttpURLConnection con= (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			Map<String,String> parameters =new HashMap();
			parameters.put("param1", "val");
			con.setDoOutput(true);
			DataOutputStream out = new DataOutputStream(con.getOutputStream());
		//	out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
			
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
