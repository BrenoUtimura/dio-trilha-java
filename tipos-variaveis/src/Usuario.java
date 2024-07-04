public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada?  " + smartTv.ligada);
        System.out.println("Em qual canal?  " + smartTv.canal);
        System.out.println("E qual o volume da TV?  " + smartTv.volume);

        smartTv.ligada();
        System.out.println("Novo status -> TV está ligada?  " + smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo status -> TV está ligada?  " + smartTv.ligada);

        smartTv.aumentandoVolume();
        smartTv.aumentandoVolume();
        smartTv.aumentandoVolume();
        smartTv.aumentandoVolume();
        smartTv.diminuindoVolume();
        System.out.println("Novo status -> volume da TV?  " + smartTv.volume);

        System.out.println("Gostaria de mudar para qual canal?  ");
        smartTv.mudarCanal(10);
        System.out.println("Novo status -> Em qual canal?  " + smartTv.canal);
    }
}
