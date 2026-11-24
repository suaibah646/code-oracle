import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {
    Font font;
    Color grayColor;
    Color darkGrayColor;
    Color backgroundColor;
    
    public DrawShapes() {
        font = new Font("Arial", Font.ITALIC, 18);
        grayColor = Color.gray;
        backgroundColor = Color.white; // Background putih
        darkGrayColor = Color.darkGray; // Menggantikan warna biru
        
        setBackground(backgroundColor);
    }
    
    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        graph.setFont(font);
        graph.setColor(Color.black); // Teks warna hitam
        graph.drawString("Draw Shapes", 90, 20);
        
        graph.setColor(darkGrayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        
        graph.setColor(grayColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        graph.setColor(Color.black);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        // Membuat jendela (window) aplikasi
        JFrame frame = new JFrame("Draw Shapes Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Memasukkan gambar/shapes ke dalam jendela
        DrawShapes panel = new DrawShapes();
        frame.add(panel);
        
        // Menampilkan jendela ke layar
        frame.setVisible(true);
    }
}