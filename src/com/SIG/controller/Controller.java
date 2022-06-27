
package com.SIG.controller;
import com.SIG.view.SIG_InvoicesFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;


public class Controller implements ActionListener {

    private SIG_InvoicesFrame frame;
    
    public Controller(SIG_InvoicesFrame frame) {
        this.frame = frame;
    }
    
    @Override
  public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println("Action: " + actionCommand);
        switch (actionCommand) {
            case "Load File":
                loadFile();
                break;
            case "Save File":
                saveFile();
                break;
            case "Create New Invoice":
                createNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Create New Item":
                createNewItem();
                break;
            case "Delete Item":
                deleteItem();
                break;
        }
    }


    
    private void loadFile() 
    { JFileChooser fileChooser=new JFileChooser();
    fileChooser.showOpenDialog(null);
    
         }
    
    

    private void saveFile() {
          }

    private void createNewInvoice() {
        }

    private void deleteInvoice() {
         }

    private void createNewItem() {
        }

    private void deleteItem() {
          }

}