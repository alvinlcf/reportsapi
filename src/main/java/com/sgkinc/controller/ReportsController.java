package com.sgkinc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgkinc.dto.TableauDTO;
import com.sgkinc.dto.TableauListingDTO;
import com.sgkinc.service.TableauService;

@RestController
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	private TableauService tableauService;

	@RequestMapping(value = "/name/{username}", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public TableauListingDTO welcomenotes(@PathVariable("username") String username) {
		StringBuilder welcomenotes = new StringBuilder("Hi ");
		welcomenotes.append(username);

		TableauDTO dummyTableauDTO = new TableauDTO();
		dummyTableauDTO.setUsername(welcomenotes.toString());

		List<TableauDTO> tableauDTOList = new ArrayList<TableauDTO>();
		tableauDTOList.add(dummyTableauDTO);

		return new TableauListingDTO(tableauDTOList, null);
	}

	@RequestMapping(value = "/getTableauTicket", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public TableauListingDTO getTableauTicket(@RequestBody TableauDTO tableauDTO) {
		List<TableauDTO> tableauDTOList = tableauService.getTableauTicket(tableauDTO);

		return new TableauListingDTO(tableauDTOList, null);
	}
}