/*
 * This file is part of GDHooks, licensed under the MIT License (MIT).
 *
 * Copyright (c) bloodmc
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.griefdefender.hooks.event;

import com.griefdefender.api.claim.Claim;
import com.griefdefender.api.claim.TrustType;
import com.griefdefender.api.event.TrustClaimEvent;

import java.util.List;

public class GDTrustClaimEvent extends GDClaimEvent implements TrustClaimEvent {

    private TrustType trustType;

    public GDTrustClaimEvent(Claim claim, TrustType trustType) {
        super(claim);
        this.trustType = trustType;
    }

    public GDTrustClaimEvent(List<Claim> claims, TrustType trustType) {
        super(claims);
        this.trustType = trustType;
    }

    @Override
    public TrustType getTrustType() {
        return this.trustType;
    }

    public static class Add extends GDTrustClaimEvent implements TrustClaimEvent.Add {

        public Add(Claim claim, TrustType trustType) {
            super(claim, trustType);
        }

        public Add(List<Claim> claims, TrustType trustType) {
            super(claims, trustType);
        }
    }

    public static class Remove extends GDTrustClaimEvent implements TrustClaimEvent.Remove {

        public Remove(Claim claim, TrustType trustType) {
            super(claim, trustType);
        }

        public Remove(List<Claim> claims, TrustType trustType) {
            super(claims, trustType);
        }
    }
}
