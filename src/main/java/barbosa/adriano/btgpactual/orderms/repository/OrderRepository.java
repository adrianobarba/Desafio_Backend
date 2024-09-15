package barbosa.adriano.btgpactual.orderms.repository;

import barbosa.adriano.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
