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

package org.yes.cart.utils.impl;

import org.junit.Test;
import org.springframework.core.convert.TypeDescriptor;
import org.yes.cart.domain.misc.Pair;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 14:12:54
 */
public class ExtendedConversionServiceTest {
    @Test
    public void testExecuteConversion() {
        ExtendedConversionService extendedConversionService = new ExtendedConversionService();

        String values = "Red,Green,Blue";
        List<Pair<String, String>> pairList = (List)
                extendedConversionService.convert(
                        values,
                        TypeDescriptor.valueOf(String.class),
                        TypeDescriptor.valueOf(List.class)
                );
        //extendedConversionService.executeConversion(values, List.class);
        assertEquals(3, pairList.size());
        assertEquals("Red", pairList.get(0).getFirst());
        assertEquals("Red", pairList.get(0).getSecond());
        assertEquals("Green", pairList.get(1).getFirst());
        assertEquals("Green", pairList.get(1).getSecond());

        values = "Red,G-Green,Blue";
        pairList = (List)
                extendedConversionService.convert(
                        values,
                        TypeDescriptor.valueOf(String.class),
                        TypeDescriptor.valueOf(List.class)
                );
        //extendedConversionService.executeConversion(values, List.class);
        assertEquals(3, pairList.size());
        assertEquals("Red", pairList.get(0).getFirst());
        assertEquals("Red", pairList.get(0).getSecond());
        assertEquals("G", pairList.get(1).getFirst());
        assertEquals("Green", pairList.get(1).getSecond());
    }
}
