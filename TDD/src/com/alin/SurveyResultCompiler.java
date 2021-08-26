package com.alin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SurveyResultCompiler {
    List<String> opinions = new ArrayList<String>();

    public void willVoteFor(String opinion) {
        opinions.add(opinion);

    }

    public Map<String, BigDecimal> forecastResult() {

        Map<String, BigDecimal> result = new HashMap<String, BigDecimal>();
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String party : opinions) {
            Integer count = countMap.get(party);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            countMap.put(party, count);
        }

        for (String party : countMap.keySet()) {
            Integer voteCount = countMap.get(party);
            int totalVotes = opinions.size();
            BigDecimal percentage = new BigDecimal((voteCount * 100) / totalVotes);
            result.put(party, percentage);
        }

        return result;
    }

}
