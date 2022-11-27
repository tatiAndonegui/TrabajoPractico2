import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //grupo a
        Equipo qatar = new Equipo("qatar");
        Equipo ecuador = new Equipo("ecuador");
        Equipo senegal = new Equipo("senegal");
        Equipo paises_bajos = new Equipo("paises bajos");

        //grupo b
        Equipo inglaterra = new Equipo("inglaterra");
        Equipo eeuu = new Equipo("eeuu");
        Equipo iran = new Equipo("iran");
        Equipo gales = new Equipo("gales");

        //grupo c
        Equipo argentina = new Equipo("argentina");
        Equipo arabia = new Equipo("arabia");
        Equipo mexico = new Equipo("mexico");
        Equipo polonia = new Equipo("polonia");

        //grupo d
        Equipo francia = new Equipo("francia");
        Equipo dinamarca = new Equipo("dinamarca");
        Equipo australia = new Equipo("australia");
        Equipo tunez = new Equipo("tunez");

        //grupo e
        Equipo espania = new Equipo("espania");
        Equipo costa_rica = new Equipo("costa_rica");
        Equipo alemania = new Equipo("alemania");
        Equipo japon = new Equipo("japon");

        //grupo f
        Equipo belgica = new Equipo("belgica");
        Equipo marruecos = new Equipo("marruecos");
        Equipo canada = new Equipo("canada");
        Equipo croacia = new Equipo(" croacia");

        //grupo g
        Equipo brasil = new Equipo("brasil");
        Equipo suiza = new Equipo("suiza");
        Equipo camerun = new Equipo("camerun");
        Equipo serbia = new Equipo("serbia");

        //grupo h
        Equipo portugal = new Equipo("portugal");
        Equipo uruguay = new Equipo("uruguay");
        Equipo corea_del_sur = new Equipo("corea_del_sur");
        Equipo ghana = new Equipo("ghana");

        EtapaMundial grupoA = new Grupo();
        grupoA.setDescripcionEtapa("grupo a");
        grupoA.addPartido(new Partido(new Date(), qatar,ecuador,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), senegal,paises_bajos,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), qatar,senegal,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), paises_bajos,ecuador,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), paises_bajos,qatar,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), ecuador,senegal,new Resultado()));

        EtapaMundial grupoB = new Grupo();
        grupoB.setDescripcionEtapa("grupo b");
        grupoB.addPartido(new Partido(new Date(), inglaterra,iran,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), eeuu,gales,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), inglaterra,eeuu,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), gales,iran,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), gales,inglaterra,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), iran,eeuu,new Resultado()));

        EtapaMundial grupoC = new Grupo();
        grupoC.setDescripcionEtapa("grupo c");
        grupoC.addPartido(new Partido(new Date(), argentina,arabia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), mexico,polonia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), argentina,mexico,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), polonia,arabia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), polonia,argentina,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), arabia,mexico,new Resultado()));

        EtapaMundial grupoD = new Grupo();
        grupoD.setDescripcionEtapa("grupo d");
        grupoD.addPartido(new Partido(new Date(), francia,australia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), dinamarca,tunez,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), francia,dinamarca,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), tunez,australia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), tunez,francia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), australia,dinamarca,new Resultado()));

        EtapaMundial grupoE = new Grupo();
        grupoE.setDescripcionEtapa("grupo e");
        grupoE.addPartido(new Partido(new Date(), espania,costa_rica,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), alemania,japon,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), espania,alemania,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), japon,costa_rica,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), japon,espania,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), costa_rica,alemania,new Resultado()));

        EtapaMundial grupoF = new Grupo();
        grupoF.setDescripcionEtapa("grupo f");
        grupoF.addPartido(new Partido(new Date(), belgica,canada,new Resultado()));
        grupoF.addPartido(new Partido(new Date(), marruecos,croacia,new Resultado()));
        grupoF.addPartido(new Partido(new Date(), belgica,marruecos,new Resultado()));
        grupoF.addPartido(new Partido(new Date(), croacia,canada,new Resultado()));
        grupoF.addPartido(new Partido(new Date(), croacia,belgica,new Resultado()));
        grupoF.addPartido(new Partido(new Date(), canada,marruecos,new Resultado()));

        EtapaMundial grupoG = new Grupo();
        grupoG.setDescripcionEtapa("grupo g");
        grupoG.addPartido(new Partido(new Date(), brasil,serbia,new Resultado()));
        grupoG.addPartido(new Partido(new Date(), suiza,camerun,new Resultado()));
        grupoG.addPartido(new Partido(new Date(), brasil,suiza,new Resultado()));
        grupoG.addPartido(new Partido(new Date(), camerun,serbia,new Resultado()));
        grupoG.addPartido(new Partido(new Date(), camerun,brasil,new Resultado()));
        grupoG.addPartido(new Partido(new Date(), serbia,suiza,new Resultado()));

        EtapaMundial grupoH = new Grupo();
        grupoH.setDescripcionEtapa("grupo h");
        grupoH.addPartido(new Partido(new Date(), portugal,ghana,new Resultado()));
        grupoH.addPartido(new Partido(new Date(), uruguay,corea_del_sur,new Resultado()));
        grupoH.addPartido(new Partido(new Date(), portugal,uruguay,new Resultado()));
        grupoH.addPartido(new Partido(new Date(), corea_del_sur,ghana,new Resultado()));
        grupoH.addPartido(new Partido(new Date(), corea_del_sur,portugal,new Resultado()));
        grupoH.addPartido(new Partido(new Date(), ghana,uruguay,new Resultado()));
    }



}