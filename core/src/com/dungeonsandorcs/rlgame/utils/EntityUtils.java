package com.dungeonsandorcs.rlgame.utils;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.dungeonsandorcs.rlgame.AppConstants;
import com.dungeonsandorcs.rlgame.components.B2dBodyComponent;
import com.dungeonsandorcs.rlgame.components.PlayerComponent;

public class EntityUtils {
    public static final Entity createPlayer() {
        Entity entity = new Entity();

        //create components
        //fill components with data
        //add component to Entity

        PlayerComponent playerComponent = new PlayerComponent();
        entity.add(playerComponent);
        B2dBodyComponent b2dBodyComponent = new B2dBodyComponent();
        Body body = BodyFactory.getInstance(Objects.world)
                .makeBoxPolyBody(AppConstants.Material.RUBBER, BodyDef.BodyType.StaticBody,
                0,0,10.00f,10.00f);

        entity.add(b2dBodyComponent);
        return entity;
    }

}
