package com.cupboard.util;

import net.minecraft.world.phys.Vec3;

public class VectorUtil
{
    public static Vec3 rotateLeft(final Vec3 vec)
    {
        if (Math.abs(vec.x) > Math.abs(vec.z))
        {
            return new Vec3(-vec.z, vec.y, vec.x);
        }
        else
        {
            return new Vec3(vec.z, vec.y, -vec.x);
        }
    }

    public static Vec3 rotateRight(final Vec3 vec)
    {
        if (Math.abs(vec.x) > Math.abs(vec.z))
        {
            return new Vec3(vec.z, vec.y, -vec.x);
        }
        else
        {
            return new Vec3(-vec.z, vec.y, vec.x);
        }
    }
}
