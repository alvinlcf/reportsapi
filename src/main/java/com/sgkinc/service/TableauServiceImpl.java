package com.sgkinc.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Service;

import com.sgkinc.dto.TableauDTO;

@Service
public class TableauServiceImpl implements TableauService {

	public List<TableauDTO> getTableauTicket(TableauDTO tableauDTO) {

		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();

			HttpPost postRequest = new HttpPost("https://test-tableau.5flow.net/trusted/");
//			StringBuffer data = new StringBuffer();
//			data.append("{\"target_site\":\"" + tableauDTO.getTarget_site() + "\",\"username\":\"" + tableauDTO.getUsername()
//					+ "\"}");

			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair("username", tableauDTO.getUsername()));
			params.add(new BasicNameValuePair("target_site", tableauDTO.getTarget_site()));
			postRequest.setEntity(new UrlEncodedFormEntity(params));

//			StringEntity input = new StringEntity(data.toString());

//			input.setContentType("application/x-www-form-urlencoded");
//			postRequest.setEntity(input);

			postRequest.setHeader("Accept", "application/json");
			postRequest.setHeader("Content-type", "application/x-www-form-urlencoded");

//        LOG.info("EmpProfileCreationHandler - Triggering to Command Center URL:"
//                + commandCenterURL
//                + " with address_id : "
//                + employerAddr.getId());

			CloseableHttpResponse response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				// resolve sonar comments.
				throw new HttpException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());

			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			while ((output = br.readLine()) != null) {
//				LOG.info("getTableauTicket - server replied : " + output);
				tableauDTO.setTrustedTicket(output);
			}

			List<TableauDTO> tableauDTOList = new ArrayList<TableauDTO>();
			tableauDTOList.add(tableauDTO);
			return tableauDTOList;

		} catch (Exception ex) {
//			LOG.error("getTableauTicket - EXCEPTION :" + ex.getMessage(), ex);
		}
		return null;
	}

}
