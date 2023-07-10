package Practice;

import javax.swing.*;
import java.awt.*;

public class StarTriangleTest extends JFrame {

    public StarTriangleTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // JEditorPane을 생성하고 HTML 컨텐츠를 설정합니다.
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><body><h1>Hello, HTML in Swing!</h1></body></html>");
        editorPane.setEditable(false);

        // JEditorPane을 프레임에 추가합니다.
        getContentPane().add(new JScrollPane(editorPane));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StarTriangleTest();
        });
    }
}
