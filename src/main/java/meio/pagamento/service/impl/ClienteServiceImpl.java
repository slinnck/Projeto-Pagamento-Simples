package meio.pagamento.service.impl;

import jakarta.inject.Inject;
import meio.pagamento.dto.ClienteDTO;
import meio.pagamento.dto.request.CadastrarClienteRequest;
import meio.pagamento.entity.Cliente;
import meio.pagamento.enums.TipoPagamentoEnum;
import meio.pagamento.repository.ClienteRepository;
import meio.pagamento.service.ClienteService;
import meio.pagamento.utils.Mensagens;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private Cliente montaEntidadeCliente(Cliente entidadeCliente, CadastrarClienteRequest request) {
        entidadeCliente.setNomeCliente(request.getNomeCliente());
        entidadeCliente.setDataNascimento(request.getDataNascimento());
        entidadeCliente.setCpf(request.getCpf());
        entidadeCliente.setContaPagamento(TipoPagamentoEnum.tipoPagamento(request.getTipoContaPagamento()));
        return entidadeCliente;
    }

    @Inject
    ClienteRepository clienteRepository;
    @Override
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();

    }

    @Override
    public String salvarCliente(CadastrarClienteRequest dto) {
        Cliente cliente = new Cliente();
        montaEntidadeCliente(cliente, dto);
        clienteRepository.save(cliente);
        return Mensagens.CLIENTE_CADASTRADO;
    }
}
