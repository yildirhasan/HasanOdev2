import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz  islem turunu  ilgili alana yazin 1. Emlak ilani Olusturma,  2.Vasita ilani Olusturma  ve  3.Cikis : ");
        int secilenIslem = input.nextInt();
        do {
            if (secilenIslem == 1) {
                System.out.println("Emlak ilani islemleri baslandi  ");
                System.out.println("lutfen sirasiyla ilan bilgileriniz giriniz 1. ilan adi ," +
                        "2. ilan   tanimi ,  3 Site ici bilgisi , 4 ilan ilcesi 5 ilan ili , 6 ilan oda sayisi 7 ilan alani 8 ilan kat saysi  , ");
                Scanner input2 = new Scanner(System.in);
                System.out.println(" Emlak ilan adi ");
                String ilanname = input2.nextLine();
                System.out.println(" ilan tanimi/aciklamasi");
                String ilandescription = input2.nextLine();
                System.out.println(" ilan site ici bilgisi");
                String ilanSiteici = input2.nextLine();
                System.out.println(" ilanin bulundugu ilce bilgisi  ");
                String ilanIlce = input2.nextLine();
                System.out.println(" ilanin bulundugu sehir bilgisi");

                String ilansehir = input2.nextLine();
                System.out.println(" ilandaki Oda sayisi");
                int ilanOdasayisi = input2.nextInt();
                System.out.println(" ilan alan(metrekare) bilgisi");
                int ilanAlanBilgisi = input.nextInt();
                System.out.println(" ilanin bulundugu kat");
                int ilanKatsayisi = input2.nextInt();


                EmlakIlan emlakilan = new EmlakIlan();
                emlakilan.setIlanname(ilanname);
                emlakilan.setIlandescription(ilandescription);
                emlakilan.setSiteBilgisi(ilanSiteici);
                emlakilan.setIlce(ilanIlce);
                emlakilan.setSehir(ilansehir);
                emlakilan.setOdaBilgisi(ilanOdasayisi);
                emlakilan.setIlanAlan(ilanAlanBilgisi);
                emlakilan.setKatBilgisi(ilanKatsayisi);
                int reelOdasayisi = emlakilan.getOdabilgisi() - 1;

                System.out.println("-----------Girmis Oldugunuz Emlak ilan bilgileri asagidaki gibidir ------------   ");
                System.out.println(" Emlak ilan adi :  " + emlakilan.getIlanname());
                System.out.println(" ilan aciklamasi  : " + emlakilan.getIlandescription() + " ...  ");
                System.out.println(" ilan oda sayisi " + reelOdasayisi + "+1 dir ");
                System.out.println(" ilan alani  " + emlakilan.getIlanAlan() + " m2 dir .");
                System.out.println(" ilan kat bilgisi " + emlakilan.getKatbilgisi() + " 'dir. ");
                System.out.println(" ilan site icirisinde mi :  " + emlakilan.getSiteBilgisi() +" dir");
                System.out.println(" Bu ilan " + emlakilan.getSehir().toUpperCase() + " ilinin " + emlakilan.getIlce().toUpperCase() + " ilcesinde bulunmaktadir ..");
                break;

            } else if (secilenIslem == 2) {
                System.out.println(" Vasita ilani islemleri basladi  ");
                VasitaIlan ilanVasita = new VasitaIlan();
                System.out.println(" lutfen sirasiyla ilan bilgileriniz giriniz 1. ilan adi ," +
                        "2. ilan   tanimi ,  3 kazali mi , 4 sahibinden mi bilgisi ,  5 renk , 6 ilan, 7 vites tipi , 8 sehir , 9  ilce    , ");
                Scanner input2 = new Scanner(System.in);
                System.out.println(" Vasita ilan adi ");
                String ilanname = input2.nextLine();
                System.out.println(" ilan tanimi/aciklamasi ");
                String ilandescription = input2.nextLine();
                System.out.println(" ilan kaza bilgisi ");
                String ilanKazabilgisi = input2.nextLine();
                System.out.println(" ilan sahibinden mi  bilgisi ");
                String ilanSahibibilgisi = input2.nextLine();
                System.out.println(" ilan vasita renk bilgisi ");
                String renkBilgisi = input2.nextLine();
                System.out.println(" ilan vites  bilgisi ");
                String ilanVitesBilgisi = input2.nextLine();
                System.out.println(" ilan sehir bilgisi");
                String ilansehir = input2.nextLine();
                System.out.println(" ilan bulundugu ilce ");
                String ilanIlce = input2.nextLine();


                System.out.println("ilk ilan tanimi === " + ilanVasita.getIlandescription());

                ilanVasita.setIlanname(ilanname);
                ilanVasita.setIlandescription(ilandescription);
                ilanVasita.setRenk(renkBilgisi);
                ilanVasita.setVitestipi(ilanVitesBilgisi);
                ilanVasita.setKazaliMi(ilanKazabilgisi);
                ilanVasita.setSahibindenMi(ilanSahibibilgisi);
                ilanVasita.setSehir(ilansehir);
                ilanVasita.setIlce(ilanIlce);


                System.out.println("-----------  Girmis Oldugunuz Vasita ilan bilgileri asagidaki gibidir ------------   ");
                System.out.println(" ilan adi :  " + ilanVasita.getIlanname().toUpperCase());
                System.out.println(" ilan aciklamasi  : " + ilanVasita.getIlandescription() + "  ...  ");
                System.out.println(" Arac renk bilgisi : " + ilanVasita.getRenk());
                System.out.println(" Arac kaza bilgisi " + ilanVasita.getKazaliMi());
                System.out.println(" ilan sahibinden mi bilgisi : " + ilanVasita.getSahibindenMi());
                System.out.println(" ilan vites tipi bilgisi : " + ilanVasita.getVitestipi());
                System.out.println(" ilan " + ilanVasita.getSehir().toUpperCase() + " sehrinde " + ilanVasita.getIlce().toUpperCase()+ " ilcesinde bulunmaktadir ");
                break;

            }
            else if(secilenIslem==3) {
                System.out.println(" Gorusmek uzere ...");
                System.exit(0);
            }
            else {

                System.out.println(" Yanlis girdi lutfen tekrar istediginiz secegini  giriniz  Emlak icin 1 , Vasita icin 2, Cikmak icin 3 yaziniz  ");
                Scanner input4 = new Scanner(System.in);
                secilenIslem = input4.nextInt();

            }
        }
        while(!(secilenIslem==1 && secilenIslem==2 && secilenIslem==3));
        System.out.println("----------- Ilaniniz yukaridaki gibi basarili sekilde olusturulmustur daha sonra tekrardan gorusmek uzere   ... -----------");
        System.exit(0);



    }
}
