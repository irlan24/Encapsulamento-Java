public class App {
    public static void main(String[] args) throws Exception {
        
        ControleRemoto c1 = new ControleRemoto();

        //Testar as interações possíveis do dispositivo

        c1.ligar(); //Ligar ou desligar 
        c1.play();  //Play ou Pause
        c1.ligarMudo();  //LigarMudo ou DesligarMudo
        c1.abrirMenu(); //Status do Menu. Apenas funciona no modo 'LIGADO'

    }
}
