/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.lrms;

import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class CLStreakLRM13OS extends StreakLRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5240577239366457930L;

    /**
     *
     */
    public CLStreakLRM13OS() {
        super();
        name = "Streak LRM 13 (OS)";
        setInternalName("CLStreakLRM13OS");
        addLookupName("Clan Streak LRM-13 (OS)");
        addLookupName("Clan Streak LRM 13 (OS)");
        heat = 0;
        rackSize = 13;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 5.7f;
        criticals = 1;
        bv = 224;
        cost = 195000;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(3065, DATE_NONE, 3079);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_X });
    }
}