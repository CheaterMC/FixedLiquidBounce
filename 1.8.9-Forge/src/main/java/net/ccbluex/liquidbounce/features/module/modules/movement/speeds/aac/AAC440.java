/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speeds.aac;

import net.ccbluex.liquidbounce.event.MoveEvent;
import net.ccbluex.liquidbounce.features.module.modules.movement.speeds.SpeedMode;
import net.ccbluex.liquidbounce.utils.MovementUtils;

public class AAC440 extends SpeedMode {
    private boolean legitJump;

    public AAC440() {
        super("AAC4.4.0");
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onMotion() {
    }

    @Override
    public void onUpdate() {
        if (!MovementUtils.isMoving())
            return;
        if (mc.thePlayer.onGround) {
            mc.thePlayer.jump();
            mc.thePlayer.speedInAir = 0.0201F;
            mc.timer.timerSpeed = 0.94F;
        }
        if (mc.thePlayer.fallDistance > 0.7 && mc.thePlayer.fallDistance < 1.3) {
            mc.thePlayer.speedInAir = 0.02F;
            mc.timer.timerSpeed = 2.7F;
        }
    }

    @Override
    public void onMove(MoveEvent event) {
    }
}
