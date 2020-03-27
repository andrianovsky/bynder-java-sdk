/*
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.model;

import com.bynder.sdk.api.BynderApi;
import java.util.Map;

/**
 * Model returned by {@link BynderApi#finaliseUpload(Map)} or {@link BynderApi#finaliseAdditionalFileUpload}.
 */
public class FinaliseResponse {

    /**
     * Import id of the upload. Needed to poll and save media.
     */
    private String importId;

    /**
     * Item id returned by {@link BynderApi#finaliseAdditionalFileUpload}. Needed to poll and save media.
     */
    private String itemId;

    public String getImportId() {
        return importId;
    }

    public String getItemId() {
        return itemId;
    }
}
