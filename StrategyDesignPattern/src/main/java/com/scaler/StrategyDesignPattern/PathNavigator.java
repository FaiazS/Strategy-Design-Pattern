package com.scaler.StrategyDesignPattern;

public class PathNavigator implements PathFindingAlgorithm {

    PathFindingAlgorithm pathFindingAlgorithm;

    @Override
    public void findPath(String source, String destination, TransportMode transportMode) {

        pathFindingAlgorithm = PathNavigatorFactory.getPathFindingAlgorithm(transportMode);

        pathFindingAlgorithm.findPath(source, destination, transportMode);

    }
}

