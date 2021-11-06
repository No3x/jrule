/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.automation.jrule.rules;

import org.openhab.automation.jrule.rules.value.JRuleOnOffValue;
import org.openhab.automation.jrule.rules.value.JRuleOpenClosedValue;
import org.openhab.automation.jrule.rules.value.JRuleUpDownValue;

/**
 * The {@link JRuleEvent}
 *
 * @author Joseph (Seaside) Hagberg - Initial contribution
 */
public class JRuleEvent {

    private final String value;

    private String memberName;

    public JRuleEvent(String value) {
        this.value = value;
    }

    public JRuleEvent(String value, String memberName) {
        this.value = value;
        this.memberName = memberName;
    }

    public String getValue() {
        return value;
    }

    public JRuleOnOffValue getValueAsOnOffValue() {
        return JRuleOnOffValue.getValueFromString(value);
    }

    public JRuleOpenClosedValue getValueAsOpenClosedValue() {
        return JRuleOpenClosedValue.getValueFromString(value);
    }

    public JRuleUpDownValue getValueAsUpDownValue() {
        return JRuleUpDownValue.getValueFromString(value);
    }

    public Double getValueAsDouble() {
        Double d = null;
        try {
            d = Double.parseDouble(value);
        } catch (NumberFormatException x) {
            // ignore
        }
        return d;
    }

    public Integer getValueAsInteger() {
        Integer i = null;
        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException x) {
            // ignore
        }
        return i;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return "JRuleEvent{" + "value='" + value + '\'' + ", memberName='" + memberName + '\'' + '}';
    }
}
