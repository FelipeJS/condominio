package br.com.gerircondominio.condominio.documento;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerircondominio.condominio.tipodocumento.TipoDocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;

	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	public Documento salvar(Documento documento) {
		documento.setTipoDocumento(tipoDocumentoRepository.findById(1L).get());
		documento.setNome("imagem teste");
		documento.setObservacao("imagem de teste");
		documento.setDataCadastro(Calendar.getInstance());
		return documentoRepository.save(documento);
	}
}