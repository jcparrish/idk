package javaapplication1;

//A code that asks the user (targeted at women) how she’s feeling and then returns an inspirational quote that is intended to motivate the user and encourage her to keep working hard


import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;



public class WomenEmpowerment extends JFrame implements ActionListener  
{
   JLabel quotes = new JLabel("How are you feeling?");
   JButton stressed = new JButton("Stressed");
   JButton anxious = new JButton("Anxious");
   JButton discouraged = new JButton("Discouraged");
   JButton frustrated = new JButton("Frustrated");
   JButton uncomfortable = new JButton("Uncomfortable");
   String Inspiration, stressedQuote, anxiousQuote, discouragedQuote, frustratedQuote, uncomfortableQuote;
    //-----------------------------------------------------------------
      public WomenEmpowerment()
    {
       
setSize(575, 400);        
java.awt.Container pane = getContentPane();
javax.swing.BoxLayout box = new
javax.swing.BoxLayout(pane,javax.swing.BoxLayout.Y_AXIS);
setLayout( box );
pane.setBackground (Color.WHITE);
    stressedQuote = "<html>”Stress is something that’s created in the mind, basically. It’s how we look at things. So our greatest defense against stress is the ability to change our minds; to change our thinking.” — Goldie Hawn<html>";
     anxiousQuote = "<html>”I will breathe. I will think of solutions, I will not let my worry control me. I will not let my stress level break me. I will simply breathe. And it will be okay. Because I don’t quit.”— Shayn McClemmon";
    discouragedQuote = "<html>”Ships don’t sink because of the water around them; ships sink because of the water that gets in them. Don’t let what’s happening around you get inside you and weigh you down.” — Unknown";

    frustratedQuote = "<html>”You've done it before and you can do it now. See the positive possibilities. Redirect the substantial energy of your frustration and turn it into positive, effective, unstoppable determination.” — Ralph Marston";

   uncomfortableQuote = "<html>”Be willing to step outside your comfort zone once in a while; take the risks in life that seem worth taking. The ride might not be as predictable if you'd just planted your feet and stayed put, but it will be a heck of a lot more interesting.” — Edward Whitacre, Jr.";

       
   quotes.setFont (new Font ("Helvetica", Font.BOLD, 18));

      
        stressed.setBackground (Color.red);

        
        anxious.setBackground (Color.blue);

        
        discouraged.setBackground (Color.yellow);


       
       frustrated.setBackground (Color.green);


      
       uncomfortable.setBackground (Color.pink);


        ButtonGroup group = new ButtonGroup();
        
        group.add (stressed);
        group.add (anxious);
        group.add (discouraged);

        group.add (frustrated);
        group.add (uncomfortable);
      

        QuoteListener listener = new QuoteListener();
        stressed.addActionListener (listener);
        anxious.addActionListener (listener);
        discouraged.addActionListener (listener);
        frustrated.addActionListener (listener);
        uncomfortable.addActionListener (listener);

        add (quotes);
        add (stressed);
        add (anxious);
        add (discouraged);

        add (frustrated);
        add (uncomfortable);

     
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
       private class QuoteListener implements ActionListener
    {
                       
                       @Override
      public void actionPerformed (ActionEvent event)
        {
            Object source = event.getSource();
            if(source == stressed) {
                quotes.setText (stressedQuote);
            }else if(source == anxious){
                    quotes.setText (anxiousQuote);
            }else if(source == discouraged){
                    quotes.setText (discouragedQuote);

            }else if(source == frustrated){
                    quotes.setText (frustratedQuote);

            }else if(source == uncomfortable){
                    quotes.setText (uncomfortableQuote);
        }



        }
       }

public static void main(String[]args) {
        WomenEmpowerment  prog = new WomenEmpowerment();
    }
}


