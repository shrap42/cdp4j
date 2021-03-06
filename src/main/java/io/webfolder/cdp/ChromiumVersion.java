/**
 * cdp4j - Chrome DevTools Protocol for Java
 * Copyright © 2017, 2018 WebFolder OÜ (support@webfolder.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.webfolder.cdp;

public enum ChromiumVersion {

    v64_0_3249_0(511134),
    v64_0_3276_0(518818),
    v65_0_3312_0(526987),
    v68_0_3399_0(551292),
    v68_0_3406_0(553380),
    v68_0_3419_0(555668),
    v68_0_3426_0(557152);

    public final int revision;

    ChromiumVersion(int revision) {
        this.revision = revision;
    }
}
