package com.elliot.footballmanager.match.engine;

import com.elliot.footballmanager.match.MatchResult;

/**
 * Outlays the interactivity with the database
 * @author Elliot
 */
public interface MatchEngineDao {

    public void persistResultToDatabase(MatchResult matchResult);

}
