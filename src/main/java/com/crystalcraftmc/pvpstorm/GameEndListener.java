/*
 * Copyright 2015 CrystalCraftMC
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.crystalcraftmc.pvpstorm;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class GameEndListener implements Listener, CommandExecutor {
    // TODO Finish and test GameStartListener before working on this.

    PvPStorm plugin;
    
    public GameEndListener(PvPStorm plugin) {
        this.plugin = plugin;
    }
}
