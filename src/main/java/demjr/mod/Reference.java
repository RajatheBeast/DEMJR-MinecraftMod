package demjr.mod;

public class Reference {
		
	public static final String MOD_ID = "demjr";
	public static final String NAME = "DEMJR";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
		
	public static final String CLIENT_PROXY_CLASS = "demjr.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "demjr.mod.proxy.ServerProxy";
	
	public static enum ModItems {
		
		SALT("salt", "ItemSalt"),
		FLOUR("flour", "ItemFlour"),
		EMPTY_WOODEN_BUCKET("empty_wooden_bucket", "ItemEmpty_Wooden_Bucket"),
		WOODEN_BUCKET("wooden_bucket", "ItemWooden_Bucket");
		
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

		SALT("salt", "BlockSalt");
		
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


