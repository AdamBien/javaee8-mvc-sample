package com.airhacks.time.presentation;

import com.airhacks.time.business.clock.boundary.AtomClock;
import com.oracle.ozark.core.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Controller
@Path("time")
public class TimeController {

    @Inject
    Models models;

    @Inject
    AtomClock clock;

    @GET
    public String now() {
        this.models.put("time", new Time(clock.currentTime()));
        return "/time.jsp";
    }

}
