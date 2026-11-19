public class Szyfr {
    public static String szyfrujCezarem(String slowoDoSzyfrowania, int klucz){
        String zaszyfrowaneSlowo = "";
        klucz = klucz % 26;
        for (int i = 0; i < slowoDoSzyfrowania.length(); i++) {
            char litera = slowoDoSzyfrowania.charAt(i);
            if(litera == ' '){
                zaszyfrowaneSlowo = zaszyfrowaneSlowo + litera;
            }else{
                int kod = (int)litera + klucz;
                if(kod>(int)'z'){
                    kod = kod -26;
                }
                if(kod<(int)'a'){
                    kod = kod+26;
                }
                zaszyfrowaneSlowo = zaszyfrowaneSlowo +(char)kod;
            }

        }
        return zaszyfrowaneSlowo;
    }

}
