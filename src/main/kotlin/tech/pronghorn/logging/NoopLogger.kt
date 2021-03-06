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

package tech.pronghorn.logging

public class NoopLogger(override val name: String) : Logger() {
    override val isTraceEnabled: Boolean = false
    override val isDebugEnabled: Boolean = false
    override val isInfoEnabled: Boolean = false
    override val isWarnEnabled: Boolean = false
    override val isErrorEnabled: Boolean = false

    override fun traceImpl(message: String) = Unit
    override fun debugImpl(message: String) = Unit
    override fun infoImpl(message: String) = Unit
    override fun warnImpl(message: String) = Unit
    override fun errorImpl(message: String) = Unit
}
