package program;

import solutions.Executable;
import solutions.basicProgram.*;

import java.util.Map;
import java.util.TreeMap;

public class MenuCommands {
    public final Map<String, Executable> options;

    public MenuCommands() {
        this.options = new TreeMap<>();

        options.put("You Can't code under pressure 1", new YouCantCodeUnderPressure1());
        options.put("Volume of a cuboid", new VolumeOfCuboid());
        options.put("Beginner series number clock", new BeginnerSeriesNumberClock());
        options.put("Grasshopper", new Grasshopper());
        options.put("PixelArt", new PixelArt());

    }
}
