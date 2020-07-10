package osgl.exception;

/*-
 * #%L
 * OSGL Core
 * %%
 * Copyright (C) 2017 OSGL (Open Source General Library)
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public class Exceptions {
    Exceptions() {
    }

    public static UnexpectedException unexpected() {
        throw new UnexpectedException();
    }

    public static void unexpectedIf(boolean test, String message, Object... args) {
        if (test) {
            throw new UnexpectedException(message, args);
        }
    }

    public static UnsupportedOperationException tbd() {
        throw new UnsupportedOperationException("To be implemented");
    }

    public static UnsupportedOperationException tbd(String feature) {
        throw new UnsupportedOperationException(feature + " to be implemented");
    }

}
