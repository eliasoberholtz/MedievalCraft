package org.elias.medievalcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.state.property.BooleanProperty;

public class StandardCrucible extends Block {
    static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
    public StandardCrucible(Settings settings) {

        super(settings);
    }
}
