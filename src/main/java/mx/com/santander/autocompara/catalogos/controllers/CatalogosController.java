package mx.com.santander.autocompara.catalogos.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.santander.autocompara.catalogos.model.ActividadesGiros;
import mx.com.santander.autocompara.catalogos.model.Ocupaciones;
import mx.com.santander.autocompara.catalogos.model.Paises;

@RestController
public class CatalogosController {

	@RequestMapping(value = "/actividadesGiro", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<ActividadesGiros> actividadesGiro() {

		return null;
	}

	@RequestMapping(value = "/ocupaciones", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Ocupaciones> ocupaciones() {
		return null;
	}

	@RequestMapping(value = "/nacionalidades", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Paises> nacionalidades() {
		return null;
	}

}
