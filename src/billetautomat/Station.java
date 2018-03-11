package billetautomat;

import java.util.Scanner;

public class Station {
    
    
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        billetautomat automat = new billetautomat();
        while(true){
            System.out.println("tryk 1 for køb af billetter\ntryk 2 for login som montør");
            int menu1Valg = tastatur.nextInt();
        
        
            if(menu1Valg==1){
                System.out.println("vælg destination for rejsen\ntryk 1 for København H     tryk 2 for Oddense C     tryk 3 for Århus C");
                int startdestinationsValg = tastatur.nextInt();
                System.out.println("Hvor rejser du fra\ntryk 1 for København H     tryk 2 for Oddense C     tryk 3 for Århus C");
                int slutdestinationsvalg = tastatur.nextInt();
                if(startdestinationsValg==1){
                    automat.setSlutDestination("København");
                    if(slutdestinationsvalg==1){
                        automat.setBørnebilletpris(12);
                        automat.setVoksenbilletpris(24);
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==2){
                        automat.setBørnebilletpris(189);
                        automat.setVoksenbilletpris(311);  
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==3){
                        automat.setBørnebilletpris(279);
                        automat.setVoksenbilletpris(420);  
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                }
                else if(startdestinationsValg==2){
                    automat.setSlutDestination("Oddense");
                    if(slutdestinationsvalg==1){
                        automat.setBørnebilletpris(189);
                        automat.setVoksenbilletpris(311);
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==2){
                        automat.setBørnebilletpris(12);
                        automat.setVoksenbilletpris(24); 
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==3){
                        automat.setBørnebilletpris(110);
                        automat.setVoksenbilletpris(205);  
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }   
                    }
                }
                else if(startdestinationsValg==3){
                    automat.setSlutDestination("Århus");
                    if(slutdestinationsvalg==1){
                        automat.setBørnebilletpris(279);
                        automat.setVoksenbilletpris(420);
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==2){
                        automat.setBørnebilletpris(110);
                        automat.setVoksenbilletpris(205);
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else if(slutdestinationsvalg==3){
                        automat.setBørnebilletpris(12);
                        automat.setVoksenbilletpris(24);
                        while(true){
                            automat.setPris((automat.getAntalBørnebilletter()*automat.getBørnebilletpris())+(automat.getVoksenbilletpris()*automat.getAntalVoksenbilletter())+(automat.getAntalCykler()*automat.getCykelPris()));
                            System.out.println("1. Tilføj børnebillet ("+automat.getBørnebilletpris()+" kr)");
                            System.out.println("2. Tilføj børnebillet ("+automat.getVoksenbilletpris()+" kr)");
                            System.out.println("3. Tilføj børnebillet ("+automat.getCykelPris()+" kr)");
                            System.out.println("4. Fortsæt til betaling");
                            System.out.println("\n                      pris: "+automat.getPris());
                            int valg = tastatur.nextInt();
                            if(valg==1){
                                automat.setAntalBørnebilletter(automat.getAntalBørnebilletter()+1);
                            }
                            else if(valg==2){
                                automat.setAntalVoksenbilletter(automat.getAntalVoksenbilletter()+1);
                            }
                            else if(valg==3){
                                automat.setAntalCykler(automat.getAntalCykler()+1);
                            }
                            else if(valg==4){
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Ugyldigt valg..");
                    }
                }
            }
        }
    }
}