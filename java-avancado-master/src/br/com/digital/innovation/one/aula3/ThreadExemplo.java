package br.com.digital.innovation.one.aula3;
//THREADS é um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se autodividir em duas ou mais tarefas. 
//Essas tarefas múltiplas podem ser executadas simultaneamente para rodar mais rápido do que um programa em um único bloco ou praticamente juntas
public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento2 iniciarBarraDeCarregamento = new BarraDeCarregamento2(iniciarGeradorPdf);
        //Thread iniciarBarraDecarregamento = new Thread();
        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();

    }

}


class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

//class BarraDeCarregamento implements Runnable {
//	@Override
//	public void run() { System.out.println("Loading ..."); }
//}


class BarraDeCarregamento2 extends Thread {
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento2(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading ... ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}

