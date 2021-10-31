package quek.undergarden.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergarden.Undergarden;
import quek.undergarden.client.model.DwellerModel;
import quek.undergarden.client.render.layer.DwellerEyesLayer;
import quek.undergarden.entity.DwellerEntity;

public class DwellerRender extends MobRenderer<DwellerEntity, DwellerModel<DwellerEntity>> {

    public DwellerRender(EntityRendererProvider.Context renderContext) {
        super(renderContext, new DwellerModel<>(renderContext.bakeLayer(DwellerModel.LAYER_LOCATION)), 0.7F);
        this.addLayer(new DwellerEyesLayer<>(this));
        this.addLayer(new SaddleLayer<>(this, new DwellerModel<>(renderContext.bakeLayer(DwellerModel.SADDLE_LAYER_LOCATION)), new ResourceLocation(Undergarden.MODID, "textures/entity/dweller_saddle.png")));
    }

    @Override
    public ResourceLocation getTextureLocation(DwellerEntity entity) {
        return new ResourceLocation(Undergarden.MODID, "textures/entity/dweller.png");
    }
}