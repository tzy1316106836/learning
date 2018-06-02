package log4jTest;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	final static Logger logger = Logger.getLogger(App.class);

	public volatile int inc = 0;
	 
    public void increase() {
        inc++;
    }
 
    public static void main(String[] args) {
        final App test = new App();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }
 
        while(Thread.activeCount()>1)  //��֤ǰ����̶߳�ִ����
            Thread.yield();
        System.out.println(test.inc);
    }
    
    
}
