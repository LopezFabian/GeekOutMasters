package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor F
 * @version v.1.0.0 date:21/11/2021
 */
public class GUIGridBagLayout extends JFrame {
    private static final String MENSAJE_INICIO = "Bienvenido a Geek Out Masters \n"
            + "Oprime el boton activar para iniciar el juego y luego de que inicie, Con el podras activar el dado seleccionado"
            + "Oprime el boton cambiar para cambiar el dado seleccionado"
            + "\nEl Meeple permite relanzar otro dado en juego, es decir, de la sección dados activos."
            + "\nLa Nave Espacial envía un dado no usado (de la sección dados activos) a la sección de dados\n" +
            "inactivos."
            + "\nEl Superhéroe permite que cualquier dado no usado (sección dados activos) sea volteado y\n" +
            "colocado en su cara opuesta."
            + "\nEl Corazón permite tomar un dado de la sección de dados inactivos y lanzarlo para que sea un\n" +
            "nuevo dado activo."
            + "\nEl Dragón es la cara que se quiere evitar, ya que si al final de la ronda es el último dado activo que\n" +
            "queda se habrán perdido todos los puntos ganados y acumulados."
            + "\n42 es cara que permite sumar puntos al final de la ronda."
            + "\nEste juego lo jugará un único jugador y ganará si logra sumar 30 puntos en 5 rondas consecutivas de juego.";

    private Header headerProject;
    private JLabel dado1, dado2, dado3, dado4, dado5, dado6, dado7;
    private JButton activar, cambiar, ayuda;
    private JPanel panelDados;
    private ImageIcon imageDados;
    private JTextArea numeroDado, tarjetaPuntuacion;
    private Escucha escucha;
    private ModelGame modelGame;

    /**
     * Constructor of GUI class
     */
    public GUIGridBagLayout(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek Out Masters");
        this.setUndecorated(true);
        this.setBackground(new Color(255, 255, 255, 0));
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constrains = new GridBagConstraints();

        //Create Listener Object and Control Object
        escucha = new Escucha();
        modelGame = new ModelGame;
        //Set up JComponents
        headerProject = new Header("Mesa Juego Geek Out Masters", Color.BLACK);
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.gridwidth = 2;
        constrains.fill = GridBagConstraints.HORIZONTAL;
        this.add(headerProyect,constrains);

        ayuda = new JButton(" ? ");
        ayuda.addActionListener(escucha);
        constrains.gridx = 0;
        constrains.gridy = 1;
        constrains.gridwidth = 1;
        constrains.fill = GridBagConstraints.NONE;
        constrains.anchor = GridBagConstraints.LINE_START;
        this.add(ayuda, constrains);

        panelDados = new JPanel();
        panelDados.setPreferredSize(new Dimension(300, 180));
        panelDados.setBorder(BorderFactory.createTitledBorder(" Tus Dados "));
        panelDados.add(dado1);
        panelDados.add(dado2);

        constrains.gridx = 0;
        constrains.gridy = 2;
        constrains.gridwidth = 1;
        constrains.fill = GridBagConstraints.BOTH;
        constrains.anchor = GridBagConstraints.CENTER;

        add(panelDados,constrains);

        activar = new JButton("lanzar");
        activar.addActionListener(escucha);
        constrains.gridx = 0;
        constrains.gridy = 3;
        constrains.gridwidth = 2;
        constrains.fill = GridBagConstraints.NONE;
        constrains.anchor = GridBagConstraints.CENTER;
        add(activar,constrains);
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
