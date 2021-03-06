/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.dto.impl;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;
import org.yes.cart.domain.dto.AttrValueBrandDTO;
import org.yes.cart.domain.dto.AttributeDTO;

import java.util.Map;

/**
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 14:12:54
 */
@Dto
public class AttrValueBrandDTOImpl implements AttrValueBrandDTO {

    private static final long serialVersionUID = 20100726L;

    @DtoField(value = "attrvalueId", readOnly = true)
    private long attrvalueId;

    @DtoField(value = "val")
    private String val;

    @DtoField(value = "displayVal", converter = "i18nStringConverter")
    private Map<String, String> displayVals;


    @DtoField(value = "attribute",
            dtoBeanKey = "org.yes.cart.domain.dto.AttributeDTO", readOnly = true)
    private AttributeDTO attributeDTO;

    @DtoField(value = "brand.brandId", readOnly = true)
    private long brandId;

    /** {@inheritDoc} */
    public long getAttrvalueId() {
        return attrvalueId;
    }

    /**
     * {@inheritDoc}
     */
    public long getId() {
        return attrvalueId;
    }

    /** {@inheritDoc} */
    public void setAttrvalueId(final long attrvalueId) {
        this.attrvalueId = attrvalueId;
    }

    /** {@inheritDoc} */
    public String getVal() {
        return val;
    }

    /** {@inheritDoc} */
    public void setVal(final String val) {
        this.val = val;
    }

    /** {@inheritDoc} */
    public Map<String, String> getDisplayVals() {
        return displayVals;
    }

    /** {@inheritDoc} */
    public void setDisplayVals(final Map<String, String> displayVals) {
        this.displayVals = displayVals;
    }

    /** {@inheritDoc} */
    public AttributeDTO getAttributeDTO() {
        return attributeDTO;
    }

    /** {@inheritDoc} */
    public void setAttributeDTO(final AttributeDTO attributeDTO) {
        this.attributeDTO = attributeDTO;
    }

    /** {@inheritDoc} */
    public long getBrandId() {
        return brandId;
    }

    /** {@inheritDoc} */
    public void setBrandId(final long brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "AttrValueBrandDTOImpl{" +
                "attrvalueId=" + attrvalueId +
                ", val='" + val + '\'' +
                ", attributeDTO=" + attributeDTO +
                ", brandId=" + brandId +
                '}';
    }
}
