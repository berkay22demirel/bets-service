package com.berkay22demirel.betsservice;

import com.berkay22demirel.betsservice.Model.Match;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BetsRestController {

    private Map<Integer, Match> mathcsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        mathcsMap.put(1, new Match(1, "BJK - GS"));
        mathcsMap.put(2, new Match(2, "FB - TS"));
        mathcsMap.put(3, new Match(3, "Madrid - Barca"));
    }

    @RequestMapping(value = "/all")
    public Collection<Match> getAll() {
        return mathcsMap.values();
    }

    @RequestMapping(value = "/{id}")
    public Match getMatch(@PathVariable("id") Integer id) {
        return mathcsMap.get(id);
    }

}
