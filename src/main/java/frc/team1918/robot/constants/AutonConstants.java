package frc.team1918.robot.constants;

import com.pathplanner.lib.util.PIDConstants;

public class AutonConstants {
    public static final PIDConstants TRANSLATION_PID = new PIDConstants(0.7, 0, 0);
    public static final PIDConstants ANGLE_PID   = new PIDConstants(0.4, 0, 0.01);
}
