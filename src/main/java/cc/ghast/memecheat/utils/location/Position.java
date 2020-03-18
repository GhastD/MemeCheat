package cc.ghast.memecheat.utils.location;

import lombok.Getter;
import lombok.AllArgsConstructor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

@Getter
@AllArgsConstructor
public class Position {

    private final Player player;
    private final double x;
    private final double y;
    private final double z;
    private final float pitch;
    private final float yaw;
    private final World bukkitWorld;
    private final Location bukkitLocation;
    private final long timestamp;
}
