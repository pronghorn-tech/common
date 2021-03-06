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

package tech.pronghorn.plugins.logging

import tech.pronghorn.logging.Logger
import tech.pronghorn.plugins.Plugin
import tech.pronghorn.plugins.PluginManager

public interface LoggingPlugin {
    companion object : Plugin<LoggingPlugin>(LoggingDefaultPlugin) {
        override fun getPlugin() = PluginManager.loggingPlugin

        public fun get(clazz: Class<*>): Logger = PluginManager.loggingPlugin.get(clazz.simpleName)
    }

    public fun get(name: String): Logger
}
