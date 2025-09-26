package Control;

import javax.swing.JDesktopPane;

import view.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyagu
 */
public class ControlTela {
    JDesktopPane tela;
    
    //telas gerais=========================
    exitConfirm telaExit;
    MenuInicial telaIni;
    //=====================================
    //ela mesma para passar as outras telas
    ControlTela controlTela;
    //=====================================
    

    public ControlTela() {
    }

    public ControlTela(JDesktopPane tela) {
        this.tela = tela;
        
    }
    
    public void reciveItself(ControlTela controlTela){
        this.controlTela = controlTela;
    }
    
    public void openTelas(){
        telaIni = new MenuInicial(controlTela);
        telaExit = new exitConfirm(controlTela);
    }
    
    public void openTelaIni(){
        tela.removeAll();
        tela.updateUI();
        telaIni.setSize(tela.getSize());
        telaIni.setLocation(0, 0);
        tela.add(telaIni);
        telaIni.setVisible(true);
    }
    
    public void openTelaExit(){
        tela.removeAll();
        tela.updateUI();
        telaExit.setSize(tela.getSize());
        telaExit.setLocation(0, 0);
        tela.add(telaExit);
        telaExit.setVisible(true);
    }
}
