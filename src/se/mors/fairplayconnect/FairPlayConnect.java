package se.mors.fairplayconnect;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;

import uk.org.whoami.geoip.GeoIPLookup;
import uk.org.whoami.geoip.GeoIPTools;

public final class FairPlayConnect extends JavaPlugin {

	static GeoIPLookup geo = null;
	
	@Override
    public void onEnable(){
		new LoginListener(this);
		geo = getGeoIPLookup();
    }
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }

	private GeoIPLookup getGeoIPLookup() {
	    Plugin pl = this.getServer().getPluginManager().getPlugin("GeoIPTools");
	    if(pl != null) {
	        return ((GeoIPTools) pl).getGeoIPLookup();
	    } else {
	        return null;
	    }
	}
	
}
