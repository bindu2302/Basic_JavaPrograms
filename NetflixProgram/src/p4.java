
public class p4 {

	public static void main(String[] args) {
		int rows = 5;
        int maxStars = 2 * rows -1;  // Maximum stars in the first row

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            // Print stars
            for (int k = 1; k <= maxStars - 2 * (i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}



//public class p4 {
//    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 0; i < rows; i++) {
//            // Print spaces
//            for (int j = 0; j <= rows - i - 1; j++) {
//                System.out.print("_");
//            }
//            // Print stars
//            for (int k = 0; k <= 2 * i + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
