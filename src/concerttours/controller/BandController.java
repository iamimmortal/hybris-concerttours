package concerttours.controller;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.servicelayer.model.ModelService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import concerttours.data.BandData;
import concerttours.data.CommentData;
import concerttours.facades.BandFacade;
import concerttours.model.BandCommentModel;


@Controller
@SessionAttributes("user")
public class BandController
{
	private static final String CATALOG_ID = "concertoursProductCatalog";
	private static final String CATALOG_VERSION_NAME = "Online";
	private CatalogVersionService catalogVersionService;
	private BandFacade bandFacade;
	private ModelService modelService;

	/*
	 * @RequestMapping(value = "/landing") public String showBands() {
	 *
	 * return "landing"; }
	 */
	@RequestMapping(value = "/home")
	public String showHome()
	{
		return "Home";
	}

	@RequestMapping(value = "/home/{country}")
	public String showCountry(final Model model, @PathVariable final String country) throws UnsupportedEncodingException
	{
		/*
		 * if (country != null) { JOptionPane.showMessageDialog(null, country); } else {
		 */
		//final String decodedBandId = URLDecoder.decode(country, "UTF-8");
		final List<BandData> bands = bandFacade.getBands(country);
		model.addAttribute("bands", bands);
		model.addAttribute("country", country);
		return "BandList";
		}
	//return "BandList";
	//}

	//for inserting records
	@RequestMapping(value = "/home/{country}/bands/{bandId}/addComment", method = RequestMethod.POST)
	public String addComment(@PathVariable final String bandId, final Model model,
			@RequestParam("name") final String name, @RequestParam("comment") final String comment,
			final BandCommentModel bandCommentModel, final HttpServletRequest request) throws UnsupportedEncodingException
		{
		final String decodedBandId = URLDecoder.decode(bandId, "UTF-8");
		bandCommentModel.setCode(decodedBandId);
		bandCommentModel.setDate(new Date());
		bandCommentModel.setName(name);
		bandCommentModel.setComment(comment);
		try
		{
			bandFacade.saveComment(bandCommentModel);

		}
		catch (final NullPointerException n)
		{
			n.printStackTrace();
		}


		final String referer = request.getHeader("Referer");
		return "redirect:" + referer;
	}

	//@ModelAttribute final
	//@ModelAttribute(value = "name") final String name, @ModelAttribute(value = "comment")
	@RequestMapping(value = "home/{country}/bands/{bandId}")
	public String showBandDetails(@PathVariable final String bandId, final Model model)
			throws UnsupportedEncodingException
	{
		catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
		final String decodedBandId = URLDecoder.decode(bandId, "UTF-8");
		final BandData band = bandFacade.getBand(decodedBandId);
		model.addAttribute("band", band);
		/*
		 * model.addAttribute("comment", bandCommentModel.getComment()); model.addAttribute("name", bandCommentModel.getName());
		 */

		/*
		 * bandCommentModel.setName(bandCommentModel.name); bandCommentModel.setComment(comment);
		 */

		//to fetch comment
		try
		{
		final List<CommentData> comment = bandFacade.getCommentForCode(bandId);
		model.addAttribute("comments", comment);
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return "BandDetails";
	}

	@Autowired
	public void setCatalogVersionService(final CatalogVersionService catalogVersionServiceService)
	{
		this.catalogVersionService = catalogVersionServiceService;
	}

	@Autowired
	public void setFacade(final BandFacade facade)
	{
		this.bandFacade = facade;
	}
}