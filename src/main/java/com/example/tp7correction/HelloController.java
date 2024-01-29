package com.example.tp7correction;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    ArrayList<Carte> lesCartes = new ArrayList<>();

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img16;
    @FXML
    private ImageView img15;
    @FXML
    private ImageView img14;
    @FXML
    private ImageView img13;
    @FXML
    private ImageView img12;
    @FXML
    private ImageView img11;
    @FXML
    private ImageView img10;
    @FXML
    private ImageView img9;
    @FXML
    private ImageView img8;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img7;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img2;

    @FXML
    public void imageClicked(Event event) {
        ImageView imageViewClique =  (ImageView) event.getSource();
        retournerImage(imageViewClique);

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initjeu();
    }


    public void initjeu(){
        Carte c1 = new Carte("Image1.png");
        Carte c2 = new Carte("Image2.png");
        Carte c3 = new Carte("Image3.png");
        Carte c4 = new Carte("Image4.png");
        Carte c5 = new Carte("Image5.png");
        Carte c6 = new Carte("Image6.png");
        Carte c7 = new Carte("Image7.png");
        Carte c8 = new Carte("Image8.png");

        lesCartes.add(c1);lesCartes.add(c2);lesCartes.add(c3);
        lesCartes.add(c4);lesCartes.add(c5);lesCartes.add(c6);lesCartes.add(c7);lesCartes.add(c8);

        lesCartes.add(c1);lesCartes.add(c2);lesCartes.add(c3);
        lesCartes.add(c4);lesCartes.add(c5);lesCartes.add(c6);lesCartes.add(c7);lesCartes.add(c8);

        Collections.shuffle(lesCartes);

        // 1ère méthode:
//        Image image = new Image("");
//        img1.setImage(image);
//        image = new Image("");
//        img2.setImage(image);
//        image = new Image("");
//        img3.setImage(image);
//        image = new Image("");
//        img4.setImage(image);
//        image = new Image("");
//        img5.setImage(image);
//        image = new Image("");
//        img6.setImage(image);
//        image = new Image("");
//        img7.setImage(image);
//        image = new Image("");
//        img8.setImage(image);

        img1.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img2.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img3.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img4.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img5.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img6.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img7.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img8.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img9.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img10.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img11.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img12.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img13.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img14.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img15.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));
        img16.setImage(new Image(String.valueOf(getClass().getResource("/images/Image0.png"))));

    }

    public void retournerImage(ImageView imageView){
        if (imageView.getId().equals("img1")){
            img1.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(0).getNom()).toString()));
        }
        else if (imageView.getId().equals("img2")) {
            img2.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(1).getNom()).toString()));
        }
        else if (imageView.getId().equals("img3")) {
            img3.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(2).getNom()).toString()));
        }
        else if (imageView.getId().equals("img4")) {
            img4.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(3).getNom()).toString()));
        }
        else if (imageView.getId().equals("img5")) {
            img5.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(4).getNom()).toString()));
        }
        else if (imageView.getId().equals("img6")) {
            img6.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(5).getNom()).toString()));
        }
        else if (imageView.getId().equals("img7")) {
            img7.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(6).getNom()).toString()));
        }
        else if (imageView.getId().equals("img8")) {
            img8.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(7).getNom()).toString()));
        }
        else if (imageView.getId().equals("img9")) {
            img9.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(8).getNom()).toString()));
        }
        else if (imageView.getId().equals("img10")) {
            img10.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(9).getNom()).toString()));
        }
        else if (imageView.getId().equals("img11")) {
            img11.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(10).getNom()).toString()));
        }
        else if (imageView.getId().equals("img12")) {
            img12.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(11).getNom()).toString()));
        }
        else if (imageView.getId().equals("img13")) {
            img13.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(12).getNom()).toString()));
        }
        else if (imageView.getId().equals("img14")) {
            img14.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(13).getNom()).toString()));
        }
        else if (imageView.getId().equals("img15")) {
            img15.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(14).getNom()).toString()));
        }
        else if (imageView.getId().equals("img16")) {
            img16.setImage(new Image(getClass().getResource("/images/"+lesCartes.get(15).getNom()).toString()));
        }
    }
}