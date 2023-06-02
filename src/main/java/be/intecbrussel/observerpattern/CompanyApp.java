package be.intecbrussel.observerpattern;

public class CompanyApp {
    public static void main(String[] args) {
        Influencer influencer1 = new Influencer("PewDiePie");
        Influencer influencer2 = new Influencer("JackSepticEye");
        Influencer influencer3 = new Influencer("Mr.Beast");
        Influencer influencer4 = new Influencer("Markplier");
        Influencer influencer5 = new Influencer("Zach King");

        Company bigCompany = new Company();

        bigCompany.addObserver(influencer1);
        bigCompany.addObserver(influencer2);
        bigCompany.addObserver(influencer3);
        bigCompany.addObserver(influencer4);
        bigCompany.addObserver(influencer5);

        bigCompany.createNewProduct("ET GAME", "WOOOOOOW NICE GRAPHICS!", 1.99);
    }
}
