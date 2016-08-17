package com.voxelwind.api.event.server;

import com.voxelwind.api.event.Event;

/**
 * This event will be fired after plugins are initialized but before the server initializes levels and binds to a port.
 * You will typically want to perform any major server initialization tasks at this point.
 */
public interface ServerInitializeEvent extends Event {
}