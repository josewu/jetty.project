//
//  ========================================================================
//  Copyright (c) 1995-2013 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.server.mux;

import java.nio.ByteBuffer;

import org.eclipse.jetty.server.HttpInput;

/**
 * HttpInput for Empty Http body sections.
 */
public class EmptyHttpInput extends HttpInput<ByteBuffer>
{
    @Override
    protected int get(ByteBuffer item, byte[] buffer, int offset, int length)
    {
        return 0;
    }

    @Override
    protected void onContentConsumed(ByteBuffer item)
    {
        // do nothing
    }

    @Override
    protected int remaining(ByteBuffer item)
    {
        return 0;
    }
}
