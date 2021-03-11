package productMVC;

/**
 *
 * @author Fox0fNight
 */
public class Product {
    private String tensp;
    private int gia,soluong;

    public Product() {
    }

    public Product(String tensp, int gia, int soluong) {
        this.tensp = tensp;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Product{" + "tensp=" + tensp + ", gia=" + gia + ", soluong=" + soluong + '}';
    }
    
    
    
}