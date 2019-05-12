package br.com.gerircondominio.condominio.documento;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("/documento")
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;

	@RequestMapping(value = "/salvar", method = POST)
	private Documento salvar(@RequestParam("arquivo") MultipartFile arquivo) {
		Documento documento = new Documento();
		try {
			documento.setArquivo(arquivo.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return documentoService.salvar(documento);
	}
}