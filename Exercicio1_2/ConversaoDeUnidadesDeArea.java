package Exercicio1_2;

public class ConversaoDeUnidadesDeArea {
    protected static float medida = 0;


    public static float metroPes() {
        medida = (float) (medida * (10.76));
        return medida;

    }

    public static float pesCentimetros() {
        medida =medida * (929);
        return medida;
    }


    public static float milhaAcre() {
        medida = medida * (640);
        return medida;
    }


    public static float acrePes() {
        medida = (float) (medida * (43.56));
        return medida;
    }
}