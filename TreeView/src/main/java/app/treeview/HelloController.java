package app.treeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TreeView treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Files");

        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leafitem1 = new TreeItem<>("Pictures1");
        TreeItem<String> leafitem2 = new TreeItem<>("Pictures2");
        TreeItem<String> leafitem3 = new TreeItem<>("Music1");
        TreeItem<String> leafitem4 = new TreeItem<>("Music2");
        TreeItem<String> leafitem5 = new TreeItem<>("Videos1");
        TreeItem<String> leafitem6 = new TreeItem<>("Videos2");

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
        branchItem1.getChildren().addAll(leafitem1, leafitem2);
        branchItem2.getChildren().addAll(leafitem5, leafitem6);
        branchItem3.getChildren().addAll(leafitem3, leafitem4);

        treeView.setShowRoot(false);
        treeView.setRoot(rootItem);
    }

    public void selectItem() {
        TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();

        if (item != null) {
            System.out.println(item.getValue());
        }

    }

}