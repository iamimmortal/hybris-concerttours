/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 18, 2018 3:11:08 PM                     ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BandComment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBandComment extends GenericItem
{
	/** Qualifier of the <code>BandComment.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>BandComment.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>BandComment.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>BandComment.comment</code> attribute **/
	public static final String COMMENT = "comment";
	/** Qualifier of the <code>BandComment.bands</code> attribute **/
	public static final String BANDS = "bands";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BANDS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBandComment> BANDSHANDLER = new BidirectionalOneToManyHandler<GeneratedBandComment>(
	ConcerttoursConstants.TC.BANDCOMMENT,
	false,
	"bands",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(COMMENT, AttributeMode.INITIAL);
		tmp.put(BANDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, BANDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands()
	{
		return getBands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final SessionContext ctx, final Band value)
	{
		BANDSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final Band value)
	{
		setBands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.code</code> attribute.
	 * @return the code - Band id
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.code</code> attribute.
	 * @return the code - Band id
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.code</code> attribute. 
	 * @param value the code - Band id
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.code</code> attribute. 
	 * @param value the code - Band id
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.comment</code> attribute.
	 * @return the comment - comments
	 */
	public String getComment(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.comment</code> attribute.
	 * @return the comment - comments
	 */
	public String getComment()
	{
		return getComment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.comment</code> attribute. 
	 * @param value the comment - comments
	 */
	public void setComment(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.comment</code> attribute. 
	 * @param value the comment - comments
	 */
	public void setComment(final String value)
	{
		setComment( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BANDSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.date</code> attribute.
	 * @return the date - date of comment
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.date</code> attribute.
	 * @return the date - date of comment
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.date</code> attribute. 
	 * @param value the date - date of comment
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.date</code> attribute. 
	 * @param value the date - date of comment
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.name</code> attribute.
	 * @return the name - name of Commentor
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BandComment.name</code> attribute.
	 * @return the name - name of Commentor
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.name</code> attribute. 
	 * @param value the name - name of Commentor
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BandComment.name</code> attribute. 
	 * @param value the name - name of Commentor
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
