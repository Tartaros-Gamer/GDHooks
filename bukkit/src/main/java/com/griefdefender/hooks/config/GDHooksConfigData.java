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
package com.griefdefender.hooks.config;

import org.spongepowered.configurate.objectmapping.ConfigSerializable;
import org.spongepowered.configurate.objectmapping.meta.Comment;
import org.spongepowered.configurate.objectmapping.meta.Setting;

import com.griefdefender.hooks.config.category.BluemapCategory;
import com.griefdefender.hooks.config.category.ClanCategory;
import com.griefdefender.hooks.config.category.ConfigCategory;
import com.griefdefender.hooks.config.category.DynmapCategory;
import com.griefdefender.hooks.config.category.MessageCategory;
import com.griefdefender.hooks.config.category.ProviderCategory;
import com.griefdefender.hooks.config.category.Pl3xmapCategory;

@ConfigSerializable
public class GDHooksConfigData extends ConfigCategory {

    @Setting
    public BluemapCategory bluemap = new BluemapCategory();

    @Setting
    public ClanCategory clan = new ClanCategory();

    @Setting
    public DynmapCategory dynmap = new DynmapCategory();

    @Setting
    public Pl3xmapCategory pl3xmap = new Pl3xmapCategory();

    @Setting
    public MessageCategory message = new MessageCategory();

    @Setting(value = "provider")
    @Comment(value = "Manages plugin providers that GDHooks plugs into for extended functionality.")
    public ProviderCategory providerCategory = new ProviderCategory();

    public GDHooksConfigData() {
        
    }
}
