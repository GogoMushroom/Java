package Wilderness;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.mail.MessagingException;

public class Main {
	public static void main(String[] args) throws IOException, MessagingException,NullPointerException {
		   System.out.print(
				   "忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n"+
				   "|忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖|\n"+
				   "||  # ###                                      ###     ##           * ||  \n"+
				   "|| ##  ##  ##       ##  ####  ##   ##    ####    ##   #     ####   *  ||\n"+
				   "||###      ##      ##  ## #  ###  ##   ##  ##    ## #     ## ##   *   ||\n"+
				   "||### ###  ##     ##  #####  #### ##  ##          ##      ## ##    *  ||\n"+
				   "||###  ##  ## #  ##  ##  ##  ## ####  ## ####     ##     ## ###     * ||\n"+
				   "|| ##  ##  ## # ##   ##  ##  ##  ###  ##   ##     ##     ##  ##       ||\n"+
				   "||  # ##   ## ####  ##   ##  ##   ##   ##  ##    ####   ##   ##       ||\n"+
				   "||         ##   ##  ##  ###  ##   ##    ####            ##  ###       ||\n"+
				   "||*                                                                   ||\n"+          
				   "|| *     ##                     ####                                  ||	\n"+
				   "|   *   # #    ####    #####    ##        ####   ##   ##   ######     ||\n"+
				   "|| *   # ##     ##    ##   ##   ##         ##    ###  ##  ##          || \n"+
				   "||*   #  ##     ##    ##   ##   ##         ##    #### ##  ##          || \n"+
				   "||   # ####     ##    ## ###    ##   #     ##    ## ####  ####        || \n"+
				   "||   #   ##     ##    ##  ##    ##  ##     ##    ##  ###  ##          || \n"+
				   "||  ### ###     ##    ##   ##  #######     ##    ##   ##  ##          || \n"+
				   "||             ####   ##   ##             ####   ##   ##  #######     ||  \n"+
		           "|戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎|\n"+
		           "戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");	
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~[惜撿縑 螃褐 罹楝碟 ?紊腎桭炴揠~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Join join = new Join();
		csQA cs = new csQA();
		Scanner sc = new Scanner(System.in);
		CustomerSign customer = new CustomerSign();
		ReservationFix rf = new ReservationFix();
		checkReservation cr = new checkReservation();
		ImplementsClass im = new ImplementsClass();
		SendEmail sm= new SendEmail();
		String id = null;

		boolean stop = true;
		id = join.run();

		while (stop) {
				try {
					System.out.println("[1] 蕨擒ж晦 [2] 蕨擒 ?挫? [3]蕨擒鏃模 [4] 僥曖ж晦[0]謙猿");
					int menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					rf.runReservation(id);
					customer.customerInformation(id);
					im.run(id);
					sm.mail(id);
					break;
				case 2:
					cr.check();
					break;
				case 3:
					cr.remov();
					break;
				case 4:
					cs.customercenter();
					break;
				
				case 0:
					stop = false;
					System.out.println("寰喟?鱁頛撚銍");
					break;
				}
			} catch (IOException e) {
				System.out.println("澀跤殮溘ж艘蝗棲棻. 棻衛 殮溘ж撮蹂");
				continue;
			} catch(NoSuchElementException ex) {
				System.out.println("蕨擒頂羲檜 橈蝗棲棻");
				continue;
			
				//			} catch(NullPointerException exx) {
				//				System.out.println("蕨擒頂羲檜 橈蝗棲棻.");2
				
				//			}

			}
			//sc.close();
		}

	}
}
