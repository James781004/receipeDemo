package services;

import java.util.Set;

import commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {
	Set<UnitOfMeasureCommand> listAllUoms();
}
