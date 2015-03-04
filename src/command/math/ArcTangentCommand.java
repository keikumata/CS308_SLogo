package command.math;

import java.util.List;
import command.Command;

public class ArcTangentCommand extends Command {
	public double calculateValue(List<Object> param) {
		return (double) Math.atan(Math.toRadians((double) param.get(0)));
	}
}
