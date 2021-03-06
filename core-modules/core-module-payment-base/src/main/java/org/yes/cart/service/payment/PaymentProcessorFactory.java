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

package org.yes.cart.service.payment;

/**
 *
 * Create {@link PaymentProcessor} for client and inject partucular PaymentGateway.
 * Payment gateway specified by his label in descriptor. To get the partucular payment gateway use the
 * {@link org.yes.cart.service.payment.PaymentModulesManager}
 *
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 14:12:54
 */
public interface PaymentProcessorFactory {


    /**
     * Create a new, thread safe, payment processor. 
     *
     * @param paymentGatewayLabel label , that specify a payment gateway.
     * @param shopCode shop code for this processor
     *
     * @return {@link PaymentProcessor}
     */
    PaymentProcessor create(String paymentGatewayLabel, String shopCode);



}
