package com.sgkinc.service;

import java.util.List;

import com.sgkinc.dto.TableauDTO;

public interface TableauService {

	List<TableauDTO> getTableauTicket(TableauDTO tableauDTO);
}
