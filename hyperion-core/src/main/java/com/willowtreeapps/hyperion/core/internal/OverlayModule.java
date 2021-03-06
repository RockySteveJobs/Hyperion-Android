package com.willowtreeapps.hyperion.core.internal;

import com.willowtreeapps.hyperion.plugin.v1.OverlayContainer;

import dagger.Module;
import dagger.Provides;

@Module
class OverlayModule {

    private final OverlayContainer container;

    OverlayModule(OverlayContainer container) {
        this.container = container;
    }

    @Provides
    OverlayContainer provideOverlayContainer() {
        return this.container;
    }

}