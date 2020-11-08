package pojo;

public class ProductData {
    private String name;
    private String priceDol;
    private String priceEuro;
    private String pricePound;

    public ProductData(String _name,
                       String _priceDol,
                       String _priceEuro,
                       String _pricePound){
        this.name = _name;
        this.priceDol = _priceDol;
        this.priceEuro = _priceEuro;
        this.pricePound = _pricePound;
    }
    public String getName() {
        return this.name;
    }
    public String getPriceDol() {
        return this.priceDol;
    }
    public String getPriceEuro() {
        return this.priceEuro;
    }
    public String getPricePound() {
        return this.pricePound;
    }
}
