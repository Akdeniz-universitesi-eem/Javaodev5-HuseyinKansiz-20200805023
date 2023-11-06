public class Methods2_3 {
    public static void main(String[] args) {
        System.out.println(changeCase("IsTaNBUl")); //deneme
        System.out.println(squeeze("adana","mersin")); //deneme
    }






    public static String changeCase(String metin){
        StringBuilder result = new StringBuilder(metin.length());   //string builder oluşturulur

        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));  //büyük harfse küçük...
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));    // ...küçük harfse büyük harf ata
            } else {
                result.append(c);  //büyük harf veya küçük harf değilse kendisini ata
            }
        }
        return result.toString(); //toString metoduyla stringbuilder stringe cevirilir
    }

    public static String squeeze(String metin1, String metin2) {
        StringBuilder result = new StringBuilder();  //string builder oluşturulur

        for (int i = 0; i < metin1.length(); i++) {
            char c = metin1.charAt(i);

            if (metin2.indexOf(c) == -1) {   //burası metin1in i indexindeki charın metin2 de bulunup bulunmadığına bakar bulunmuyorsa -1 döndüreceğinden
                result.append(c);           //bulunmuyorsa stringe ekleme yapar
            }
        }

        return result.toString();  //toString metoduyla stringbuilder stringe cevirilir
    }

}
