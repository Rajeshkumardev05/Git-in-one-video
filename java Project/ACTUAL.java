import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
public class ACTUAL {
    public static void main(String[] args) {
        new welcome();
    }
}
class welcome extends JFrame implements ActionListener {
    JButton enter;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JPanel left;
    JPanel right;
    Timer timer;
    ImageIcon icon;
    welcome() {
        enter = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        int width = 200;
        int height = 50;
        int size = 30;
        left = new JPanel();
        right = new JPanel();
        icon = new ImageIcon("black_ball.jpg");
        enter.setFont(new Font("MV BOLI", Font.BOLD, 25));
        enter.setText("ENTER");
        enter.setOpaque(true);
        enter.setForeground(Color.RED);
        enter.setBackground(new Color(0xA5D7E8));
        enter.setBounds(150, 250, 200, 100);
        enter.addActionListener(this);
        enter.setFocusable(false);
        label1.setText("WELCOME");
        label1.setBounds(150, 20, width, height);
        label1.setFont(new Font("MV BOLI", Font.ITALIC, size));
        label1.setForeground(new Color(0x576CBC));
        label2.setText("TO");
        label2.setBounds(150, 70, width, height);
        label2.setFont(new Font("MV BOLI", Font.ITALIC, size));
        label2.setForeground(new Color(0x576CBC));
        label3.setText("GAMING");
        label3.setBounds(150, 120, width, height);
        label3.setFont(new Font("MV BOLI", Font.ITALIC, size));
        label3.setForeground(new Color(0x576CBC));
        label4.setText("ADDA");
        label4.setBounds(150, 170, width, height);
        label4.setFont(new Font("MV BOLI", Font.ITALIC, size));
        label4.setForeground(new Color(0x576CBC));
        left.setSize(new Dimension(35, 500));
        left.setBackground(Color.RED);
        left.setBounds(0, 0, 35, 500);
        right.setSize(new Dimension(50, 500));
        right.setBackground(Color.RED);
        right.setBounds(450, 0, 50, 500);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0x0B2447));
        setVisible(true);
        setFocusable(false);
        setFont(new Font("MV BOLI", Font.ITALIC, 25));
        setResizable(false);
        paint(getGraphics());
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(left);
        add(right);
        add(enter);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            new progressBar();
            this.dispose();
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(0, 0, 30, 30);
        Image img = new ImageIcon("blck-ball.png").getImage();
        g.drawImage(img, 0, 0, null);
    }
}

