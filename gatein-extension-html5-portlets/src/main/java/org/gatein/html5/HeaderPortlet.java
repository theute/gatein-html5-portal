package org.gatein.html5;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.UnavailableException;

public class HeaderPortlet extends GenericPortlet {

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException, UnavailableException {
		response.setContentType("text/html");
		PortletContext ctx = getPortletContext();
	    PortletRequestDispatcher dispatcher = ctx.getRequestDispatcher("/header.jsp");
	    dispatcher.include(request, response);
	}
}
