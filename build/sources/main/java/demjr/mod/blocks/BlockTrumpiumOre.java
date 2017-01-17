package demjr.mod.blocks;

import demjr.mod.Reference;
import demjr.mod.init.ModBlocks;
import demjr.mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event.HasResult;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockTrumpiumOre extends Block {

    public BlockTrumpiumOre() {
        super(Material.ROCK);

        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMORE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMORE.getRegistryName());

        setHardness(50);
    }
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this == ModBlocks.trumpiumore ? ModItems.trumpgem :  Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random){
        return this == ModBlocks.trumpiumore ? 2 + random.nextInt(5) : 1;
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

}
