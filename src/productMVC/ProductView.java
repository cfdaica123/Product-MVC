package productMVC;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class ProductView {
        String tensp;
        int gia,soluong;

    public ProductView() {
    }
        
       public Product themPro(){
        System.out.println("----------------------");
        System.out.println("Tên SP: ");
        Scanner sc = new Scanner(System.in);
        tensp = sc.nextLine();
        System.out.println("Giá: ");
        gia = Integer.parseInt(sc.nextLine());
        System.out.println("Số lượng: ");
        soluong = Integer.parseInt(sc.nextLine());
        Product pro =new Product(tensp,gia,soluong);
                System.out.println("Finish");
                        System.out.println("**********************************");
        return pro;
    }
    
        public ArrayList<Product> nhapdanhsachPro(){
        ArrayList<Product> list = new ArrayList<>();
        boolean flag = true;
        while (flag){
            System.out.println("Bạn muốn nhập dữ liệu hay không?(Y/N)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if("n".equals(answer)||"N".equals(answer)){
                flag = false;
            }else{
                Product pr =  themPro();
                list.add(pr);
            }
        }
        return list;
    }
    
    public void hienthidanhsachPro(ArrayList<Product> products){
        System.out.println("---------------------");
        for(Product pr: products){
                    System.out.println("++"+pr.toString()+"++");                
        }
        System.out.println("---------------------");
    
    }
    public void hienthiPro(Product x){
        System.out.println("---------------------");
        System.out.println("++"+x.toString()+"++");                
        System.out.println("---------------------");
    }
    
     public void timPro(ArrayList<Product> products ){
        int result = -1;
        ArrayList<Product> list = new ArrayList<>();
        System.out.println("Nhập tên sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for(Product st:products){
            if(st.getTensp().equalsIgnoreCase(input)){
                hienthiPro(st);
            }
        }
        if (result == -1){
            System.out.println("không tìm sản phẩm!!!");
        }  
    }
     
    public void deletePro(){
        
        ArrayList<Product> list = new ArrayList<>();
        System.out.println("Nhập sản phẩm cần xóa: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for(int i=0; i<list.size();i++){
            if(list.get(i).getTensp().equalsIgnoreCase(input)){
                list.remove(i);
            }
        }
    }
}