package barbosa.adriano.btgpactual.orderms.repository;

import barbosa.adriano.btgpactual.orderms.controller.dto.OrderResponse;
import barbosa.adriano.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findByCustomerId(Long customerId, PageRequest pageRequest);
}
