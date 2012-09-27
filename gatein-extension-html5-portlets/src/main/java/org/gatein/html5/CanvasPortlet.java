package org.gatein.html5;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletContext;
import javax.portlet.MimeResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.w3c.dom.Element;

public class CanvasPortlet extends GenericPortlet {

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		response.setContentType("text/html");
		PortletContext ctx = getPortletContext();
		PortletRequestDispatcher dispatcher = ctx.getRequestDispatcher("/view.jsp");
		dispatcher.include(request, response);
	}

	@Override
	public void doHeaders(RenderRequest request, RenderResponse response)
	{
		Element script = response.createElement("script");
		script.setAttribute("type", "text/javascript");
		script.setAttribute("src", request.getContextPath() + "/script.js");
		response.addProperty(MimeResponse.MARKUP_HEAD_ELEMENT, script);        
	}
}
