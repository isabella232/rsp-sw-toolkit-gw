/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: BSD-3-Clause
 */
package com.intel.rfid.api.upstream;

import com.intel.rfid.api.JsonRequest;

public class InventoryUnloadRequest extends JsonRequest {

    public static final String METHOD_NAME = "inventory_unload";

    public InventoryUnloadRequest() {
        method = METHOD_NAME;
    }

}
