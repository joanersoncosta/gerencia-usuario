package br.com.attornatus.endereco.application.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.com.attornatus.DataHelpher;
import br.com.attornatus.endereco.aplication.api.EnderecoAlteracaoRequest;
import br.com.attornatus.endereco.aplication.api.EnderecoIdResponse;
import br.com.attornatus.endereco.aplication.api.EnderecoRequest;
import br.com.attornatus.endereco.aplication.repository.EnderecoRepository;
import br.com.attornatus.endereco.aplication.service.EnderecoApplicationService;
import br.com.attornatus.endereco.domain.Endereco;
import br.com.attornatus.pessoa.application.api.PessoaIdResponse;
import br.com.attornatus.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoa.domain.Pessoa;

@ExtendWith(MockitoExtension.class)
class EnderecoApplicationTest {

	@Autowired
	private EnderecoApplicationService enderecoApplicationService;

	@MockBean
	private EnderecoRepository enderecoRepository;
	
	@MockBean
	private PessoaRepository pessoaRepository;

	@MockBean
	DataHelpher dataHelpher;
	
	@MockBean
	Endereco endereco = DataHelpher.createEndereco();
	UUID idEndereco = endereco.getIdEndereco();
	@MockBean
	Pessoa pessoa = DataHelpher.createPessoa();;
	UUID idPessoa = pessoa.getIdPessoa();
	
	@BeforeEach
	void setup() {
		endereco = DataHelpher.createEndereco();
		pessoa = DataHelpher.createPessoa();
		idEndereco = endereco.getIdEndereco();
		idPessoa = endereco.getIdPessoa();
//        when(enderecoRepository.buscaEnderecoPeloId(any())).thenReturn(endereco);
//        when(pessoaRepository.buscaPessoaPorId(any())).thenReturn(pessoa);
	}

	@Test
	void testCriaPessoa() {
//		EnderecoRequest enderecoCriado= DataHelpher.getEnderecoRequest();
//        when(pessoaRepository.buscaPessoaPorId(any())).thenReturn(DataHelpher.createPessoa());
//		when (enderecoRepository.salvaEndereco(any())).thenReturn(new Endereco(enderecoCriado));
//		enderecoApplicationService.buscaEnderecoDaPessoaComId(idPessoa, idEndereco);
//		verify(pessoaRepository, times(1)).buscaPessoaPorId(idPessoa);	
//		verify(enderecoRepository, times(1)).buscaEnderecoPeloId(idEndereco);	
//
//		EnderecoIdResponse response = enderecoApplicationService.criaEndereco(idPessoa, enderecoCriado);
//		assertNotNull(response);
//        assertEquals(PessoaIdResponse.class, response.getClass());
	}
	
	@Test
	void testBuscaEnderecoDaPessoaComId() {
//		when(pessoaRepository.buscaPessoaPorId(idPessoa)).thenReturn(pessoa);
//		when(enderecoRepository.buscaEnderecoPeloId(any(UUID.class))).thenReturn(endereco);
//		enderecoApplicationService.buscaEnderecoDaPessoaComId(idPessoa, idEndereco);
//		verify(enderecoRepository, times(1)).buscaEnderecoPeloId(idEndereco);	
	}

	@Test
	void testDeletaEnderecoDaPessoaComId() {
//		Endereco enderecoMock = DataHelpher.createEndereco();
//		when (enderecoRepository.buscaEnderecoPeloId(enderecoMock.getIdPessoa())).thenReturn(enderecoMock);
//		enderecoApplicationService.deletaEnderecoDaPessoaComId(enderecoMock.getIdPessoa(), enderecoMock.getIdEndereco());
//		verify(enderecoRepository, times(1)).deletaEndereco(enderecoMock);
	}

	@Test
	void testAlteraEnderecoDaPessoaComId() {
//		Endereco enderecoMock = DataHelpher.createEndereco();
//		when(pessoaRepository.buscaPessoaPorId(idPessoa)).thenReturn(pessoa);
//		when(enderecoRepository.buscaEnderecoPeloId(any())).thenReturn(endereco);
//		EnderecoAlteracaoRequest request = new EnderecoAlteracaoRequest("123456789", "Cidade", "Rua 5", "145");
//		enderecoMock.altera(request);
//		enderecoApplicationService.alteraEnderecoDaPessoaComId(enderecoMock.getIdPessoa(), enderecoMock.getIdEndereco(), request);
//		verify(enderecoRepository, times(1)).buscaEnderecosDaPessoaComId(enderecoMock.getIdPessoa());	
	}

}
