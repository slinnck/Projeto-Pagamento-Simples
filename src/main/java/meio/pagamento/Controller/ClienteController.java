package meio.pagamento.Controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import meio.pagamento.DTO.request.CadastrarClienteRequest;

@Controller("/cliente")
public class ClienteController {

    @Post
    public String cadastrar(@Body CadastrarClienteRequest request) {
        System.out.println("Cadastro");
        return "Cadastrado!";
    }

    @Get
    public String buscar() {
        System.out.println("Olá, vadia!");
        return "Usuário encontrado.";
    }

}
