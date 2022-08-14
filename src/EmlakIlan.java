public class EmlakIlan extends Temelilan {

    private int odaSayisi;
    private int alan;
    private int kat;
    private String siteIcersindemi;


    EmlakIlan(){
        super();
    }


    public int getIlanAlan(){
        return alan;
    }
    public int setIlanAlan(int alan){
        return this.alan=alan;
    }
    public int getKatbilgisi(){
        return kat;
    }
    public int setKatBilgisi(int kat){
        return this.kat=kat;
    }
    public int getOdabilgisi(){
        return odaSayisi;
    }
    public int setOdaBilgisi(int odaSayisi){
        return this.odaSayisi=odaSayisi;
    }
    public String getSiteBilgisi(){
        return siteIcersindemi;
    }
    public String setSiteBilgisi(String siteIcersindemi){
        return this.siteIcersindemi = siteIcersindemi;
    }





    /*
    public String ilanOlustur(String ilanname,String ilandescription,int odaSayisi,int alan,int kat,String sehir,String ilce){
       // return ilanname + ilandescription + odaSayisi +alan + kat + sehir + ilce;
        String ilan =  ilanname+ ilandescription + odaSayisi +alan + kat + sehir + ilce;
        return ilan ;
    }*/

}
