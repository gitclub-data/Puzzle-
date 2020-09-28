
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Puzzle
{
public static void main(String args[])
{
mycomponents x=new mycomponents("Puzzle Game");
}
}

class mycomponents extends JFrame
{
	ImageIcon icon;
	JButton b1;
	public mycomponents(String s)
	{
	super(s);
	icon=new ImageIcon("../image/puzzle.png");
		Image i11=icon.getImage();
		Image modify=i11.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon=new ImageIcon(modify);
		setIconImage(modify);
	b1=new JButton("New Game");
	setResizable(false);
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
					new hello1("Puzzle Game: Made by Gaurav : Level 1");
						dispose();
					}
			
				});
		add(b1);
		setLayout(null);
		b1.setBounds(60, 50, 100, 30);
		setVisible(true);
		setSize(230, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class hello1 extends JFrame 
{
public ImageIcon icon;
	Image i=new ImageIcon("../image/4.png").getImage();
	Image i1=new ImageIcon("../image/2.png").getImage();
	Image i2=new ImageIcon("../image/5.png").getImage();
	Image i3=new ImageIcon("../image/6.png").getImage();
	Image i4=new ImageIcon("../image/8.png").getImage();
	Image i5=new ImageIcon("../image/1.png").getImage();
	Image i6=new ImageIcon("../image/3.png").getImage();
	Image i7=new ImageIcon("../image/7.png").getImage();
	Image i8=new ImageIcon("../image/9.png").getImage();
	Image i9=new ImageIcon("../image/image1.jpg").getImage();
	
	hello1(String s)
	{
		super(s);
		icon=new ImageIcon("../image/puzzle.png");
		Image i11=icon.getImage();
		Image modify=i11.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon=new ImageIcon(modify);
		setIconImage(modify);
		setBounds(0,0,315,450);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.gray);
		addKeyListener(new keyEvent());
	}
public  int x=10,y=160;
public  int p=110,q=60;
public  int r=110,s=160;
public  int t=210,u=160;
public  int v=110,w=260;
public  int a=10,b=60;
public  int m=210,n=60;
public  int c=10,d=260;
public  int xy=210,yz=260;
public  int xk=210,yk=365;
public int k;
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(0,0, 1370,768);	
	g.setColor(Color.BLACK);
	g.drawString("level 2",145,50);
	
	g.setColor(Color.white);
	g.drawString("Change The Above Image Into This",10,390);
	g.drawString("Image",10,410);
	g.drawImage(i9, xk, yk, 90, 70, null);
	
	g.drawImage(i, a, b, 100,100, null);
	
	g.drawImage(i1, c, d, 100,100, null);
	
	g.drawImage(i2, x, y, 100 , 100 ,null);
	
	g.drawImage(i3, m, n, 100, 100, null);
	
	g.drawImage(i4, p, q, 100, 100, null);
	
	g.drawImage(i5, r, s, 100, 100, null);
	
	g.drawImage(i6, t, u, 100, 100, null);
	g.drawImage(i7, v, w, 100, 100, null);
	
	g.drawImage(i8, xy, yz, 100, 100, null);
	}
	class keyEvent implements KeyListener
	{
		public void keyPressed(KeyEvent ak)
		{
			if(ak.getKeyCode()==37)
			{
			int yx=x-100;
	if(yx==a&&y==b)
	{
	k=x;
	x=x-100;
	a=k;
	repaint();
	}
	else
	{
		if(yx==c&&y==d)
		{
		k=x;
		x=x-100;
		c=k;
		repaint();
		}
		else
		{
			if(yx==m&&y==n)
			{
			k=x;
			x=x-100;
			m=k;
			repaint();
			}
			else
			{
				if(yx==p&&y==q)
				{
				k=x;
				x=x-100;
				p=k;
				repaint();
				}
				else
				{
					if(yx==r&&y==s)
					{
					k=x;
					x=x-100;
					r=k;
					repaint();
					}
					else
					{
						if(yx==t&&y==u)
						{
						k=x;
						x=x-100;
						t=k;
						repaint();
						}
						else
						{
							if(yx==v&&y==w)
							{
							k=x;
							x=x-100;
							v=k;
							repaint();
							}
							else
							{
								if(yx==xy&&y==yz)
								{
								k=x;
								x=x-100;
								xy=k;
								repaint();
								}
							}
						}
					}
				}
			}
		}
	}
	if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello2("Puzzle Game: Made by Gaurav : Level 2");
						dispose();
		}
			}
			if(ak.getKeyCode()==39)
			{
			int zx=x+100;
		if(zx==a&&y==b)
		{
		k=x;
		x=x+100;
		a=k;
		repaint();
		}
		else
		{
			if(zx==c&&y==d)
			{
			k=x;
			x=x+100;
			c=k;
			repaint();
			}
			else
			{
				if(zx==m&&y==n)
				{
				k=x;
				x=x+100;
				m=k;
				repaint();
				}
				else
				{
					if(zx==p&&y==q)
					{
					k=x;
					x=x+100;
					p=k;
					repaint();
					}
					else
					{
						if(zx==r&&y==s)
						{
						k=x;
						x=x+100;
						r=k;
						repaint();
						}
						else
						{
							if(zx==t&&y==u)
							{
							k=x;
							x=x+100;
							t=k;
							repaint();
							}
							else
							{
								if(zx==v&&y==w)
								{
								k=x;
								x=x+100;
								v=k;
								repaint();
								}
								else
								{
									if(zx==xy&&y==yz)
									{
									k=x;
									x=x+100;
									xy=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello2("Puzzle Game: Made by Gaurav : Level 2");
						dispose();
		}
			}
			if(ak.getKeyCode()==38)
			{int cx=y-100;
		if(x==a&&cx==b)
		{
		k=y;
		y=y-100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&cx==d)
			{
			k=y;
			y=y-100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&cx==n)
				{
				k=y;
				y=y-100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&cx==q)
					{
					k=y;
					y=y-100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&cx==s)
						{
						k=y;
						y=y-100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&cx==u)
							{
							k=y;
							y=y-100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&cx==w)
								{
								k=y;
								y=y-100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&cx==yz)
									{
									k=y;
									y=y-100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello2("Puzzle Game: Made by Gaurav : Level 2");
						dispose();
		}
			}
			if(ak.getKeyCode()==40)
			{
			int vx=y+100;
		if(x==a&&vx==b)
		{
		k=y;
		y=y+100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&vx==d)
			{
			k=y;
			y=y+100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&vx==n)
				{
				k=y;
				y=y+100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&vx==q)
					{
					k=y;
					y=y+100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&vx==s)
						{
						k=y;
						y=y+100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&vx==u)
							{
							k=y;
							y=y+100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&vx==w)
								{
								k=y;
								y=y+100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&vx==yz)
									{
									k=y;
									y=y+100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello2("Puzzle Game: Made by Gaurav : Level 2");
						dispose();
		}
		}
		}
				public void keyReleased(KeyEvent k)
		{
			
		}
		public void keyTyped(KeyEvent k)
		{
			
		}
	}
}

class hello2 extends JFrame 
{
public ImageIcon icon;
	Image i=new ImageIcon("../image/14.png").getImage();
	Image i1=new ImageIcon("../image/12.png").getImage();
	Image i2=new ImageIcon("../image/15.png").getImage();
	Image i3=new ImageIcon("../image/16.png").getImage();
	Image i4=new ImageIcon("../image/18.png").getImage();
	Image i5=new ImageIcon("../image/11.png").getImage();
	Image i6=new ImageIcon("../image/13.png").getImage();
	Image i7=new ImageIcon("../image/17.png").getImage();
	Image i8=new ImageIcon("../image/19.png").getImage();
	Image i9=new ImageIcon("../image/image2.jpg").getImage();
	
	hello2(String s)
	{
		super(s);
		icon=new ImageIcon("../image/puzzle.png");
		Image i11=icon.getImage();
		Image modify=i11.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon=new ImageIcon(modify);
		setIconImage(modify);
		setBounds(0,0,315,450);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.gray);
		addKeyListener(new keyEvent());
	}
public  int r=10,s=160;
public  int a=110,b=60;
public  int m=210,n=160;
public  int x=110,y=160;
public  int c=110,d=260;
public  int p=10,q=60;
public  int v=210,w=60;
public  int t=10,u=260;
public  int xy=210,yz=260;
public  int xk=210,yk=365;
public int k;
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(0,0, 1370,768);	
	g.setColor(Color.BLACK);
	g.drawString("level 2",145,50);
	
	g.setColor(Color.white);
	g.drawString("Change The Above Image Into This",10,390);
	g.drawString("Image",10,410);
	g.drawImage(i9, xk, yk, 90, 70, null);
	
	g.drawImage(i, a, b, 100,100, null);
	
	g.drawImage(i1, c, d, 100,100, null);
	
	g.drawImage(i2, x, y, 100 , 100 ,null);
	
	g.drawImage(i3, m, n, 100, 100, null);
	
	g.drawImage(i4, p, q, 100, 100, null);
	
	g.drawImage(i5, r, s, 100, 100, null);
	
	g.drawImage(i6, t, u, 100, 100, null);
	g.drawImage(i7, v, w, 100, 100, null);
	
	g.drawImage(i8, xy, yz, 100, 100, null);
	}
	class keyEvent implements KeyListener
	{
		public void keyPressed(KeyEvent ak)
		{
			if(ak.getKeyCode()==37)
			{
			int yx=x-100;
	if(yx==a&&y==b)
	{
	k=x;
	x=x-100;
	a=k;
	repaint();
	}
	else
	{
		if(yx==c&&y==d)
		{
		k=x;
		x=x-100;
		c=k;
		repaint();
		}
		else
		{
			if(yx==m&&y==n)
			{
			k=x;
			x=x-100;
			m=k;
			repaint();
			}
			else
			{
				if(yx==p&&y==q)
				{
				k=x;
				x=x-100;
				p=k;
				repaint();
				}
				else
				{
					if(yx==r&&y==s)
					{
					k=x;
					x=x-100;
					r=k;
					repaint();
					}
					else
					{
						if(yx==t&&y==u)
						{
						k=x;
						x=x-100;
						t=k;
						repaint();
						}
						else
						{
							if(yx==v&&y==w)
							{
							k=x;
							x=x-100;
							v=k;
							repaint();
							}
							else
							{
								if(yx==xy&&y==yz)
								{
								k=x;
								x=x-100;
								xy=k;
								repaint();
								}
							}
						}
					}
				}
			}
		}
	}
	if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello3("Puzzle Game: Made by Gaurav : Level 3");
						dispose();
		}
			}
			if(ak.getKeyCode()==39)
			{
			int zx=x+100;
		if(zx==a&&y==b)
		{
		k=x;
		x=x+100;
		a=k;
		repaint();
		}
		else
		{
			if(zx==c&&y==d)
			{
			k=x;
			x=x+100;
			c=k;
			repaint();
			}
			else
			{
				if(zx==m&&y==n)
				{
				k=x;
				x=x+100;
				m=k;
				repaint();
				}
				else
				{
					if(zx==p&&y==q)
					{
					k=x;
					x=x+100;
					p=k;
					repaint();
					}
					else
					{
						if(zx==r&&y==s)
						{
						k=x;
						x=x+100;
						r=k;
						repaint();
						}
						else
						{
							if(zx==t&&y==u)
							{
							k=x;
							x=x+100;
							t=k;
							repaint();
							}
							else
							{
								if(zx==v&&y==w)
								{
								k=x;
								x=x+100;
								v=k;
								repaint();
								}
								else
								{
									if(zx==xy&&y==yz)
									{
									k=x;
									x=x+100;
									xy=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello3("Puzzle Game: Made by Gaurav : Level 3");
						dispose();
		}
			}
			if(ak.getKeyCode()==38)
			{int cx=y-100;
		if(x==a&&cx==b)
		{
		k=y;
		y=y-100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&cx==d)
			{
			k=y;
			y=y-100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&cx==n)
				{
				k=y;
				y=y-100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&cx==q)
					{
					k=y;
					y=y-100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&cx==s)
						{
						k=y;
						y=y-100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&cx==u)
							{
							k=y;
							y=y-100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&cx==w)
								{
								k=y;
								y=y-100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&cx==yz)
									{
									k=y;
									y=y-100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello3("Puzzle Game: Made by Gaurav : Level 3");
						dispose();
		}
			}
			if(ak.getKeyCode()==40)
			{
			int vx=y+100;
		if(x==a&&vx==b)
		{
		k=y;
		y=y+100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&vx==d)
			{
			k=y;
			y=y+100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&vx==n)
				{
				k=y;
				y=y+100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&vx==q)
					{
					k=y;
					y=y+100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&vx==s)
						{
						k=y;
						y=y+100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&vx==u)
							{
							k=y;
							y=y+100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&vx==w)
								{
								k=y;
								y=y+100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&vx==yz)
									{
									k=y;
									y=y+100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "Press OK To Enter The Next Level", "Level Passed", JOptionPane.OK_OPTION,icon);
			new hello3("Puzzle Game: Made by Gaurav : Level 3");
						dispose();
		}
		}
		}
				public void keyReleased(KeyEvent k)
		{
			
		}
		public void keyTyped(KeyEvent k)
		{
			
		}
	}
}

class hello3 extends JFrame 
{
public ImageIcon icon;
	Image i=new ImageIcon("../image/24.png").getImage();
	Image i1=new ImageIcon("../image/22.png").getImage();
	Image i2=new ImageIcon("../image/25.png").getImage();
	Image i3=new ImageIcon("../image/26.png").getImage();
	Image i4=new ImageIcon("../image/28.png").getImage();
	Image i5=new ImageIcon("../image/21.png").getImage();
	Image i6=new ImageIcon("../image/23.png").getImage();
	Image i7=new ImageIcon("../image/27.png").getImage();
	Image i8=new ImageIcon("../image/29.png").getImage();
	Image i9=new ImageIcon("../image/image3.jpg").getImage();
	
	hello3(String s)
	{
		super(s);
		icon=new ImageIcon("../image/puzzle.png");
		Image i11=icon.getImage();
		Image modify=i11.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon=new ImageIcon(modify);
		setIconImage(modify);
		setBounds(0,0,315,450);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.gray);
		addKeyListener(new keyEvent());
	}
public  int x=10,y=160;
public  int c=110,d=60;
public  int m=210,n=160;
public  int a=110,b=160;
public  int t=110,u=260;
public  int p=10,q=60;
public  int r=210,s=60;
public  int v=10,w=260;
public  int xy=210,yz=260;
public  int xk=210,yk=365;
public int k;
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(0,0, 1370,768);	
	g.setColor(Color.BLACK);
	g.drawString("level 2",145,50);
	
	g.setColor(Color.white);
	g.drawString("Change The Above Image Into This",10,390);
	g.drawString("Image",10,410);
	g.drawImage(i9, xk, yk, 90, 70, null);
	
	g.drawImage(i, a, b, 100,100, null);
	
	g.drawImage(i1, c, d, 100,100, null);
	
	g.drawImage(i2, x, y, 100 , 100 ,null);
	
	g.drawImage(i3, m, n, 100, 100, null);
	
	g.drawImage(i4, p, q, 100, 100, null);
	
	g.drawImage(i5, r, s, 100, 100, null);
	
	g.drawImage(i6, t, u, 100, 100, null);
	g.drawImage(i7, v, w, 100, 100, null);
	
	g.drawImage(i8, xy, yz, 100, 100, null);
	}
	class keyEvent implements KeyListener
	{
		public void keyPressed(KeyEvent ak)
		{
			if(ak.getKeyCode()==37)
			{
			int yx=x-100;
	if(yx==a&&y==b)
	{
	k=x;
	x=x-100;
	a=k;
	repaint();
	}
	else
	{
		if(yx==c&&y==d)
		{
		k=x;
		x=x-100;
		c=k;
		repaint();
		}
		else
		{
			if(yx==m&&y==n)
			{
			k=x;
			x=x-100;
			m=k;
			repaint();
			}
			else
			{
				if(yx==p&&y==q)
				{
				k=x;
				x=x-100;
				p=k;
				repaint();
				}
				else
				{
					if(yx==r&&y==s)
					{
					k=x;
					x=x-100;
					r=k;
					repaint();
					}
					else
					{
						if(yx==t&&y==u)
						{
						k=x;
						x=x-100;
						t=k;
						repaint();
						}
						else
						{
							if(yx==v&&y==w)
							{
							k=x;
							x=x-100;
							v=k;
							repaint();
							}
							else
							{
								if(yx==xy&&y==yz)
								{
								k=x;
								x=x-100;
								xy=k;
								repaint();
								}
							}
						}
					}
				}
			}
		}
	}
	if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "You won the game", "Level Passed", JOptionPane.CLOSED_OPTION,icon);
			dispose();
		}
			}
			if(ak.getKeyCode()==39)
			{
			int zx=x+100;
		if(zx==a&&y==b)
		{
		k=x;
		x=x+100;
		a=k;
		repaint();
		}
		else
		{
			if(zx==c&&y==d)
			{
			k=x;
			x=x+100;
			c=k;
			repaint();
			}
			else
			{
				if(zx==m&&y==n)
				{
				k=x;
				x=x+100;
				m=k;
				repaint();
				}
				else
				{
					if(zx==p&&y==q)
					{
					k=x;
					x=x+100;
					p=k;
					repaint();
					}
					else
					{
						if(zx==r&&y==s)
						{
						k=x;
						x=x+100;
						r=k;
						repaint();
						}
						else
						{
							if(zx==t&&y==u)
							{
							k=x;
							x=x+100;
							t=k;
							repaint();
							}
							else
							{
								if(zx==v&&y==w)
								{
								k=x;
								x=x+100;
								v=k;
								repaint();
								}
								else
								{
									if(zx==xy&&y==yz)
									{
									k=x;
									x=x+100;
									xy=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "You won the game", "Level Passed", JOptionPane.CLOSED_OPTION,icon);
			dispose();
		}
			}
			if(ak.getKeyCode()==38)
			{int cx=y-100;
		if(x==a&&cx==b)
		{
		k=y;
		y=y-100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&cx==d)
			{
			k=y;
			y=y-100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&cx==n)
				{
				k=y;
				y=y-100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&cx==q)
					{
					k=y;
					y=y-100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&cx==s)
						{
						k=y;
						y=y-100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&cx==u)
							{
							k=y;
							y=y-100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&cx==w)
								{
								k=y;
								y=y-100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&cx==yz)
									{
									k=y;
									y=y-100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "You won the game", "Level Passed", JOptionPane.CLOSED_OPTION,icon);
			dispose();
		}
			}
			if(ak.getKeyCode()==40)
			{
			int vx=y+100;
		if(x==a&&vx==b)
		{
		k=y;
		y=y+100;
		b=k;
		repaint();
		}
		else
		{
			if(x==c&&vx==d)
			{
			k=y;
			y=y+100;
			d=k;
			repaint();
			}
			else
			{
				if(x==m&&vx==n)
				{
				k=y;
				y=y+100;
				n=k;
				repaint();
				}
				else
				{
					if(x==p&&vx==q)
					{
					k=y;
					y=y+100;
					q=k;
					repaint();
					}
					else
					{
						if(x==r&&vx==s)
						{
						k=y;
						y=y+100;
						s=k;
						repaint();
						}
						else
						{
							if(x==t&&vx==u)
							{
							k=y;
							y=y+100;
							u=k;
							repaint();
							}
							else
							{
								if(x==v&&vx==w)
								{
								k=y;
								y=y+100;
								w=k;
								repaint();
								}
								else
								{
									if(x==xy&&vx==yz)
									{
									k=y;
									y=y+100;
									yz=k;
									repaint();
									}
								}
							}
						}
					}
				}
			}
		}
			if(a==10&&b==160&&c==110&&d==60&&x==110&&y==160&&m==210&&n==160&&p==110&&q==260&&r==10&&s==60&&t==210&&u==60&&v==10&&w==260&&xy==210&&yz==260)
		{
			JOptionPane.showMessageDialog(null, "You won the game", "Level Passed", JOptionPane.CLOSED_OPTION,icon);
			dispose();
		}
		}
		}
				public void keyReleased(KeyEvent k)
		{
			
		}
		public void keyTyped(KeyEvent k)
		{
			
		}
	}
}