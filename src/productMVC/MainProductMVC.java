package productMVC;

import java.util.Scanner;

/**
 *
 * @author Fox0fNight
 */
public class MainProductMVC {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        ProductController sc = new ProductController(new ProductView());
        int choose;
        Scanner scan = new Scanner(System.in);
        
        do{
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose){
                case 1:
                    sc.nhapdanhsachPro();break;
                case 2:
                    sc.hienthidanhsachPro();break;
                case 3:
                    sc.timkiemPro();break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: 
                    System.out.println("GOOBYE!!");break;
                default:
                    System.out.println("Nhập sai mất tiêu!!");break;
            }
        }while(choose!=4);
    
        
    }
    public static void showMenu(){
        System.out.println("1. Nhập vào số lượng sản phẩm.");
        System.out.println("2. Hiển thị danh sách sản phẩm.");
        System.out.println("3. Tifm kiếm sản phẩm.");
        System.out.println("4. Sửa sản phẩm.");
        System.out.println("5. Xóa sản phẩm.");
        System.out.println("6. Bye bye ahihi.");
    }
    
}