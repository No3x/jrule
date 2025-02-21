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
package org.openhab.automation.jrule.items;

/**
 * The {@link JRuleItemType} .
 *
 * @author Joseph (Seaside) Hagberg - Initial contribution
 */
public enum JRuleItemType {

    SWITCH,
    CONTACT,
    STRING,
    ROLLERSHUTTER,
    PLAYER,
    NUMBER,
    LOCATION,
    IMAGE,
    GROUP,
    DIMMER,
    DATETIME,
    COLOR
}
