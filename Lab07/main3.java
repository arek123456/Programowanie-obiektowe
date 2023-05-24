package Lab07;


class main3 {
    public static void main(String[] arg) {
        System.out.println("===========PROSTOKAT=================");
        Prostokat prostokat = new Prostokat(4, 7, "niebieski"){};
        System.out.println(prostokat.opis());
        System.out.println("Pole: "+prostokat.getPowierzchnia());
        System.out.println(prostokat.wPolu(new Punkt(3,6)));
        prostokat.skaluj(7);

        System.out.println("===========TROJKAT=================");
        Trojkat trojkat = new Trojkat(8, 5, "zielony"){};
        System.out.println(trojkat.opis());
        System.out.println("Pole: "+trojkat.getPowierzchnia());
        System.out.println(trojkat.wPolu(new Punkt(2,5)));
        trojkat.skaluj(5);

        System.out.println("===========KWADRAT=================");
        Kwadrat kwadrat = new Kwadrat(12, "brazowy"){};
        System.out.println(kwadrat.opis());
        System.out.println("Pole: "+kwadrat.getPowierzchnia());
        System.out.println(kwadrat.wPolu(new Punkt(1,7)));
        kwadrat.skaluj(8);

        System.out.println("===========OKRAG=================");
        Okrag ok = new Okrag(1, new Punkt(3,6)) {};
        System.out.println(ok.opis());
        ok.przesun(3,11);
        System.out.println(ok.opis());
        ok.skaluj(2);

        System.out.println("=================TABLICA1======================");

        Figura1[] tablicaFigur1 = new Figura1[10];

        for(int i = 0; i<10; i++){
            if(i < 5){
                Trojkat tr = new Trojkat(i+4,i+2, "niebieski"){};
                tablicaFigur1[i] = tr;
            }
            if(i>=5){
                Prostokat pr = new Prostokat(i+2, i+5, "zielony"){};
                tablicaFigur1[i] = pr;
            }
            System.out.println(tablicaFigur1[i].opis());
        }

        System.out.println("=================TABLICA2===============");

        IFigury[] tablica = new IFigury[10];
        for(int i = 0; i<10; i++){
            if(i<=3) {
                Prostokat pr = new Prostokat(i + 1, i + 5, "") {};
                tablica[i] = pr;
            } else if (i>3 && i<7) {
                Kwadrat kw = new Kwadrat(i+5, ""){};
                tablica[i] = kw;
            }
            else{
                Trojkat tr = new Trojkat(i+2, i+4, ""){};
                tablica[i] = tr;
            }
            System.out.print("Pole: ");
            System.out.println(tablica[i].getPowierzchnia());
            System.out.println(tablica[i].wPolu(new Punkt(2,3)));
        }
    }
}