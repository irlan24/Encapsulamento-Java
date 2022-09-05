public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodos especiais

    public ControleRemoto(){    //Construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    
    //Setters and Getters

    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;

    }
    public void setLigado(boolean ligado){
        this.ligado =  ligado;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    public boolean getTocando(){
        return tocando;
    }

    //Metodos abstrtos

    @Override
    public void ligar() {

        this.setLigado(true);
                
    
    }


    @Override
    public void desligar() {
        this.setLigado(false);
        
    }


    @Override
    public void abrirMenu() {
        System.out.println("-------MENU------");
        if(this.getLigado() == true){
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Tem tocando? " + getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i=0; i< this.getVolume(); i+=10){
            System.out.print("|");
        }
        }
        
        
    }


    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
        
    }


    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            setVolume(getVolume() + 5);
        }
        
    }


    @Override
    public void menosVolume() {
        if (this.getLigado()==true){
            setVolume(getVolume() - 5);
        }
        
    }


    @Override
    public void ligarMudo() {
        if(this.getLigado()==true && this.getVolume()>0){
            setVolume(0);
        }
        
    }


    @Override
    public void desligarMudo() {
        if(this.getLigado()==true && this.getVolume() == 0){
            setVolume(50);
        }
        
    }


    @Override
    public void play() {
        if(this.getLigado() && this.getTocando() == false){
            setTocando(true);
        }
        
    }


    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() == true){
            setTocando(false);
        
    }

}
}