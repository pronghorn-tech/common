/*
 * Copyright 2017 Pronghorn Technology LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.pronghorn.plugins.spscQueue

import tech.pronghorn.plugins.Plugin
import tech.pronghorn.plugins.PluginManager
import java.util.Queue

public interface SpscQueuePlugin {
    companion object : Plugin<SpscQueuePlugin>(SpscQueueDefaultPlugin) {
        override fun getPlugin() = PluginManager.spscQueuePlugin

        public fun <T> getBounded(capacity: Int): Queue<T> = PluginManager.spscQueuePlugin.getBounded(capacity)

        public fun <T> getUnbounded(): Queue<T> = PluginManager.spscQueuePlugin.getUnbounded()
    }

    public fun <T> getBounded(capacity: Int): Queue<T>

    public fun <T> getUnbounded(): Queue<T>
}
