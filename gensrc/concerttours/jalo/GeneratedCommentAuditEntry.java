/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 21, 2018 4:52:20 PM                     ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CommentAuditEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommentAuditEntry extends GenericItem
{
	/** Qualifier of the <code>CommentAuditEntry.commentbandcode</code> attribute **/
	public static final String COMMENTBANDCODE = "commentbandcode";
	/** Qualifier of the <code>CommentAuditEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CommentAuditEntry.changeTimestamp</code> attribute **/
	public static final String CHANGETIMESTAMP = "changeTimestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMENTBANDCODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CHANGETIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.changeTimestamp</code> attribute.
	 * @return the changeTimestamp
	 */
	public Date getChangeTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CHANGETIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.changeTimestamp</code> attribute.
	 * @return the changeTimestamp
	 */
	public Date getChangeTimestamp()
	{
		return getChangeTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.changeTimestamp</code> attribute. 
	 * @param value the changeTimestamp
	 */
	public void setChangeTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CHANGETIMESTAMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.changeTimestamp</code> attribute. 
	 * @param value the changeTimestamp
	 */
	public void setChangeTimestamp(final Date value)
	{
		setChangeTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.commentbandcode</code> attribute.
	 * @return the commentbandcode
	 */
	public String getCommentbandcode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTBANDCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.commentbandcode</code> attribute.
	 * @return the commentbandcode
	 */
	public String getCommentbandcode()
	{
		return getCommentbandcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.commentbandcode</code> attribute. 
	 * @param value the commentbandcode
	 */
	public void setCommentbandcode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTBANDCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.commentbandcode</code> attribute. 
	 * @param value the commentbandcode
	 */
	public void setCommentbandcode(final String value)
	{
		setCommentbandcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommentAuditEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommentAuditEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