class progressBar extends JFrame implements ActionListener {
    static int i = 1;
    JProgressBar jpb;
    Timer timer;
    progressBar() {
        jpb = new JProgressBar(0, 100);
        jpb.setValue(0);
        jpb.setStringPainted(true);
        jpb.setBounds(0, 0, 500, 200);
        jpb.setBackground(Color.black);
        jpb.setForeground(Color.red);
        timer = new Timer(50, this);
        timer.start();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Loading Page..");
        setVisible(true);
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(jpb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = jpb.getValue();
        if (value < 100) {
            jpb.setValue(value + 1);
            value++;
        } else if (value == 100) {
            dispose();
            i++;
            if (i == 2)
                new GamePage();
            if (i >= 2) {
                dispose();
            }
        }
    }
}
class GamePage extends JFrame implements ActionListener {
    JButton ticButton;
    JButton snaButton;
    JButton exitButton;
    JLabel Heading;
    JLabel iconLabel;
    GameFrame gf;
    GamePage() {
        ticButton = new JButton();
        snaButton = new JButton();
        exitButton = new JButton();
        Heading = new JLabel();
        iconLabel = new JLabel();
        Heading.setText("     GAMERS HUB");
        Heading.setFont(new Font("MV BOLI", Font.BOLD + Font.ITALIC, 35));
        Heading.setVerticalAlignment(JLabel.TOP);
        Heading.setBounds(20, 20, 1000, 40);
        iconLabel.setIcon(new ImageIcon("game-logo.jpeg"));
        iconLabel.setBounds(73, 70, 2000, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setTitle("Game page");
        setSize(500, 500);
        setLocationRelativeTo(null);
        ticButton.setText("TIC TAC TOE");
        ticButton.setFocusable(false);
        ticButton.setVisible(true);
        ticButton.setBounds(73, 300, 150, 50);
        ticButton.setForeground(Color.RED);
        ticButton.setBackground(Color.BLACK);
        ticButton.addActionListener(this);
        snaButton.setText("SNAKE & LADDER");
        snaButton.setFocusable(false);
        snaButton.setVisible(true);
        snaButton.setBounds(250, 300, 150, 50);
        snaButton.setForeground(Color.RED);
        snaButton.setBackground(Color.BLACK);
        snaButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setVisible(true);
        exitButton.setBounds(161, 360, 150, 50);
        exitButton.setForeground(Color.RED);
        exitButton.setBackground(Color.BLACK);
        exitButton.addActionListener(this);
        add(Heading);
        add(iconLabel);
        add(ticButton);
        add(snaButton);
        add(exitButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ticButton) {
            new TicToe();
            dispose();
        }
        if (e.getSource() == snaButton) {
            gf = new GameFrame();
            dispose();
        }
        if (e.getSource() == exitButton) {
            new efgh();
            dispose();
        }
    }
}
class efgh extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JButton exit;
    efgh() {
        label1 = new JLabel(" THANK");
        label2 = new JLabel("  YOU");
        label3 = new JLabel("  SIR");
        exit = new JButton();
        label1.setBounds(150, 100, 200, 40);
        label1.setVisible(true);
        label1.setForeground(Color.RED);
        label1.setFont(new Font("MV BOLI", Font.BOLD, 40));
        label2.setBounds(150, 150, 200, 40);
        label2.setVisible(true);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("MV BOLI", Font.BOLD, 40));
        label3.setBounds(150, 200, 200, 40);
        label3.setVisible(true);
        label3.setForeground(Color.RED);
        label3.setFont(new Font("MV BOLI", Font.BOLD, 40));
        exit.setText("CLick To Exit");
        exit.setFont(new Font("MV BOLI", Font.BOLD, 20));
        exit.addActionListener(this);
        exit.setBounds(150, 300, 200, 100);
        exit.setBackground(Color.GREEN);
        exit.setForeground(Color.RED);
        exit.setFocusable(false);
        exit.setVisible(true);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        add(label1);
        add(label2);
        add(label3);
        add(exit);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            exit.setVisible(false);
            try {
                Thread.sleep(50);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            dispose();
        }
    }
}

