package com.airhacks.time.business.clock.boundary;

import java.time.LocalTime;
import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class AtomClock {

    public String currentTime() {
        return LocalTime.now().toString();
    }

}
