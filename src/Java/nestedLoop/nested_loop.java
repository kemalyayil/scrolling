package Java.nestedLoop;
/*
15  5   100 2
30  10  90  4
45  15  80  8
60  20  70  16
75  25  60  32
90  30  50  64
Yukarıdaki ekran görüntüsünde 4 farklı kolon var.
Birinci kolonda 1'den 100'e kadar olan 15'in katlarını
ikinci kolonda 1'den 30'a kadar olan 5'in katları
üçüncü kolonda 100'den 50'ye kadar olan 10'un katları
dördüncü kolonda ise 2'den 64'e kadar olan 2'nin üstlerini ekran görüntüsündeki gibi yazılması isteniyor.
 */
public class nested_loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1) {
                    System.out.print(i * 15 + " ");
                } else if (j == 2) {
                    System.out.print(i * 5 + " ");
                } else if (j == 3) {
                    System.out.print(110 - (i * 10) + " ");
                } else {
                    System.out.print(2 * i + " ");
                }
            }
            System.out.println("   "+ i + ". loop ta iken");
        }
        }

    }

