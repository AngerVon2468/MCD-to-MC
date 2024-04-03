package net.mavity.mcd_to_mc.itemregister.itemtypes;

import software.bernie.geckolib.model.GeoModel;

public class AAAAAAAAAAAAAA extends GeoModel<ExampleModel> {
    private final ResourceLocation modelResource = new ResourceLocation(GeckoLib.ModID, "geo/example.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(GeckoLib.ModID, "textures/item/examplepng");
    private final ResourceLocation animationResource = new ResourceLocation(GeckoLib.ModID, "animations/example.animation.json");

    @Override
    public ResourceLocation getModelLocation(ExampleItem object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureLocation(ExampleItem object) {
        return this.textures;
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ExampleItem object) {
        return this.animations;
    }
}
