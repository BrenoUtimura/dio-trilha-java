public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    public void ligada(){
        ligada = true;
    }

    public void desligada(){
        ligada = false;
    }

    public void aumentandoVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuindoVolume(){
        //volume = volume - 1
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
