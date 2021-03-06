package com.berkay22demirel.betsservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match extends BaseModel {

    public Match(Integer id, String name) {
        super.setId(id);
        this.name = name;
    }

    private String name;


}
