/*
 * $Id: ConsumingMouseListener.java 1190 2013-10-11 08:38:58Z PSpeed42@gmail.com $
 *
 * Copyright (c) 2012-2013 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.simsilica.lemur.event;

import com.jme3.input.event.*;
import com.jme3.scene.*;


/**
 *  MouseListener implementation that will consume all events.
 *  This is useful when creating a panel that should block input
 *  from the components behind it.
 *
 *  @author    Paul Speed
 */
public class ConsumingMouseListener implements MouseListener {

    public static final ConsumingMouseListener INSTANCE = new ConsumingMouseListener();

    protected ConsumingMouseListener() {
    }

    public void mouseButtonEvent(MouseButtonEvent event, Spatial target, Spatial capture) {
        event.setConsumed();
    }

    public void mouseEntered(MouseMotionEvent event, Spatial target, Spatial capture) {
        event.setConsumed();
    }

    public void mouseExited(MouseMotionEvent event, Spatial target, Spatial capture) {
        event.setConsumed();
    }

    public void mouseMoved(MouseMotionEvent event, Spatial target, Spatial capture) {
        event.setConsumed();
    }
}
