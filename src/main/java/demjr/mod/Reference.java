package demjr.mod;

public class Reference {
		
	public static final String MOD_ID = "demjr";
	public static final String NAME = "DEMJR";
	public static final String VERSION = "1.1";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
		
	public static final String CLIENT_PROXY_CLASS = "demjr.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "demjr.mod.proxy.ServerProxy";
	
	public static enum ModItems {
		
		SALT("salt", "ItemSalt"),
        FLOUR("flour", "ItemFlour"),
        TRUMPGEM("trumpgem", "ItemTrumpGem"),
        COOKIEDOUGH("cookiedough", "ItemCookieDough"),
        DOUGH("dough", "ItemDough"),
        CHOCOLATECHIPS("chocolatechips", "ItemChocolateChips"),
		APPLEPIE("applepie", "ItemApplePie"),
		CEMENTPOWDER("cementpowder", "ItemCementPowder"),
		TRUMPSWORD("trumpsword", "ItemTrumpSword"),
        TRUMPHELMET("trumphelmet", "ItemTrumpHelmet"),
        TRUMPPICKAXE("trumppickaxe", "ItemTrumpPickaxe"),
        TRUMPCHEST("trumpchest", "ItemTrumpChestplate"),
        TRUMPLEGS("trumplegs", "ItemTrumpLeggings"),
        TRUMPBOOTS("trumpboots", "ItemTrumpBoots"),
        TRUMPSPADE("trumpspade", "ItemTrumpSpade"),
        TRUMPHOE("trumphoe", "ItemTrumpHoe"),
        TRUMPAXE("trumpaxe", "ItemTrumpAxe"),
        DISSAPOINTIUMCRYSTAL("dissapointiumcrystal", "ItemDissapointiumCrystal"),
        DISSAPOINTIUMSWORD("dissapointiumsword", "ItemDissapointiumSword"),
        DISSAPOINTIUMHELMET("dissapointiumhelmet", "ItemDissapointiumHelmet"),
        DISSAPOINTIUMPICKAXE("dissapointiumpickaxe", "ItemDissapointiumPickaxe"),
        DISSAPOINTIUMCHEST("dissapointiumchest", "ItemDissapointiumChestplate"),
        DISSAPOINTIUMLEGS("dissapointiumlegs", "ItemDissapointiumLeggings"),
        DISSAPOINTIUMBOOTS("dissapointiumboots", "ItemDissapointiumBoots"),
        DISSAPOINTIUMSPADE("dissapointiumspade", "ItemDissapointiumSpade"),
        DISSAPOINTIUMHOE("dissapointiumhoe", "ItemDissapointiumHoe"),
        DISSAPOINTIUMAXE("dissapointiumaxe", "ItemDissapointiumAxe"),
		CHEESE("cheese", "ItemCheese"),
		TOMATO("tomato", "ItemTomato");
		
		private String unlocalizedName;
		private String registryName;		
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	
	public static enum ModBlocks {

		SALT("salt", "BlockSalt"),
        TRUMPIUMORE("trumpiumore", "BlockTrumpiumOre"),
        TRUMPIUMBLOCK("trumpiumblock", "BlockTrumpiumBlock"),
        CEMENT("cementblock", "BlockCement"),
        DISSAPOINTIUMORE("dissapointiumore", "BlockDissapointiumOre");
		
		private String unlocalizedName;
		private String registryName;		
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}

}


