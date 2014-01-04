/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.batchee.cli.command;

import io.airlift.command.Command;
import io.airlift.command.Option;

@Command(name = "stop", description = "stop a batch from its id")
public class Abandon extends JobOperatorCommand {
    @Option(name = "-id", description = "id of the batch to stop", required = true)
    private long id;

    @Override
    public void run() {
        operator().stop(id);
        info("Stopped batch " + id);
    }
}