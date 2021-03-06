/*
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.query;

import com.bynder.sdk.query.decoder.ApiField;
import com.bynder.sdk.query.decoder.MetapropertyAttributeDecoder;

/**
 * Query to specify the media metadata to be modified.
 */
public class MediaModifyQuery {

    /**
     * Id of the media for which we want to modify its metadata.
     */
    @ApiField(name = "id")
    private final String mediaId;
    /**
     * Name new value.
     */
    @ApiField
    private String name;
    /**
     * Description new value.
     */
    @ApiField
    private String description;
    /**
     * Copyright new value.
     */
    @ApiField
    private String copyright;
    /**
     * Archive new status.
     */
    @ApiField
    private Boolean archive;
    /**
     * Date published new value.
     */
    @ApiField
    private String datePublished;
    /**
     * MetapropertyAttribute with metaproperty id and list of all its metaproperty options ids to
     * set on
     * the media.
     */
    @ApiField(decoder = MetapropertyAttributeDecoder.class)
    private MetapropertyAttribute metaproperty;

    public MediaModifyQuery(final String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public String getName() {
        return name;
    }

    public MediaModifyQuery setName(final String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MediaModifyQuery setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public MediaModifyQuery setCopyright(final String copyright) {
        this.copyright = copyright;
        return this;
    }

    public Boolean getArchive() {
        return archive;
    }

    public MediaModifyQuery setArchive(final Boolean archive) {
        this.archive = archive;
        return this;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public MediaModifyQuery setDatePublished(final String datePublished) {
        this.datePublished = datePublished;
        return this;
    }

    public MetapropertyAttribute getMetaproperty() {
        return metaproperty;
    }

    public MediaModifyQuery setMetaproperty(final MetapropertyAttribute metaproperty) {
        this.metaproperty = metaproperty;
        return this;
    }
}
