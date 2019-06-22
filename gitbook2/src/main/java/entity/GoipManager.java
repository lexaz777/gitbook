package entity;

import java.util.List;

public class GoipManager {
    private List<GoipGateway> goipGateways;

    public List<GoipGateway> getGoipGateways() {
        return goipGateways;
    }

    public void setGoipGateways(List<GoipGateway> goipGateways) {
        this.goipGateways = goipGateways;
    }
}
