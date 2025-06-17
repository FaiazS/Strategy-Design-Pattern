package com.scaler.StrategyDesignPattern;

public class PathNavigatorFactory {

    public static PathFindingAlgorithm getPathFindingAlgorithm(TransportMode transportMode){

        PathFindingAlgorithm pathFindingAlgorithm;

        if(transportMode == TransportMode.BIKE){

            pathFindingAlgorithm = new BikePathFindingAlgorithm();
        }
        else if(transportMode == TransportMode.CAR){

            pathFindingAlgorithm = new CarPathFindingAlgorithm();
        }
        else if(transportMode == TransportMode.WALK){

            pathFindingAlgorithm = new WalkPathFindingAlgorithm();
        }
        else{

            throw new RuntimeException("Unknown transportMode :" + transportMode);
        }

        return pathFindingAlgorithm;
    }
}
