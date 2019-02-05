
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 *An array string is used to grab the first word from user and then verifies 
 * if it is an actual user then responds with a message specific to it's command
 *
 * @author Jay's PC
 */
public class MyEventListener extends ListenerAdapter{

    String prefix = "!";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        
       String command = event.getMessage().getContentRaw();
       
       if(command.equalsIgnoreCase(prefix+"Hey")){
           
           if(!event.getMember().getUser().isBot()) {
           
               if(null == event.getMember().getNickname()){
                   
                   event.getChannel().sendMessage("Hey " + event.getMember().getEffectiveName()+"!").queue();//Never forget .queue method for bot
                   
               }else{
                       
                   event.getChannel().sendMessage("Hey " + event.getMember().getNickname()+"!").queue();
                       
               }
               
           
           }//End if check if user is bot
           
       }//End if for !Hey
        
    }//End MyEventListener class
    
}//End ListenerAdapter class