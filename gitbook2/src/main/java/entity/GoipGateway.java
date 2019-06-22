package entity;

public class GoipGateway {
    private int id;
    private String title;
    private int port;
    private int ip;

    public GoipGateway(int id, String title, int port, int ip) {
        this.id = id;
        this.title = title;
        this.port = port;
        this.ip = ip;
    }

    public int getId() {
        return id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public void setId(int id) {
        this.id = id;
    }
}
