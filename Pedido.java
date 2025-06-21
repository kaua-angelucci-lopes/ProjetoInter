public class Pedido {
    private int idPedido;
    private String data;
    private double valorTotal;
    private int status;
    private Cliente idCliente;


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Pedido(String data, int idPedido, int status, double valorTotal) {
        this.data = data;
        this.idPedido = idPedido;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public Pedido() {
        this.data = "sem data";
        this.idPedido = 0;
        this.status = 0;
        this.valorTotal = 0;
    }
    
}
