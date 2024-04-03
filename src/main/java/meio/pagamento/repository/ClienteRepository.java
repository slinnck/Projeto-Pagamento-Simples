package meio.pagamento.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import meio.pagamento.entity.Cliente;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
