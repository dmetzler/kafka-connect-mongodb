/*
 * (C) Copyright 2017 Nuxeo (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     dmetzler
 */
package org.apache.kafka.connect.mongodb;

import static org.junit.Assert.assertTrue;

import org.bson.types.ObjectId;
import org.junit.Test;

/**
 *
 * @since TODO
 */
public class SimpleTest {
@Test
    public void testName() throws Exception {
    assertTrue(ObjectId.isValid("5a3ae874e48a2000d9fb467c"));
}
}
