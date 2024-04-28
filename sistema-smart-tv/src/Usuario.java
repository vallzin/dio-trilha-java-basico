public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+smartTv.ligada);
        
        System.out.println("Volume atual: "+smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo volume da Tv "+smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume da TV para "+smartTv.volume);

        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Mudando de canal "+smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? "+smartTv.ligada);
    }

    
}
