package firewolf8385.elytrapvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import firewolf8385.elytrapvp.commands.subcommands.Disable;
import firewolf8385.elytrapvp.commands.subcommands.Enable;
import firewolf8385.elytrapvp.commands.subcommands.Help;
import firewolf8385.elytrapvp.commands.subcommands.Setcoins;
import firewolf8385.elytrapvp.commands.subcommands.Setspawn;
import firewolf8385.elytrapvp.commands.subcommands.Setstartlevel;

public class ElytraPvP implements CommandExecutor{

	private Disable disable;
	private Enable enable;
	private Help help;
	private Setcoins setcoins;
	private Setspawn setspawn;
	private Setstartlevel setstartlevel;
	
	public ElytraPvP() {
		this.disable = new Disable();
		this.enable = new Enable();
		this.help = new Help();
		this.setcoins = new Setcoins();
		this.setspawn = new Setspawn();
		this.setstartlevel = new Setstartlevel();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lavel, String[] args) {
		
		if(args.length >= 1) {
			
			switch (args[0].toLowerCase()) {
				case "disable":
					break;
				case "enable":
					break;
				case "help":
					break;
				case "setcoins":
					break;
				case "setspawn":
					break;
				case "setstartlevel":
					break;
			}
			
		}
		else {
			
		}
				
		
		return true;
	}
	
}
