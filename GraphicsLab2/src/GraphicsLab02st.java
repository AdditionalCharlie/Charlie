// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.

import java.awt.*;
import java.applet.*;
 


public class GraphicsLab02st extends Applet 
{
    static final long serialVersionUID = 0;

    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        g.drawRect(10,10,width,height);    
        
        
        
        
        
        
        
        
        int x1 = 10;
        int y1 = 10;
        int x2 = 990;
        int y2 = 10;

        for (x1 = 10; x1 < 990; x1 += 14)
        
        {
            g.drawLine(x1, y1, x2, y2);
            
            y2 += 9; 

        }
        
        
        
        //end of topright
        
        
        
        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;

        for (x2 = 990; x2 > 10; x2 -= 14)
        
        {
            g.drawLine(x1, y1, x2, y2);
            
            y1 -= 9; 
        
        }
        
        //end of botleft
        
            
        x1 = 10;
		y1 = 640;
		x2 = 990;
		y2 = 640;

		for (x1 = 10; x1 < 990; x1 += 14)
		
		{
			g.drawLine(x1, y1, x2, y2);
			
			y2 -= 9; 
			
		}
                
            
            
                //end of botright
                
            
        }
        
    }