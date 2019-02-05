import java.util.*;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
/* API token for discord */

/**
 * a bot is constructed out of JDA builder and initialized to a token and an event
 * listener is added so the bot can read our messages
 * -Thats all i got thanks to Youtube!-
 * 
 * @author Jay's PC
 */
class BotMain{
    
    private static JDA jda;
    
    
  /**
   * Main makes bot and makes a event listener which allows the bot to read messages..?
   * @param args
   * @throws Exception 
   */
    
  public static void main(String args[]) throws Exception{
    
        jda = new JDABuilder(AccountType.BOT).setToken("NTQxMzQyMzI4Nzc5MTc3OTg0.DzeE7w.rvF4dXEcjl8kG3mUUKLBA-W_0N8").buildBlocking();
        
        jda.addEventListener(new MyEventListener());
  }
  
}//End BotMain class
