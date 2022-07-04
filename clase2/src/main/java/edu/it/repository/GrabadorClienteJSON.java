package edu.it.repository;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import edu.it.error.GrabacionErroneaException;
import edu.it.model.Cliente;

public class GrabadorClienteJSON implements GrabadorCliente {

	public void grabarCliente(Cliente cli) {
		try {
		String cliJSON = new Gson().toJson(cli);
		String fullPath = String.join("", "/var/dicaprios/", cli.id, ".json");
		File absFile = new File(fullPath);
		
		FileUtils.write(absFile, cliJSON, "utf-8");
		}
		catch (Exception ex) {
			throw new GrabacionErroneaException();
		}
	}

}
