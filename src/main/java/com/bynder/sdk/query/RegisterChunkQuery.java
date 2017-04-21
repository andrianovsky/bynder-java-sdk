/**
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.query;

import java.util.Map;

import com.bynder.sdk.api.BynderApi;

/**
 * Query with the information to register an uploaded chunk in Bynder.
 */
public class RegisterChunkQuery {

    /**
     * Upload id for the file being uploaded.
     */
    @ApiField(name = "id")
    private String uploadId;

    /**
     * Number of the chunk that was uploaded.
     */
    @ApiField(name = "chunkNumber")
    private int chunkNumber;

    /**
     * Target id in the authorisation information returned by the
     * {@link BynderApi#getUploadInformation(Map)}.
     */
    @ApiField(name = "targetid")
    private String targetId;

    /**
     * S3 filename.
     */
    @ApiField(name = "filename")
    private String filename;

    public RegisterChunkQuery(final String uploadId, final int chunkNumber, final String targetId, final String filename) {
        this.uploadId = uploadId;
        this.chunkNumber = chunkNumber;
        this.targetId = targetId;
        this.filename = filename;
    }

    public String getUploadId() {
        return uploadId;
    }

    public int getChunkNumber() {
        return chunkNumber;
    }

    public String getTargetId() {
        return targetId;
    }

    public String getFilename() {
        return filename;
    }
}
