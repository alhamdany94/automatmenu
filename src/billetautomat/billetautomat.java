package billetautomat;

public class billetautomat {
    
    /*
    1. variabler - tænk over hvilket attributter dit objekt skal have
    2. generer constructor - højre klik - insert code - constructor
    3. generer getter og setter, så du kan hente (gette) og ændre (sette) variablerne du definerede i (1)
    */
    
    private String slutDestination;
    private String startDestination;
    private int børnebilletpris;
    private int voksenbilletpris;
    private final int cykelPris;
    private int antalCykler;
    private int antalBørnebilletter;
    private int antalVoksenbilletter;
    private int pris;
    private String billettype;
    private int balanca;
    
    public billetautomat() {
        this.cykelPris = 26;
        
        
    }

    public String getSlutDestination() {
        return slutDestination;
    }
    public void setSlutDestination(String slutDestination) {
        this.slutDestination = slutDestination;
    }

    public String getStartDestination() {
        return startDestination;
    }
    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }
    
    public int getPris() {
        return pris;
    }
    public void setPris(int pris) {
        this.pris = pris;
    }
    
    public String getBillettype() {
        return billettype;
    }
    public void setBillettype(String billettype) {
        this.billettype = billettype;
    }

    public int getBørnebilletpris() {
        return børnebilletpris;
    }
    public void setBørnebilletpris(int børnebilletpris) {
        this.børnebilletpris = børnebilletpris;
    }
    
    public int getAntalBørnebilletter() {
        return antalBørnebilletter;
    }
    public void setAntalBørnebilletter(int antalBørnebilletter) {
        this.antalBørnebilletter = antalBørnebilletter;
    }

    public int getAntalVoksenbilletter() {
        return antalVoksenbilletter;
    }
    public void setAntalVoksenbilletter(int antalVoksenbilletter) {
        this.antalVoksenbilletter = antalVoksenbilletter;
    }
    
    public int getVoksenbilletpris() {
        return voksenbilletpris;
    }
    public void setVoksenbilletpris(int voksenbilletpris) {
        this.voksenbilletpris = voksenbilletpris;
    }

    public int getCykelPris() {
        return cykelPris;
    }

    public int getAntalCykler() {
        return antalCykler;
    }
    public void setAntalCykler(int antalCykler) {
        this.antalCykler = antalCykler;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
