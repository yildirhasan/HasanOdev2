public class Temelilan {


    private String ilanname;
    private String ilandescription;
    private String sehir;
    private String ilce;

    Temelilan(){
    }
    public String getSehir(){
        return sehir;
    }
    public String setSehir(String sehir){
        return this.sehir = sehir;
    }
    public String getIlce(){
        return ilce;
    }
    public String setIlce(String ilce){
        return this.ilce = ilce;
    }
    public String getIlanname() {
        return ilanname;
    }

    public void setIlanname(String ilanname) {
        this.ilanname = ilanname;
    }

    public String getIlandescription() {
        return ilandescription;
    }

    public void setIlandescription(String ilandescription) {
        this.ilandescription = ilandescription;
    }

}
