package org.terasology.logic.tree.lsystem;

import org.terasology.world.block.Block;

import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
public interface AxionElementGeneration {
    public void generate(AxionElementGenerationCallback callback, Vector3f position, Matrix4f rotation, String axionParameter);

    public interface AxionElementGenerationCallback {
        public void setBlock(Vector3f position, Block block);

        public void advance(float distance);
    }
}