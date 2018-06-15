package concerttours.facades;

import java.util.List;

import concerttours.data.BandData;
import concerttours.data.CommentData;
import concerttours.model.BandCommentModel;


public interface BandFacade
{
	BandData getBand(String name);

	List<BandData> getBands(String country);

	int saveComment(BandCommentModel bandCommentModel);

	//fetch comment
	List<CommentData> getCommentForCode(String code);

}