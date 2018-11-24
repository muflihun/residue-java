/**
 * ResidueConnectTask.java
 *
 * Official Java client library for Residue logging server
 *
 * Copyright (C) 2017-present Zuhd Web Services
 *
 * https://muflihun.com
 * https://zuhd.org
 * https://github.com/zuhd-org/residue-java
 *
 * Author: @abumusamq
 *
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
 */

package org.zuhd.residue;

import android.os.AsyncTask;

public class ResidueConnectTask extends AsyncTask<Object, Object, Void> {
    protected Void doInBackground(Object... urls) {

        try {
            Residue.getInstance().reconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
