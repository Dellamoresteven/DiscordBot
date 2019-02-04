
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 *An array string is used to grab the first word from user and then verifies 
 * if it is an actual user then responds with a message specific to it's command
 *
 * @author Jay's PC
 */
public class MyEventListener extends ListenerAdapter{

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        
       String[] args = event.getMessage().getContentRaw().split( " ");
       
       if(args[0].equalsIgnoreCase(  "Hi")){
           
           if(!event.getMember().getUser().isBot()) {
           
            event.getChannel().sendMessage("Hey " + event.getMember().getNickname()+"!").queue();//Never forget .queue method for bot
           
           }//End if check if user is bot
           
       }//End 
        
    }
    
}//End ListenerAdapter class