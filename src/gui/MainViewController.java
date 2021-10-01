package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

    @FXML
    private MenuItem menuItemAbout;
    
    @FXML
    private MenuItem menuItemDepartment;
    
    @FXML
    private MenuItem menuItemSeller;
        
    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("onMenuItemAboutAction");
    }
    
    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }
    
    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
