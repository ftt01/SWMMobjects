package org.altervista.growworkinghard.jswmm.dataStructure.routing;

import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.linkObjects.OutsideSetup;
import org.altervista.growworkinghard.jswmm.dataStructure.hydraulics.linkObjects.crossSections.CrossSectionType;

import java.time.Instant;

public class RoutingKinematicWaveSetup implements RoutingSetup {

    Instant routingStepSize;

    @Override
    public void evaluateWetArea(Instant currentTime, Long routingStepSize, OutsideSetup upstreamOutside, OutsideSetup downstreamOutside, Double linkLength, Double linkRoughness, CrossSectionType crossSectionType) {

    }

    @Override
    public Instant getInitialTime() {
        return null;
    }

    @Override
    public Instant getTotalTime() {
        return null;
    }

    @Override
    public Long getRoutingStepSize() {
        return null;
    }
}