class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    static final int DELAY = 200;
    final int[] x = new int[GAME_UNITS];
    final int[] y = new int[GAME_UNITS];
    int bodyParts = 1;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        if (running) {
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, ((SCREEN_WIDTH / 2) - (metrics.stringWidth("Game Over")) / 2), g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }
    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U':
                y[0] -= UNIT_SIZE;
                break;
            case 'D':
                y[0] += UNIT_SIZE;
                break;
            case 'L':
                x[0] -= UNIT_SIZE;
                break;
            case 'R':
                x[0] += UNIT_SIZE;
                break;

        }
    }
    public void checkApples() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    public void CheckCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        if (x[0] < 0) {
            running = false;
        }
        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }
        if (y[0] < 0) {
            running = false;
        }
        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        if (!running) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, ((SCREEN_WIDTH / 2) - (metrics1.stringWidth("Game Over")) / 2), g.getFont().getSize());
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", ((SCREEN_WIDTH / 2) - (metrics2.stringWidth("Game Over")) / 2), SCREEN_HEIGHT / 2);
        new efgh();
    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApples();
            CheckCollisions();
        }
        repaint();
    }
}
class TicToe implements ActionListener {
  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel title_panel = new JPanel();
  JPanel button_panel = new JPanel();
  JLabel textfield = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_turn;
  public TicToe() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.getContentPane().setBackground(new Color(50, 50, 50));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);
    textfield.setBackground(new Color(25, 25, 25));
    textfield.setForeground(new Color(25, 255, 0));
    textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
    textfield.setHorizontalAlignment(JLabel.CENTER);
    textfield.setText("TIC-TAC-TOE");
    textfield.setOpaque(true);
    title_panel.setLayout(new BorderLayout());
    title_panel.setBounds(0, 0, 800, 100);
    button_panel.setLayout(new GridLayout(3, 3));
    button_panel.setBackground(new Color(150, 150, 150));
    for (int i = 0; i < 9; i++) {
      buttons[i] = new JButton();
      button_panel.add(buttons[i]);
      buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }
    title_panel.add(textfield);
    frame.add(title_panel, BorderLayout.NORTH);
    frame.add(button_panel);
    firstTurn();
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < 9; i++) {
      if (e.getSource() == buttons[i]) {
        if (player1_turn) {
          if (buttons[i].getText() == "") {
            buttons[i].setForeground(new Color(255, 0, 0));
            buttons[i].setText("X");
            player1_turn = false;
            textfield.setText("O Turn");
            check();
          }
        } else {
          if (buttons[i].getText() == "") {
            buttons[i].setForeground(new Color(0, 255, 0));
            buttons[i].setText("O");
            player1_turn = true;
            textfield.setText("X Turn");
            check();
          }
        }
      }
    }
    if(!buttons[0].isEnabled() && 
       !buttons[1].isEnabled() &&
       !buttons[2].isEnabled() &&
       !buttons[3].isEnabled() &&
       !buttons[4].isEnabled() &&
       !buttons[5].isEnabled() &&
       !buttons[6].isEnabled() &&
       !buttons[7].isEnabled() &&
       !buttons[8].isEnabled() 
    ){   
        new efgh();
    }
  }

  public void firstTurn() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (random.nextInt(2) == 0) {
      player1_turn = true;
      textfield.setText("X Turn");
    } else {
      player1_turn = false;
      textfield.setText("Y Turn");
    }
  }
  public void check() {
    if ((buttons[0].getText() == "X") &&
        (buttons[1].getText() == "X") &&
        (buttons[2].getText() == "X")) {
      xWins(0, 1, 2);
    }
    if ((buttons[3].getText() == "X") &&
        (buttons[4].getText() == "X") &&
        (buttons[5].getText() == "X")) {
      xWins(3, 4, 5);
    }
    if ((buttons[6].getText() == "X") &&
        (buttons[7].getText() == "X") &&
        (buttons[8].getText() == "X")) {
      xWins(6, 7, 8);
    }
    if ((buttons[0].getText() == "X") &&
        (buttons[3].getText() == "X") &&
        (buttons[6].getText() == "X")) {
      xWins(0, 3, 6);
    }
    if ((buttons[1].getText() == "X") &&
        (buttons[4].getText() == "X") &&
        (buttons[7].getText() == "X")) {
      xWins(1, 4, 7);
    }
    if ((buttons[2].getText() == "X") &&
        (buttons[5].getText() == "X") &&
        (buttons[8].getText() == "X")) {
      xWins(2, 5, 8);
    }
    if ((buttons[0].getText() == "X") &&
        (buttons[4].getText() == "X") &&
        (buttons[8].getText() == "X")) {
      xWins(0, 4, 8);
    }
    if ((buttons[2].getText() == "X") &&
        (buttons[4].getText() == "X") &&
        (buttons[6].getText() == "X")) {
      xWins(2, 4, 6);
    }
    if ((buttons[0].getText() == "O") &&
        (buttons[1].getText() == "O") &&
        (buttons[2].getText() == "O")) {
      oWins(0, 1, 2);
    }
    if ((buttons[3].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[5].getText() == "O")) {
      oWins(3, 4, 5);
    }
    if ((buttons[6].getText() == "O") &&
        (buttons[7].getText() == "O") &&
        (buttons[8].getText() == "O")) {
      oWins(6, 7, 8);
    }
    if ((buttons[0].getText() == "O") &&
        (buttons[3].getText() == "O") &&
        (buttons[6].getText() == "O")) {
      oWins(0, 3, 6);
    }
    if ((buttons[1].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[7].getText() == "O")) {
      oWins(1, 4, 7);
    }
    if ((buttons[2].getText() == "O") &&
        (buttons[5].getText() == "O") &&
        (buttons[8].getText() == "O")) {
      oWins(2, 5, 8);
    }
    if ((buttons[0].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[8].getText() == "O")) {
      oWins(0, 4, 8);
    }
    if ((buttons[2].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[6].getText() == "O")) {
      oWins(2, 4, 6);
    }
  }
  public void xWins(int a, int b, int c) {
    buttons[a].setBackground(Color.BLUE);
    buttons[b].setBackground(Color.BLUE);
    buttons[c].setBackground(Color.BLUE);
    for (int i = 0; i < 9; i++) {
      buttons[i].setEnabled(false);
    }
    textfield.setText("GAME OVER X wins");
  }
  public void oWins(int a, int b, int c) {
    buttons[a].setBackground(Color.BLUE);
    buttons[b].setBackground(Color.BLUE);
    buttons[c].setBackground(Color.BLUE);
    for (int i = 0; i < 9; i++) {
      buttons[i].setEnabled(false);
    }
    textfield.setText("GAME OVER O wins");
  }
};