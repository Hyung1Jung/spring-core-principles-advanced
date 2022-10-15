package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {

    private final OrderServicevV0 orderServicevV0;

    @GetMapping("/v0/request")
    public String request(String itemId){
        orderServicevV0.orderItem(itemId);
        return "ok";
    }
}
