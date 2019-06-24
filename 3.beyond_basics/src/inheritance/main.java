/**
 * 
 */
package inheritance;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

/**
 * @author Giang Vu
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insect insect = new Insect(5, 6);
		Spider spider = new Spider(13, true);
		Cricket cricket = new Cricket(2, 15);
		insect.crawl();
		insect.says();

		spider.crawl();
		spider.says();
        
		cricket.crawl();
		cricket.jumps();
		cricket.says();
        
        if (spider instanceof Insect && spider instanceof Spider) {
            System.out.println("Spider is an insect and a spider");
        }
	}

}
