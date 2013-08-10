package BrokenKingdom;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="YourName_ModName", name="Mod Name", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class block
{


	public class Portal extends Item
	{
	       public Portal(int id)
	       {
	             super(id);
	             this.setCreativeTab(CreativeTabs.tabMaterials);
	       }
	      @SideOnly(Side.CLIENT)
	       public void updateIcons(IconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon(block.modid + ":" + this.getUnlocalizedName());
	    }
	}
	
	
	
       public static final String modid = "YourName_ModName";
      
       public static Block PortalBlock;
            
       @Init
       public void load(FMLInitializationEvent event)
       {
    	   PortalBlock = new BlockBlock(500, Material.rock).setUnlocalizedName("PortalBlock");
            
    	   GameRegistry.registerBlock(PortalBlock, modid + PortalBlock.getUnlocalizedName2());
           
           LanguageRegistry.addName(PortalBlock, "PortalBlock");
        
          
           GameRegistry.addShapelessRecipe(new ItemStack(PortalBlock), new Object[]{
          	 
                  new ItemStack(Item.redstone), new ItemStack(Item.clay)
                  
           });
          
           GameRegistry.addRecipe(new ItemStack(PortalBlock), new Object[]{
          	 
                  "XC",
                  "CX",
                  'X', Item.redstone, 'C', Item.clay
                  
           });
            

  	     
  	       }
       }
