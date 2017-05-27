
package tabbedpaneexample;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TabbedPaneExample extends JFrame implements ActionListener{
    
        JButton b1,b2,b3,b4,b5,b6,c1,c2,c3,c4,c5,d1,d2,d3;
        JLabel label1, label2;
        double num1=0,num2=0,result=0;
        JTextField field, field2,l1;
        
        
	static public	JTabbedPane tabbedPane;
	static public	JPanel		panel1;
	static public	JPanel		panel2;
	static public	JPanel		panel3;
        static public	JPanel		panel4;
        static public	JPanel		panel5;


	public TabbedPaneExample()
	{
		// NOTE: to reduce the amount of code in this example, it uses
		// panels with a NULL layout.  This is NOT suitable for
		// production code since it may not display correctly for
		// a look-and-feel.
		
		setTitle( "Muestra Layouts" );
		
		setBackground( Color.gray );

		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create the tab pages
		Page1();
		Page2();
		Page3();
                Page4();
                Page5();

		// Create a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Free Layout", panel1 );
		tabbedPane.addTab( "Border Layout", panel2 );
		tabbedPane.addTab( "Grid Layout", panel3 );
                tabbedPane.addTab( "Box Layout", panel4 );
                tabbedPane.addTab( "Flow Layout", panel5 );
		topPanel.add( tabbedPane, BorderLayout.CENTER );
	}

	public void Page1()
	{
		panel1 = new JPanel();
		panel1.setLayout( null );

		label1 = new JLabel( "Número 1:" );
		label1.setBounds( 10, 15, 150, 20 );
		panel1.add( label1 );

		field = new JTextField();
		field.setBounds( 10, 35, 150, 20 );
		panel1.add( field );

		label2 = new JLabel( "Número 2:" );
		label2.setBounds( 30, 60, 150, 20 );
		panel1.add( label2 );

		field2 = new JTextField();
		field2.setBounds( 30, 80, 150, 20 );
		panel1.add( field2 );
                
                b6=new JButton(" Sumar ");
                b6.setBounds( 190, 50, 80, 25 );
                b6.addActionListener(this);
		panel1.add( b6 );
                
                
                l1 = new JTextField();
		l1.setBounds( 10, 160, 150, 20 );
		l1.setEnabled(true);
                l1.setEditable(false);
                panel1.add( l1 );
                
                
                
	}

	public void Page2()
	{
		panel2 = new JPanel();
		panel2.setLayout( new BorderLayout() );
                
                c1=new JButton( "North" );
                c2=new JButton( "South" );
                c3=new JButton( "East" );
                c4=new JButton( "West" );
                c5=new JButton( "Center" );
                
                c1.addActionListener(this);
                c2.addActionListener(this);
                c3.addActionListener(this);
                c4.addActionListener(this);
                c5.addActionListener(this);
                
		panel2.add( c1, BorderLayout.NORTH );
		panel2.add( c2, BorderLayout.SOUTH );
		panel2.add( c3, BorderLayout.EAST );
		panel2.add( c4, BorderLayout.WEST );
		panel2.add( c5, BorderLayout.CENTER );
	}

	public void Page3()
	{
		panel3 = new JPanel();
		panel3.setLayout( new GridLayout( 3, 2 ) );

		panel3.add( new JLabel( "Field 1:" ) );
		panel3.add( new TextArea("Hola") );
		panel3.add( new JLabel( "Field 2:" ) );
		panel3.add( new TextArea("TextArea 2") );
		panel3.add( new JLabel( "Field 3:" ) );
		panel3.add( new TextArea("Y otra TextArea editable :D") );
	}
        
        public void Page4()
	{
		panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
                                
                b1=new JButton( " Opción 1" );
                b2=new JButton( " Opción 2" );
                b3=new JButton( " Opción 3" );
                b4=new JButton( " Opción 4" );
                b5=new JButton( " Opción 5" );
                
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                                
		panel4.add(b1);
		panel4.add(b2);
		panel4.add(b3);
		panel4.add(b4);
		panel4.add(b5);
		
	}
        
        public void Page5()
	{
		panel5 = new JPanel();
		panel5.setLayout( new FlowLayout() );
                panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
                
                d1=new JButton( "Button1" );
                d2=new JButton( "Button2" );
                d3=new JButton( "Button3" );
                
                d1.addActionListener(this);
                d2.addActionListener(this);
                d3.addActionListener(this);

		panel5.add( new JLabel( "Field 1:" ) );
		panel5.add( d1 );
		panel5.add( new JLabel( "Field 2:" ) );
		panel5.add( d2 );
		panel5.add( new JLabel( "Field 3:" ) );
		panel5.add( d3 );
	}

    // Main method to get things started
	public static void main( String args[] )
	{
		// Create an instance of the test application
		TabbedPaneExample ventana = new TabbedPaneExample();
		ventana.setVisible( true );
                ventana.setBounds(600, 250, 400, 600);
                ventana.setSize( 500, 500 );
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b6){
            
            num1=Double.parseDouble(field.getText());
            num2=Double.parseDouble(field2.getText());
            
            result=num1+num2;
            l1.setText(""+result);
        }
        
        if(ae.getSource()==c1){
            JOptionPane.showMessageDialog(null, "Pulso el botón NORTE.");
        }
        
        if(ae.getSource()==c2){
            JOptionPane.showMessageDialog(null, "Pulso el botón SUR.");
        }
        
        if(ae.getSource()==c3){
            JOptionPane.showMessageDialog(null, "Pulso el botón ESTE.");
        }
        
        if(ae.getSource()==c4){
            JOptionPane.showMessageDialog(null, "Pulso el botón OESTE.");
        }
        
        if(ae.getSource()==c5){
            JOptionPane.showMessageDialog(null, "Pulso el botón CENTRO.");
        }
        
        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null, "Pulso la OPCIÓN 1.");
        }
        
        if(ae.getSource()==b2){
            JOptionPane.showMessageDialog(null, "Pulso la OPCIÓN 2.");
        }
        
        if(ae.getSource()==b3){
            JOptionPane.showMessageDialog(null, "Pulso la OPCIÓN 3.");
        }
        
        if(ae.getSource()==b4){
            JOptionPane.showMessageDialog(null, "Pulso la OPCIÓN 4.");
        }
        
        if(ae.getSource()==b5){
            JOptionPane.showMessageDialog(null, "Pulso la OPCIÓN 5.");
        }
        
        if(ae.getSource()==d1){
            JOptionPane.showMessageDialog(null, "Hola!, soy el botón 1 :D");
        }
        
        if(ae.getSource()==d2){
            JOptionPane.showMessageDialog(null, "Hola!, soy el botón 2 :D");
        }
        
        if(ae.getSource()==d3){
            JOptionPane.showMessageDialog(null, "Hola!, soy el botón 3 :D");
        }
    }
}
