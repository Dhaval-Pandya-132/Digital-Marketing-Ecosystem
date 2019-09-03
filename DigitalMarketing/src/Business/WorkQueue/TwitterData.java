/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author dhava
 */
public class TwitterData {
      String TweetID ;
    String Text ;
    int RetweetCount ;
    int favoriteCount;
    List<String>  hasTagList;
    int NeutralComments;

    public int getNeutralComments() {
        return NeutralComments;
    }

    public void setNeutralComments(int NeutralComments) {
        this.NeutralComments = NeutralComments;
    }
    
    public int getTotalComment() {
        return TotalComment;
    }

    public void setTotalComment(int TotalComment) {
        this.TotalComment = TotalComment;
    }

    public int getPositiveComment() {
        return PositiveComment;
    }

    public void setPositiveComment(int PositiveComment) {
        this.PositiveComment = PositiveComment;
    }

    public int getNegativeComment() {
        return NegativeComment;
    }

    public void setNegativeComment(int NegativeComment) {
        this.NegativeComment = NegativeComment;
    }
    HashMap<String,String>   Comments;
    int TotalComment;
    int PositiveComment;
    int NegativeComment;
    
    public TwitterData()
    {
        hasTagList = new ArrayList<String>();
        Comments = new HashMap<String,String>();
    }
    
    public String getTweetID() {
        return TweetID;
    }

    public void setTweetID(String TweetID) {
        this.TweetID = TweetID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public int getRetweetCount() {
        return RetweetCount;
    }

    public void setRetweetCount(int RetweetCount) {
        this.RetweetCount = RetweetCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public List<String> getHasTagList() {
        return hasTagList;
    }

    public void setHasTagList(List<String> hasTagList) {
        this.hasTagList = hasTagList;
    }

    public HashMap<String, String> getComments() {
        return Comments;
    }

    public void setComments(HashMap<String, String> Comments) {
        this.Comments = Comments;
    }

    
    @Override
    public String toString()
    {
        return this.getText();
    }
    
    
}
