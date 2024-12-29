import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount=21;
        int columnCount=19;
        int tilesSize=32;
        int boardWidth=columnCount*tilesSize;
        int boardHeight=columnCount*tilesSize;

        JFrame frame=new JFrame("Pac Man");
        //frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);//for screen open in center
        frame.setResizable(false);//user con't resize the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame=new PacMan();//from PacMan.java
        frame.add(pacmanGame);
        frame.pack();//full size jpanel within on the windo
        pacmanGame.requestFocus();
        frame.setVisible(true);


    }
}
