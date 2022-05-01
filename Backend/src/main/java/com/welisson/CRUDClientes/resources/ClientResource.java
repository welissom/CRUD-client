package com.welisson.CRUDClientes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welisson.CRUDClientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Rafa", "000.000.000-00", null, null, null));
		list.add(new Client(2L, "Joana", "000.000.000-00", null, null, null));
		return ResponseEntity.ok().body(list);
	}
}
