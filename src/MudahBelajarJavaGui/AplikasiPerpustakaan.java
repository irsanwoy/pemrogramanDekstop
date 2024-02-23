
package MudahBelajarJavaGui;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class AplikasiPerpustakaan {
    public static void main(String[] args) {
//        start contaier
         JFrame form = new JFrame("aplikasi perpustakaan");  // membuat container/frame
         form.setSize(400, 550); // mengatur lebar dan tinggi
         form.setVisible(true);// untuk menampilkan frame
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // agar menyetop otomatis saat di close
         form.setLocationRelativeTo(null);// agar frame berada ditengah
//         end kontainer

        JLabel labelJudul = new JLabel("aplikasi perpustakaan"); // membuat objek untuk label
        labelJudul.setBounds(200, 30, 150, 30);
         form.add(labelJudul);
    }
}
