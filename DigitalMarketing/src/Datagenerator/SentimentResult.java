/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadashboarddemo;

import javadashboarddemo.SentimentClassification;

/**
 *
 * @author dhava
 */
public class SentimentResult {
    
	double sentimentScore;
	String sentimentType;
	SentimentClassification sentimentClass;

	public double getSentiment() {
		return sentimentScore;
	}

	public double getSentimentScore() {
		return sentimentScore;
	}

	public void setSentimentScore(double sentimentScore) {
		this.sentimentScore = sentimentScore;
	}

	public String getSentimentType() {
		return sentimentType;
	}

	public void setSentimentType(String sentimentType) {
		this.sentimentType = sentimentType;
	}

	public SentimentClassification getSentimentClass() {
		return sentimentClass;
	}

	public void setSentimentClass(SentimentClassification sentimentClass) {
		this.sentimentClass = sentimentClass;
	}
}
