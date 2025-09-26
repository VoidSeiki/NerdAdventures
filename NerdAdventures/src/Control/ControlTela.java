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
    
    MenuInicial telaIni;
    

    public ControlTela() {
    }

    public ControlTela(JDesktopPane tela) {
        this.tela = tela;
        openTelas();
        openTelaIni();
    }
    
    public void openTelas(){
        telaIni = new MenuInicial();
        
    }
    
    public void openTelaIni(){
        tela.removeAll();
        tela.updateUI();
        telaIni.setSize(tela.getSize());
        telaIni.setLocation(0, 0);
        tela.add(telaIni);
        telaIni.setVisible(true);
    }
}
